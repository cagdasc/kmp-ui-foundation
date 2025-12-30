package com.cacaosd.uikit.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

internal val lightSchema = lightColorScheme(
    // Primary colors
    primary = Color(0xFF388E3C),         // Using the ItemSelected green as primary
    onPrimary = Color(0xFFFFFFFF),       // White text on primary
    primaryContainer = Color(0xFFA5D6A7), // Light green (BackgroundAccentColor) for containers
    onPrimaryContainer = Color(0xFF1B5E20), // Dark green (TextPrimary) on containers

    // Secondary colors
    secondary = Color(0xFF2E7D32),       // Medium green (TextSecondary)
    onSecondary = Color(0xFFFFFFFF),     // White text on secondary
    secondaryContainer = Color(0xFFC8E6C9), // Slightly darker mint (PrimaryDark)
    onSecondaryContainer = Color(0xFF1B5E20), // Dark green text

    // Tertiary colors
    tertiary = Color(0xFF1B5E20),        // Dark green (ToolbarTitleColor)
    onTertiary = Color(0xFFFFFFFF),      // White text on tertiary
    tertiaryContainer = Color(0xFFE8F5E9), // Mint green (Primary)
    onTertiaryContainer = Color(0xFF1B5E20), // Dark green text

    // Error colors
    error = Color(0xFFD32F2F),           // Dark red (ErrorColor)
    errorContainer = Color(0xFFFFDAD6),  // Light red for error container
    onError = Color(0xFFFFFFFF),         // White text on error
    onErrorContainer = Color(0xFF410002), // Dark text on error container

    // Background colors
    background = Color(0xFFE8F5E9),      // Main background color (Background)
    onBackground = Color(0xFF1B5E20),    // Dark green text (TextPrimary)

    // Surface colors
    surface = Color(0xFFFFFFFF),         // White (SecondaryBackground)
    onSurface = Color(0xFF1B5E20),       // Dark green text (TextPrimary)
    surfaceVariant = Color(0xFFDCE5DD),  // Slightly tinted surface
    onSurfaceVariant = Color(0xFF388E3C), // Light green text (TextTertiary)

    // Outline colors
    outline = Color(0xFF72796F),         // Medium gray with green tint
    outlineVariant = Color(0xFFC1C9BF),  // Light gray with green tint

    // Inverse colors
    inverseSurface = Color(0xFF2E312D),  // Dark surface
    inverseOnSurface = Color(0xFFEAF1E9), // Light text on dark surface
    inversePrimary = Color(0xFFA5D6A7),  // Light green accent on dark bg

    // Scrim color
    scrim = Color(0xFF000000)            // Scrim is typically black
)

internal val darkSchema = darkColorScheme(
    // Primary colors
    primary = Color(0xFFA5D6A7),         // Light green accent
    onPrimary = Color(0xFF00390D),       // Very dark green text on primary
    primaryContainer = Color(0xFF2E7D32), // Medium green (TextSecondary) for containers
    onPrimaryContainer = Color(0xFFCCF5CF), // Very light green on containers

    // Secondary colors
    secondary = Color(0xFFC8E6C9),       // Light mint green
    onSecondary = Color(0xFF003A07),     // Very dark green text on secondary
    secondaryContainer = Color(0xFF1B5E20), // Dark green for containers
    onSecondaryContainer = Color(0xFFD9F5D6), // Very light green text

    // Tertiary colors
    tertiary = Color(0xFFE8F5E9),        // Mint green
    onTertiary = Color(0xFF003A04),      // Very dark green text on tertiary
    tertiaryContainer = Color(0xFF005307), // Dark green for containers
    onTertiaryContainer = Color(0xFFD9F5D6), // Very light green text

    // Error colors
    error = Color(0xFFFFB4AB),           // Light red
    errorContainer = Color(0xFF93000A),  // Dark red for error container
    onError = Color(0xFF690005),         // Dark red text on error
    onErrorContainer = Color(0xFFFFDAD6), // Light red text on error container

    // Background colors
    background = Color(0xFF1A211A),      // Dark background with green tint
    onBackground = Color(0xFFE1EBE0),    // Light green-white text

    // Surface colors
    surface = Color(0xFF121812),         // Very dark green-tinted surface
    onSurface = Color(0xFFE1EBE0),       // Light green-white text
    surfaceVariant = Color(0xFF424940),  // Dark green-tinted surface variant
    onSurfaceVariant = Color(0xFFC1C9BF), // Light green-gray text

    // Outline colors
    outline = Color(0xFF8B9389),         // Medium green-gray
    outlineVariant = Color(0xFF424940),  // Dark green-gray

    // Inverse colors
    inverseSurface = Color(0xFFE1EBE0),  // Light surface
    inverseOnSurface = Color(0xFF1A211A), // Dark text on light surface
    inversePrimary = Color(0xFF388E3C),  // Medium green

    // Scrim color
    scrim = Color(0xFF000000)            // Scrim is typically black
)
