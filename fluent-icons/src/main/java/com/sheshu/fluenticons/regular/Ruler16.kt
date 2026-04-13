package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Ruler16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Ruler16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 3.5f)
            curveTo(11f, 2.672f, 10.328f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-3f)
            curveTo(5.672f, 2f, 5f, 2.672f, 5f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(5f, 13.33f, 5.672f, 14f, 6.5f, 14f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.671f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            close()
            moveTo(9.5f, 3f)
            curveTo(9.776f, 3f, 10f, 3.224f, 10f, 3.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.277f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-3f)
            curveTo(6.224f, 13f, 6f, 12.778f, 6f, 12.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(1.5f)
            curveTo(7.776f, 11f, 8f, 10.776f, 8f, 10.5f)
            reflectiveCurveTo(7.776f, 10f, 7.5f, 10f)
            horizontalLineTo(6f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(8.276f, 7.5f, 8f, 7.5f)
            horizontalLineTo(6f)
            verticalLineTo(6f)
            horizontalLineToRelative(1.5f)
            curveTo(7.776f, 6f, 8f, 5.776f, 8f, 5.5f)
            reflectiveCurveTo(7.776f, 5f, 7.5f, 5f)
            horizontalLineTo(6f)
            verticalLineTo(3.5f)
            curveTo(6f, 3.224f, 6.224f, 3f, 6.5f, 3f)
            horizontalLineToRelative(3f)
            close()
        }
    }.build()
}
