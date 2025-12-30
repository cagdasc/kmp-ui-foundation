package com.cacaosd.kmp_ui_foundation.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ColorShowcase(modifier: Modifier = Modifier) {
    val colorScheme = MaterialTheme.colorScheme

    val colors = remember {
        listOf(
            "Primary" to colorScheme.primary,
            "On Primary" to colorScheme.onPrimary,
            "Primary Container" to colorScheme.primaryContainer,
            "On Primary Container" to colorScheme.onPrimaryContainer,
            "Secondary" to colorScheme.secondary,
            "On Secondary" to colorScheme.onSecondary,
            "Secondary Container" to colorScheme.secondaryContainer,
            "On Secondary Container" to colorScheme.onSecondaryContainer,
            "Tertiary" to colorScheme.tertiary,
            "On Tertiary" to colorScheme.onTertiary,
            "Tertiary Container" to colorScheme.tertiaryContainer,
            "On Tertiary Container" to colorScheme.onTertiaryContainer,
            "Error" to colorScheme.error,
            "Error Container" to colorScheme.errorContainer,
            "Background" to colorScheme.background,
            "On Background" to colorScheme.onBackground,
            "Surface" to colorScheme.surface,
            "On Surface" to colorScheme.onSurface,
        )
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(
                text = "Color Palette",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(modifier = Modifier.height(8.dp))
        }

        items(colors) { (name, color) ->
            ColorCard(name, color)
        }
    }
}

@Composable
fun ColorCard(name: String, color: Color) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color)
            )
            Column(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxHeight()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = name,
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = colorToHex(color),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace
                )
            }
        }
    }
}

// Helper function to convert Color to Hex
private fun colorToHex(color: Color): String {
    val red = (color.red * 255).toInt()
    val green = (color.green * 255).toInt()
    val blue = (color.blue * 255).toInt()
    return "#" + listOf(red, green, blue).joinToString("") {
        it.coerceIn(0, 255).toString(16).padStart(2, '0').uppercase()
    }
}
