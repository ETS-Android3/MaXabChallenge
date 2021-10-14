# MaXabChallenge
A currency converter mobile app.

## Challenge description
As a user I want to create a currency converter.
The currency converter must use EUR as the base currency (displayed at top) and display the currency
rates as a list. When a user taps on a currency, a calculation view should appear with the selected
currency and the base currency. Only the base currency field should be editable.
(Consider this project as if you were developing a component within a large-scaled project)

- Create your offline currency calculator that should convert the base currency to anothercurrency.
- The app should handle offline mode if there is no network and in case
online it should load data from [ fixer.io]. So the user can use the app
anytime.


## What i have done
I started working on it by migrating gradle files to kotlin dsl then modeling the project to multi modules ( module by feature ) ,
applied clean architecture with MVVM design pattern used Coroutines to handle heavy operations on the background thread,
Dagger 2 for dependency injection,Room for caching currencies,
unit testing all the feature using (JUnit, Mockk),
used different branches to implement and refactor the features to avoid conflicts.


## Screenshot
<img src="https://github.com/MosaabAhmedMohamed/MaXabChallenge/blob/master/maxab_app.jpeg" width="200" height="400"></a>

## Specifications
- Caching currencies.
- portrait and landscape.
- using Clean architecture.
- using MVVM
- using Coroutines
- Using Usecases (part of clean architecture)
- Using View State
- Unit test.
- Partly include comments.
- Reactive code
- Kotlin DSL
- Enabling ProGuard

## Languages, libraries and tools used

 * [Kotlin](https://kotlinlang.org/)
 * [androidX libraries](https://developer.android.com/jetpack/androidx)
 * [Android LifeCycle](https://developer.android.com/topic/libraries/architecture)
 * [Glide](https://github.com/bumptech/glide)
 * [Room](https://developer.android.com/jetpack/androidx/releases/room)
 * [Retrofit2](https://github.com/square/retrofit)
 * [Dagger2](https://dagger.dev/)
 * [Moshi](https://github.com/square/moshi)
 * [Coroutines](https://developer.android.com/kotlin/coroutines?gclid=Cj0KCQjwqp-LBhDQARIsAO0a6aKRxs8RzINNC4Mlq9rQuGnlWQhT4PY5aTxBRk9ppc9dkSbRH3-G2GUaAiEvEALw_wcB&gclsrc=aw.ds) 
 
## Requirements
- min SDK 21

## Installation
MaXabChallenge requires Android Studio version 3.6 or higher.

## Implementation

* In this project I'm using [Clean architecture with MVVM Pattern](https://developer.android.com/jetpack/docs/guide)
as an application architecture adopted with usage of UseCases with these design patterns in mind:-
- Repository Pattern
- Singleton
- Single source of truth
- Adapters

* Using Dagger2 for dependency injection that will make testing easier and make our code 
cleaner and more readable and handy when creating dependecies.
* Using Retrofit library to handle the APIs stuff.
* Using Room for caching user data
* Separation of concerns : The most important principle used in this project to avoid many lifecycle-related problems.
<img src="https://developer.android.com/topic/libraries/architecture/images/final-architecture.png"></a>
* Each component depends only on the component one level below it. For example, activities and fragments depend only on a view model. The repository is the only class that depends on multiple other classes; in this example, the repository depends on a persistent data model and a remote backend data source.
This design creates a consistent and pleasant user experience. Regardless of whether the user comes back to the app several minutes after they've last closed it or several days later, they instantly see a user's information that the app persists locally. If this data is stale, the app's repository module starts updating the data in the background.
* Using to best of managing ViewState with less complex tools , using Sealed Classes and LiveData we created a solid source that we can expose to view to show what the app can do to the user without worrying about the side effects

## Immutability
Data immutability is embraced to help keeping the logic simple. Immutability means that we do not need to manage data being mutated in other methods, in other threads, etc; because we are sure the data cannot change. Data immutability is implemented with LiveData class.

## ViewModel LifeCycle
The ViewModel should outlive the View on configuration changes. For instance, on rotation, the Activity gets destroyed and recreated but your ViewModel should not be affected by this. If the ViewModel was to be recreated as well, all the ongoing tasks and cached latest ViewState would be lost.
We use the Architecture Components library to instantiate our ViewModel in order to easily have its lifecycle correctly managed.

