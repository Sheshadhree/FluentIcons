package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FStop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FStop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.442f, 6.57f)
            curveToRelative(0.312f, -1.827f, 2.188f, -2.937f, 3.94f, -2.33f)
            lineToRelative(0.59f, 0.205f)
            curveToRelative(0.523f, 0.18f, 1.092f, -0.096f, 1.273f, -0.617f)
            curveToRelative(0.18f, -0.522f, -0.096f, -1.092f, -0.617f, -1.273f)
            lineTo(18.036f, 2.35f)
            curveToRelative(-2.918f, -1.01f, -6.046f, 0.84f, -6.566f, 3.883f)
            lineTo(10.742f, 10.5f)
            horizontalLineTo(7f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(3.4f)
            lineToRelative(-0.69f, 4.042f)
            curveToRelative(-0.347f, 2.033f, -2.595f, 3.117f, -4.403f, 2.123f)
            lineToRelative(-0.075f, -0.041f)
            curveToRelative(-0.484f, -0.266f, -1.092f, -0.09f, -1.358f, 0.394f)
            reflectiveCurveToRelative(-0.09f, 1.092f, 0.394f, 1.358f)
            lineToRelative(0.076f, 0.042f)
            curveToRelative(3.012f, 1.657f, 6.76f, -0.15f, 7.338f, -3.54f)
            lineToRelative(0.747f, -4.378f)
            horizontalLineTo(16f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-3.23f)
            lineToRelative(0.672f, -3.93f)
            close()
        }
    }.build()
}
