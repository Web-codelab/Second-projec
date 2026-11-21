package com.mykharcha.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = PrimaryBlue,
    onPrimary = CardSurface,
    primaryContainer = PrimaryBlueSoft,
    onPrimaryContainer = PrimaryBlueDark,
    secondary = SecondaryNavy,
    onSecondary = CardSurface,
    background = AppBackground,
    onBackground = SecondaryNavy,
    surface = CardSurface,
    onSurface = SecondaryNavy,
    surfaceVariant = PrimaryBlueSoft,
    onSurfaceVariant = SlateText,
    error = ExpenseRed,
    onError = CardSurface,
    outline = CardBorder
)

@Composable
fun MyKharchaTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = MyKharchaTypography,
        shapes = MyKharchaShapes,
        content = content
    )
}
