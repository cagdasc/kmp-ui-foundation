package com.cacaosd.kmp_ui_foundation.sample

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UIFoundationShowcase() {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Typography", "Colors", "Shapes", "Sizes")

    Scaffold(
        topBar = {
            Column {
                TopAppBar(
                    title = { Text("KMP UI Foundation") },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.surface
                    )
                )
                TabRow(selectedTabIndex = selectedTab) {
                    tabs.forEachIndexed { index, title ->
                        Tab(
                            selected = selectedTab == index,
                            onClick = { selectedTab = index },
                            text = { Text(title) }
                        )
                    }
                }
            }
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            when (selectedTab) {
                0 -> TypographyShowcase()
                1 -> ColorShowcase()
                2 -> ShapeShowcase()
                3 -> SizeShowcase()
            }
        }
    }
}
