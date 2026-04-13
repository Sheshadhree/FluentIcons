package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ListBar16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ListBar16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(3.075f, 0.285714f),
                end = Offset(13.2431f, 13.8553f)
            )
        ) {
            moveTo(5f, 14f)
            horizontalLineToRelative(7.75f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(5f)
            lineToRelative(-0.5f, 1.5f)
            lineTo(5f, 14f)
            close()
            moveToRelative(0f, -4f)
            horizontalLineToRelative(7.75f)
            curveTo(13.44f, 10f, 14f, 9.44f, 14f, 8.75f)
            verticalLineToRelative(-1.5f)
            curveTo(14f, 6.56f, 13.44f, 6f, 12.75f, 6f)
            horizontalLineTo(5f)
            lineTo(4.5f, 8f)
            lineTo(5f, 10f)
            close()
            moveToRelative(0f, -5f)
            horizontalLineToRelative(7.75f)
            curveTo(13.44f, 5f, 14f, 4.44f, 14f, 3.75f)
            verticalLineToRelative(-0.5f)
            curveTo(14f, 2.56f, 13.44f, 2f, 12.75f, 2f)
            horizontalLineTo(5f)
            lineTo(4.5f, 3.5f)
            lineTo(5f, 5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(2.71341f, 3.59523f),
                end = Offset(7.3946f, 5.46393f)
            )
        ) {
            moveTo(5f, 6f)
            verticalLineToRelative(4f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 10f, 2f, 9.44f, 2f, 8.75f)
            verticalLineToRelative(-1.5f)
            curveTo(2f, 6.56f, 2.56f, 6f, 3.25f, 6f)
            horizontalLineTo(5f)
            close()
            moveToRelative(0f, -4f)
            verticalLineToRelative(3f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 5f, 2f, 4.44f, 2f, 3.75f)
            verticalLineToRelative(-0.5f)
            curveTo(2f, 2.56f, 2.56f, 2f, 3.25f, 2f)
            horizontalLineTo(5f)
            close()
            moveToRelative(0f, 9f)
            verticalLineToRelative(3f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 14f, 2f, 13.44f, 2f, 12.75f)
            verticalLineToRelative(-0.5f)
            curveTo(2f, 11.56f, 2.56f, 11f, 3.25f, 11f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
