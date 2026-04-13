package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarPerson32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarPerson32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(16f)
            curveToRelative(-0.516f, -0.687f, -1.204f, -1.236f, -2f, -1.584f)
            verticalLineTo(11f)
            horizontalLineTo(5f)
            verticalLineToRelative(13.5f)
            curveTo(5f, 25.88f, 6.12f, 27f, 7.5f, 27f)
            horizontalLineToRelative(10.031f)
            curveToRelative(0.078f, 0.695f, 0.302f, 1.375f, 0.68f, 2f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            close()
            moveTo(7.5f, 5f)
            curveTo(6.12f, 5f, 5f, 6.12f, 5f, 7.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(22f)
            verticalLineTo(7.5f)
            curveTo(27f, 6.12f, 25.88f, 5f, 24.5f, 5f)
            horizontalLineToRelative(-17f)
            close()
            moveToRelative(21f, 14f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            close()
            moveToRelative(2.5f, 7.438f)
            curveToRelative(0f, 2.023f, -1.714f, 4.062f, -6f, 4.062f)
            reflectiveCurveToRelative(-6f, -2.031f, -6f, -4.063f)
            curveTo(19f, 25.102f, 20.082f, 24f, 21.417f, 24f)
            horizontalLineToRelative(7.166f)
            curveTo(29.918f, 24f, 31f, 25.102f, 31f, 26.438f)
            close()
        }
    }.build()
}
