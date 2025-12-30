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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun TypographyShowcase(modifier: Modifier = Modifier) {
    val typography = MaterialTheme.typography

    val typographyItems = remember {
        listOf(
            TypographyItem("Display Large", typography.displayLarge, "40sp • Normal • -0.25sp"),
            TypographyItem("Display Medium", typography.displayMedium, "34sp • Normal • 0sp"),
            TypographyItem("Display Small", typography.displaySmall, "28sp • Normal • 0sp"),
            TypographyItem("Headline Large", typography.headlineLarge, "24sp • Normal • 0sp"),
            TypographyItem("Headline Medium", typography.headlineMedium, "20sp • Normal • 0sp"),
            TypographyItem("Headline Small", typography.headlineSmall, "18sp • Normal • 0sp"),
            TypographyItem("Title Large", typography.titleLarge, "16sp • Medium • 0sp"),
            TypographyItem("Title Medium", typography.titleMedium, "14sp • Medium • 0.1sp"),
            TypographyItem("Title Small", typography.titleSmall, "13sp • Medium • 0.05sp"),
            TypographyItem("Body Large", typography.bodyLarge, "14sp • Normal • 0.25sp"),
            TypographyItem("Body Medium", typography.bodyMedium, "13sp • Normal • 0.2sp"),
            TypographyItem("Body Small", typography.bodySmall, "11sp • Normal • 0.3sp"),
            TypographyItem("Label Large", typography.labelLarge, "13sp • Medium • 0.1sp"),
            TypographyItem("Label Medium", typography.labelMedium, "11sp • Medium • 0.4sp"),
            TypographyItem("Label Small", typography.labelSmall, "10sp • Medium • 0.5sp"),
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
                text = "Typography Showcase",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(modifier = Modifier.height(8.dp))
        }

        items(typographyItems) { item ->
            TypographyCard(item)
        }
    }
}

@Composable
fun TypographyCard(item: TypographyItem) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = item.name,
                style = item.style,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "The quick brown fox jumps over the lazy dog",
                style = item.style,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = item.description,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

data class TypographyItem(
    val name: String,
    val style: TextStyle,
    val description: String
)