package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Code24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Code24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFC76EFB),
                    1f to Color(0xFF8B52F4)
                ),
                start = Offset(2.58824f, 2.93305f),
                end = Offset(20.693f, 22.3089f)
            )
        ) {
            moveTo(8.085f, 18.61f)
            lineToRelative(5.997f, -14.004f)
            curveToRelative(0.217f, -0.507f, 0.805f, -0.743f, 1.313f, -0.525f)
            curveToRelative(0.471f, 0.202f, 0.708f, 0.723f, 0.565f, 1.203f)
            lineToRelative(-0.04f, 0.11f)
            lineToRelative(-5.996f, 14.004f)
            curveToRelative(-0.217f, 0.508f, -0.805f, 0.743f, -1.313f, 0.526f)
            curveTo(8.14f, 19.722f, 7.903f, 19.2f, 8.046f, 18.72f)
            lineToRelative(0.04f, -0.11f)
            lineToRelative(5.996f, -14.005f)
            lineTo(8.085f, 18.61f)
            close()
            moveToRelative(-5.792f, -7.317f)
            lineToRelative(4f, -4f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.36f, 0.36f, 0.388f, 0.928f, 0.083f, 1.32f)
            lineTo(7.707f, 8.707f)
            lineTo(4.414f, 12f)
            lineToRelative(3.293f, 3.293f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.36f, 0.36f, -0.928f, 0.388f, -1.32f, 0.083f)
            lineToRelative(-0.094f, -0.083f)
            lineToRelative(-4f, -4f)
            curveToRelative(-0.36f, -0.36f, -0.388f, -0.928f, -0.083f, -1.32f)
            lineToRelative(0.083f, -0.094f)
            lineToRelative(4f, -4f)
            lineToRelative(-4f, 4f)
            close()
            moveToRelative(14f, -4.001f)
            curveToRelative(0.36f, -0.36f, 0.927f, -0.388f, 1.32f, -0.083f)
            lineToRelative(0.093f, 0.083f)
            lineToRelative(4.001f, 4f)
            curveToRelative(0.36f, 0.362f, 0.388f, 0.93f, 0.083f, 1.321f)
            lineToRelative(-0.083f, 0.095f)
            lineToRelative(-4.001f, 3.995f)
            curveToRelative(-0.391f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.36f, -0.361f, -0.388f, -0.929f, -0.083f, -1.32f)
            lineToRelative(0.084f, -0.095f)
            lineToRelative(3.292f, -3.289f)
            lineToRelative(-3.293f, -3.293f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            close()
        }
    }.build()
}
