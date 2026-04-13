package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.CalendarPattern32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.CalendarPattern32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(29f, 24.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineToRelative(17f)
            close()
            moveTo(24.5f, 4f)
            horizontalLineToRelative(-17f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(24f)
            verticalLineTo(7.5f)
            curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
            close()
            moveTo(4f, 16.293f)
            lineTo(9.293f, 11f)
            horizontalLineTo(4f)
            verticalLineToRelative(5.293f)
            close()
            moveToRelative(0f, 1.414f)
            verticalLineTo(20f)
            horizontalLineToRelative(3.293f)
            lineToRelative(9f, -9f)
            horizontalLineToRelative(-5.586f)
            lineTo(4f, 17.707f)
            close()
            moveTo(17.707f, 11f)
            lineToRelative(-9f, 9f)
            horizontalLineToRelative(5.586f)
            lineToRelative(9f, -9f)
            horizontalLineToRelative(-5.586f)
            close()
            moveToRelative(7f, 0f)
            lineToRelative(-9f, 9f)
            horizontalLineToRelative(5.586f)
            lineTo(28f, 13.293f)
            verticalLineTo(11f)
            horizontalLineToRelative(-3.293f)
            close()
            moveTo(28f, 14.707f)
            lineTo(22.707f, 20f)
            horizontalLineTo(28f)
            verticalLineToRelative(-5.293f)
            close()
        }
    }.build()
}
