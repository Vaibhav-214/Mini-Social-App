# Mini Social Media App - Built using Kotlin and Jetpack Compose

## Overview
This is a mini social media app built using Kotlin, Jetpack Compose, MVVM Architecture, Hilt for dependency Injection, Retrofit, Paging3, Coil, WorkManager, Preferences datastore, and more. 

The app fetches users from an API and uses pagination to list them. By clicking on any user, the app will fetch their profile information including their profile picture, posts, followers count, etc. Users can also click on any post to view its details, delete posts, and create new posts. All of these actions are performed using network requests.

## Features
- Pagination to list users
- View user profile information 
- View post details
- Delete posts after 5 seconds using WorkManager
- Swipe to refresh using accompanist library
- Multi-language support with Hindi and English
- Preferences datastore to save user's language selection

## Technologies used
- Kotlin
- Jetpack Compose
- MVVM Architecture
- Hilt for dependency Injection
- Retrofit
- Paging3
- Coil
- WorkManager
- Preferences datastore
- Accompanist library

## Installation
Clone the repository and import the project into Android Studio. The required dependencies are specified in the build.gradle files.

## Conclusion
This app demonstrates the power of modern Android development tools and techniques. It showcases how easily you can build a feature-rich mini social media app using Kotlin, Jetpack Compose, and other Jetpack libraries. Feel free to modify and extend this app to suit your needs!

  

https://user-images.githubusercontent.com/94449143/234789540-f20d6190-ba13-44c4-919f-210b0a12c6e5.mp4
