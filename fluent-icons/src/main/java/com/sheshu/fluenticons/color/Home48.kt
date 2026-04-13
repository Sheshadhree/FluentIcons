package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Home48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Home48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02)
                ),
                start = Offset(24.0674f, 27f),
                end = Offset(13.4808f, 44.6501f)
            )
        ) {
            moveTo(18.067f, 27f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(16f)
            horizontalLineToRelative(-12f)
            verticalLineTo(27f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFD394),
                    1f to Color(0xFFFFB357)
                ),
                start = Offset(10.3125f, 5.23952f),
                end = Offset(45.1728f, 31.9998f)
            )
        ) {
            moveTo(26.461f, 7.855f)
            curveToRelative(-1.398f, -1.14f, -3.389f, -1.14f, -4.787f, 0f)
            lineTo(8.499f, 18.597f)
            curveToRelative(-0.905f, 0.737f, -1.432f, 1.852f, -1.432f, 3.031f)
            verticalLineToRelative(17.485f)
            curveTo(7.067f, 41.26f, 8.78f, 43f, 10.892f, 43f)
            horizontalLineToRelative(8.175f)
            verticalLineTo(30.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.381f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineTo(43f)
            horizontalLineToRelative(8.175f)
            curveToRelative(2.113f, 0f, 3.825f, -1.74f, 3.825f, -3.887f)
            verticalLineTo(21.628f)
            curveToRelative(0f, -1.179f, -0.526f, -2.294f, -1.43f, -3.031f)
            lineTo(26.46f, 7.855f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824)
                ),
                start = Offset(17.8174f, 0.724922f),
                end = Offset(25.3077f, 22.4516f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(24.068f, 9.329f)
            lineToRelative(-16f, 13.215f)
            curveToRelative(-0.862f, 0.699f, -2.138f, 0.581f, -2.852f, -0.262f)
            curveToRelative(-0.714f, -0.844f, -0.594f, -2.095f, 0.267f, -2.794f)
            lineTo(22.28f, 5.628f)
            curveToRelative(1.019f, -0.828f, 2.492f, -0.838f, 3.523f, -0.024f)
            lineToRelative(16.805f, 13.588f)
            curveToRelative(0.872f, 0.687f, 1.009f, 1.936f, 0.307f, 2.79f)
            curveToRelative(-0.702f, 0.853f, -1.977f, 0.987f, -2.848f, 0.3f)
            lineToRelative(-16f, -12.953f)
            close()
        }
    }.build()
}
