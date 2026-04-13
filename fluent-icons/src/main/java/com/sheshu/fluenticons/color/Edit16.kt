package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Edit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Edit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(8.63101f, 5.56297f),
                end = Offset(10.2809f, 10.0951f)
            )
        ) {
            moveTo(2.657f, 9.635f)
            lineTo(9.75f, 2.543f)
            lineToRelative(3.707f, 3.707f)
            lineToRelative(-7.093f, 7.092f)
            lineToRelative(-2.267f, -1.439f)
            lineToRelative(-1.44f, -2.268f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.255f to Color(0xFFFFD394),
                    1f to Color(0xFFFF921F)
                ),
                start = Offset(0.187307f, 10.9083f),
                end = Offset(4.27539f, 14.9717f)
            )
        ) {
            moveTo(2.964f, 9.328f)
            lineTo(2.657f, 9.635f)
            curveToRelative(-0.374f, 0.374f, -0.64f, 0.842f, -0.772f, 1.355f)
            lineToRelative(-0.87f, 3.385f)
            curveToRelative(-0.043f, 0.171f, 0.007f, 0.353f, 0.132f, 0.478f)
            curveToRelative(0.124f, 0.125f, 0.306f, 0.175f, 0.477f, 0.13f)
            lineToRelative(3.386f, -0.868f)
            curveToRelative(0.512f, -0.132f, 0.98f, -0.399f, 1.354f, -0.773f)
            lineToRelative(0.307f, -0.307f)
            reflectiveCurveToRelative(-1.285f, -0.3f, -2.346f, -1.361f)
            curveToRelative(-1.06f, -1.06f, -1.36f, -2.346f, -1.36f, -2.346f)
            close()
            moveToRelative(7.565f, -7.564f)
            curveToRelative(1.024f, -1.024f, 2.683f, -1.024f, 3.707f, 0f)
            reflectiveCurveToRelative(1.024f, 2.683f, 0f, 3.707f)
            lineToRelative(-1.908f, 1.908f)
            lineToRelative(-3.707f, -3.707f)
            lineToRelative(1.908f, -1.908f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFFFE994)
                ),
                start = Offset(10.921f, 6.11381f),
                end = Offset(7.29466f, 4.52804f)
            )
        ) {
            moveTo(8.266f, 4.027f)
            reflectiveCurveToRelative(0.295f, 1.29f, 1.356f, 2.35f)
            curveToRelative(1.06f, 1.062f, 2.351f, 1.357f, 2.351f, 1.357f)
            lineTo(13.4f, 6.308f)
            reflectiveCurveTo(12.11f, 6.01f, 11.05f, 4.95f)
            curveTo(9.99f, 3.889f, 9.691f, 2.6f, 9.691f, 2.6f)
            lineTo(8.266f, 4.027f)
            close()
        }
    }.build()
}
