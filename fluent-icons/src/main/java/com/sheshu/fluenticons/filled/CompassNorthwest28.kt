package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CompassNorthwest28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CompassNorthwest28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 26f)
            curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(20.627f, 2f, 14f, 2f)
            reflectiveCurveTo(2f, 7.373f, 2f, 14f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            close()
            moveToRelative(-0.424f, -8.702f)
            curveToRelative(-1.322f, -0.508f, -2.366f, -1.552f, -2.874f, -2.874f)
            lineTo(8.783f, 9.43f)
            curveTo(8.628f, 9.025f, 9.025f, 8.628f, 9.429f, 8.784f)
            lineToRelative(4.995f, 1.918f)
            curveToRelative(1.321f, 0.508f, 2.366f, 1.553f, 2.874f, 2.874f)
            lineToRelative(1.919f, 4.995f)
            curveToRelative(0.155f, 0.404f, -0.242f, 0.801f, -0.646f, 0.646f)
            lineToRelative(-4.995f, -1.919f)
            close()
        }
    }.build()
}
