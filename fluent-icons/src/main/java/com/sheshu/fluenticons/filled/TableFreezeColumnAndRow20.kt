package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableFreezeColumnAndRow20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableFreezeColumnAndRow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 5.5f)
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
            curveTo(15.328f, 4f, 16f, 4.672f, 16f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(12f)
            verticalLineToRelative(-3f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9f)
            close()
            moveToRelative(-14f, 9f)
            verticalLineTo(13f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            close()
            moveTo(8f, 8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}
