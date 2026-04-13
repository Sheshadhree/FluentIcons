package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookDownLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookDownLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(5f)
            curveToRelative(2.242f, 0f, 4.01f, 0.778f, 5.218f, 2.023f)
            curveTo(19.414f, 7.256f, 20f, 8.887f, 20f, 10.5f)
            curveToRelative(0f, 1.613f, -0.586f, 3.244f, -1.782f, 4.477f)
            curveTo(17.01f, 16.222f, 15.242f, 17f, 13f, 17f)
            horizontalLineTo(8.414f)
            lineToRelative(2.043f, 2.043f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-3.75f, -3.75f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(3.75f, -3.75f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineTo(8.414f, 15f)
            horizontalLineTo(13f)
            curveToRelative(1.758f, 0f, 2.99f, -0.597f, 3.782f, -1.415f)
            curveTo(17.586f, 12.755f, 18f, 11.637f, 18f, 10.5f)
            reflectiveCurveToRelative(-0.414f, -2.256f, -1.218f, -3.085f)
            curveTo(15.99f, 6.597f, 14.758f, 6f, 13f, 6f)
            horizontalLineTo(8f)
            curveTo(7.448f, 6f, 7f, 5.552f, 7f, 5f)
            close()
        }
    }.build()
}
