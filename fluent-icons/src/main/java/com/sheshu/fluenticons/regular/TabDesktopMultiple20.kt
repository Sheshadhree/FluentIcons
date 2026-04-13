package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TabDesktopMultiple20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TabDesktopMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(8f)
            curveTo(2f, 13.88f, 3.12f, 15f, 4.5f, 15f)
            horizontalLineToRelative(8f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-8f)
            curveTo(15f, 3.12f, 13.88f, 2f, 12.5f, 2f)
            horizontalLineToRelative(-8f)
            close()
            moveTo(14f, 4.5f)
            verticalLineTo(5f)
            horizontalLineTo(7.5f)
            curveTo(7.224f, 5f, 7f, 4.776f, 7f, 4.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(5.5f)
            curveTo(13.328f, 3f, 14f, 3.672f, 14f, 4.5f)
            close()
            moveToRelative(-8f, 0f)
            curveTo(6f, 5.328f, 6.672f, 6f, 7.5f, 6f)
            horizontalLineTo(14f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-8f)
            curveTo(3.672f, 14f, 3f, 13.328f, 3f, 12.5f)
            verticalLineToRelative(-8f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineTo(6f)
            verticalLineToRelative(1.5f)
            close()
            moveTo(7.5f, 18f)
            curveToRelative(-1.21f, 0f, -2.219f, -0.859f, -2.45f, -2f)
            horizontalLineToRelative(1.035f)
            curveToRelative(0.206f, 0.583f, 0.762f, 1f, 1.415f, 1f)
            horizontalLineTo(14f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(7.5f)
            curveToRelative(0f, -0.653f, -0.418f, -1.209f, -1f, -1.415f)
            verticalLineTo(5.05f)
            curveToRelative(1.14f, 0.232f, 2f, 1.24f, 2f, 2.45f)
            verticalLineTo(14f)
            curveToRelative(0f, 2.21f, -1.791f, 4f, -4f, 4f)
            horizontalLineTo(7.5f)
            close()
        }
    }.build()
}
