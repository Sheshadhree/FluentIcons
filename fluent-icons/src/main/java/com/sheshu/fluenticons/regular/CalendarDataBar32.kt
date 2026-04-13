package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarDataBar32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarDataBar32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 22f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
            moveToRelative(5f, -6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            verticalLineTo(18f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
            moveToRelative(5f, 4f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
            moveTo(24.5f, 3f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineToRelative(11f)
            curveToRelative(-0.537f, 0f, -1.046f, 0.12f, -1.5f, 0.336f)
            verticalLineTo(18f)
            curveToRelative(0f, -0.66f, -0.183f, -1.276f, -0.5f, -1.803f)
            verticalLineTo(11f)
            horizontalLineTo(5f)
            verticalLineToRelative(13.5f)
            curveTo(5f, 25.88f, 6.12f, 27f, 7.5f, 27f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-8f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            close()
            moveToRelative(-17f, 2f)
            curveTo(6.12f, 5f, 5f, 6.12f, 5f, 7.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(22f)
            verticalLineTo(7.5f)
            curveTo(27f, 6.12f, 25.88f, 5f, 24.5f, 5f)
            horizontalLineToRelative(-17f)
            close()
        }
    }.build()
}
