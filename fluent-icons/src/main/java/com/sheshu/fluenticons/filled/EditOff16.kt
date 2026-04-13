package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EditOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EditOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 10.207f)
            lineToRelative(4.646f, 4.647f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(5.793f, 6.5f)
            lineTo(2.657f, 9.636f)
            curveToRelative(-0.374f, 0.374f, -0.64f, 0.841f, -0.772f, 1.354f)
            lineToRelative(-0.87f, 3.386f)
            curveToRelative(-0.043f, 0.17f, 0.007f, 0.352f, 0.132f, 0.477f)
            curveToRelative(0.124f, 0.125f, 0.306f, 0.175f, 0.477f, 0.131f)
            lineToRelative(3.386f, -0.869f)
            curveToRelative(0.512f, -0.131f, 0.98f, -0.398f, 1.354f, -0.772f)
            lineTo(9.5f, 10.207f)
            close()
            moveToRelative(3.25f, -3.25f)
            lineToRelative(-1.836f, 1.836f)
            lineToRelative(-3.707f, -3.707f)
            lineTo(9.043f, 3.25f)
            lineToRelative(3.707f, 3.707f)
            close()
            moveToRelative(-2.221f, -5.193f)
            curveToRelative(1.024f, -1.024f, 2.683f, -1.024f, 3.707f, 0f)
            reflectiveCurveToRelative(1.024f, 2.683f, 0f, 3.707f)
            lineTo(13.457f, 6.25f)
            lineTo(9.75f, 2.543f)
            lineToRelative(0.779f, -0.78f)
            close()
        }
    }.build()
}
