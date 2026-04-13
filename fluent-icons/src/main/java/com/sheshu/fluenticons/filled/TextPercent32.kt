package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextPercent32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextPercent32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24.627f, 3.21f)
            curveToRelative(0.572f, 0.386f, 0.723f, 1.163f, 0.337f, 1.736f)
            lineTo(9.112f, 28.447f)
            curveToRelative(-0.386f, 0.573f, -1.163f, 0.724f, -1.735f, 0.338f)
            curveToRelative(-0.573f, -0.387f, -0.724f, -1.163f, -0.338f, -1.736f)
            lineTo(22.891f, 3.548f)
            curveToRelative(0.387f, -0.573f, 1.163f, -0.724f, 1.736f, -0.338f)
            close()
            moveTo(8.5f, 5.5f)
            curveTo(6.567f, 5.5f, 5f, 7.067f, 5f, 9f)
            reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveTo(12f, 10.933f, 12f, 9f)
            reflectiveCurveToRelative(-1.567f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(2.5f, 9f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            close()
            moveTo(20f, 23f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveTo(27f, 21.067f, 27f, 23f)
            reflectiveCurveToRelative(-1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(20f, 24.933f, 20f, 23f)
            close()
            moveToRelative(3.5f, -6f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            close()
        }
    }.build()
}
