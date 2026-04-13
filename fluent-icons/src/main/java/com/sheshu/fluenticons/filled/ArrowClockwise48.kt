package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowClockwise48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowClockwise48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 24f)
            curveToRelative(0f, -8.284f, 6.716f, -15f, 15f, -15f)
            curveToRelative(3.938f, 0f, 7.52f, 1.516f, 10.198f, 4f)
            horizontalLineTo(30.5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveTo(39f, 6.672f, 38.328f, 6f, 37.5f, 6f)
            reflectiveCurveTo(36f, 6.672f, 36f, 7.5f)
            verticalLineToRelative(3.084f)
            curveTo(32.816f, 7.734f, 28.61f, 6f, 24f, 6f)
            curveTo(14.059f, 6f, 6f, 14.059f, 6f, 24f)
            reflectiveCurveToRelative(8.059f, 18f, 18f, 18f)
            reflectiveCurveToRelative(18f, -8.059f, 18f, -18f)
            curveToRelative(0f, -0.926f, -0.07f, -1.836f, -0.205f, -2.725f)
            curveToRelative(-0.125f, -0.82f, -0.89f, -1.383f, -1.709f, -1.258f)
            curveToRelative(-0.819f, 0.125f, -1.382f, 0.89f, -1.257f, 1.708f)
            curveTo(38.94f, 22.466f, 39f, 23.225f, 39f, 24f)
            curveToRelative(0f, 8.284f, -6.716f, 15f, -15f, 15f)
            curveToRelative(-8.284f, 0f, -15f, -6.716f, -15f, -15f)
            close()
        }
    }.build()
}
