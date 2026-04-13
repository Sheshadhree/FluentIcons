package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.LockClosed32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.LockClosed32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 22f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveTo(10f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1.5f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-15f)
            curveTo(6.015f, 30f, 4f, 27.985f, 4f, 25.5f)
            verticalLineToRelative(-12f)
            curveTo(4f, 11.015f, 6.015f, 9f, 8.5f, 9f)
            horizontalLineTo(10f)
            verticalLineTo(8f)
            close()
            moveToRelative(11f, 0f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.239f, -5f, 5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(10f)
            verticalLineTo(8f)
            close()
            moveTo(8.5f, 10f)
            curveTo(6.567f, 10f, 5f, 11.567f, 5f, 13.5f)
            verticalLineToRelative(12f)
            curveTo(5f, 27.433f, 6.567f, 29f, 8.5f, 29f)
            horizontalLineToRelative(15f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-12f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-15f)
            close()
        }
    }.build()
}
