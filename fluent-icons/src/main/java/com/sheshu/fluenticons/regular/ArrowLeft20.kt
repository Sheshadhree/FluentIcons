package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.159f, 16.867f)
            curveToRelative(0.204f, 0.186f, 0.52f, 0.171f, 0.706f, -0.033f)
            curveToRelative(0.187f, -0.203f, 0.172f, -0.52f, -0.032f, -0.706f)
            lineToRelative(-6.168f, -5.63f)
            horizontalLineToRelative(13.831f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            curveToRelative(0f, -0.277f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(3.668f)
            lineToRelative(6.165f, -5.629f)
            curveToRelative(0.204f, -0.186f, 0.219f, -0.502f, 0.032f, -0.706f)
            curveTo(9.68f, 2.959f, 9.363f, 2.945f, 9.16f, 3.13f)
            lineTo(2.243f, 9.445f)
            curveToRelative(-0.14f, 0.127f, -0.22f, 0.295f, -0.24f, 0.468f)
            curveTo(1.998f, 9.941f, 1.996f, 9.97f, 1.996f, 9.997f)
            curveToRelative(0f, 0.027f, 0.002f, 0.054f, 0.006f, 0.08f)
            curveToRelative(0.019f, 0.175f, 0.099f, 0.346f, 0.24f, 0.476f)
            lineToRelative(6.917f, 6.314f)
            close()
        }
    }.build()
}
