package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChatEmpty16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatEmpty16",
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
        }
    }.build()
}
