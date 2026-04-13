package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Home32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Home32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF944600),
                    1f to Color(0xFFCD8E02)
                ),
                start = Offset(16f, 17f),
                end = Offset(8.47581f, 30.9383f)
            )
        ) {
            moveTo(11f, 17f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(12f)
            horizontalLineTo(11f)
            verticalLineTo(17f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFD394),
                    1f to Color(0xFFFFB357)
                ),
                start = Offset(5.48154f, 2.25606f),
                end = Offset(30.5958f, 23.0715f)
            )
        ) {
            moveTo(13.895f, 4.277f)
            curveToRelative(1.214f, -1.032f, 2.996f, -1.032f, 4.21f, 0f)
            lineToRelative(9.75f, 8.287f)
            curveTo(28.58f, 13.182f, 29f, 14.087f, 29f, 15.04f)
            verticalLineTo(26.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(20f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -1.102f, -0.89f, -1.995f, -1.991f, -2f)
            horizontalLineTo(13.99f)
            curveTo(12.891f, 18.005f, 12f, 18.898f, 12f, 20f)
            verticalLineToRelative(9f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 29f, 3f, 27.88f, 3f, 26.5f)
            verticalLineTo(15.04f)
            curveToRelative(0f, -0.953f, 0.419f, -1.858f, 1.145f, -2.476f)
            lineToRelative(9.75f, -8.287f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFEB4824)
                ),
                start = Offset(11.1525f, -1.37789f),
                end = Offset(17.1496f, 15.7268f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.958f, 5.313f)
            lineTo(3.448f, 15.506f)
            curveToRelative(-0.643f, 0.524f, -1.588f, 0.427f, -2.11f, -0.215f)
            curveToRelative(-0.524f, -0.642f, -0.428f, -1.587f, 0.214f, -2.11f)
            lineTo(14.723f, 2.45f)
            curveToRelative(0.761f, -0.62f, 1.86f, -0.597f, 2.593f, 0.055f)
            lineToRelative(13.181f, 11.096f)
            curveToRelative(0.62f, 0.55f, 0.676f, 1.499f, 0.125f, 2.118f)
            curveToRelative(-0.55f, 0.62f, -1.498f, 0.675f, -2.118f, 0.125f)
            lineTo(15.958f, 5.313f)
            close()
        }
    }.build()
}
