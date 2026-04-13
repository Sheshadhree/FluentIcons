package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LayoutAddAbove16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LayoutAddAbove16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 6f)
            curveTo(13.776f, 6f, 14f, 6.224f, 14f, 6.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-5f)
            curveTo(2f, 6.224f, 2.224f, 6f, 2.5f, 6f)
            horizontalLineToRelative(11f)
            close()
            moveTo(3f, 11.5f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineToRelative(4.5f)
            close()
            moveTo(13.5f, 2f)
            curveTo(13.776f, 2f, 14f, 2.224f, 14f, 2.5f)
            reflectiveCurveTo(13.776f, 3f, 13.5f, 3f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 3f, 2f, 2.776f, 2f, 2.5f)
            reflectiveCurveTo(2.224f, 2f, 2.5f, 2f)
            horizontalLineToRelative(11f)
            close()
        }
    }.build()
}
