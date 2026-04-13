package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Edit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Edit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.529f, 1.764f)
            curveToRelative(1.024f, -1.024f, 2.683f, -1.024f, 3.707f, 0f)
            reflectiveCurveToRelative(1.024f, 2.683f, 0f, 3.707f)
            lineTo(13.457f, 6.25f)
            lineTo(9.75f, 2.543f)
            lineToRelative(0.779f, -0.779f)
            close()
            moveTo(9.043f, 3.25f)
            lineTo(2.657f, 9.636f)
            curveToRelative(-0.374f, 0.374f, -0.64f, 0.842f, -0.772f, 1.354f)
            lineToRelative(-0.87f, 3.386f)
            curveToRelative(-0.043f, 0.17f, 0.007f, 0.353f, 0.132f, 0.478f)
            curveToRelative(0.124f, 0.125f, 0.306f, 0.174f, 0.477f, 0.13f)
            lineToRelative(3.386f, -0.869f)
            curveToRelative(0.512f, -0.131f, 0.98f, -0.398f, 1.354f, -0.772f)
            lineToRelative(6.386f, -6.386f)
            lineTo(9.043f, 3.25f)
            close()
        }
    }.build()
}
