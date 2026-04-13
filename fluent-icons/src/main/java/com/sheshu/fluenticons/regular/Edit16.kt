package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Edit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Edit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.236f, 1.764f)
            curveToRelative(-1.024f, -1.024f, -2.684f, -1.024f, -3.707f, 0f)
            lineTo(2.657f, 9.636f)
            curveToRelative(-0.374f, 0.374f, -0.64f, 0.842f, -0.772f, 1.354f)
            lineToRelative(-0.87f, 3.386f)
            curveToRelative(-0.043f, 0.17f, 0.007f, 0.353f, 0.132f, 0.478f)
            curveToRelative(0.124f, 0.125f, 0.306f, 0.174f, 0.477f, 0.13f)
            lineToRelative(3.386f, -0.869f)
            curveToRelative(0.512f, -0.131f, 0.98f, -0.398f, 1.354f, -0.772f)
            lineToRelative(7.872f, -7.872f)
            curveToRelative(1.024f, -1.024f, 1.024f, -2.683f, 0f, -3.707f)
            close()
            moveToRelative(-3f, 0.707f)
            curveToRelative(0.633f, -0.633f, 1.66f, -0.633f, 2.293f, 0f)
            curveToRelative(0.633f, 0.633f, 0.633f, 1.66f, 0f, 2.293f)
            lineTo(12.75f, 5.543f)
            lineTo(10.457f, 3.25f)
            lineToRelative(0.779f, -0.779f)
            close()
            moveTo(9.75f, 3.957f)
            lineToRelative(2.293f, 2.293f)
            lineToRelative(-6.386f, 6.386f)
            curveTo(5.41f, 12.883f, 5.1f, 13.06f, 4.761f, 13.146f)
            lineToRelative(-2.567f, 0.66f)
            lineToRelative(0.66f, -2.567f)
            curveToRelative(0.086f, -0.34f, 0.263f, -0.649f, 0.51f, -0.896f)
            lineTo(9.75f, 3.957f)
            close()
        }
    }.build()
}
