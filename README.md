EcoHero 🌿 - Waste Management & Community Action App
EcoHero is a modern Android application built with Jetpack Compose that empowers citizens to take charge of their environment. Users can report waste, track community cleanup efforts, and earn rewards for their contributions to a cleaner city.

Kotlin Jetpack Compose Firebase License: MIT

✨ Key Features
🚀 Instant Reporting: Capture and report waste hotspots with photos, descriptions, and GPS locations.
🗺️ Community Map: Real-time visualization of reported waste using Google Maps API.
🎮 Gamification: Earn Eco Score points for every report and cleanup. Level up your rank from "Eco Beginner" to "Eco Hero".
🤝 Volunteer Integration: Join local cleanup events and connect with other environmental activists.
📊 Real-time Dashboard: Track your impact and see recent community reports at a glance.
🔐 Secure Auth: Seamless login and data synchronization powered by Firebase.
🛠️ Tech Stack
UI Framework: Jetpack Compose (Material 3)
Language: Kotlin
Backend: Firebase
Authentication
Firestore (NoSQL Database)
Cloud Storage (for images)
Maps: Google Maps SDK for Android
Image Loading: Coil Compose
Architecture: MVVM (Model-View-ViewModel)
Navigation: Jetpack Compose Navigation
🚀 Getting Started
Prerequisites
Android Studio Koala or newer.
JDK 11 or higher.
A Firebase Project.
A Google Cloud Project with Maps SDK enabled.
Installation
Clone the Repository:

git clone https://github.com/PrajwalLokesh007/Mindmatrix_Project_80.git
Firebase Setup:

Create a project in the Firebase Console.
Add an Android app with package name com.example.myapplication.
Download google-services.json and place it in the app/ directory.
Enable Anonymous Auth (or Email/Google) and Firestore.
Google Maps Setup:

Get an API Key from the Google Cloud Console.
Add your API key to local.properties:
MAPS_API_KEY=YOUR_API_KEY_HERE
Build & Run:

Open the project in Android Studio.
Sync Gradle and run the app on an emulator or physical device.
📸 Screenshots
Dashboard	Reporting	Map View
Dashboard	Reporting	Map
🤝 Contributing
Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

Fork the Project.
Create your Feature Branch (git checkout -b feature/AmazingFeature).
Commit your Changes (git commit -m 'Add some AmazingFeature').
Push to the Branch (git push origin feature/AmazingFeature).
Open a Pull Request.
