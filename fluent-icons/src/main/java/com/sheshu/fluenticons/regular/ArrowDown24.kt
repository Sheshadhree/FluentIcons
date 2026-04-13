package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.79f, 13.267f)
            curveToRelative(0.286f, -0.3f, 0.275f, -0.774f, -0.025f, -1.06f)
            curveToRelative(-0.3f, -0.286f, -0.775f, -0.274f, -1.06f, 0.026f)
            lineToRelative(-5.955f, 6.251f)
            verticalLineTo(3.75f)
            curveTo(12.75f, 3.336f, 12.414f, 3f, 12f, 3f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(14.734f)
            lineToRelative(-5.955f, -6.251f)
            curveToRelative(-0.286f, -0.3f, -0.76f, -0.312f, -1.06f, -0.026f)
            curveToRelative(-0.3f, 0.286f, -0.312f, 0.76f, -0.026f, 1.06f)
            lineToRelative(7.067f, 7.42f)
            curveToRelative(0.16f, 0.168f, 0.366f, 0.268f, 0.58f, 0.3f)
            curveTo(11.902f, 20.994f, 11.95f, 21f, 12f, 21f)
            curveToRelative(0.05f, 0f, 0.098f, -0.005f, 0.145f, -0.014f)
            curveToRelative(0.213f, -0.031f, 0.418f, -0.131f, 0.579f, -0.3f)
            lineToRelative(7.067f, -7.419f)
            close()
        }
    }.build()
}
