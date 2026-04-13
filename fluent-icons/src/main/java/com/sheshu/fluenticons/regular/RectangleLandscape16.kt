package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.RectangleLandscape16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RectangleLandscape16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 5.5f)
            curveTo(1f, 4.12f, 2.12f, 3f, 3.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(13.88f, 3f, 15f, 4.12f, 15f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.12f, 13f, 1f, 11.88f, 1f, 10.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(3.5f, 4f)
            curveTo(2.672f, 4f, 2f, 4.672f, 2f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 11.328f, 2.672f, 12f, 3.5f, 12f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveTo(14f, 4.672f, 13.328f, 4f, 12.5f, 4f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
