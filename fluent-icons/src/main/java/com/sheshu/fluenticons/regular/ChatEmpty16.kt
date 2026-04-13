package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChatEmpty16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatEmpty16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            curveToRelative(-1.094f, 0f, -2.12f, -0.293f, -3.004f, -0.805f)
            lineToRelative(-2.338f, 0.78f)
            curveToRelative(-0.176f, 0.058f, -0.37f, 0.014f, -0.504f, -0.114f)
            reflectiveCurveToRelative(-0.186f, -0.32f, -0.135f, -0.498f)
            lineToRelative(0.712f, -2.491f)
            curveTo(2.265f, 10.019f, 2f, 9.04f, 2f, 8f)
            close()
            moveToRelative(6f, -5f)
            curveTo(5.239f, 3f, 3f, 5.239f, 3f, 8f)
            curveToRelative(0f, 0.933f, 0.255f, 1.805f, 0.7f, 2.552f)
            curveToRelative(0.07f, 0.118f, 0.088f, 0.26f, 0.05f, 0.393f)
            lineToRelative(-0.509f, 1.78f)
            lineTo(4.9f, 12.174f)
            curveToRelative(0.143f, -0.047f, 0.3f, -0.028f, 0.426f, 0.052f)
            curveTo(6.098f, 12.715f, 7.015f, 13f, 8f, 13f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            close()
        }
    }.build()
}
