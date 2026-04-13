package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookDownLeft28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookDownLeft28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.218f, 8.023f)
            curveTo(20.01f, 6.778f, 18.242f, 6f, 16f, 6f)
            horizontalLineTo(9f)
            curveTo(8.448f, 6f, 8f, 6.448f, 8f, 7f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(7f)
            curveToRelative(1.758f, 0f, 2.99f, 0.597f, 3.782f, 1.415f)
            curveTo(20.586f, 10.245f, 21f, 11.363f, 21f, 12.5f)
            reflectiveCurveToRelative(-0.414f, 2.256f, -1.218f, 3.085f)
            curveTo(18.99f, 16.403f, 17.758f, 17f, 16f, 17f)
            horizontalLineTo(8.414f)
            lineToRelative(3.293f, -3.293f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-5f, 5f)
            curveTo(5.105f, 17.48f, 5f, 17.735f, 5f, 18f)
            curveToRelative(0f, 0.265f, 0.105f, 0.52f, 0.293f, 0.707f)
            lineToRelative(5f, 5f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineTo(8.414f, 19f)
            horizontalLineTo(16f)
            curveToRelative(2.242f, 0f, 4.01f, -0.778f, 5.218f, -2.023f)
            curveTo(22.414f, 15.744f, 23f, 14.113f, 23f, 12.5f)
            curveToRelative(0f, -1.613f, -0.586f, -3.244f, -1.782f, -4.477f)
            close()
        }
    }.build()
}
