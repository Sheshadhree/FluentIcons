package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Broom32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Broom32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(28.293f, 2.293f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.023f, 0f, 1.414f)
            lineToRelative(-9.34f, 9.34f)
            curveToRelative(2.21f, 2.894f, 1.99f, 7.01f, -0.66f, 9.66f)
            lineTo(18.914f, 23.5f)
            lineTo(8.524f, 13.11f)
            lineToRelative(0.781f, -0.73f)
            curveToRelative(2.633f, -2.62f, 6.742f, -2.952f, 9.647f, -0.746f)
            lineToRelative(9.34f, -9.341f)
            close()
            moveTo(6.773f, 14.187f)
            lineTo(2.586f, 16.09f)
            curveToRelative(-0.298f, 0.135f, -0.511f, 0.409f, -0.57f, 0.731f)
            curveToRelative(-0.058f, 0.323f, 0.045f, 0.654f, 0.277f, 0.886f)
            lineToRelative(12f, 12f)
            curveToRelative(0.232f, 0.232f, 0.563f, 0.335f, 0.886f, 0.277f)
            curveToRelative(0.322f, -0.059f, 0.596f, -0.272f, 0.731f, -0.57f)
            lineToRelative(1.903f, -4.187f)
            lineToRelative(-11.04f, -11.04f)
            close()
        }
    }.build()
}
