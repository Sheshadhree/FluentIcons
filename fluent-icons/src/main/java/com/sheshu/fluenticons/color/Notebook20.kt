package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Notebook20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Notebook20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD373FC),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(14.5f, -2.5f),
                end = Offset(23.0548f, 17.7904f)
            )
        ) {
            moveTo(14.5f, 4f)
            horizontalLineToRelative(2f)
            curveTo(16.776f, 4f, 17f, 4.224f, 17f, 4.5f)
            verticalLineToRelative(2f)
            curveTo(17f, 6.776f, 16.776f, 7f, 16.5f, 7f)
            horizontalLineToRelative(-2f)
            verticalLineTo(4f)
            close()
            moveToRelative(0f, 4f)
            horizontalLineToRelative(2f)
            curveTo(16.776f, 8f, 17f, 8.224f, 17f, 8.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-2f)
            verticalLineTo(8f)
            close()
            moveToRelative(0f, 4f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE587F2),
                    1f to Color(0xFF816CDE)
                ),
                start = Offset(1.5f, 2f),
                end = Offset(0.604747f, 19.9052f)
            )
        ) {
            moveTo(5f, 2f)
            curveTo(3.895f, 2f, 3f, 2.895f, 3f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(8.50001f, 1f),
                radius = 18.3207f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(5f, 2f)
            curveTo(3.895f, 2f, 3f, 2.895f, 3f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDD3FF),
                    1f to Color(0xFFF3D8FF)
                ),
                start = Offset(6.5f, 5f),
                end = Offset(11.2483f, 10.1234f)
            )
        ) {
            moveTo(5.5f, 5f)
            curveTo(5.224f, 5f, 5f, 5.224f, 5f, 5.5f)
            verticalLineToRelative(1f)
            curveTo(5f, 6.776f, 5.224f, 7f, 5.5f, 7f)
            horizontalLineToRelative(7f)
            curveTo(12.776f, 7f, 13f, 6.776f, 13f, 6.5f)
            verticalLineToRelative(-1f)
            curveTo(13f, 5.224f, 12.776f, 5f, 12.5f, 5f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
