package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.BookOpen20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.BookOpen20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(5.10524f, 5.61947f),
                end = Offset(7.75685f, 20.5339f)
            )
        ) {
            moveTo(8f, 17f)
            curveToRelative(0.818f, 0f, 1.544f, -0.393f, 2f, -1f)
            lineToRelative(1f, -6f)
            lineToRelative(-1f, -5.5f)
            curveTo(9.544f, 3.893f, 8.818f, 3f, 8f, 3f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
            verticalLineToRelative(11f)
            curveTo(2f, 16.328f, 2.672f, 17f, 3.5f, 17f)
            horizontalLineTo(8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    0.908213f to Color(0xFF2052CB)
                ),
                start = Offset(16.5f, 3.5f),
                end = Offset(13.2516f, 20.5387f)
            )
        ) {
            moveTo(12f, 17f)
            curveToRelative(-0.818f, 0f, -1.544f, -0.393f, -2f, -1f)
            verticalLineTo(4.5f)
            curveTo(10f, 4f, 11f, 3f, 12f, 3f)
            horizontalLineToRelative(4.5f)
            curveTo(17.328f, 3f, 18f, 3.672f, 18f, 4.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    1f to Color(0xFF58AAFE)
                ),
                start = Offset(4f, 5.5f),
                end = Offset(18.5103f, 11.0548f)
            )
        ) {
            moveTo(3.5f, 3.5f)
            curveTo(3.5f, 3.224f, 3.724f, 3f, 4f, 3f)
            horizontalLineToRelative(4.5f)
            curveTo(9.328f, 3f, 10f, 3.672f, 10f, 4.5f)
            lineTo(10.5f, 9f)
            lineTo(10f, 13.5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(3.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.229224f to Color(0xFF9DEAFF),
                    0.853191f to Color(0xFF4894FE)
                ),
                start = Offset(16.5103f, 3.73035f),
                end = Offset(5f, 8f)
            )
        ) {
            moveTo(16.5f, 3.5f)
            curveTo(16.5f, 3.224f, 16.276f, 3f, 16f, 3f)
            horizontalLineToRelative(-4.5f)
            curveTo(10.672f, 3f, 10f, 3.672f, 10f, 4.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(3.5f)
            close()
        }
    }.build()
}
