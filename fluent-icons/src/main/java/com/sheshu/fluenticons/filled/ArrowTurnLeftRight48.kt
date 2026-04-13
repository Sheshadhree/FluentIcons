package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnLeftRight48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnLeftRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(40.056f, 9.893f)
            curveToRelative(0.77f, -0.307f, 1.145f, -1.18f, 0.838f, -1.949f)
            curveToRelative(-0.308f, -0.77f, -1.18f, -1.144f, -1.95f, -0.837f)
            lineTo(7.391f, 19.702f)
            curveToRelative(-2.077f, 0.83f, -2.103f, 3.76f, -0.041f, 4.627f)
            lineToRelative(29.258f, 12.293f)
            lineToRelative(-7.728f, 3.513f)
            curveToRelative(-0.755f, 0.343f, -1.088f, 1.232f, -0.745f, 1.986f)
            curveToRelative(0.343f, 0.754f, 1.232f, 1.088f, 1.986f, 0.745f)
            lineToRelative(11f, -5f)
            curveToRelative(0.737f, -0.335f, 1.075f, -1.195f, 0.764f, -1.943f)
            lineToRelative(-5f, -12f)
            curveToRelative(-0.319f, -0.764f, -1.197f, -1.126f, -1.962f, -0.807f)
            curveToRelative(-0.764f, 0.318f, -1.126f, 1.197f, -0.807f, 1.961f)
            lineToRelative(3.659f, 8.781f)
            lineTo(9.637f, 22.036f)
            lineToRelative(30.42f, -12.143f)
            close()
        }
    }.build()
}
