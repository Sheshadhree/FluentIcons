package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookUpLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookUpLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 19f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(2.242f, 0f, 4.01f, -0.778f, 5.218f, -2.023f)
            curveTo(19.414f, 16.744f, 20f, 15.113f, 20f, 13.5f)
            curveToRelative(0f, -1.613f, -0.586f, -3.244f, -1.782f, -4.477f)
            curveTo(17.01f, 7.778f, 15.242f, 7f, 13f, 7f)
            horizontalLineTo(8.414f)
            lineToRelative(2.043f, -2.043f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-3.75f, 3.75f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(3.75f, 3.75f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineTo(8.414f, 9f)
            horizontalLineTo(13f)
            curveToRelative(1.758f, 0f, 2.99f, 0.597f, 3.782f, 1.415f)
            curveTo(17.586f, 11.245f, 18f, 12.363f, 18f, 13.5f)
            reflectiveCurveToRelative(-0.414f, 2.256f, -1.218f, 3.085f)
            curveTo(15.99f, 17.403f, 14.758f, 18f, 13f, 18f)
            horizontalLineTo(8f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            close()
        }
    }.build()
}
