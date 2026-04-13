package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ListBar24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ListBar24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(5.47497f, 0.428572f),
                end = Offset(20.9394f, 19.9803f)
            )
        ) {
            moveTo(8f, 21f)
            horizontalLineToRelative(11f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(8f)
            lineToRelative(-0.5f, 2.5f)
            lineTo(8f, 21f)
            close()
            moveToRelative(0f, -6.5f)
            horizontalLineToRelative(11f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(8f)
            lineTo(7.5f, 12f)
            lineTo(8f, 14.5f)
            close()
            moveTo(8f, 8f)
            horizontalLineToRelative(11f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(8f)
            lineTo(7.5f, 5.5f)
            lineTo(8f, 8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(4.18904f, 5.39284f),
                end = Offset(11.7474f, 8.74539f)
            )
        ) {
            moveTo(8f, 9.5f)
            verticalLineToRelative(5f)
            horizontalLineTo(5f)
            curveToRelative(-1.104f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.105f, 0.896f, -2f, 2f, -2f)
            horizontalLineToRelative(3f)
            close()
            moveTo(8f, 3f)
            verticalLineToRelative(5f)
            horizontalLineTo(5f)
            curveTo(3.896f, 8f, 3f, 7.105f, 3f, 6f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.896f, -2f, 2f, -2f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(0f, 13f)
            verticalLineToRelative(5f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(3f)
            close()
        }
    }.build()
}
