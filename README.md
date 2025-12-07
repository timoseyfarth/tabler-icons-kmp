# Tabler Icons KMP

[![Maven Central](https://img.shields.io/maven-central/v/dev.seyfarth/tabler-icons-kmp)](https://central.sonatype.com/artifact/dev.seyfarth/tabler-icons-kmp)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

A **Kotlin Multiplatform** library providing ~6,000 high-quality icons from [Tabler Icons](https://tabler.io/icons),
ready to use in **Jetpack Compose** and **Compose Multiplatform** (Android, iOS, Desktop).

---

## 📦 Installation

### Standard Gradle
Add the dependency to your `commonMain` source set or module-level `build.gradle.kts`:

```kts
implementation("dev.seyfarth:tabler-icons-kmp:1.0.0")
```

### Version Catalog `libs.versions.toml`
If you use a version catalog, add the following to your `gradle/libs.versions.toml` file:
```toml
[versions]
tablerIconsKmp = "1.0.0"

[libraries]
tabler-icons-kmp = { module = "dev.seyfarth:tabler-icons-kmp", version.ref = "tablerIconsKmp" }
```

Then in your `commonMain` source set or module-level `build.gradle.kts`, you can use the dependency like this:

```kts
implementation(libs.tabler.icons.kmp)
```

## 🚀 Usage

The icons are organized inside the `TablerIcons` object, split into *Filled* and *Outlined* categories.
```kotlin
@Composable
fun MyScreen() {
    Icon(
        imageVector = TablerIcons.Filled.Home,
        contentDescription = "Home icon"
    )

    Icon(
        imageVector = TablerIcons.Outlined.DotsVertical,
        contentDescription = "Dots vertical icon"
    )
}
```

## ✨ Features & Info

- **Multiplatform Ready**: Works on Android, iOS, and JVM (Desktop), and Web (Wasm/JS) targets supported by Compose Multiplatform.
- **100% SVG**: All icons are SVG files, so you can scale them to any size without losing quality.
- **~6000 Icons**: Includes the full set of [Tabler Icons](https://tabler.io/icons) v3.35.0.
- **Tree Shaking**: Only the icons you use are included in your final binary, keeping your app size minimal.

## 🤝 Special Thanks / Credits

- **Icons - [Tabler Icons](https://tabler.io/icons):** ~6000 free MIT-licensed high-quality SVG icons.
- **Generator - [Valkyrie](https://github.com/ComposeGears/Valkyrie):** Powerful tool used to convert SVG source files into Kotlin Compose ImageVectors.

