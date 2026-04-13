package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BreakoutRoom16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BreakoutRoom16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 7f)
            curveTo(7.88f, 7f, 9f, 8.12f, 9f, 9.5f)
            verticalLineToRelative(2f)
            curveTo(9f, 12.88f, 7.88f, 14f, 6.5f, 14f)
            horizontalLineToRelative(-2f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-2f)
            curveTo(2f, 8.12f, 3.12f, 7f, 4.5f, 7f)
            horizontalLineToRelative(2f)
            close()
            moveToRelative(5f, -5f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(8.948f)
            curveToRelative(0.293f, -0.287f, 0.537f, -0.625f, 0.715f, -1f)
            horizontalLineTo(11.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineToRelative(1.836f)
            curveTo(2.625f, 6.514f, 2.287f, 6.758f, 2f, 7.052f)
            verticalLineTo(4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(-7f, 6f)
            curveTo(3.672f, 8f, 3f, 8.672f, 3f, 9.5f)
            verticalLineToRelative(2f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineToRelative(2f)
            curveTo(7.328f, 13f, 8f, 12.328f, 8f, 11.5f)
            verticalLineToRelative(-2f)
            curveTo(8f, 8.672f, 7.328f, 8f, 6.5f, 8f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}
