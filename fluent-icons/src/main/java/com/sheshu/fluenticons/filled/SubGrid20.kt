package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SubGrid20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SubGrid20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 10.5f)
            verticalLineToRelative(2f)
            curveTo(6f, 13.328f, 6.672f, 14f, 7.5f, 14f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-3.5f)
            horizontalLineTo(6f)
            close()
            moveToRelative(0f, -1f)
            verticalLineToRelative(-2f)
            curveTo(6f, 6.672f, 6.672f, 6f, 7.5f, 6f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3.5f)
            horizontalLineTo(6f)
            close()
            moveTo(10.5f, 6f)
            verticalLineToRelative(3.5f)
            horizontalLineTo(14f)
            verticalLineToRelative(-2f)
            curveTo(14f, 6.672f, 13.328f, 6f, 12.5f, 6f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(3.5f, 4.5f)
            horizontalLineToRelative(-3.5f)
            verticalLineTo(14f)
            horizontalLineToRelative(2f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            close()
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
            moveToRelative(-2f, 7.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-1f)
            horizontalLineTo(4f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(1f)
            verticalLineTo(4f)
            horizontalLineTo(14f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(2f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
