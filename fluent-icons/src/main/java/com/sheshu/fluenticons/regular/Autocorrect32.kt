package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Autocorrect32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Autocorrect32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.74f, 7.686f)
            curveToRelative(0.592f, -0.914f, 1.929f, -0.914f, 2.52f, 0f)
            lineTo(20.697f, 13f)
            horizontalLineTo(19.5f)
            curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
            reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
            reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
            curveToRelative(0f, -1.393f, -0.438f, -2.684f, -1.184f, -3.742f)
            lineToRelative(-0.008f, -0.012f)
            lineTo(24.341f, 15f)
            horizontalLineTo(29f)
            curveToRelative(0.551f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.449f, -1f, -1f, -1f)
            horizontalLineToRelative(-5.923f)
            lineTo(18.94f, 6.6f)
            curveToRelative(-1.379f, -2.133f, -4.499f, -2.133f, -5.878f, 0f)
            lineToRelative(-10.9f, 16.855f)
            curveToRelative(-0.3f, 0.464f, -0.168f, 1.083f, 0.296f, 1.383f)
            curveToRelative(0.464f, 0.3f, 1.083f, 0.167f, 1.383f, -0.297f)
            lineToRelative(10.9f, -16.855f)
            close()
            moveTo(15f, 19.5f)
            curveToRelative(0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            reflectiveCurveToRelative(-2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveToRelative(-4.5f, -2.015f, -4.5f, -4.5f)
            close()
        }
    }.build()
}
