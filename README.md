# Compose Custom Colors

Material design 3 custom colors with Jetpack Compose. Harmonization is enabled by default.

[![alt text](Screenshot.png)]

## Usage
```kotlin
@Composable
fun Example() {
    CustomColorScheme(color = Color.Yellow) { // darkTheme = isSystemInDarkTheme(), harmonize = true
        Column {
            Item()
        }
    }
}

@Composable
private fun Item(){
    val colorScheme = LocalCustomColorScheme.current

    Surface(
        color = colorScheme.customColorContainer
    ) {
        Text(
            text = "Example item",
            color = colorScheme.onCustomColorContainer
        )
    }
}
```


## Import
In `settings.gradle.kts`, add `maven { setUrl("https://jitpack.io") }`.

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        
        maven { setUrl("https://jitpack.io") }
    }
}
```

## Questions

Should text selection colors be updated like in `MaterialTheme`?

```kotlin
fun MaterialTheme(
    colorScheme: ColorScheme = MaterialTheme.colorScheme,
    shapes: Shapes = MaterialTheme.shapes,
    typography: Typography = MaterialTheme.typography,
    content: @Composable () -> Unit
) {
    val rememberedColorScheme = remember {
        // Explicitly creating a new object here so we don't mutate the initial [colorScheme]
        // provided, and overwrite the values set in it.
        colorScheme.copy()
    }.apply {
        updateColorSchemeFrom(colorScheme)
    }
    val rippleIndication = rememberRipple()
    val selectionColors = rememberTextSelectionColors(rememberedColorScheme) // HERE!
    CompositionLocalProvider(
        LocalColorScheme provides rememberedColorScheme,
        LocalIndication provides rippleIndication,
        LocalRippleTheme provides MaterialRippleTheme,
        LocalShapes provides shapes,
        LocalTextSelectionColors provides selectionColors,
        LocalTypography provides typography,
    ) {
        ProvideTextStyle(value = typography.bodyLarge, content = content)
    }
}
```