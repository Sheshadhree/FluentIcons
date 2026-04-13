package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Scales20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Scales20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 3f)
            curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
            reflectiveCurveTo(3.224f, 4f, 3.5f, 4f)
            horizontalLineToRelative(0.75f)
            lineTo(2.077f, 9.215f)
            curveToRelative(-0.05f, 0.119f, -0.08f, 0.257f, -0.075f, 0.405f)
            curveTo(2.066f, 11.22f, 3.383f, 12.5f, 5f, 12.5f)
            curveToRelative(1.617f, 0f, 2.935f, -1.279f, 2.998f, -2.88f)
            curveToRelative(0.006f, -0.148f, -0.026f, -0.286f, -0.075f, -0.405f)
            lineTo(5.75f, 4f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(11f)
            horizontalLineToRelative(-4f)
            curveTo(4.672f, 15f, 4f, 15.672f, 4f, 16.5f)
            reflectiveCurveTo(4.672f, 18f, 5.5f, 18f)
            horizontalLineToRelative(9f)
            curveToRelative(0.829f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(15.33f, 15f, 14.5f, 15f)
            horizontalLineToRelative(-4f)
            verticalLineTo(4f)
            horizontalLineToRelative(3.75f)
            lineToRelative(-2.173f, 5.215f)
            curveToRelative(-0.05f, 0.119f, -0.08f, 0.257f, -0.075f, 0.405f)
            curveToRelative(0.063f, 1.601f, 1.381f, 2.88f, 2.998f, 2.88f)
            curveToRelative(1.617f, 0f, 2.935f, -1.279f, 2.998f, -2.88f)
            curveToRelative(0.005f, -0.148f, -0.026f, -0.286f, -0.075f, -0.405f)
            lineTo(15.75f, 4f)
            horizontalLineToRelative(0.75f)
            curveTo(16.776f, 4f, 17f, 3.776f, 17f, 3.5f)
            reflectiveCurveTo(16.776f, 3f, 16.5f, 3f)
            horizontalLineToRelative(-13f)
            close()
            moveTo(5f, 4.8f)
            lineTo(6.75f, 9f)
            horizontalLineToRelative(-3.5f)
            lineTo(5f, 4.8f)
            close()
            moveTo(16.75f, 9f)
            horizontalLineToRelative(-3.5f)
            lineTo(15f, 4.8f)
            lineTo(16.75f, 9f)
            close()
        }
    }.build()
}
