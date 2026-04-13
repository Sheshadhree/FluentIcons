package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Home20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Home20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.002f, 2.388f)
            curveToRelative(-0.57f, -0.512f, -1.434f, -0.512f, -2.005f, 0f)
            lineToRelative(-5.5f, 4.942f)
            curveTo(3.182f, 7.614f, 3f, 8.02f, 3f, 8.445f)
            verticalLineTo(15.5f)
            curveTo(3f, 16.328f, 3.672f, 17f, 4.5f, 17f)
            horizontalLineToRelative(2f)
            curveTo(7.328f, 17f, 8f, 16.328f, 8f, 15.5f)
            verticalLineToRelative(-4f)
            curveTo(8f, 11.223f, 8.224f, 11f, 8.5f, 11f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, 0.223f, 0.5f, 0.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(8.445f)
            curveToRelative(0f, -0.425f, -0.18f, -0.83f, -0.497f, -1.115f)
            lineToRelative(-5.5f, -4.942f)
            close()
        }
    }.build()
}
