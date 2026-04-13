package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TransparencySquare20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TransparencySquare20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2.5f)
            curveTo(4.067f, 2.5f, 2.5f, 4.067f, 2.5f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(8f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            horizontalLineTo(6f)
            close()
            moveTo(4f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(3f)
            horizontalLineTo(4f)
            verticalLineTo(6f)
            close()
            moveToRelative(0f, 4f)
            horizontalLineToRelative(3f)
            verticalLineTo(7f)
            horizontalLineToRelative(3f)
            verticalLineTo(4f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            horizontalLineTo(7f)
            verticalLineToRelative(-3f)
            horizontalLineTo(4f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(6f, 0f)
            verticalLineToRelative(3f)
            horizontalLineTo(7f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(0f, 0f)
            horizontalLineToRelative(3f)
            verticalLineTo(7f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}
