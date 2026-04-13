package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.733f, 19.79f)
            curveToRelative(0.3f, 0.286f, 0.774f, 0.275f, 1.06f, -0.025f)
            curveToRelative(0.286f, -0.3f, 0.274f, -0.775f, -0.026f, -1.06f)
            lineTo(5.516f, 12.75f)
            horizontalLineTo(20.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            curveToRelative(0f, -0.415f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(5.516f)
            lineToRelative(6.251f, -5.955f)
            curveToRelative(0.3f, -0.286f, 0.312f, -0.76f, 0.026f, -1.06f)
            curveToRelative(-0.286f, -0.3f, -0.76f, -0.312f, -1.06f, -0.026f)
            lineToRelative(-7.42f, 7.067f)
            curveToRelative(-0.168f, 0.16f, -0.268f, 0.366f, -0.3f, 0.58f)
            curveTo(3.006f, 11.901f, 3f, 11.95f, 3f, 12f)
            curveToRelative(0f, 0.05f, 0.005f, 0.098f, 0.014f, 0.145f)
            curveToRelative(0.031f, 0.213f, 0.131f, 0.418f, 0.3f, 0.579f)
            lineToRelative(7.419f, 7.067f)
            close()
        }
    }.build()
}
