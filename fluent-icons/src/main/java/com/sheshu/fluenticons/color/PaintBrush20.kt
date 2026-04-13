package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PaintBrush20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PaintBrush20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0853737f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                start = Offset(8f, -0.5f),
                end = Offset(13f, 12.5f)
            )
        ) {
            moveTo(5f, 2.5f)
            curveTo(5f, 2.224f, 5.224f, 2f, 5.5f, 2f)
            horizontalLineToRelative(9f)
            curveTo(14.776f, 2f, 15f, 2.224f, 15f, 2.5f)
            verticalLineToRelative(7.501f)
            horizontalLineTo(5f)
            verticalLineTo(2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFFAC80FF),
                    1f to Color(0xFF5750E2)
                ),
                start = Offset(5f, 6.5f),
                end = Offset(5.8664f, 20.1858f)
            )
        ) {
            moveTo(7f, 13.003f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(10f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineTo(15f)
            verticalLineToRelative(1.503f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-0.996f)
            verticalLineToRelative(2.998f)
            curveToRelative(0f, 1.104f, -0.895f, 2f, -2f, 2f)
            curveToRelative(-1.104f, 0f, -2f, -0.896f, -2f, -2f)
            verticalLineToRelative(-2.998f)
            horizontalLineTo(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF5750E2)
                ),
                start = Offset(7.37804f, 9.13294f),
                end = Offset(7.44871f, 10.2615f)
            )
        ) {
            moveTo(5f, 9.5f)
            curveTo(5f, 9.224f, 5.224f, 9f, 5.5f, 9f)
            horizontalLineToRelative(9f)
            curveTo(14.776f, 9f, 15f, 9.224f, 15f, 9.5f)
            verticalLineTo(10f)
            horizontalLineTo(5f)
            verticalLineTo(9.5f)
            close()
            moveToRelative(5f, -5.001f)
            verticalLineTo(2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(2.499f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(10f, 4.775f, 10f, 4.499f)
            close()
            moveToRelative(2f, 1.002f)
            verticalLineTo(2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(3.501f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(12f, 5.777f, 12f, 5.501f)
            close()
        }
    }.build()
}
