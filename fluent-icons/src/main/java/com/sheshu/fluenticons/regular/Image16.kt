package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Image16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Image16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 5.502f)
            curveToRelative(0f, 0.554f, -0.449f, 1.002f, -1.002f, 1.002f)
            curveToRelative(-0.553f, 0f, -1.002f, -0.448f, -1.002f, -1.002f)
            curveToRelative(0f, -0.553f, 0.448f, -1.002f, 1.002f, -1.002f)
            curveToRelative(0.553f, 0f, 1.002f, 0.449f, 1.002f, 1.002f)
            close()
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(4.5f, 3f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.232f, 0.053f, 0.45f, 0.146f, 0.647f)
            lineToRelative(3.652f, -3.652f)
            curveToRelative(0.664f, -0.664f, 1.74f, -0.664f, 2.404f, 0f)
            lineToRelative(3.652f, 3.652f)
            curveTo(12.948f, 11.95f, 13f, 11.732f, 13f, 11.5f)
            verticalLineToRelative(-7f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(7.647f, 9.854f)
            lineTo(8.495f, 9.202f)
            curveToRelative(-0.273f, -0.273f, -0.717f, -0.273f, -0.99f, 0f)
            lineToRelative(-3.652f, 3.652f)
            curveTo(4.05f, 12.948f, 4.268f, 13f, 4.5f, 13f)
            horizontalLineToRelative(7f)
            curveToRelative(0.232f, 0f, 0.45f, -0.053f, 0.647f, -0.146f)
            close()
        }
    }.build()
}
