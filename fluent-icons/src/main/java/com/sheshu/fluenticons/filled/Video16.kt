package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Video16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Video16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 5.5f)
            curveTo(1f, 4.12f, 2.12f, 3f, 3.5f, 3f)
            horizontalLineToRelative(4f)
            curveTo(8.88f, 3f, 10f, 4.12f, 10f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-4f)
            curveTo(2.12f, 13f, 1f, 11.88f, 1f, 10.5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(12.036f, 6.278f)
            lineTo(10.9f, 10.304f)
            curveToRelative(0.013f, -0.093f, 0.02f, -0.187f, 0.02f, -0.283f)
            verticalLineToRelative(-4.04f)
            curveToRelative(0f, -0.096f, -0.007f, -0.19f, -0.02f, -0.283f)
            lineToRelative(2.136f, -1.475f)
            curveToRelative(0.829f, -0.572f, 1.96f, 0.022f, 1.96f, 1.03f)
            verticalLineToRelative(5.497f)
            curveToRelative(0f, 1.007f, -1.131f, 1.6f, -1.96f, 1.028f)
            close()
        }
    }.build()
}
