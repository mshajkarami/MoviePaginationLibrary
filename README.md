# MoviePaginationLibrary

## Overview
MoviePaginationLibrary is a sample Android application built using **Kotlin** and **XML**, demonstrating how to implement pagination with **Paging Library 2**. It fetches a list of movies from a remote API and presents them in a smooth, scrollable list with optimized performance.

## Features
- Built using **Kotlin** with **XML layouts**.
- Uses **Paging Library 2** for loading paged data.
- Clean **MVVM architecture**.
- Fetches data from a remote API using **Retrofit**.
- Includes utility classes for better UI rendering.
- Handles pagination efficiently with smooth scroll behavior.

## Tech Stack
- **Kotlin**
- **Paging Library 2**
- **Retrofit**
- **MVVM Architecture**
- **RecyclerView**
- **XML Layouts**

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/mshajkarami/MoviePaginationLibrary.git
Open the project in Android Studio.

Let Gradle sync and resolve dependencies.

Run the app on an emulator or physical device.

How It Works
API Call: Movies are fetched from a remote API via Retrofit.

Pagination: The app uses Paging 2 to load pages one by one while scrolling.

Model Classes: Movie and MovieResponse classes handle data structure.

Utils: Custom comparators and layout helpers improve rendering and UX.

Contributing
Contributions are welcome! Please feel free to submit pull requests or create issues for suggestions or bugs.

License
This project is licensed under the MIT License.

Contact
For any questions or suggestions, feel free to reach out on GitHub.
