package com.cacaosd.kmp_ui_foundation.components.dialog

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import com.cacaosd.uikit.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun ConfirmationDialog(
    title: String,
    message: String,
    confirmText: String,
    dismissText: String?,
    onConfirm: () -> Unit,
    onDismiss: () -> Unit,
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        shape = MaterialTheme.shapes.medium,
        title = {
            Text(
                text = title,
                color = MaterialTheme.colorScheme.onSurface
            )
        },
        text = {
            Text(
                text = message,
                color = MaterialTheme.colorScheme.onBackground
            )
        },
        confirmButton = {
            TextButton(
                onClick = onConfirm
            ) {
                Text(
                    text = confirmText,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        },
        dismissButton = dismissText?.let { text ->
            {
                TextButton(
                    onClick = onDismiss
                ) {
                    Text(
                        text = text,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
        }
    )
}

@Preview
@Composable
private fun ConfirmationDialogPreview() {
    AppTheme {
        ConfirmationDialog(
            title = "Confirm action",
            message = "Are you sure you want to proceed?",
            confirmText = "Yes",
            dismissText = "No",
            onConfirm = {},
            onDismiss = {}
        )
    }
}
