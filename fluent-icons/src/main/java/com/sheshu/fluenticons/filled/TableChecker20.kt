package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableChecker20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableChecker20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 3f)
            verticalLineToRelative(4f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineTo(7f)
            close()
            moveToRelative(5f, 5f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            close()
            moveToRelative(1f, 5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(13f)
            verticalLineToRelative(-4f)
            close()
            moveTo(8f, 4f)
            horizontalLineToRelative(6.5f)
            curveTo(15.328f, 4f, 16f, 4.672f, 16f, 5.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(1f)
            verticalLineTo(5.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineTo(8f)
            verticalLineToRelative(1f)
            close()
            moveTo(5.5f, 16f)
            horizontalLineTo(12f)
            verticalLineToRelative(1f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(6.5f)
            curveTo(4f, 15.328f, 4.672f, 16f, 5.5f, 16f)
            close()
        }
    }.build()
}
