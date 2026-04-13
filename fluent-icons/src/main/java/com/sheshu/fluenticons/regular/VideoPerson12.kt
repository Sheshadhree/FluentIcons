package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.VideoPerson12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.VideoPerson12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(6.828f, 4f, 6f, 4f)
            reflectiveCurveTo(4.5f, 4.672f, 4.5f, 5.5f)
            reflectiveCurveTo(5.172f, 7f, 6f, 7f)
            close()
            moveToRelative(0f, -1f)
            curveTo(5.724f, 6f, 5.5f, 5.776f, 5.5f, 5.5f)
            reflectiveCurveTo(5.724f, 5f, 6f, 5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(6.276f, 6f, 6f, 6f)
            close()
            moveTo(1f, 3.5f)
            curveTo(1f, 2.672f, 1.672f, 2f, 2.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(10.328f, 2f, 11f, 2.672f, 11f, 3.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(1.672f, 10f, 1f, 9.328f, 1f, 8.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(2.5f, 3f)
            curveTo(2.224f, 3f, 2f, 3.224f, 2f, 3.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 8.776f, 2.224f, 9f, 2.5f, 9f)
            horizontalLineTo(4f)
            verticalLineTo(8.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineTo(9f)
            horizontalLineToRelative(1.5f)
            curveTo(9.776f, 9f, 10f, 8.776f, 10f, 8.5f)
            verticalLineToRelative(-5f)
            curveTo(10f, 3.224f, 9.776f, 3f, 9.5f, 3f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(7f, 9f)
            verticalLineTo(8.5f)
            horizontalLineTo(5f)
            verticalLineTo(9f)
            horizontalLineToRelative(2f)
            close()
        }
    }.build()
}
