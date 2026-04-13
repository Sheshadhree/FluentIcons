package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Guest12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Guest12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 1f)
            curveTo(2.672f, 1f, 2f, 1.672f, 2f, 2.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 10.328f, 2.672f, 11f, 3.5f, 11f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveTo(10f, 1.672f, 9.328f, 1f, 8.5f, 1f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(3f, 2.5f)
            curveTo(3f, 2.224f, 3.224f, 2f, 3.5f, 2f)
            horizontalLineToRelative(5f)
            curveTo(8.776f, 2f, 9f, 2.224f, 9f, 2.5f)
            verticalLineToRelative(7f)
            curveTo(9f, 9.776f, 8.776f, 10f, 8.5f, 10f)
            horizontalLineToRelative(-5f)
            curveTo(3.224f, 10f, 3f, 9.776f, 3f, 9.5f)
            verticalLineToRelative(-7f)
            close()
            moveToRelative(3f, 4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveTo(4.5f, 7f)
            curveTo(4.224f, 7f, 4f, 7.224f, 4f, 7.5f)
            curveTo(4f, 8.5f, 5f, 9f, 6f, 9f)
            reflectiveCurveToRelative(2f, -0.5f, 2f, -1.5f)
            curveTo(8f, 7.224f, 7.776f, 7f, 7.5f, 7f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(1f, -4.5f)
            curveTo(5.224f, 2.5f, 5f, 2.724f, 5f, 3f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1f)
            curveTo(6.776f, 3.5f, 7f, 3.276f, 7f, 3f)
            reflectiveCurveTo(6.776f, 2.5f, 6.5f, 2.5f)
            horizontalLineToRelative(-1f)
            close()
        }
    }.build()
}
