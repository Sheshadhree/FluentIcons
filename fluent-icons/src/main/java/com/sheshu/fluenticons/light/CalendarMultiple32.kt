package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.CalendarMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.CalendarMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(15f)
            curveTo(24.985f, 3f, 27f, 5.015f, 27f, 7.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-15f)
            curveTo(5.015f, 27f, 3f, 24.985f, 3f, 22.5f)
            verticalLineToRelative(-15f)
            close()
            moveTo(22.5f, 4f)
            horizontalLineToRelative(-15f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(22f)
            verticalLineTo(7.5f)
            curveTo(26f, 5.567f, 24.433f, 4f, 22.5f, 4f)
            close()
            moveToRelative(3.5f, 6f)
            horizontalLineTo(4f)
            verticalLineToRelative(12.5f)
            curveTo(4f, 24.433f, 5.567f, 26f, 7.5f, 26f)
            horizontalLineToRelative(15f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(10f)
            close()
            moveTo(7.671f, 29f)
            curveToRelative(0.773f, 0.625f, 1.757f, 1f, 2.829f, 1f)
            horizontalLineToRelative(12f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            verticalLineToRelative(-12f)
            curveToRelative(0f, -1.072f, -0.375f, -2.056f, -1f, -2.829f)
            verticalLineTo(22.5f)
            curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
            horizontalLineTo(7.67f)
            close()
        }
    }.build()
}
