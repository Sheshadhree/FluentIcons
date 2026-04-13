package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Filter12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Filter12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 2.5f)
            curveTo(1f, 2.224f, 1.224f, 2f, 1.5f, 2f)
            horizontalLineToRelative(9f)
            curveTo(10.776f, 2f, 11f, 2.224f, 11f, 2.5f)
            reflectiveCurveTo(10.776f, 3f, 10.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(1.224f, 3f, 1f, 2.776f, 1f, 2.5f)
            close()
            moveToRelative(2f, 3f)
            curveTo(3f, 5.224f, 3.224f, 5f, 3.5f, 5f)
            horizontalLineToRelative(5f)
            curveTo(8.776f, 5f, 9f, 5.224f, 9f, 5.5f)
            reflectiveCurveTo(8.776f, 6f, 8.5f, 6f)
            horizontalLineToRelative(-5f)
            curveTo(3.224f, 6f, 3f, 5.776f, 3f, 5.5f)
            close()
            moveTo(5f, 8f)
            curveTo(4.724f, 8f, 4.5f, 8.224f, 4.5f, 8.5f)
            reflectiveCurveTo(4.724f, 9f, 5f, 9f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(7.276f, 8f, 7f, 8f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
