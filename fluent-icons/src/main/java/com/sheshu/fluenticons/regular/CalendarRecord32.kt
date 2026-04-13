package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarRecord32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarRecord32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 3f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineToRelative(17f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineToRelative(8.875f)
            curveToRelative(-0.47f, -0.61f, -0.865f, -1.28f, -1.17f, -2f)
            horizontalLineTo(7.5f)
            curveTo(6.12f, 27f, 5f, 25.88f, 5f, 24.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(22f)
            verticalLineToRelative(4.206f)
            curveToRelative(0.72f, 0.304f, 1.39f, 0.698f, 2f, 1.17f)
            verticalLineTo(7.5f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            horizontalLineToRelative(-17f)
            close()
            moveTo(5f, 7.5f)
            curveTo(5f, 6.12f, 6.12f, 5f, 7.5f, 5f)
            horizontalLineToRelative(17f)
            curveTo(25.88f, 5f, 27f, 6.12f, 27f, 7.5f)
            verticalLineTo(9f)
            horizontalLineTo(5f)
            verticalLineTo(7.5f)
            close()
            moveTo(23.5f, 18f)
            curveToRelative(3.038f, 0f, 5.5f, 2.462f, 5.5f, 5.5f)
            reflectiveCurveTo(26.538f, 29f, 23.5f, 29f)
            reflectiveCurveTo(18f, 26.538f, 18f, 23.5f)
            reflectiveCurveToRelative(2.462f, -5.5f, 5.5f, -5.5f)
            close()
            moveToRelative(0f, 13f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            curveToRelative(0f, -4.142f, -3.358f, -7.5f, -7.5f, -7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, 3.358f, -7.5f, 7.5f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            close()
            moveToRelative(3.5f, -7.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(20f, 25.433f, 20f, 23.5f)
            reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            close()
        }
    }.build()
}
