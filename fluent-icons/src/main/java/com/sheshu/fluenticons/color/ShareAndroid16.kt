package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ShareAndroid16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ShareAndroid16",
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
                start = Offset(2.88208f, 4.05251f),
                end = Offset(5.59312f, 12.2376f)
            )
        ) {
            moveTo(10.776f, 4.053f)
            lineToRelative(0.447f, 0.894f)
            lineTo(5.118f, 8f)
            lineToRelative(6.105f, 3.053f)
            lineToRelative(-0.447f, 0.894f)
            lineTo(2.882f, 8f)
            lineToRelative(7.894f, -3.947f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(12f, 11.9998f),
                radius = 2.91548f
            )
        ) {
            moveTo(10.776f, 4.053f)
            lineToRelative(0.447f, 0.894f)
            lineTo(5.118f, 8f)
            lineToRelative(6.105f, 3.053f)
            lineToRelative(-0.447f, 0.894f)
            lineTo(2.882f, 8f)
            lineToRelative(7.894f, -3.947f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(4f, 7.99977f),
                radius = 2.5f
            )
        ) {
            moveTo(10.776f, 4.053f)
            lineToRelative(0.447f, 0.894f)
            lineTo(5.118f, 8f)
            lineToRelative(6.105f, 3.053f)
            lineToRelative(-0.447f, 0.894f)
            lineTo(2.882f, 8f)
            lineToRelative(7.894f, -3.947f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.548597f to Color(0xFF70777D),
                    1f to Color(0x0070777D)
                ),
                center = Offset(12f, 3.99977f),
                radius = 2.91548f
            )
        ) {
            moveTo(10.776f, 4.053f)
            lineToRelative(0.447f, 0.894f)
            lineTo(5.118f, 8f)
            lineToRelative(6.105f, 3.053f)
            lineToRelative(-0.447f, 0.894f)
            lineTo(2.882f, 8f)
            lineToRelative(7.894f, -3.947f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.528807f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0078D4)
                ),
                center = Offset(7.58333f, 5.54167f),
                radius = 10.8171f
            )
        ) {
            moveTo(10f, 12f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            moveTo(2f, 8f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            moveToRelative(8f, -4f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
        }
    }.build()
}
