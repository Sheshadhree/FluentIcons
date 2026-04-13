package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCounterclockwise48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCounterclockwise48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(39f, 24f)
            curveToRelative(0f, -8.284f, -6.716f, -15f, -15f, -15f)
            curveToRelative(-3.938f, 0f, -7.52f, 1.516f, -10.198f, 4f)
            horizontalLineTo(17.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(18.328f, 16f, 17.5f, 16f)
            horizontalLineToRelative(-7f)
            curveTo(9.672f, 16f, 9f, 15.328f, 9f, 14.5f)
            verticalLineToRelative(-7f)
            curveTo(9f, 6.672f, 9.672f, 6f, 10.5f, 6f)
            reflectiveCurveTo(12f, 6.672f, 12f, 7.5f)
            verticalLineToRelative(3.084f)
            curveTo(15.184f, 7.734f, 19.39f, 6f, 24f, 6f)
            curveToRelative(9.941f, 0f, 18f, 8.059f, 18f, 18f)
            reflectiveCurveToRelative(-8.059f, 18f, -18f, 18f)
            reflectiveCurveTo(6f, 33.941f, 6f, 24f)
            curveToRelative(0f, -0.926f, 0.07f, -1.836f, 0.205f, -2.725f)
            curveToRelative(0.125f, -0.82f, 0.89f, -1.383f, 1.709f, -1.258f)
            curveToRelative(0.819f, 0.125f, 1.382f, 0.89f, 1.257f, 1.708f)
            curveTo(9.06f, 22.466f, 9f, 23.225f, 9f, 24f)
            curveToRelative(0f, 8.284f, 6.716f, 15f, 15f, 15f)
            curveToRelative(8.284f, 0f, 15f, -6.716f, 15f, -15f)
            close()
        }
    }.build()
}
