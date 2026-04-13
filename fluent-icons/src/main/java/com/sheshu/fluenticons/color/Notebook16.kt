package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Notebook16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Notebook16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD373FC),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(12.5f, -0.727273f),
                end = Offset(18.3082f, 14.4263f)
            )
        ) {
            moveTo(12.5f, 4f)
            horizontalLineToRelative(1.625f)
            curveTo(14.332f, 4f, 14.5f, 4.168f, 14.5f, 4.375f)
            verticalLineToRelative(1.25f)
            curveTo(14.5f, 5.832f, 14.332f, 6f, 14.125f, 6f)
            horizontalLineTo(12.5f)
            verticalLineTo(4f)
            close()
            moveToRelative(1.625f, 3f)
            horizontalLineTo(12.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(1.625f)
            curveTo(14.332f, 9f, 14.5f, 8.832f, 14.5f, 8.625f)
            verticalLineToRelative(-1.25f)
            curveTo(14.5f, 7.168f, 14.332f, 7f, 14.125f, 7f)
            close()
            moveTo(12.5f, 10f)
            horizontalLineToRelative(1.625f)
            curveToRelative(0.207f, 0f, 0.375f, 0.168f, 0.375f, 0.375f)
            verticalLineToRelative(1.25f)
            curveToRelative(0f, 0.207f, -0.168f, 0.375f, -0.375f, 0.375f)
            horizontalLineTo(12.5f)
            verticalLineToRelative(-2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE587F2),
                    1f to Color(0xFF816CDE)
                ),
                start = Offset(0.625f, 1f),
                end = Offset(-0.122905f, 16.6706f)
            )
        ) {
            moveTo(3.75f, 1f)
            curveTo(2.784f, 1f, 2f, 1.784f, 2f, 2.75f)
            verticalLineToRelative(10.5f)
            curveTo(2f, 14.216f, 2.784f, 15f, 3.75f, 15f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(2.75f)
            curveTo(13f, 1.784f, 12.216f, 1f, 11.25f, 1f)
            horizontalLineToRelative(-7.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.5f to Color(0x00DD3CE2),
                    1f to Color(0xFFDD3CE2)
                ),
                center = Offset(7.04167f, 0.125f),
                radius = 16.0803f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(3.75f, 1f)
            curveTo(2.784f, 1f, 2f, 1.784f, 2f, 2.75f)
            verticalLineToRelative(10.5f)
            curveTo(2f, 14.216f, 2.784f, 15f, 3.75f, 15f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(2.75f)
            curveTo(13f, 1.784f, 12.216f, 1f, 11.25f, 1f)
            horizontalLineToRelative(-7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDD3FF),
                    1f to Color(0xFFF3D8FF)
                ),
                start = Offset(5.3125f, 3f),
                end = Offset(10.0667f, 7.48854f)
            )
        ) {
            moveTo(4f, 3.75f)
            curveTo(4f, 3.336f, 4.336f, 3f, 4.75f, 3f)
            horizontalLineToRelative(5.5f)
            curveTo(10.664f, 3f, 11f, 3.336f, 11f, 3.75f)
            verticalLineToRelative(0.5f)
            curveTo(11f, 4.664f, 10.664f, 5f, 10.25f, 5f)
            horizontalLineToRelative(-5.5f)
            curveTo(4.336f, 5f, 4f, 4.664f, 4f, 4.25f)
            verticalLineToRelative(-0.5f)
            close()
        }
    }.build()
}
