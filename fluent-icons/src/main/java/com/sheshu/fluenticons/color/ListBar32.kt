package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ListBar32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ListBar32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(7.3f, 0.571429f),
                end = Offset(27.9193f, 26.6401f)
            )
        ) {
            moveTo(11f, 28f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineTo(11f)
            lineToRelative(-1f, 3.5f)
            lineToRelative(1f, 3.5f)
            close()
            moveToRelative(0f, -9f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineTo(11f)
            lineToRelative(-1f, 3f)
            lineToRelative(1f, 3f)
            close()
            moveToRelative(0f, -8f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-2f)
            curveTo(28f, 5.12f, 26.88f, 4f, 25.5f, 4f)
            horizontalLineTo(11f)
            lineToRelative(-1f, 3.5f)
            lineToRelative(1f, 3.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(5.66463f, 7.19046f),
                end = Offset(16.0709f, 12.0369f)
            )
        ) {
            moveTo(11f, 13f)
            verticalLineToRelative(6f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 19f, 4f, 17.88f, 4f, 16.5f)
            verticalLineToRelative(-1f)
            curveTo(4f, 14.12f, 5.12f, 13f, 6.5f, 13f)
            horizontalLineTo(11f)
            close()
            moveToRelative(0f, -9f)
            verticalLineToRelative(7f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 11f, 4f, 9.88f, 4f, 8.5f)
            verticalLineToRelative(-2f)
            curveTo(4f, 5.12f, 5.12f, 4f, 6.5f, 4f)
            horizontalLineTo(11f)
            close()
            moveToRelative(0f, 17f)
            verticalLineToRelative(7f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 28f, 4f, 26.88f, 4f, 25.5f)
            verticalLineToRelative(-2f)
            curveTo(4f, 22.12f, 5.12f, 21f, 6.5f, 21f)
            horizontalLineTo(11f)
            close()
        }
    }.build()
}
