package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Ruler20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Ruler20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 3.5f)
            curveTo(14f, 2.672f, 13.328f, 2f, 12.5f, 2f)
            horizontalLineToRelative(-5f)
            curveTo(6.672f, 2f, 6f, 2.672f, 6f, 3.5f)
            verticalLineToRelative(13f)
            curveTo(6f, 17.328f, 6.672f, 18f, 7.5f, 18f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-13f)
            close()
            moveToRelative(-7f, 9.504f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(7f)
            verticalLineTo(10.5f)
            horizontalLineToRelative(1.5f)
            curveTo(8.776f, 10.5f, 9f, 10.276f, 9f, 10f)
            reflectiveCurveTo(8.776f, 9.5f, 8.5f, 9.5f)
            horizontalLineTo(7f)
            verticalLineTo(8f)
            horizontalLineToRelative(2.5f)
            curveTo(9.776f, 8f, 10f, 7.776f, 10f, 7.5f)
            reflectiveCurveTo(9.776f, 7f, 9.5f, 7f)
            horizontalLineTo(7f)
            verticalLineTo(5.5f)
            horizontalLineToRelative(1.5f)
            curveTo(8.776f, 5.5f, 9f, 5.276f, 9f, 5f)
            reflectiveCurveTo(8.776f, 4.5f, 8.5f, 4.5f)
            horizontalLineTo(7f)
            verticalLineToRelative(-1f)
            curveTo(7f, 3.224f, 7.224f, 3f, 7.5f, 3f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 3f, 13f, 3.224f, 13f, 3.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 17f, 7f, 16.776f, 7f, 16.5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(1.5f)
            curveTo(8.776f, 15.5f, 9f, 15.276f, 9f, 15f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(7f)
            verticalLineToRelative(-1.496f)
            close()
        }
    }.build()
}
