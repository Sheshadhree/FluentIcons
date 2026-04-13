package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableColumnTopBottom24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableColumnTopBottom24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 21f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(-5f)
            verticalLineTo(21f)
            close()
            moveToRelative(6.5f, 0f)
            horizontalLineToRelative(1.75f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(16f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            close()
            moveToRelative(5f, -6.5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            close()
            moveTo(21f, 8f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(16f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            close()
            moveToRelative(-6.5f, -5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(5f)
            verticalLineTo(3f)
            close()
            moveTo(8f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(8f)
            horizontalLineToRelative(5f)
            verticalLineTo(3f)
            close()
            moveTo(3f, 9.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-5f)
            horizontalLineTo(3f)
            close()
            moveTo(3f, 16f)
            verticalLineToRelative(1.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(8f)
            verticalLineToRelative(-5f)
            horizontalLineTo(3f)
            close()
            moveToRelative(11.5f, -6.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(5f)
            close()
        }
    }.build()
}
