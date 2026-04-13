package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoClip16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoClip16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5.5f)
            curveTo(2f, 4.12f, 3.12f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 3f, 14f, 4.12f, 14f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 13f, 2f, 11.88f, 2f, 10.5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(4.5f, 0.32f)
            verticalLineToRelative(4.36f)
            curveToRelative(0f, 0.25f, 0.274f, 0.403f, 0.487f, 0.273f)
            lineToRelative(3.259f, -1.992f)
            curveToRelative(0.345f, -0.21f, 0.345f, -0.711f, 0f, -0.922f)
            lineToRelative(-3.26f, -1.991f)
            curveTo(6.775f, 5.418f, 6.5f, 5.57f, 6.5f, 5.82f)
            close()
        }
    }.build()
}
