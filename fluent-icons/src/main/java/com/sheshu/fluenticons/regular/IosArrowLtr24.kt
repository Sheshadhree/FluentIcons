package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.IosArrowLtr24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.IosArrowLtr24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.296f, 12f)
            lineToRelative(8.491f, -8.727f)
            curveToRelative(0.29f, -0.297f, 0.283f, -0.772f, -0.014f, -1.06f)
            curveToRelative(-0.297f, -0.29f, -0.772f, -0.283f, -1.06f, 0.014f)
            lineToRelative(-9f, 9.25f)
            curveToRelative(-0.284f, 0.291f, -0.284f, 0.755f, 0f, 1.046f)
            lineToRelative(9f, 9.25f)
            curveToRelative(0.288f, 0.297f, 0.763f, 0.303f, 1.06f, 0.015f)
            curveToRelative(0.297f, -0.29f, 0.303f, -0.764f, 0.014f, -1.061f)
            lineTo(4.297f, 12f)
            close()
        }
    }.build()
}
