package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.267f, 4.209f)
            curveToRelative(-0.3f, -0.286f, -0.774f, -0.274f, -1.06f, 0.026f)
            curveToRelative(-0.286f, 0.3f, -0.274f, 0.774f, 0.026f, 1.06f)
            lineToRelative(6.251f, 5.955f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 11.25f, 3f, 11.585f, 3f, 12f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(14.734f)
            lineToRelative(-6.251f, 5.954f)
            curveToRelative(-0.3f, 0.286f, -0.312f, 0.76f, -0.026f, 1.06f)
            curveToRelative(0.286f, 0.3f, 0.76f, 0.312f, 1.06f, 0.027f)
            lineToRelative(7.42f, -7.067f)
            curveToRelative(0.168f, -0.161f, 0.268f, -0.366f, 0.3f, -0.58f)
            curveTo(20.994f, 12.098f, 21f, 12.05f, 21f, 12f)
            curveToRelative(0f, -0.05f, -0.005f, -0.098f, -0.014f, -0.145f)
            curveToRelative(-0.031f, -0.213f, -0.131f, -0.419f, -0.3f, -0.58f)
            lineTo(13.267f, 4.21f)
            close()
        }
    }.build()
}
