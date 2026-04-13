package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookUpRight28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookUpRight28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.782f, 19.977f)
            curveTo(7.99f, 21.222f, 9.758f, 22f, 12f, 22f)
            horizontalLineToRelative(7f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.758f, 0f, -2.99f, -0.597f, -3.782f, -1.415f)
            curveTo(7.414f, 17.755f, 7f, 16.637f, 7f, 15.5f)
            reflectiveCurveToRelative(0.414f, -2.256f, 1.218f, -3.085f)
            curveTo(9.01f, 11.597f, 10.242f, 11f, 12f, 11f)
            horizontalLineToRelative(7.586f)
            lineToRelative(-3.293f, 3.293f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(5f, -5f)
            curveTo(22.895f, 10.52f, 23f, 10.265f, 23f, 10f)
            curveToRelative(0f, -0.265f, -0.105f, -0.52f, -0.293f, -0.707f)
            lineToRelative(-5f, -5f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineTo(19.586f, 9f)
            horizontalLineTo(12f)
            curveToRelative(-2.242f, 0f, -4.01f, 0.778f, -5.218f, 2.023f)
            curveTo(5.586f, 12.256f, 5f, 13.887f, 5f, 15.5f)
            curveToRelative(0f, 1.613f, 0.586f, 3.244f, 1.782f, 4.477f)
            close()
        }
    }.build()
}
