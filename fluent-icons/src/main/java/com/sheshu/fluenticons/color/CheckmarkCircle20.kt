package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CheckmarkCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CheckmarkCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(2.57143f, 5f),
                end = Offset(13.6134f, 16.4721f)
            )
        ) {
            moveTo(18f, 10f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFE3FFD9)
                ),
                start = Offset(7.8125f, 8.01003f),
                end = Offset(8.9497f, 13.6303f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13.354f, 7.646f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.707f)
            curveToRelative(0.195f, -0.196f, 0.511f, -0.196f, 0.707f, 0f)
            lineTo(9f, 11.293f)
            lineToRelative(3.646f, -3.646f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            close()
        }
    }.build()
}
