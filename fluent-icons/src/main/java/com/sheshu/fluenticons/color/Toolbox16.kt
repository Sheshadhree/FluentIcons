package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Toolbox16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Toolbox16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(2.86398f, 3f),
                end = Offset(3.21192f, 5.17558f)
            )
        ) {
            moveTo(5.007f, 5.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-1f)
            close()
            moveTo(4f, 13f)
            curveToRelative(-1.105f, 0f, -2f, -0.896f, -2f, -2f)
            verticalLineTo(7.5f)
            horizontalLineToRelative(12f)
            verticalLineTo(11f)
            curveToRelative(0f, 1.104f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(1.25f, 3.875f),
                end = Offset(1.47709f, 11.0566f)
            )
        ) {
            moveTo(2f, 7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1f)
            horizontalLineTo(2f)
            verticalLineTo(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEFEFEF),
                    1f to Color(0xFFDADADA)
                ),
                start = Offset(2.85714f, 7f),
                end = Offset(3.35383f, 9.58512f)
            )
        ) {
            moveTo(10.5f, 7f)
            curveTo(10.776f, 7f, 11f, 7.224f, 11f, 7.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(10f, 9.776f, 10f, 9.5f)
            verticalLineToRelative(-2f)
            curveTo(10f, 7.224f, 10.224f, 7f, 10.5f, 7f)
            close()
            moveToRelative(-5f, 0f)
            curveTo(5.776f, 7f, 6f, 7.224f, 6f, 7.5f)
            verticalLineToRelative(2.004f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(5f, 9.78f, 5f, 9.503f)
            verticalLineTo(7.5f)
            curveTo(5f, 7.224f, 5.224f, 7f, 5.5f, 7f)
            close()
        }
    }.build()
}
