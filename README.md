# Constraint Layout in Jetpack Compose

## 📌 Project Overview
This repository contains the frontend of a **Course App** built using **Constraint Layout in Jetpack Compose**. The **Constraint Layout** simplifies the process of creating modern and responsive UI designs in Jetpack Compose, reducing nested structures and improving performance.

## 🚀 Features
- Efficient UI layout management using **ConstraintLayout**.
- Reduces the need for deeply nested Composables.
- Supports flexible alignment and positioning.
- Improves UI performance and scalability.

## 📖 Getting Started
### 1️⃣ Prerequisites
Ensure you have the following setup:
- Android Studio **Giraffe** or later.
- Jetpack Compose enabled in your project.
- Kotlin version **1.7+**.

### 2️⃣ Add Dependency
Include the Constraint Layout dependency in your `build.gradle` file:

```gradle
dependencies {
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
}
```

### 3️⃣ Usage Example
Here's an example of how to use **ConstraintLayout** in Jetpack Compose:

```kotlin
@Composable
fun CourseAppUI() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (title, button) = createRefs()

        Text(
            text = "Welcome to Course App",
            fontSize = 24.sp,
            modifier = Modifier.constrainAs(title) {
                top.linkTo(parent.top, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        Button(
            onClick = {},
            modifier = Modifier.constrainAs(button) {
                top.linkTo(title.bottom, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        ) {
            Text("Get Started")
        }
    }
}
```
## 🏆 Conclusion
Using **Constraint Layout** in Jetpack Compose allows for flexible, modern UI design with better performance. This project demonstrates how to leverage **Constraint Layout** to structure your app’s interface efficiently.

🚀 **Happy Coding!** 🎉

