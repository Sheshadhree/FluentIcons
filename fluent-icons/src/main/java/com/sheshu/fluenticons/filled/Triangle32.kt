package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Triangle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Triangle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.847f, 4.684f)
            curveToRelative(-1.235f, -2.242f, -4.457f, -2.243f, -5.693f, -0.001f)
            lineTo(2.404f, 24.18f)
            curveTo(1.21f, 26.346f, 2.777f, 29f, 5.251f, 29f)
            horizontalLineToRelative(21.492f)
            curveToRelative(2.473f, 0f, 4.04f, -2.653f, 2.846f, -4.819f)
            lineTo(18.847f, 4.684f)
            close()
        }
    }.build()
}
