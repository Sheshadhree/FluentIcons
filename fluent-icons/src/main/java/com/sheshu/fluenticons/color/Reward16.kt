package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Reward16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Reward16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF1A7F7C)
                ),
                start = Offset(14f, 2.5335f),
                end = Offset(9.63747f, 7.31163f)
            )
        ) {
            moveTo(10f, 8f)
            lineToRelative(3.295f, -2.06f)
            curveTo(13.734f, 5.667f, 14f, 5.187f, 14f, 4.67f)
            verticalLineTo(3.5f)
            curveTo(14f, 2.672f, 13.328f, 2f, 12.5f, 2f)
            horizontalLineTo(10f)
            lineTo(9.5f, 5f)
            lineTo(10f, 8f)
            close()
            moveTo(6f, 2f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
            verticalLineToRelative(1.169f)
            curveTo(2f, 5.186f, 2.266f, 5.667f, 2.705f, 5.94f)
            lineTo(6f, 8f)
            lineToRelative(0.5f, -3f)
            lineTo(6f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF76EB95),
                    1f to Color(0xFF1EC8B0)
                ),
                start = Offset(8f, 1.12688f),
                end = Offset(10.5679f, 8.02523f)
            )
        ) {
            moveTo(10f, 2f)
            horizontalLineTo(6f)
            verticalLineToRelative(6f)
            lineToRelative(1.205f, 0.753f)
            curveToRelative(0.486f, 0.304f, 1.104f, 0.304f, 1.59f, 0f)
            lineTo(10f, 8f)
            verticalLineTo(2f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.771547f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(-7.96429f, -13f),
                radius = 33.4905f
            )
        ) {
            moveTo(11f, 11f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
        }
    }.build()
}
