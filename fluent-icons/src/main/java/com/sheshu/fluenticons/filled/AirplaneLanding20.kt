package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AirplaneLanding20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AirplaneLanding20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.883f, 6f)
            lineToRelative(-1.03f, -2.147f)
            curveTo(10.16f, 2.414f, 8f, 2.906f, 8f, 4.503f)
            verticalLineToRelative(0.742f)
            lineTo(10.768f, 6f)
            horizontalLineToRelative(1.115f)
            close()
            moveToRelative(-1.115f, 1f)
            curveToRelative(-0.09f, 0f, -0.178f, -0.012f, -0.263f, -0.035f)
            lineTo(6f, 5.736f)
            verticalLineTo(4.205f)
            curveToRelative(0f, -1.223f, -1.615f, -1.663f, -2.234f, -0.609f)
            lineTo(2.24f, 6.19f)
            curveTo(1.674f, 7.152f, 2.143f, 8.392f, 3.205f, 8.74f)
            lineToRelative(3.411f, 1.117f)
            lineToRelative(-1.672f, 1.527f)
            curveToRelative(-1.178f, 1.076f, -0.085f, 3.003f, 1.442f, 2.545f)
            lineToRelative(6.612f, -1.984f)
            lineToRelative(3.03f, 0.992f)
            curveToRelative(0.97f, 0.317f, 1.967f, -0.405f, 1.967f, -1.426f)
            verticalLineTo(11f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineToRelative(-3.227f)
            close()
            moveTo(2f, 17.5f)
            curveTo(2f, 17.224f, 2.224f, 17f, 2.5f, 17f)
            horizontalLineToRelative(15f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(17.776f, 18f, 17.5f, 18f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 18f, 2f, 17.776f, 2f, 17.5f)
            close()
        }
    }.build()
}
