package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableFreezeRow20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableFreezeRow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 4f)
            curveTo(15.328f, 4f, 16f, 4.672f, 16f, 5.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(5.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            horizontalLineTo(4f)
            verticalLineTo(5.5f)
            curveTo(4f, 4.672f, 4.672f, 4f, 5.5f, 4f)
            horizontalLineToRelative(9f)
            close()
            moveTo(3f, 14.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            close()
            moveToRelative(9f, -1.5f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-4f)
            close()
            moveTo(8f, 8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            horizontalLineTo(8f)
            close()
            moveToRelative(5f, 9f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(13f)
            close()
        }
    }.build()
}
