package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.VideoClip16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.VideoClip16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 5.82f)
            verticalLineToRelative(4.36f)
            curveToRelative(0f, 0.25f, 0.274f, 0.403f, 0.487f, 0.273f)
            lineToRelative(3.259f, -1.992f)
            curveToRelative(0.345f, -0.21f, 0.345f, -0.711f, 0f, -0.922f)
            lineToRelative(-3.26f, -1.991f)
            curveTo(6.775f, 5.418f, 6.5f, 5.57f, 6.5f, 5.82f)
            close()
            moveTo(4.5f, 3f)
            curveTo(3.12f, 3f, 2f, 4.12f, 2f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 11.88f, 3.12f, 13f, 4.5f, 13f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveTo(14f, 4.12f, 12.88f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(3f, 5.5f)
            curveTo(3f, 4.672f, 3.672f, 4f, 4.5f, 4f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 4f, 13f, 4.672f, 13f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 12f, 3f, 11.328f, 3f, 10.5f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}
