package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.133f, 9.16f)
            curveTo(2.946f, 9.366f, 2.96f, 9.682f, 3.165f, 9.868f)
            curveToRelative(0.204f, 0.186f, 0.52f, 0.172f, 0.706f, -0.032f)
            lineToRelative(5.631f, -6.168f)
            verticalLineToRelative(13.831f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(3.67f)
            lineToRelative(5.628f, 6.165f)
            curveToRelative(0.186f, 0.204f, 0.503f, 0.218f, 0.706f, 0.032f)
            curveToRelative(0.204f, -0.186f, 0.219f, -0.502f, 0.033f, -0.706f)
            lineToRelative(-6.314f, -6.916f)
            curveToRelative(-0.128f, -0.14f, -0.296f, -0.22f, -0.469f, -0.24f)
            curveToRelative(-0.027f, -0.004f, -0.055f, -0.007f, -0.084f, -0.007f)
            curveToRelative(-0.027f, 0f, -0.053f, 0.002f, -0.079f, 0.006f)
            curveToRelative(-0.176f, 0.018f, -0.347f, 0.099f, -0.476f, 0.24f)
            lineTo(3.133f, 9.162f)
            close()
        }
    }.build()
}
