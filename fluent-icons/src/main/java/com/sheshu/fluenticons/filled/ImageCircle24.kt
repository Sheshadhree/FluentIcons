package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.564f, 18.542f)
            curveTo(21.082f, 16.788f, 22f, 14.502f, 22f, 12f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            reflectiveCurveTo(2f, 6.477f, 2f, 12f)
            curveToRelative(0f, 2.501f, 0.918f, 4.788f, 2.436f, 6.542f)
            lineToRelative(5.983f, -5.909f)
            curveToRelative(0.876f, -0.865f, 2.286f, -0.865f, 3.162f, 0f)
            lineToRelative(5.983f, 5.909f)
            close()
            moveTo(18.5f, 19.599f)
            lineToRelative(-5.973f, -5.898f)
            curveToRelative(-0.292f, -0.289f, -0.762f, -0.289f, -1.054f, 0f)
            lineTo(5.5f, 19.599f)
            curveTo(7.248f, 21.096f, 9.518f, 22f, 12f, 22f)
            reflectiveCurveToRelative(4.752f, -0.904f, 6.5f, -2.4f)
            close()
            moveTo(17.5f, 8.5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
        }
    }.build()
}
