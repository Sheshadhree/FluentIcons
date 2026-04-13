package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableCellsSplit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableCellsSplit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 4f)
            horizontalLineToRelative(5.95f)
            curveToRelative(-0.232f, -1.141f, -1.24f, -2f, -2.45f, -2f)
            horizontalLineTo(8f)
            verticalLineToRelative(2f)
            close()
            moveTo(7f, 2f)
            horizontalLineTo(4.5f)
            curveTo(3.29f, 2f, 2.282f, 2.859f, 2.05f, 4f)
            horizontalLineTo(7f)
            verticalLineTo(2f)
            close()
            moveToRelative(1f, 12f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.21f, 0f, 2.218f, -0.859f, 2.45f, -2f)
            horizontalLineTo(8f)
            verticalLineToRelative(2f)
            close()
            moveToRelative(-1f, -2f)
            horizontalLineTo(2.05f)
            curveToRelative(0.232f, 1.141f, 1.24f, 2f, 2.45f, 2f)
            horizontalLineTo(7f)
            verticalLineToRelative(-2f)
            close()
            moveToRelative(-5f, -1f)
            verticalLineTo(5f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(6f)
            horizontalLineTo(2f)
            close()
            moveToRelative(5f, -5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(1f)
            verticalLineTo(6f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}
