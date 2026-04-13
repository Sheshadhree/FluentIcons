package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Book16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Book16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9DEAFF),
                    0.715705f to Color(0xFF58AAFE)
                ),
                start = Offset(9.5f, 14f),
                end = Offset(9.5f, 12f)
            )
        ) {
            moveTo(3.5f, 12.5f)
            horizontalLineToRelative(9.313f)
            reflectiveCurveTo(12.5f, 13f, 12.5f, 13.5f)
            reflectiveCurveToRelative(0.313f, 1f, 0.313f, 1f)
            horizontalLineTo(5f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF20AC9D),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(6.45027f, 3.61947f),
                end = Offset(8.85069f, 18.6212f)
            )
        ) {
            moveTo(11f, 1f)
            horizontalLineTo(5f)
            curveTo(3.895f, 1f, 3f, 1.895f, 3f, 3f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 14f, 12.5f, 14f)
            horizontalLineTo(5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-0.003f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(3f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF9FF0F9),
                    1f to Color(0xFF6CE0FF)
                ),
                start = Offset(7.06924f, 2.48531f),
                end = Offset(10.7765f, 7.09941f)
            )
        ) {
            moveTo(6f, 3f)
            curveTo(5.448f, 3f, 5f, 3.448f, 5f, 4f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
