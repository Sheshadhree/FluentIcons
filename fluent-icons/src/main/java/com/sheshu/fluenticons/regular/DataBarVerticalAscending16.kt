package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataBarVerticalAscending16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataBarVerticalAscending16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 3.5f)
            curveTo(14f, 2.672f, 13.328f, 2f, 12.5f, 2f)
            reflectiveCurveTo(11f, 2.672f, 11f, 3.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            close()
            moveTo(12.5f, 3f)
            curveTo(12.776f, 3f, 13f, 3.224f, 13f, 3.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(12f, 12.776f, 12f, 12.5f)
            verticalLineToRelative(-9f)
            curveTo(12f, 3.224f, 12.224f, 3f, 12.5f, 3f)
            close()
            moveTo(10f, 6.5f)
            curveTo(10f, 5.672f, 9.328f, 5f, 8.5f, 5f)
            reflectiveCurveTo(7f, 5.672f, 7f, 6.5f)
            verticalLineToRelative(6f)
            curveTo(7f, 13.328f, 7.672f, 14f, 8.5f, 14f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            close()
            moveTo(8.5f, 6f)
            curveTo(8.776f, 6f, 9f, 6.224f, 9f, 6.5f)
            verticalLineToRelative(6f)
            curveTo(9f, 12.776f, 8.776f, 13f, 8.5f, 13f)
            reflectiveCurveTo(8f, 12.776f, 8f, 12.5f)
            verticalLineToRelative(-6f)
            curveTo(8f, 6.224f, 8.224f, 6f, 8.5f, 6f)
            close()
            moveToRelative(-4f, 2f)
            curveTo(5.328f, 8f, 6f, 8.672f, 6f, 9.5f)
            verticalLineToRelative(3f)
            curveTo(6f, 13.328f, 5.328f, 14f, 4.5f, 14f)
            reflectiveCurveTo(3f, 13.328f, 3f, 12.5f)
            verticalLineToRelative(-3f)
            curveTo(3f, 8.672f, 3.672f, 8f, 4.5f, 8f)
            close()
            moveTo(5f, 9.5f)
            curveTo(5f, 9.224f, 4.776f, 9f, 4.5f, 9f)
            reflectiveCurveTo(4f, 9.224f, 4f, 9.5f)
            verticalLineToRelative(3f)
            curveTo(4f, 12.776f, 4.224f, 13f, 4.5f, 13f)
            reflectiveCurveTo(5f, 12.776f, 5f, 12.5f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
