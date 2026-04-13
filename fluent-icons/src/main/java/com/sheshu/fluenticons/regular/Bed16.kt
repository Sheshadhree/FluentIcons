package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Bed16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bed16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 4.5f)
            curveTo(3f, 3.12f, 4.12f, 2f, 5.5f, 2f)
            horizontalLineToRelative(5f)
            curveTo(11.88f, 2f, 13f, 3.12f, 13f, 4.5f)
            verticalLineToRelative(1.55f)
            curveToRelative(1.141f, 0.232f, 2f, 1.24f, 2f, 2.45f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(14f, 13.776f, 14f, 13.5f)
            verticalLineTo(11f)
            horizontalLineTo(2f)
            verticalLineToRelative(2.5f)
            curveTo(2f, 13.776f, 1.776f, 14f, 1.5f, 14f)
            reflectiveCurveTo(1f, 13.776f, 1f, 13.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.21f, 0.859f, -2.218f, 2f, -2.45f)
            verticalLineTo(4.5f)
            close()
            moveTo(2f, 10f)
            horizontalLineToRelative(12f)
            verticalLineTo(8.5f)
            curveTo(14f, 7.672f, 13.328f, 7f, 12.5f, 7f)
            horizontalLineToRelative(-9f)
            curveTo(2.672f, 7f, 2f, 7.672f, 2f, 8.5f)
            verticalLineTo(10f)
            close()
            moveToRelative(10f, -5.5f)
            curveTo(12f, 3.672f, 11.328f, 3f, 10.5f, 3f)
            horizontalLineToRelative(-5f)
            curveTo(4.672f, 3f, 4f, 3.672f, 4f, 4.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(1f)
            verticalLineTo(5.5f)
            curveTo(5f, 5.224f, 5.224f, 5f, 5.5f, 5f)
            horizontalLineTo(7f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(1f)
            verticalLineTo(5.5f)
            curveTo(8.5f, 5.224f, 8.724f, 5f, 9f, 5f)
            horizontalLineToRelative(1.5f)
            curveTo(10.776f, 5f, 11f, 5.224f, 11f, 5.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(1f)
            verticalLineTo(4.5f)
            close()
        }
    }.build()
}
