package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Image16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Image16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.51f, 0.152f, 0.983f, 0.414f, 1.379f)
            lineToRelative(4.384f, -4.384f)
            curveToRelative(0.664f, -0.664f, 1.74f, -0.664f, 2.404f, 0f)
            lineToRelative(4.384f, 4.384f)
            curveTo(13.848f, 12.483f, 14f, 12.009f, 14f, 11.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(7f, 3.502f)
            curveToRelative(0f, 0.554f, -0.449f, 1.002f, -1.002f, 1.002f)
            curveToRelative(-0.553f, 0f, -1.002f, -0.448f, -1.002f, -1.002f)
            curveToRelative(0f, -0.553f, 0.448f, -1.002f, 1.002f, -1.002f)
            curveToRelative(0.553f, 0f, 1.002f, 0.449f, 1.002f, 1.002f)
            close()
            moveToRelative(1.379f, 8.084f)
            lineTo(8.495f, 9.202f)
            curveToRelative(-0.273f, -0.273f, -0.717f, -0.273f, -0.99f, 0f)
            lineToRelative(-4.384f, 4.384f)
            curveTo(3.517f, 13.848f, 3.991f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(0.51f, 0f, 0.983f, -0.152f, 1.379f, -0.414f)
            close()
        }
    }.build()
}
