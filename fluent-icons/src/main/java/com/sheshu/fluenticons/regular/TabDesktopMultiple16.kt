package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TabDesktopMultiple16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TabDesktopMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(5f)
            curveTo(10.88f, 2f, 12f, 3.12f, 12f, 4.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5f)
            curveTo(3.12f, 12f, 2f, 10.88f, 2f, 9.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(4.5f, 3f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineToRelative(5f)
            curveTo(3f, 10.328f, 3.672f, 11f, 4.5f, 11f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(5f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 5f, 5f, 4.328f, 5f, 3.5f)
            verticalLineTo(3f)
            horizontalLineTo(4.5f)
            close()
            moveTo(6f, 3f)
            verticalLineToRelative(0.5f)
            curveTo(6f, 3.776f, 6.224f, 4f, 6.5f, 4f)
            horizontalLineToRelative(4.415f)
            curveTo(10.709f, 3.417f, 10.153f, 3f, 9.5f, 3f)
            horizontalLineTo(6f)
            close()
            moveToRelative(0.499f, 11f)
            curveToRelative(-0.818f, 0f, -1.545f, -0.392f, -2f, -1f)
            horizontalLineToRelative(5.5f)
            curveToRelative(1.656f, 0f, 3f, -1.342f, 3f, -3f)
            verticalLineTo(9.615f)
            lineTo(13f, 9.5f)
            verticalLineTo(4.502f)
            curveToRelative(0.606f, 0.456f, 0.998f, 1.182f, 0.998f, 1.999f)
            verticalLineTo(10f)
            curveToRelative(0f, 2.209f, -1.791f, 4f, -4f, 4f)
            horizontalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
