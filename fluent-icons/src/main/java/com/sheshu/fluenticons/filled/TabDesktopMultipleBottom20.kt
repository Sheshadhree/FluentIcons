package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabDesktopMultipleBottom20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabDesktopMultipleBottom20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.05f, 4f)
            horizontalLineToRelative(7.45f)
            curveTo(14.435f, 4f, 16f, 5.567f, 16f, 7.5f)
            verticalLineToRelative(7.45f)
            curveToRelative(1.142f, -0.232f, 2f, -1.24f, 2f, -2.45f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineTo(7.5f)
            curveTo(6.292f, 2f, 5.283f, 2.859f, 5.05f, 4f)
            close()
            moveTo(2f, 7.5f)
            curveTo(2f, 6.12f, 3.12f, 5f, 4.5f, 5f)
            horizontalLineToRelative(8f)
            curveTo(13.88f, 5f, 15f, 6.12f, 15f, 7.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(11f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineTo(2f)
            verticalLineTo(7.5f)
            close()
            moveToRelative(8f, 8f)
            verticalLineTo(18f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 18f, 2f, 16.88f, 2f, 15.5f)
            verticalLineTo(15f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            close()
        }
    }.build()
}
