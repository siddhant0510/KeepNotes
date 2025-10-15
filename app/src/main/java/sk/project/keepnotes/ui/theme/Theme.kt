package sk.project.keepnotes.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color.White,
    background = DarkGray,
    onBackground = Color.White,
    surface = LightBlue,
    onSurface = DarkGray,
    // Material 3 has more color tokens, you might want to define these as well
    onPrimary = DarkGray, // Text/icon color on primary background
    primaryContainer = LightBlue, // Container color for primary elements
    onPrimaryContainer = DarkGray, // Content color for primary containers
    inverseOnSurface = DarkGray, // Inverse of onSurface for contrast
    inverseSurface = LightBlue, // Inverse of surface for contrast
    surfaceVariant = Color.LightGray, // Alternative surface color
    onSurfaceVariant = DarkGray // Content color on surface variant
)

@Composable
fun KeepNotesTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme, // Changed from 'colors' to 'colorScheme'
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}