package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Mail20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Mail20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 4f)
            curveTo(16.88f, 4f, 18f, 5.12f, 18f, 6.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 17f, 2f, 15.88f, 2f, 14.5f)
            verticalLineToRelative(-8f)
            curveTo(2f, 5.12f, 3.12f, 4f, 4.5f, 4f)
            horizontalLineToRelative(11f)
            close()
            moveTo(17f, 7.961f)
            lineToRelative(-6.746f, 3.97f)
            curveToRelative(-0.13f, 0.077f, -0.287f, 0.09f, -0.426f, 0.038f)
            lineToRelative(-0.082f, -0.038f)
            lineTo(3f, 7.963f)
            verticalLineTo(14.5f)
            curveTo(3f, 15.328f, 3.672f, 16f, 4.5f, 16f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(7.961f)
            close()
            moveTo(15.5f, 5f)
            horizontalLineToRelative(-11f)
            curveTo(3.672f, 5f, 3f, 5.672f, 3f, 6.5f)
            verticalLineToRelative(0.302f)
            lineToRelative(7f, 4.118f)
            lineToRelative(7f, -4.12f)
            verticalLineTo(6.5f)
            curveTo(17f, 5.672f, 16.328f, 5f, 15.5f, 5f)
            close()
        }
    }.build()
}
