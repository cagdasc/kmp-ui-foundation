package com.cacaosd.kmp_ui_foundation.sample

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.cacaosd.uikit.theme.AppTheme
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        AppTheme {
            UIFoundationShowcase()
        }
    }
}
