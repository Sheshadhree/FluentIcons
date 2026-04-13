package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PenOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PenOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 15.06f)
            lineToRelative(6.72f, 6.72f)
            curveToRelative(0.292f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.294f, -0.767f, -0.294f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.292f, -0.293f, 0.767f, 0f, 1.06f)
            lineTo(8.94f, 10f)
            lineToRelative(-5f, 4.999f)
            curveToRelative(-0.406f, 0.406f, -0.692f, 0.917f, -0.825f, 1.476f)
            lineTo(2.02f, 21.077f)
            curveToRelative(-0.06f, 0.253f, 0.015f, 0.52f, 0.2f, 0.704f)
            curveToRelative(0.184f, 0.184f, 0.45f, 0.26f, 0.704f, 0.199f)
            lineToRelative(4.601f, -1.096f)
            curveToRelative(0.56f, -0.133f, 1.07f, -0.418f, 1.477f, -0.825f)
            lineTo(14f, 15.06f)
            close()
            moveToRelative(4.995f, -2.53f)
            lineToRelative(-1.642f, 1.642f)
            lineToRelative(1.061f, 1.06f)
            lineToRelative(1.642f, -1.641f)
            curveToRelative(1.268f, -1.268f, 1.27f, -3.322f, 0.005f, -4.592f)
            lineToRelative(0.891f, -0.891f)
            curveToRelative(1.397f, -1.398f, 1.397f, -3.664f, 0f, -5.06f)
            curveToRelative(-1.398f, -1.398f, -3.664f, -1.398f, -5.06f, 0f)
            lineToRelative(-4.832f, 4.83f)
            lineToRelative(5.061f, 5.061f)
            lineTo(19f, 10.06f)
            curveToRelative(0.679f, 0.685f, 0.677f, 1.79f, -0.005f, 2.471f)
            close()
        }
    }.build()
}
