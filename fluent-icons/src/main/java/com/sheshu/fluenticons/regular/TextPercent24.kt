package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextPercent24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextPercent24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.984f, 3.128f)
            curveToRelative(0.343f, 0.232f, 0.434f, 0.698f, 0.202f, 1.041f)
            lineTo(7.057f, 20.67f)
            curveToRelative(-0.231f, 0.343f, -0.697f, 0.434f, -1.04f, 0.202f)
            curveToRelative(-0.344f, -0.232f, -0.435f, -0.698f, -0.203f, -1.041f)
            lineToRelative(11.129f, -16.5f)
            curveToRelative(0.231f, -0.343f, 0.697f, -0.433f, 1.04f, -0.202f)
            close()
            moveTo(6.5f, 4.5f)
            curveTo(5.12f, 4.5f, 4f, 5.62f, 4f, 7f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveTo(9f, 8.38f, 9f, 7f)
            reflectiveCurveTo(7.88f, 4.5f, 6.5f, 4.5f)
            close()
            moveTo(2.5f, 7f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            close()
            moveTo(15f, 17f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveTo(20f, 15.62f, 20f, 17f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(15f, 18.38f, 15f, 17f)
            close()
            moveToRelative(2.5f, -4f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
        }
    }.build()
}
