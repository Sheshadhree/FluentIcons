package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Stop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Stop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 3f)
            curveTo(12.776f, 3f, 13f, 3.224f, 13f, 3.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-9f)
            curveTo(3.224f, 13f, 3f, 12.776f, 3f, 12.5f)
            verticalLineToRelative(-9f)
            curveTo(3f, 3.224f, 3.224f, 3f, 3.5f, 3f)
            horizontalLineToRelative(9f)
            close()
            moveToRelative(-9f, -1f)
            curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(2f, 13.328f, 2.672f, 14f, 3.5f, 14f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            curveTo(14f, 2.672f, 13.328f, 2f, 12.5f, 2f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
