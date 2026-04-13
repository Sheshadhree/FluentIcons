package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PanelLeftText16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PanelLeftText16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 5.5f)
            curveTo(4f, 5.224f, 4.224f, 5f, 4.5f, 5f)
            horizontalLineToRelative(1f)
            curveTo(5.776f, 5f, 6f, 5.224f, 6f, 5.5f)
            reflectiveCurveTo(5.776f, 6f, 5.5f, 6f)
            horizontalLineToRelative(-1f)
            curveTo(4.224f, 6f, 4f, 5.776f, 4f, 5.5f)
            close()
            moveTo(4f, 8f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1f)
            curveTo(5.776f, 7.5f, 6f, 7.724f, 6f, 8f)
            reflectiveCurveTo(5.776f, 8.5f, 5.5f, 8.5f)
            horizontalLineToRelative(-1f)
            curveTo(4.224f, 8.5f, 4f, 8.276f, 4f, 8f)
            close()
            moveToRelative(0.5f, 2f)
            curveTo(4.224f, 10f, 4f, 10.224f, 4f, 10.5f)
            reflectiveCurveTo(4.224f, 11f, 4.5f, 11f)
            horizontalLineToRelative(1f)
            curveTo(5.776f, 11f, 6f, 10.776f, 6f, 10.5f)
            reflectiveCurveTo(5.776f, 10f, 5.5f, 10f)
            horizontalLineToRelative(-1f)
            close()
            moveToRelative(0f, -7f)
            curveTo(3.12f, 3f, 2f, 4.12f, 2f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 11.88f, 3.12f, 13f, 4.5f, 13f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveTo(14f, 4.12f, 12.88f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(3f, 5.5f)
            curveTo(3f, 4.672f, 3.672f, 4f, 4.5f, 4f)
            horizontalLineTo(7f)
            verticalLineToRelative(8f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 12f, 3f, 11.328f, 3f, 10.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(8f, 12f)
            verticalLineTo(4f)
            horizontalLineToRelative(3.5f)
            curveTo(12.328f, 4f, 13f, 4.672f, 13f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}
