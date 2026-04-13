package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Book20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Book20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    0.715705f to Color(0xFF58AAFE)
                ),
                start = Offset(10f, 17f),
                end = Offset(10f, 15f)
            )
        ) {
            moveTo(4.5f, 15f)
            horizontalLineTo(16f)
            reflectiveCurveToRelative(-0.5f, 0.5f, -0.5f, 1.5f)
            reflectiveCurveToRelative(0.5f, 1f, 0.5f, 1f)
            horizontalLineTo(5.5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(15f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(8.14033f, 4.99369f),
                end = Offset(10.7591f, 22.1785f)
            )
        ) {
            moveTo(4f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(15.776f, 17f, 15.5f, 17f)
            horizontalLineTo(6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(8.75898f, 3.48531f),
                end = Offset(12.1155f, 9.05541f)
            )
        ) {
            moveTo(6f, 5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(7f)
            curveTo(6.448f, 7f, 6f, 6.552f, 6f, 6f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}
