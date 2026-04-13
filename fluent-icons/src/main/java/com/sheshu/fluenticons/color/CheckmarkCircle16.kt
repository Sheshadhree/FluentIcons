package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CheckmarkCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CheckmarkCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(2.42857f, 4.25f),
                end = Offset(10.71f, 12.8541f)
            )
        ) {
            moveTo(2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFE3FFD9)
                ),
                start = Offset(6.12018f, 6.44888f),
                end = Offset(7.07576f, 11.2099f)
            )
        ) {
            moveTo(10.12f, 6.164f)
            lineTo(7.25f, 9.042f)
            lineTo(5.854f, 7.646f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1.75f, 1.75f)
            curveToRelative(0.196f, 0.195f, 0.513f, 0.195f, 0.708f, 0f)
            lineToRelative(3.224f, -3.234f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.195f, -0.513f, -0.195f, -0.708f, 0.001f)
            close()
        }
    }.build()
}
