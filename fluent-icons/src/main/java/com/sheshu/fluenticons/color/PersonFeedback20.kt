package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PersonFeedback20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PersonFeedback20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(4.37804f, 12.7976f),
                end = Offset(6.61628f, 18.7542f)
            )
        ) {
            moveTo(10.5f, 12f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.971f, -1.86f, 4f, -5f, 4f)
            curveToRelative(-3.14f, 0f, -5f, -2.029f, -5f, -4f)
            verticalLineToRelative(-0.5f)
            curveTo(2f, 12.672f, 2.672f, 12f, 3.5f, 12f)
            horizontalLineToRelative(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(7f, 11.2857f),
                end = Offset(10.1641f, 21.1388f)
            )
        ) {
            moveTo(10.5f, 12f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.971f, -1.86f, 4f, -5f, 4f)
            curveToRelative(-3.14f, 0f, -5f, -2.029f, -5f, -4f)
            verticalLineToRelative(-0.5f)
            curveTo(2f, 12.672f, 2.672f, 12f, 3.5f, 12f)
            horizontalLineToRelative(7f)
            close()
            moveTo(7f, 5.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveTo(8.519f, 11f, 7f, 11f)
            reflectiveCurveTo(4.25f, 9.769f, 4.25f, 8.25f)
            reflectiveCurveTo(5.481f, 5.5f, 7f, 5.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFAB500),
                    0.535356f to Color(0xFFFE8401),
                    1f to Color(0xFFFB5937)
                ),
                center = Offset(8.15385f, -0.464058f),
                radius = 14.8043f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12f, 2f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            verticalLineToRelative(1.227f)
            curveToRelative(0f, 0.742f, 0.94f, 1.065f, 1.396f, 0.479f)
            lineTo(14.722f, 8f)
            horizontalLineTo(16f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
