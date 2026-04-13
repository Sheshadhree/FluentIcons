package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableFreezeColumnAndRow16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableFreezeColumnAndRow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(3f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            verticalLineTo(4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(10f)
            verticalLineToRelative(-2f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(5.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(10f, 6f)
            horizontalLineTo(6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(6f)
            close()
            moveToRelative(-5f, 5f)
            horizontalLineTo(2f)
            verticalLineToRelative(0.5f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineTo(5f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
