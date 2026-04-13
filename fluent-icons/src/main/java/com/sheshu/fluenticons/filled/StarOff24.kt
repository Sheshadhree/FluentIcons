package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(4.804f, 4.805f)
            lineTo(3.16f, 8.646f)
            curveToRelative(-1.107f, 0.161f, -1.55f, 1.522f, -0.748f, 2.303f)
            lineToRelative(3.815f, 3.719f)
            lineToRelative(-0.9f, 5.251f)
            curveToRelative(-0.19f, 1.103f, 0.968f, 1.944f, 1.959f, 1.423f)
            lineTo(12f, 18.863f)
            lineToRelative(4.716f, 2.48f)
            curveToRelative(0.99f, 0.52f, 2.148f, -0.32f, 1.959f, -1.424f)
            lineToRelative(-0.038f, -0.22f)
            lineToRelative(2.082f, 2.081f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.061f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveToRelative(18.31f, 8.73f)
            lineToRelative(-3.777f, 3.68f)
            lineTo(9.3f, 6.12f)
            lineToRelative(1.489f, -3.016f)
            curveToRelative(0.495f, -1.004f, 1.926f, -1.004f, 2.421f, 0f)
            lineToRelative(2.358f, 4.777f)
            lineToRelative(5.272f, 0.766f)
            curveToRelative(1.108f, 0.161f, 1.55f, 1.522f, 0.749f, 2.303f)
            close()
        }
    }.build()
}
