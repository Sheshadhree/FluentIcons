package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PanelRightGallery16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelRightGallery16",
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
            verticalLineTo(10f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(2f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 12f, 3f, 11.328f, 3f, 10.5f)
            verticalLineToRelative(-5f)
            curveTo(3f, 4.672f, 3.672f, 4f, 4.5f, 4f)
            horizontalLineTo(10f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(4f)
            verticalLineTo(5.5f)
            close()
            moveTo(14f, 7f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(4f)
            verticalLineTo(7f)
            close()
        }
    }.build()
}
