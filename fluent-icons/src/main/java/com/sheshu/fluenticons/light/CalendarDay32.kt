package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.CalendarDay32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.CalendarDay32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 9.5f)
            curveTo(9f, 9.224f, 9.224f, 9f, 9.5f, 9f)
            horizontalLineToRelative(13f)
            curveTo(22.776f, 9f, 23f, 9.224f, 23f, 9.5f)
            reflectiveCurveTo(22.776f, 10f, 22.5f, 10f)
            horizontalLineToRelative(-13f)
            curveTo(9.224f, 10f, 9f, 9.776f, 9f, 9.5f)
            close()
            moveToRelative(1.5f, 3.5f)
            curveTo(9.672f, 13f, 9f, 13.672f, 9f, 14.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(10f, 14.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-11f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(7.5f, 3f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineToRelative(17f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineToRelative(17f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-17f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            horizontalLineToRelative(-17f)
            close()
            moveToRelative(17f, 1f)
            curveTo(26.433f, 4f, 28f, 5.567f, 28f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.567f, 28f, 4f, 26.433f, 4f, 24.5f)
            verticalLineToRelative(-17f)
            curveTo(4f, 5.567f, 5.567f, 4f, 7.5f, 4f)
            horizontalLineToRelative(17f)
            close()
        }
    }.build()
}
