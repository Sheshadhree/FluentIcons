package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pen24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pen24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.891f, 3.047f)
            curveToRelative(1.397f, -1.397f, 3.663f, -1.397f, 5.06f, 0f)
            curveToRelative(1.398f, 1.397f, 1.398f, 3.663f, 0.001f, 5.06f)
            lineTo(20.061f, 9f)
            curveToRelative(1.264f, 1.27f, 1.263f, 3.324f, -0.005f, 4.592f)
            lineToRelative(-1.784f, 1.783f)
            curveToRelative(-0.292f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.06f)
            lineToRelative(1.783f, -1.784f)
            curveToRelative(0.682f, -0.682f, 0.684f, -1.786f, 0.005f, -2.47f)
            lineToRelative(-9.998f, 10f)
            curveToRelative(-0.407f, 0.406f, -0.918f, 0.691f, -1.477f, 0.825f)
            lineTo(2.924f, 21.98f)
            curveToRelative(-0.254f, 0.06f, -0.52f, -0.015f, -0.704f, -0.2f)
            curveToRelative(-0.185f, -0.183f, -0.26f, -0.45f, -0.2f, -0.703f)
            lineToRelative(1.096f, -4.602f)
            curveToRelative(0.133f, -0.559f, 0.419f, -1.07f, 0.825f, -1.476f)
            lineToRelative(11.95f, -11.952f)
            close()
        }
    }.build()
}
