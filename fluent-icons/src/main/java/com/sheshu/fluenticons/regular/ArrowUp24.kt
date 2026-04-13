package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.209f, 10.733f)
            curveToRelative(-0.286f, 0.3f, -0.274f, 0.774f, 0.026f, 1.06f)
            curveToRelative(0.3f, 0.286f, 0.774f, 0.274f, 1.06f, -0.026f)
            lineToRelative(5.954f, -6.251f)
            verticalLineTo(20.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            curveToRelative(0.415f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(5.516f)
            lineToRelative(5.955f, 6.251f)
            curveToRelative(0.286f, 0.3f, 0.76f, 0.312f, 1.06f, 0.026f)
            curveToRelative(0.3f, -0.286f, 0.312f, -0.76f, 0.027f, -1.06f)
            lineToRelative(-7.067f, -7.42f)
            curveToRelative(-0.161f, -0.168f, -0.367f, -0.268f, -0.58f, -0.3f)
            curveTo(12.097f, 3.006f, 12.049f, 3f, 11.999f, 3f)
            curveToRelative(-0.05f, 0f, -0.098f, 0.005f, -0.145f, 0.014f)
            curveToRelative(-0.213f, 0.031f, -0.418f, 0.131f, -0.578f, 0.3f)
            lineToRelative(-7.067f, 7.419f)
            close()
        }
    }.build()
}
