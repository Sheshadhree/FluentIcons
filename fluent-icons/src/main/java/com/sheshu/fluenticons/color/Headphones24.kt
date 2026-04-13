package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Headphones24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Headphones24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(-3.42857f, 3f),
                end = Offset(-0.856476f, 13.0517f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12f, 4f)
            curveToRelative(-4.418f, 0f, -8f, 3.582f, -8f, 8f)
            verticalLineToRelative(2f)
            lineToRelative(-1f, 1f)
            lineToRelative(-1f, -1f)
            verticalLineToRelative(-2f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            verticalLineToRelative(2f)
            lineToRelative(-1f, 1f)
            lineToRelative(-1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -4.418f, -3.582f, -8f, -8f, -8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(17.75f, 14f),
                end = Offset(17.75f, 22f)
            )
        ) {
            moveTo(3.5f, 14f)
            verticalLineToRelative(7.599f)
            curveTo(3.941f, 21.854f, 4.454f, 22f, 5f, 22f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(3.5f)
            close()
            moveToRelative(17f, 7.599f)
            verticalLineTo(14f)
            horizontalLineTo(16f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.546f, 0f, 1.059f, -0.146f, 1.5f, -0.401f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(3f, 14f),
                end = Offset(3f, 21.8293f)
            )
        ) {
            moveTo(2f, 19f)
            curveToRelative(0f, 1.306f, 0.835f, 2.418f, 2f, 2.83f)
            verticalLineTo(14f)
            horizontalLineTo(2f)
            verticalLineToRelative(5f)
            close()
            moveToRelative(20f, 0f)
            curveToRelative(0f, 1.306f, -0.835f, 2.418f, -2f, 2.83f)
            verticalLineTo(14f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(5f)
            close()
        }
    }.build()
}
