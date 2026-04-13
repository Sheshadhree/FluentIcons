package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BinFull20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BinFull20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.752f, 2.932f)
            curveToRelative(0.239f, -0.14f, 0.319f, -0.445f, 0.18f, -0.684f)
            curveToRelative(-0.14f, -0.238f, -0.445f, -0.319f, -0.684f, -0.18f)
            lineToRelative(-12f, 7f)
            curveTo(2.094f, 9.158f, 2f, 9.322f, 2f, 9.5f)
            verticalLineToRelative(6f)
            curveTo(2f, 16.88f, 3.12f, 18f, 4.5f, 18f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-6f)
            curveTo(18f, 9.224f, 17.776f, 9f, 17.5f, 9f)
            horizontalLineTo(17f)
            verticalLineTo(6.5f)
            curveTo(17f, 5.672f, 16.328f, 5f, 15.5f, 5f)
            horizontalLineToRelative(-2f)
            curveTo(12.672f, 5f, 12f, 5.672f, 12f, 6.5f)
            verticalLineTo(7f)
            horizontalLineTo(9.5f)
            curveTo(8.672f, 7f, 8f, 7.672f, 8f, 8.5f)
            verticalLineTo(9f)
            horizontalLineTo(4.35f)
            lineToRelative(10.402f, -6.068f)
            close()
            moveTo(12f, 8f)
            verticalLineToRelative(1f)
            horizontalLineTo(9f)
            verticalLineTo(8.5f)
            curveTo(9f, 8.224f, 9.224f, 8f, 9.5f, 8f)
            horizontalLineTo(12f)
            close()
            moveToRelative(1f, 1f)
            verticalLineTo(6.5f)
            curveTo(13f, 6.224f, 13.224f, 6f, 13.5f, 6f)
            horizontalLineToRelative(2f)
            curveTo(15.776f, 6f, 16f, 6.224f, 16f, 6.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
