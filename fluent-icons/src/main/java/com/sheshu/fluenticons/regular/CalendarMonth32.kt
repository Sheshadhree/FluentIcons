package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarMonth32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarMonth32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 12.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(9f, 13.328f, 9f, 12.5f)
            reflectiveCurveTo(9.672f, 11f, 10.5f, 11f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            close()
            moveTo(10.5f, 20f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(11.328f, 17f, 10.5f, 17f)
            reflectiveCurveTo(9f, 17.672f, 9f, 18.5f)
            reflectiveCurveTo(9.672f, 20f, 10.5f, 20f)
            close()
            moveToRelative(5.5f, 0f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(16.828f, 17f, 16f, 17f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveTo(15.172f, 20f, 16f, 20f)
            close()
            moveToRelative(0f, -6f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(16.828f, 11f, 16f, 11f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveTo(15.172f, 14f, 16f, 14f)
            close()
            moveToRelative(5.5f, 0f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(22.328f, 11f, 21.5f, 11f)
            reflectiveCurveTo(20f, 11.672f, 20f, 12.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
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
            moveTo(5f, 7.5f)
            curveTo(5f, 6.12f, 6.12f, 5f, 7.5f, 5f)
            horizontalLineToRelative(17f)
            curveTo(25.88f, 5f, 27f, 6.12f, 27f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-17f)
            curveTo(6.12f, 27f, 5f, 25.88f, 5f, 24.5f)
            verticalLineToRelative(-17f)
            close()
        }
    }.build()
}
