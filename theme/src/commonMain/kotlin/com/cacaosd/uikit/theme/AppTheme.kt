package com.cacaosd.uikit.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.cacaosd.uikit.theme.config.ColorSchemeProvider
import com.cacaosd.uikit.theme.config.DefaultColorSchemeProvider
import com.cacaosd.uikit.theme.typography.appTypography

object AppTheme {
    var colorSchemeProvider: ColorSchemeProvider = DefaultColorSchemeProvider()

    val shapes: AppShapes
        @Composable
        get() = LocalAppShapes.current

    val sizes: AppSize
        @Composable
        get() = LocalAppSizes.current

    @Composable
    operator fun invoke(
        isDarkTheme: Boolean = isSystemInDarkTheme(),
        content: @Composable () -> Unit
    ) {
        val colorScheme = LocalAppDarkThemePreview.current?.let { isDarkTheme ->
            if (isDarkTheme) colorSchemeProvider.darkColorScheme else colorSchemeProvider.lightColorScheme
        } ?: if (isDarkTheme) colorSchemeProvider.darkColorScheme else colorSchemeProvider.lightColorScheme

        CompositionLocalProvider(
            LocalAppShapes provides appShapes,
            LocalAppSizes provides appSize
        ) {
            MaterialTheme(colorScheme = colorScheme, typography = appTypography, content = content)
        }
    }
}

val LocalAppShapes = staticCompositionLocalOf {
    AppShapes(
        small = RoundedCornerShape(0.dp),
        medium = RoundedCornerShape(0.dp),
        large = RoundedCornerShape(0.dp),
    )
}

val LocalAppSizes = staticCompositionLocalOf {
    AppSize(
        xsmall = Dp.Unspecified,
        small = Dp.Unspecified,
        medium = Dp.Unspecified,
        xmedium = Dp.Unspecified,
        large = Dp.Unspecified,
        xlarge = Dp.Unspecified,
        xxlarge = Dp.Unspecified,
        xxxlarge = Dp.Unspecified,
        x4large = Dp.Unspecified,
    )
}

val LocalAppDarkThemePreview = staticCompositionLocalOf<Boolean?> { null }
