package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableFreezeColumn20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableFreezeColumn20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 14.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(12f)
            verticalLineToRelative(-3f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(4f)
            horizontalLineToRelative(2.5f)
            curveTo(15.328f, 4f, 16f, 4.672f, 16f, 5.5f)
            verticalLineToRelative(9f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineTo(7f)
            verticalLineToRelative(4f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            close()
            moveTo(7f, 12f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(5f, -4f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            close()
            moveToRelative(-9f, 5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineTo(13f)
            close()
        }
    }.build()
}
