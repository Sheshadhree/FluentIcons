package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextField16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextField16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 11.5f)
            curveTo(6.5f, 11.224f, 6.724f, 11f, 7f, 11f)
            horizontalLineToRelative(0.5f)
            verticalLineTo(5f)
            horizontalLineTo(5f)
            verticalLineToRelative(0.5f)
            curveTo(5f, 5.776f, 4.776f, 6f, 4.5f, 6f)
            reflectiveCurveTo(4f, 5.776f, 4f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(4f, 4.224f, 4.224f, 4f, 4.5f, 4f)
            horizontalLineToRelative(7f)
            curveTo(11.776f, 4f, 12f, 4.224f, 12f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(12f, 5.776f, 11.776f, 6f, 11.5f, 6f)
            reflectiveCurveTo(11f, 5.776f, 11f, 5.5f)
            verticalLineTo(5f)
            horizontalLineTo(8.5f)
            verticalLineToRelative(6f)
            horizontalLineTo(9f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(9.276f, 12f, 9f, 12f)
            horizontalLineTo(7f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            close()
            moveTo(1f, 4.5f)
            curveTo(1f, 3.12f, 2.12f, 2f, 3.5f, 2f)
            horizontalLineToRelative(9f)
            curveTo(13.88f, 2f, 15f, 3.12f, 15f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.12f, 14f, 1f, 12.88f, 1f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(3.5f, 3f)
            curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.328f, 2.672f, 13f, 3.5f, 13f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.672f, 13.328f, 3f, 12.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
