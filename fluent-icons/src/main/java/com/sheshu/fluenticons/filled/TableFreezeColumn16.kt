package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableFreezeColumn16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableFreezeColumn16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 11.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(10f)
            verticalLineToRelative(-2f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(5.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4f)
            verticalLineTo(3f)
            horizontalLineToRelative(1.5f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineToRelative(7f)
            close()
            moveTo(10f, 10f)
            verticalLineTo(6f)
            horizontalLineTo(6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            close()
            moveTo(5f, 5f)
            verticalLineTo(2f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(3f)
            close()
            moveTo(2f, 6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(3f)
            verticalLineTo(6f)
            horizontalLineTo(2f)
            close()
            moveToRelative(0f, 5.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            close()
        }
    }.build()
}
