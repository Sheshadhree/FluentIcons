package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableCellsSplit24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableCellsSplit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            horizontalLineTo(11f)
            verticalLineToRelative(4f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            close()
            moveTo(21f, 7f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(12.5f)
            verticalLineToRelative(4f)
            horizontalLineTo(21f)
            close()
            moveToRelative(-8.5f, 14f)
            horizontalLineToRelative(5.25f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(17f)
            horizontalLineToRelative(-8.5f)
            verticalLineToRelative(4f)
            close()
            moveTo(3f, 8.5f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(-7f)
            horizontalLineTo(3f)
            close()
            moveToRelative(9.5f, 1.5f)
            verticalLineToRelative(4f)
            horizontalLineTo(11f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(1.5f)
            close()
            moveTo(3f, 17.75f)
            verticalLineTo(17f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(4f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            close()
        }
    }.build()
}
