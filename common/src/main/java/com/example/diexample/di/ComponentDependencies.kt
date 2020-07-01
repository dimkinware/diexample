package com.example.diexample.di

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import dagger.MapKey
import kotlin.reflect.KClass

interface ComponentDependencies

interface HasComponentDependencies {
    val dependencies: ComponentDependenciesProvider
}

typealias ComponentDependenciesProvider = Map<Class<out ComponentDependencies>, @JvmSuppressWildcards ComponentDependencies>

@MapKey
@Target(AnnotationTarget.FUNCTION)
annotation class ComponentDependenciesKey(val value: KClass<out ComponentDependencies>)


inline fun <reified T: ComponentDependencies> HasComponentDependencies.findComponentDependencies(): T {
    return dependencies[T::class.java] as T
}

inline fun <reified T: ComponentDependencies> AppCompatActivity.findComponentDependencies(): T {
    return findComponentDependenciesProvider()[T::class.java] as T
}

inline fun <reified T: ComponentDependencies> Fragment.findComponentDependencies(): T {
    return findComponentDependenciesProvider()[T::class.java] as T
}

fun AppCompatActivity.findComponentDependenciesProvider(): ComponentDependenciesProvider {
    val hasProviders = when {
        this is HasComponentDependencies -> this
        this.application is HasComponentDependencies -> this.application as HasComponentDependencies
        else -> throwDontHaveProvider(this)
    }

    return hasProviders.dependencies
}

fun Fragment.findComponentDependenciesProvider(): ComponentDependenciesProvider {
    var current: Fragment? = parentFragment
    while(current !is HasComponentDependencies?) {
        current = current?.parentFragment
    }

    if (current != null && current is HasComponentDependencies) {
        return current.dependencies
    }

    val hasProviders = when {
        activity is HasComponentDependencies -> activity as HasComponentDependencies
        activity?.application is HasComponentDependencies -> activity?.application as HasComponentDependencies
        else -> throwDontHaveProvider(this)
    }

    return hasProviders.dependencies
}

private inline fun throwDontHaveProvider(target: Any): Nothing {
    throw IllegalArgumentException("Can find dagger provider for $target")
}