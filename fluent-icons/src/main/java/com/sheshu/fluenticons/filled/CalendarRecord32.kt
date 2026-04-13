package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarRecord32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarRecord32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 3f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(26f)
            verticalLineTo(7.5f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            horizontalLineToRelative(-17f)
            close()
            moveTo(29f, 11f)
            horizontalLineTo(3f)
            verticalLineToRelative(13.5f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineToRelative(8.875f)
            curveTo(15.2f, 27.48f, 14.5f, 25.571f, 14.5f, 23.5f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            curveToRelative(2.071f, 0f, 3.98f, 0.7f, 5.5f, 1.875f)
            verticalLineTo(11f)
            close()
            moveToRelative(-5.5f, 7f)
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
