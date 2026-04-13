package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabDesktopCopy20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabDesktopCopy20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4.5f)
            curveTo(5f, 3.12f, 6.12f, 2f, 7.5f, 2f)
            horizontalLineTo(9f)
            verticalLineToRelative(2.5f)
            curveTo(9f, 5.328f, 9.672f, 6f, 10.5f, 6f)
            horizontalLineTo(18f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-8f)
            curveTo(6.12f, 15f, 5f, 13.88f, 5f, 12.5f)
            verticalLineToRelative(-8f)
            close()
            moveToRelative(5f, 0f)
            verticalLineTo(2f)
            horizontalLineToRelative(5.5f)
            curveTo(16.88f, 2f, 18f, 3.12f, 18f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(-7.5f)
            curveTo(10.224f, 5f, 10f, 4.776f, 10f, 4.5f)
            close()
            moveTo(12.5f, 18f)
            curveToRelative(1.21f, 0f, 2.219f, -0.859f, 2.45f, -2f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 16f, 4f, 14.433f, 4f, 12.5f)
            verticalLineTo(5.05f)
            curveTo(2.86f, 5.282f, 2f, 6.29f, 2f, 7.5f)
            verticalLineTo(14f)
            curveToRelative(0f, 2.21f, 1.791f, 4f, 4f, 4f)
            horizontalLineToRelative(6.5f)
            close()
        }
    }.build()
}
