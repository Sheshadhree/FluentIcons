package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Tablet12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Tablet12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 7f)
            curveTo(4.724f, 7f, 4.5f, 7.224f, 4.5f, 7.5f)
            reflectiveCurveTo(4.724f, 8f, 5f, 8f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(7.276f, 7f, 7f, 7f)
            horizontalLineTo(5f)
            close()
            moveTo(2.5f, 2f)
            curveTo(1.672f, 2f, 1f, 2.672f, 1f, 3.5f)
            verticalLineToRelative(5f)
            curveTo(1f, 9.328f, 1.672f, 10f, 2.5f, 10f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveTo(11f, 2.672f, 10.328f, 2f, 9.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(2f, 3.5f)
            curveTo(2f, 3.224f, 2.224f, 3f, 2.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(9.776f, 3f, 10f, 3.224f, 10f, 3.5f)
            verticalLineToRelative(5f)
            curveTo(10f, 8.776f, 9.776f, 9f, 9.5f, 9f)
            horizontalLineToRelative(-7f)
            curveTo(2.224f, 9f, 2f, 8.776f, 2f, 8.5f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}
