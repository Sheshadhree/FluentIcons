package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabDesktopMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabDesktopMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineTo(6f)
            verticalLineToRelative(2.5f)
            curveTo(6f, 5.328f, 6.672f, 6f, 7.5f, 6f)
            horizontalLineTo(15f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-8f)
            curveTo(3.12f, 15f, 2f, 13.88f, 2f, 12.5f)
            verticalLineToRelative(-8f)
            close()
            moveToRelative(5f, 0f)
            verticalLineTo(2f)
            horizontalLineToRelative(5.5f)
            curveTo(13.88f, 2f, 15f, 3.12f, 15f, 4.5f)
            verticalLineTo(5f)
            horizontalLineTo(7.5f)
            curveTo(7.224f, 5f, 7f, 4.776f, 7f, 4.5f)
            close()
            moveTo(7.5f, 18f)
            curveToRelative(-1.21f, 0f, -2.219f, -0.859f, -2.45f, -2f)
            horizontalLineToRelative(7.45f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(5.05f)
            curveToRelative(1.14f, 0.232f, 2f, 1.24f, 2f, 2.45f)
            verticalLineTo(14f)
            curveToRelative(0f, 2.21f, -1.791f, 4f, -4f, 4f)
            horizontalLineTo(7.5f)
            close()
        }
    }.build()
}
