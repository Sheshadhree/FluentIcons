package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableCellsSplit20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableCellsSplit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 6f)
            horizontalLineToRelative(7f)
            verticalLineTo(5.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineTo(10f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(7f, 7f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(14f)
            close()
            moveToRelative(-7f, -5f)
            verticalLineToRelative(4f)
            horizontalLineTo(9f)
            verticalLineTo(8f)
            horizontalLineToRelative(1f)
            close()
            moveToRelative(0f, 9f)
            horizontalLineToRelative(4.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(14f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(-1f, -3f)
            horizontalLineTo(3f)
            verticalLineToRelative(0.5f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineTo(9f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(0f, -8f)
            verticalLineTo(3f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(6f)
            close()
        }
    }.build()
}
