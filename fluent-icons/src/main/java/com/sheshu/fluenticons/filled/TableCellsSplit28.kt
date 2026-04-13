package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableCellsSplit28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableCellsSplit28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 7.5f)
            horizontalLineTo(25f)
            verticalLineTo(6.75f)
            curveTo(25f, 4.679f, 23.321f, 3f, 21.25f, 3f)
            horizontalLineTo(14.5f)
            verticalLineToRelative(4.5f)
            close()
            moveTo(13f, 3f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 3f, 3f, 4.679f, 3f, 6.75f)
            verticalLineTo(7.5f)
            horizontalLineToRelative(10f)
            verticalLineTo(3f)
            close()
            moveToRelative(1.5f, 22f)
            horizontalLineToRelative(6.75f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(20.5f)
            horizontalLineTo(14.5f)
            verticalLineTo(25f)
            close()
            moveTo(13f, 20.5f)
            horizontalLineTo(3f)
            verticalLineToRelative(0.75f)
            curveTo(3f, 23.321f, 4.679f, 25f, 6.75f, 25f)
            horizontalLineTo(13f)
            verticalLineToRelative(-4.5f)
            close()
            moveTo(3f, 9f)
            horizontalLineToRelative(22f)
            verticalLineToRelative(10f)
            horizontalLineTo(3f)
            verticalLineTo(9f)
            close()
            moveToRelative(10f, 1f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-8f)
            horizontalLineTo(13f)
            close()
        }
    }.build()
}
