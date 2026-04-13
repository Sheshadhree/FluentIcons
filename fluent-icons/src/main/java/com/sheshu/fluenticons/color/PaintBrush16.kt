package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PaintBrush16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PaintBrush16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0853737f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                start = Offset(6f, -1.18723f),
                end = Offset(9.94648f, 10.5409f)
            )
        ) {
            moveTo(3f, 1.5f)
            curveTo(3f, 1.224f, 3.224f, 1f, 3.5f, 1f)
            horizontalLineToRelative(9f)
            curveTo(12.776f, 1f, 13f, 1.224f, 13f, 1.5f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineTo(1.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFAC80FF),
                    1f to Color(0xFF5750E2)
                ),
                start = Offset(3f, 4.85317f),
                end = Offset(3.67501f, 16.9385f)
            )
        ) {
            moveTo(13f, 7.5f)
            horizontalLineTo(3f)
            verticalLineTo(9f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(2.5f)
            curveTo(6.5f, 14.328f, 7.172f, 15f, 8f, 15f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(11f)
            horizontalLineTo(11f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(7.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF5750E2)
                ),
                start = Offset(5.37804f, 7.13294f),
                end = Offset(5.44871f, 8.26145f)
            )
        ) {
            moveTo(3f, 7.5f)
            curveTo(3f, 7.224f, 3.224f, 7f, 3.5f, 7f)
            horizontalLineToRelative(9f)
            curveTo(12.776f, 7f, 13f, 7.224f, 13f, 7.5f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineTo(7.5f)
            close()
            moveTo(10f, 1f)
            verticalLineToRelative(3.5f)
            curveTo(10f, 4.776f, 10.224f, 5f, 10.5f, 5f)
            reflectiveCurveTo(11f, 4.776f, 11f, 4.5f)
            verticalLineTo(1f)
            horizontalLineToRelative(-1f)
            close()
            moveTo(9f, 3.5f)
            verticalLineTo(1f)
            horizontalLineTo(8f)
            verticalLineToRelative(2.5f)
            curveTo(8f, 3.776f, 8.224f, 4f, 8.5f, 4f)
            reflectiveCurveTo(9f, 3.776f, 9f, 3.5f)
            close()
        }
    }.build()
}
