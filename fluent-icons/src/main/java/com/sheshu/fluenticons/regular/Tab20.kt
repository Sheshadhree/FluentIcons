package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Tab20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Tab20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineToRelative(-9f)
            close()
            moveTo(5.5f, 4f)
            curveTo(4.672f, 4f, 4f, 4.672f, 4f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(4f, 15.328f, 4.672f, 16f, 5.5f, 16f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            curveTo(16f, 4.672f, 15.328f, 4f, 14.5f, 4f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
