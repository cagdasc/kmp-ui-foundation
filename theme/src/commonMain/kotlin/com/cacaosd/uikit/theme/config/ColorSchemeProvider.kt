package com.cacaosd.uikit.theme.config

import androidx.compose.material3.ColorScheme
import com.cacaosd.uikit.theme.darkSchema
import com.cacaosd.uikit.theme.lightSchema

interface ColorSchemeProvider {
    val lightColorScheme: ColorScheme
    val darkColorScheme: ColorScheme
}

internal class DefaultColorSchemeProvider : ColorSchemeProvider {
    override val lightColorScheme: ColorScheme
        get() = lightSchema
    override val darkColorScheme: ColorScheme
        get() = darkSchema
}
