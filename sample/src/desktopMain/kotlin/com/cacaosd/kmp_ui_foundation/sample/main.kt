package com.cacaosd.kmp_ui_foundation.sample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.cacaosd.uikit.theme.AppTheme

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        AppTheme {
            UIFoundationShowcase()
        }
    }
}
