package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PuzzleCube16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PuzzleCube16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(4f)
            verticalLineTo(2f)
            horizontalLineTo(6f)
            close()
            moveTo(5f, 6f)
            horizontalLineTo(2f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(3f)
            verticalLineTo(6f)
            close()
            moveToRelative(1f, 4f)
            verticalLineTo(6f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(6f)
            close()
            moveToRelative(-1f, 1f)
            horizontalLineTo(2f)
            verticalLineToRelative(0.5f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineTo(5f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(1f, 3f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(5f, 0f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(11f)
            close()
            moveToRelative(3f, -8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-3f)
            verticalLineTo(6f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(0f, -1f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineTo(11f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            close()
        }
    }.build()
}
