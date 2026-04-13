package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Board24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Board24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB0F098),
                    1f to Color(0xFF52D17C)
                ),
                start = Offset(7.66639f, 11.4539f),
                end = Offset(12.7211f, 23.5634f)
            )
        ) {
            moveTo(11.999f, 15f)
            lineToRelative(4.501f, -1f)
            lineToRelative(4.5f, 1f)
            verticalLineToRelative(2.752f)
            curveToRelative(0f, 1.795f, -1.454f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(12f)
            lineTo(11f, 18f)
            lineToRelative(0.999f, -3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF309C61)
                ),
                start = Offset(13.0003f, 4.33333f),
                end = Offset(20.1034f, 13.3225f)
            )
        ) {
            moveTo(17.751f, 3f)
            curveToRelative(1.733f, 0f, 3.15f, 1.356f, 3.245f, 3.066f)
            lineToRelative(0.005f, 0.184f)
            lineTo(21f, 15f)
            horizontalLineToRelative(-9f)
            lineToRelative(-1f, -6f)
            lineToRelative(1.001f, -6f)
            horizontalLineToRelative(5.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    1f to Color(0xFF1A7F7C)
                ),
                start = Offset(4.28571f, 10.0529f),
                end = Offset(11.7475f, 17.1987f)
            )
        ) {
            moveTo(11.999f, 9f)
            lineTo(12f, 21.001f)
            horizontalLineTo(6.25f)
            curveToRelative(-1.733f, 0f, -3.15f, -1.356f, -3.245f, -3.065f)
            lineTo(3f, 17.752f)
            verticalLineTo(9f)
            lineToRelative(4.5f, -1f)
            lineToRelative(4.499f, 1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB0F098),
                    1f to Color(0xFF64DE89)
                ),
                start = Offset(4.28586f, 4.2f),
                end = Offset(6.6498f, 10.3216f)
            )
        ) {
            moveTo(12.001f, 3f)
            lineTo(12f, 9f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.457f, 3f, 6.25f, 3f)
            horizontalLineToRelative(5.751f)
            close()
        }
    }.build()
}
