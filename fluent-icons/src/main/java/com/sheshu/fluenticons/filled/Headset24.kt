package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Headset24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Headset24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 9f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(9f)
            curveToRelative(0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
            reflectiveCurveTo(6.5f, 5.962f, 6.5f, 9f)
            verticalLineToRelative(1f)
            horizontalLineTo(9f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(7f)
            curveToRelative(-0.173f, 0f, -0.34f, -0.022f, -0.5f, -0.063f)
            verticalLineToRelative(0.313f)
            curveToRelative(0f, 1.19f, 0.925f, 2.166f, 2.096f, 2.245f)
            lineTo(8.75f, 18.5f)
            horizontalLineToRelative(1.128f)
            curveTo(10.186f, 17.628f, 11.02f, 17f, 12f, 17f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            reflectiveCurveTo(13.243f, 21.5f, 12f, 21.5f)
            curveToRelative(-0.98f, 0f, -1.813f, -0.626f, -2.122f, -1.5f)
            horizontalLineTo(8.75f)
            curveToRelative(-2.004f, 0f, -3.641f, -1.572f, -3.745f, -3.55f)
            lineTo(5f, 16.25f)
            verticalLineTo(9f)
            close()
        }
    }.build()
}
