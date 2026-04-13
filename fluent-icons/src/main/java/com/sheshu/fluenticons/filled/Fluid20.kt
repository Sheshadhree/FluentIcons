package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Fluid20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Fluid20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.5f)
            curveTo(2f, 2.672f, 2.672f, 2f, 3.5f, 2f)
            horizontalLineToRelative(2f)
            curveTo(6.328f, 2f, 7f, 2.672f, 7f, 3.5f)
            verticalLineToRelative(2.043f)
            curveToRelative(0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.671f, -1.5f, -1.5f)
            verticalLineTo(3.5f)
            close()
            moveTo(8f, 4f)
            horizontalLineToRelative(5.5f)
            curveTo(14.328f, 4f, 15f, 4.672f, 15f, 5.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(-1f)
            verticalLineTo(5.5f)
            curveTo(14f, 5.224f, 13.776f, 5f, 13.5f, 5f)
            horizontalLineTo(8f)
            verticalLineTo(4f)
            close()
            moveTo(5f, 8f)
            verticalLineToRelative(5.5f)
            curveTo(5f, 13.776f, 5.224f, 14f, 5.5f, 14f)
            horizontalLineTo(9f)
            verticalLineToRelative(1f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 15f, 4f, 14.328f, 4f, 13.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(1f)
            close()
            moveToRelative(6.504f, 2f)
            curveToRelative(-0.829f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
