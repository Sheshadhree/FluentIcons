package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BoardSplit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BoardSplit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(7f)
            verticalLineTo(2f)
            horizontalLineTo(4.5f)
            close()
            moveToRelative(5.5f, 8f)
            horizontalLineToRelative(4f)
            verticalLineTo(6f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(4f, 1f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(11f)
            close()
            moveToRelative(0f, -6.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(-4f)
            verticalLineTo(2f)
            horizontalLineToRelative(1.5f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            close()
            moveTo(9f, 8f)
            horizontalLineTo(2f)
            verticalLineToRelative(3.5f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineTo(9f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}
