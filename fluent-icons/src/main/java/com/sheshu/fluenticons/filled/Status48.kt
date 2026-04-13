package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Status48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Status48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(32.05f, 6.05f)
            curveToRelative(2.734f, -2.733f, 7.166f, -2.733f, 9.9f, 0f)
            curveToRelative(2.733f, 2.734f, 2.733f, 7.166f, 0f, 9.9f)
            lineTo(29.6f, 28.3f)
            curveToRelative(-0.542f, 0.541f, -1.22f, 0.927f, -1.964f, 1.114f)
            lineToRelative(-10.08f, 2.548f)
            curveToRelative(-0.427f, 0.108f, -0.879f, -0.017f, -1.19f, -0.328f)
            curveToRelative(-0.311f, -0.311f, -0.436f, -0.764f, -0.328f, -1.19f)
            lineToRelative(2.547f, -10.08f)
            curveToRelative(0.188f, -0.744f, 0.574f, -1.422f, 1.116f, -1.964f)
            lineTo(32.05f, 6.05f)
            close()
            moveTo(24f, 8.5f)
            curveToRelative(0.872f, 0f, 1.728f, 0.072f, 2.561f, 0.21f)
            lineToRelative(2.101f, -2.1f)
            curveTo(27.175f, 6.212f, 25.612f, 6f, 24f, 6f)
            curveTo(14.059f, 6f, 6f, 14.059f, 6f, 24f)
            reflectiveCurveToRelative(8.059f, 18f, 18f, 18f)
            reflectiveCurveToRelative(18f, -8.059f, 18f, -18f)
            curveToRelative(0f, -1.613f, -0.212f, -3.175f, -0.61f, -4.663f)
            lineToRelative(-2.1f, 2.102f)
            curveToRelative(0.138f, 0.833f, 0.21f, 1.688f, 0.21f, 2.561f)
            curveToRelative(0f, 8.56f, -6.94f, 15.5f, -15.5f, 15.5f)
            curveToRelative(-8.56f, 0f, -15.5f, -6.94f, -15.5f, -15.5f)
            curveToRelative(0f, -8.56f, 6.94f, -15.5f, 15.5f, -15.5f)
            close()
        }
    }.build()
}
