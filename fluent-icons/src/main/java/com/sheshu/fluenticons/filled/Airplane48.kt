package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Airplane48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Airplane48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.01f, 3f)
            curveToRelative(-1.195f, 0f, -2.128f, 1.033f, -2.008f, 2.223f)
            lineToRelative(1.512f, 14.93f)
            lineToRelative(-4.367f, 0.273f)
            lineToRelative(-2.494f, -4.365f)
            curveTo(12.925f, 14.786f, 11.57f, 14f, 10.102f, 14f)
            curveTo(8.942f, 14f, 8f, 14.941f, 8f, 16.102f)
            verticalLineToRelative(4.833f)
            lineTo(6.956f, 21f)
            curveTo(5.319f, 21.024f, 4f, 22.358f, 4f, 24f)
            reflectiveCurveToRelative(1.32f, 2.976f, 2.956f, 3f)
            lineTo(8f, 27.065f)
            verticalLineToRelative(4.833f)
            curveTo(8f, 33.058f, 8.941f, 34f, 10.102f, 34f)
            curveToRelative(1.468f, 0f, 2.823f, -0.786f, 3.551f, -2.06f)
            lineToRelative(2.494f, -4.366f)
            lineToRelative(4.367f, 0.273f)
            lineToRelative(-1.512f, 14.93f)
            curveTo(18.882f, 43.968f, 19.815f, 45f, 21.011f, 45f)
            curveToRelative(1.494f, 0f, 2.85f, -0.873f, 3.47f, -2.232f)
            lineTo(30.982f, 28.5f)
            curveTo(33.64f, 28.667f, 36.338f, 29f, 39f, 29f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            curveToRelative(-2.662f, 0f, -5.36f, 0.333f, -8.018f, 0.499f)
            lineToRelative(-6.5f, -14.267f)
            curveTo(23.861f, 3.872f, 22.504f, 3f, 21.01f, 3f)
            close()
        }
    }.build()
}
