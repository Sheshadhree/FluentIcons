package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.837f, 3.13f)
            curveToRelative(-0.204f, -0.185f, -0.52f, -0.171f, -0.706f, 0.033f)
            curveToRelative(-0.186f, 0.204f, -0.172f, 0.52f, 0.032f, 0.706f)
            lineTo(16.33f, 9.5f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 9.5f, 2f, 9.724f, 2f, 10f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(13.828f)
            lineToRelative(-6.165f, 5.628f)
            curveToRelative(-0.204f, 0.186f, -0.218f, 0.503f, -0.032f, 0.706f)
            curveToRelative(0.186f, 0.204f, 0.502f, 0.219f, 0.706f, 0.033f)
            lineToRelative(6.916f, -6.314f)
            curveToRelative(0.14f, -0.128f, 0.22f, -0.296f, 0.24f, -0.469f)
            curveTo(17.998f, 10.057f, 18f, 10.03f, 18f, 10f)
            curveToRelative(0f, -0.027f, -0.002f, -0.053f, -0.006f, -0.079f)
            curveToRelative(-0.018f, -0.176f, -0.099f, -0.346f, -0.24f, -0.476f)
            lineTo(10.836f, 3.13f)
            close()
        }
    }.build()
}
