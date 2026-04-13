package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowRight28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRight28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.268f, 4.21f)
            curveToRelative(-0.298f, -0.288f, -0.773f, -0.278f, -1.06f, 0.02f)
            curveToRelative(-0.287f, 0.299f, -0.278f, 0.773f, 0.02f, 1.06f)
            lineToRelative(8.275f, 7.96f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 13.25f, 3f, 13.586f, 3f, 14f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(18.752f)
            lineToRelative(-8.273f, 7.959f)
            curveToRelative(-0.299f, 0.287f, -0.308f, 0.762f, -0.021f, 1.06f)
            curveToRelative(0.287f, 0.299f, 0.762f, 0.308f, 1.06f, 0.02f)
            lineToRelative(9.428f, -9.069f)
            curveToRelative(0.41f, -0.393f, 0.41f, -1.048f, 0f, -1.441f)
            lineToRelative(-9.428f, -9.07f)
            close()
        }
    }.build()
}
