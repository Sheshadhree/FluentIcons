package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataBarVertical16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataBarVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.5f)
            curveTo(2f, 2.672f, 2.672f, 2f, 3.5f, 2f)
            reflectiveCurveTo(5f, 2.672f, 5f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(5f, 13.328f, 4.328f, 14f, 3.5f, 14f)
            reflectiveCurveTo(2f, 13.328f, 2f, 12.5f)
            verticalLineToRelative(-9f)
            close()
            moveTo(3.5f, 3f)
            curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(3f, 12.776f, 3.224f, 13f, 3.5f, 13f)
            reflectiveCurveTo(4f, 12.776f, 4f, 12.5f)
            verticalLineToRelative(-9f)
            curveTo(4f, 3.224f, 3.776f, 3f, 3.5f, 3f)
            close()
            moveTo(6f, 6.5f)
            curveTo(6f, 5.672f, 6.672f, 5f, 7.5f, 5f)
            reflectiveCurveTo(9f, 5.672f, 9f, 6.5f)
            verticalLineToRelative(6f)
            curveTo(9f, 13.328f, 8.328f, 14f, 7.5f, 14f)
            reflectiveCurveTo(6f, 13.328f, 6f, 12.5f)
            verticalLineToRelative(-6f)
            close()
            moveTo(7.5f, 6f)
            curveTo(7.224f, 6f, 7f, 6.224f, 7f, 6.5f)
            verticalLineToRelative(6f)
            curveTo(7f, 12.776f, 7.224f, 13f, 7.5f, 13f)
            reflectiveCurveTo(8f, 12.776f, 8f, 12.5f)
            verticalLineToRelative(-6f)
            curveTo(8f, 6.224f, 7.776f, 6f, 7.5f, 6f)
            close()
            moveToRelative(4f, 2f)
            curveTo(10.672f, 8f, 10f, 8.672f, 10f, 9.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveTo(13f, 8.672f, 12.328f, 8f, 11.5f, 8f)
            close()
            moveTo(11f, 9.5f)
            curveTo(11f, 9.224f, 11.224f, 9f, 11.5f, 9f)
            reflectiveCurveTo(12f, 9.224f, 12f, 9.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(11f, 12.776f, 11f, 12.5f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
