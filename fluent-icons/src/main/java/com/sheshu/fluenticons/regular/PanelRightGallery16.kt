package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PanelRightGallery16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PanelRightGallery16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 5.5f)
            curveTo(14f, 4.12f, 12.88f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 3f, 2f, 4.12f, 2f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 11.88f, 3.12f, 13f, 4.5f, 13f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(-1f, 0f)
            verticalLineTo(6f)
            horizontalLineToRelative(-3f)
            verticalLineTo(4f)
            horizontalLineToRelative(1.5f)
            curveTo(12.328f, 4f, 13f, 4.672f, 13f, 5.5f)
            close()
            moveTo(10f, 9f)
            verticalLineTo(7f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(10f)
            verticalLineToRelative(-2f)
            close()
            moveTo(9f, 4f)
            verticalLineToRelative(8f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 12f, 3f, 11.328f, 3f, 10.5f)
            verticalLineToRelative(-5f)
            curveTo(3f, 4.672f, 3.672f, 4f, 4.5f, 4f)
            horizontalLineTo(9f)
            close()
        }
    }.build()
}
