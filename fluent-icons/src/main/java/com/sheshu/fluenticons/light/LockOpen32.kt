package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.LockOpen32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.LockOpen32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 20f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(3f, -14.5f)
            curveTo(21f, 3.015f, 23.015f, 1f, 25.5f, 1f)
            reflectiveCurveTo(30f, 3.015f, 30f, 5.5f)
            verticalLineToRelative(2f)
            curveTo(30f, 7.776f, 30.224f, 8f, 30.5f, 8f)
            reflectiveCurveTo(31f, 7.776f, 31f, 7.5f)
            verticalLineToRelative(-2f)
            curveTo(31f, 2.462f, 28.538f, 0f, 25.5f, 0f)
            reflectiveCurveTo(20f, 2.462f, 20f, 5.5f)
            verticalLineTo(9f)
            horizontalLineTo(8.5f)
            curveTo(6.015f, 9f, 4f, 11.015f, 4f, 13.5f)
            verticalLineToRelative(12f)
            curveTo(4f, 27.985f, 6.015f, 30f, 8.5f, 30f)
            horizontalLineToRelative(15f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-12f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            horizontalLineTo(21f)
            verticalLineTo(5.5f)
            close()
            moveToRelative(2.5f, 4.5f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-15f)
            curveTo(6.567f, 29f, 5f, 27.433f, 5f, 25.5f)
            verticalLineToRelative(-12f)
            curveTo(5f, 11.567f, 6.567f, 10f, 8.5f, 10f)
            horizontalLineToRelative(15f)
            close()
        }
    }.build()
}
