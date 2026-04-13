package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Lightbulb16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Lightbulb16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 6.5f)
            curveTo(4.5f, 4.567f, 6.067f, 3f, 8f, 3f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            curveToRelative(0f, 0.977f, -0.4f, 1.86f, -1.046f, 2.495f)
            curveToRelative(-0.193f, 0.19f, -0.363f, 0.437f, -0.445f, 0.736f)
            lineTo(9.664f, 11f)
            horizontalLineTo(6.336f)
            lineTo(5.99f, 9.731f)
            curveToRelative(-0.08f, -0.3f, -0.25f, -0.546f, -0.444f, -0.736f)
            curveTo(4.9f, 8.36f, 4.5f, 7.477f, 4.5f, 6.5f)
            close()
            moveTo(6.61f, 12f)
            horizontalLineToRelative(2.78f)
            lineToRelative(-0.17f, 0.632f)
            curveTo(9.159f, 12.849f, 8.962f, 13f, 8.736f, 13f)
            horizontalLineTo(7.264f)
            curveToRelative(-0.226f, 0f, -0.423f, -0.15f, -0.483f, -0.368f)
            lineTo(6.61f, 12f)
            close()
            moveTo(8f, 2f)
            curveTo(5.515f, 2f, 3.5f, 4.015f, 3.5f, 6.5f)
            curveToRelative(0f, 1.256f, 0.515f, 2.393f, 1.345f, 3.208f)
            curveTo(4.94f, 9.803f, 5f, 9.902f, 5.025f, 9.995f)
            lineToRelative(0.792f, 2.9f)
            curveTo(5.995f, 13.547f, 6.587f, 14f, 7.264f, 14f)
            horizontalLineToRelative(1.472f)
            curveToRelative(0.677f, 0f, 1.27f, -0.453f, 1.447f, -1.105f)
            lineToRelative(0.791f, -2.9f)
            curveTo(11f, 9.902f, 11.06f, 9.803f, 11.155f, 9.707f)
            curveTo(11.985f, 8.893f, 12.5f, 7.756f, 12.5f, 6.5f)
            curveTo(12.5f, 4.015f, 10.485f, 2f, 8f, 2f)
            close()
        }
    }.build()
}
