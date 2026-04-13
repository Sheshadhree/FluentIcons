package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Print20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Print20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4.5f)
            curveTo(5f, 3.672f, 5.672f, 3f, 6.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(14.328f, 3f, 15f, 3.672f, 15f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(0.5f)
            curveTo(16.88f, 5f, 18f, 6.12f, 18f, 7.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(15f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(5.672f, 17f, 5f, 16.328f, 5f, 15.5f)
            verticalLineTo(14f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 14f, 2f, 13.328f, 2f, 12.5f)
            verticalLineToRelative(-5f)
            curveTo(2f, 6.12f, 3.12f, 5f, 4.5f, 5f)
            horizontalLineTo(5f)
            verticalLineTo(4.5f)
            close()
            moveToRelative(9f, 0f)
            curveTo(14f, 4.224f, 13.776f, 4f, 13.5f, 4f)
            horizontalLineToRelative(-7f)
            curveTo(6.224f, 4f, 6f, 4.224f, 6f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(8f)
            verticalLineTo(4.5f)
            close()
            moveToRelative(-8f, 7f)
            verticalLineToRelative(4f)
            curveTo(6f, 15.776f, 6.224f, 16f, 6.5f, 16f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-7f)
            curveTo(6.224f, 11f, 6f, 11.224f, 6f, 11.5f)
            close()
        }
    }.build()
}
