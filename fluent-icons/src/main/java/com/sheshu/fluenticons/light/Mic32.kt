package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Mic32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Mic32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            verticalLineTo(8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            close()
            moveToRelative(5f, 14f)
            verticalLineTo(8f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.239f, -5f, 5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            close()
            moveTo(6.5f, 15f)
            curveTo(6.776f, 15f, 7f, 15.224f, 7f, 15.5f)
            verticalLineTo(16f)
            curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(16f)
            curveToRelative(0f, 5.355f, -4.21f, 9.727f, -9.5f, 9.988f)
            verticalLineTo(29.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-3.512f)
            curveTo(10.21f, 25.728f, 6f, 21.355f, 6f, 16f)
            verticalLineToRelative(-0.5f)
            curveTo(6f, 15.224f, 6.224f, 15f, 6.5f, 15f)
            close()
        }
    }.build()
}
