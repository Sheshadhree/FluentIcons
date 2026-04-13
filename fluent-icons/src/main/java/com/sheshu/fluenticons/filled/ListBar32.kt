package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ListBar32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ListBar32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 28f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineTo(12f)
            verticalLineToRelative(7f)
            close()
            moveToRelative(0f, -9f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineTo(12f)
            verticalLineToRelative(6f)
            close()
            moveToRelative(-2f, -6f)
            verticalLineToRelative(6f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 19f, 4f, 17.88f, 4f, 16.5f)
            verticalLineToRelative(-1f)
            curveTo(4f, 14.12f, 5.12f, 13f, 6.5f, 13f)
            horizontalLineTo(10f)
            close()
            moveToRelative(2f, -2f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-2f)
            curveTo(28f, 5.12f, 26.88f, 4f, 25.5f, 4f)
            horizontalLineTo(12f)
            verticalLineToRelative(7f)
            close()
            moveToRelative(-2f, -7f)
            verticalLineToRelative(7f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 11f, 4f, 9.88f, 4f, 8.5f)
            verticalLineToRelative(-2f)
            curveTo(4f, 5.12f, 5.12f, 4f, 6.5f, 4f)
            horizontalLineTo(10f)
            close()
            moveToRelative(0f, 17f)
            verticalLineToRelative(7f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 28f, 4f, 26.88f, 4f, 25.5f)
            verticalLineToRelative(-2f)
            curveTo(4f, 22.12f, 5.12f, 21f, 6.5f, 21f)
            horizontalLineTo(10f)
            close()
        }
    }.build()
}
