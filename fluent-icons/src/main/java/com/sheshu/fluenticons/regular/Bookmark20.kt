package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Bookmark20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bookmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4.5f)
            curveTo(4f, 3.12f, 5.12f, 2f, 6.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(14.88f, 2f, 16f, 3.12f, 16f, 4.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.188f, -0.105f, 0.36f, -0.273f, 0.446f)
            curveToRelative(-0.168f, 0.085f, -0.369f, 0.069f, -0.521f, -0.042f)
            lineTo(10f, 14.118f)
            lineToRelative(-5.206f, 3.786f)
            curveToRelative(-0.152f, 0.111f, -0.353f, 0.127f, -0.52f, 0.042f)
            curveTo(4.105f, 17.86f, 4f, 17.688f, 4f, 17.5f)
            verticalLineToRelative(-13f)
            close()
            moveTo(6.5f, 3f)
            curveTo(5.672f, 3f, 5f, 3.672f, 5f, 4.5f)
            verticalLineToRelative(12.018f)
            lineToRelative(4.706f, -3.422f)
            curveToRelative(0.175f, -0.128f, 0.413f, -0.128f, 0.588f, 0f)
            lineTo(15f, 16.518f)
            verticalLineTo(4.5f)
            curveTo(15f, 3.672f, 14.328f, 3f, 13.5f, 3f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
