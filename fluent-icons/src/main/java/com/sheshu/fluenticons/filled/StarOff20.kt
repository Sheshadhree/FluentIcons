package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.856f, 2.147f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(4.093f, 4.092f)
            lineToRelative(-3.384f, 0.492f)
            curveTo(2.037f, 7.557f, 1.71f, 8.565f, 2.303f, 9.143f)
            lineToRelative(3.124f, 3.045f)
            lineToRelative(-0.738f, 4.3f)
            curveToRelative(-0.14f, 0.816f, 0.718f, 1.44f, 1.451f, 1.053f)
            lineToRelative(3.861f, -2.03f)
            lineToRelative(3.86f, 2.03f)
            curveToRelative(0.735f, 0.386f, 1.592f, -0.237f, 1.452f, -1.054f)
            lineToRelative(-0.097f, -0.566f)
            lineToRelative(1.932f, 1.933f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            curveToRelative(0.196f, -0.196f, 0.196f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveToRelative(11.72f, 10.041f)
            lineToRelative(0.054f, 0.319f)
            lineToRelative(-6.875f, -6.875f)
            lineTo(9.105f, 2.9f)
            curveToRelative(0.366f, -0.743f, 1.426f, -0.743f, 1.793f, 0f)
            lineToRelative(1.93f, 3.912f)
            lineToRelative(4.317f, 0.627f)
            curveToRelative(0.82f, 0.119f, 1.148f, 1.127f, 0.554f, 1.705f)
            lineToRelative(-3.124f, 3.045f)
            close()
        }
    }.build()
}
