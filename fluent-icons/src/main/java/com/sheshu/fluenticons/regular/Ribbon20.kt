package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Ribbon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Ribbon20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 8f)
            curveToRelative(0f, 1.777f, -0.773f, 3.374f, -2f, 4.472f)
            verticalLineTo(17.5f)
            curveToRelative(0f, 0.178f, -0.095f, 0.343f, -0.249f, 0.433f)
            curveToRelative(-0.154f, 0.09f, -0.344f, 0.09f, -0.5f, 0.001f)
            lineTo(10f, 16.076f)
            lineToRelative(-3.252f, 1.858f)
            curveToRelative(-0.155f, 0.089f, -0.345f, 0.088f, -0.499f, -0.001f)
            curveTo(6.095f, 17.843f, 6f, 17.678f, 6f, 17.5f)
            verticalLineToRelative(-5.028f)
            curveTo(4.772f, 11.374f, 4f, 9.777f, 4f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            close()
            moveToRelative(-6f, 6f)
            curveToRelative(-1.093f, 0f, -2.117f, -0.292f, -3f, -0.803f)
            verticalLineToRelative(3.442f)
            lineToRelative(2.752f, -1.573f)
            curveToRelative(0.154f, -0.088f, 0.342f, -0.088f, 0.496f, 0f)
            lineTo(13f, 16.64f)
            verticalLineToRelative(-3.442f)
            curveTo(12.117f, 13.707f, 11.093f, 14f, 10f, 14f)
            close()
            moveToRelative(0f, -1f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            close()
        }
    }.build()
}
