package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Lightbulb16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Lightbulb16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFE06B),
                    0.376456f to Color(0xFFFFA43D),
                    1f to Color(0xFFE67505)
                ),
                center = Offset(4.78629f, 3.69356f),
                radius = 10.3164f
            )
        ) {
            moveTo(5.436f, 11.5f)
            lineToRelative(0.38f, 1.395f)
            curveTo(5.996f, 13.547f, 6.589f, 14f, 7.265f, 14f)
            horizontalLineToRelative(1.472f)
            curveToRelative(0.677f, 0f, 1.27f, -0.453f, 1.448f, -1.105f)
            lineToRelative(0.38f, -1.395f)
            horizontalLineTo(5.436f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD34719),
                    1f to Color(0x00D34719)
                ),
                start = Offset(7.99988f, 11.5f),
                end = Offset(8.00005f, 14f)
            )
        ) {
            moveTo(5.436f, 11.5f)
            lineToRelative(0.38f, 1.395f)
            curveTo(5.996f, 13.547f, 6.589f, 14f, 7.265f, 14f)
            horizontalLineToRelative(1.472f)
            curveToRelative(0.677f, 0f, 1.27f, -0.453f, 1.448f, -1.105f)
            lineToRelative(0.38f, -1.395f)
            horizontalLineTo(5.436f)
            close()
            moveToRelative(5.128f, 0f)
            horizontalLineTo(5.436f)
            lineToRelative(-0.41f, -1.505f)
            curveTo(5f, 9.902f, 4.94f, 9.803f, 4.845f, 9.707f)
            curveTo(4.015f, 8.893f, 3.5f, 7.756f, 3.5f, 6.5f)
            curveTo(3.5f, 4.015f, 5.515f, 2f, 8f, 2f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            curveToRelative(0f, 1.256f, -0.515f, 2.393f, -1.345f, 3.208f)
            curveTo(11.06f, 9.803f, 11f, 9.902f, 10.975f, 9.995f)
            lineTo(10.563f, 11.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFC7A3),
                    1f to Color(0xFFFF9C70)
                ),
                start = Offset(7.57274f, 11.3972f),
                end = Offset(8.44316f, 13.2781f)
            )
        ) {
            moveTo(10.427f, 12f)
            lineToRelative(0.273f, -1f)
            horizontalLineTo(5.3f)
            lineToRelative(0.272f, 1f)
            horizontalLineToRelative(4.855f)
            close()
        }
    }.build()
}
