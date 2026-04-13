package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabDesktopMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabDesktopMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            horizontalLineTo(5f)
            verticalLineToRelative(1.5f)
            curveTo(5f, 4.328f, 5.672f, 5f, 6.5f, 5f)
            horizontalLineTo(12f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5f)
            curveTo(3.12f, 12f, 2f, 10.88f, 2f, 9.5f)
            verticalLineToRelative(-5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            close()
            moveToRelative(5f, 0f)
            curveToRelative(1.21f, 0f, 2.218f, 0.859f, 2.45f, 2f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 4f, 6f, 3.776f, 6f, 3.5f)
            verticalLineTo(2f)
            horizontalLineToRelative(3.5f)
            close()
            moveTo(4.498f, 13f)
            curveToRelative(0.456f, 0.608f, 1.183f, 1f, 2f, 1f)
            horizontalLineToRelative(3.5f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineTo(6.5f)
            curveToRelative(0f, -0.816f, -0.391f, -1.542f, -0.997f, -1.998f)
            verticalLineTo(9.5f)
            lineToRelative(-0.002f, 0.114f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.657f, -1.344f, 3f, -3f, 3f)
            horizontalLineToRelative(-5.5f)
            close()
        }
    }.build()
}
