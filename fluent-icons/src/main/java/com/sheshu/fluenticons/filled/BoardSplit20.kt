package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BoardSplit20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BoardSplit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(8f)
            verticalLineTo(3f)
            horizontalLineTo(6f)
            close()
            moveToRelative(5f, 7f)
            horizontalLineTo(3f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-7f)
            close()
            moveToRelative(3f, 7f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            close()
            moveToRelative(3f, -5f)
            horizontalLineToRelative(-5f)
            verticalLineTo(8f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(0f, -5f)
            horizontalLineToRelative(-5f)
            verticalLineTo(3f)
            horizontalLineToRelative(2f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(1f)
            close()
        }
    }.build()
}
