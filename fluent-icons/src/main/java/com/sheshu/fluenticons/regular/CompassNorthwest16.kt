package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CompassNorthwest16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CompassNorthwest16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            close()
            moveToRelative(0f, 1f)
            curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            close()
            moveTo(4.603f, 5.903f)
            curveTo(4.264f, 5.082f, 5.085f, 4.261f, 5.907f, 4.6f)
            lineTo(8.45f, 5.644f)
            curveTo(9.313f, 5.998f, 10f, 6.686f, 10.355f, 7.55f)
            lineToRelative(1.046f, 2.543f)
            curveToRelative(0.337f, 0.82f, -0.484f, 1.641f, -1.305f, 1.305f)
            lineToRelative(-2.543f, -1.046f)
            curveTo(6.688f, 9.997f, 6.002f, 9.311f, 5.646f, 8.446f)
            lineTo(4.603f, 5.903f)
            close()
            moveTo(6.57f, 8.066f)
            curveToRelative(0.254f, 0.618f, 0.745f, 1.108f, 1.363f, 1.362f)
            lineToRelative(2.542f, 1.045f)
            lineTo(9.43f, 7.93f)
            curveTo(9.177f, 7.313f, 8.687f, 6.822f, 8.069f, 6.568f)
            lineTo(5.526f, 5.523f)
            lineToRelative(1.045f, 2.543f)
            close()
        }
    }.build()
}
