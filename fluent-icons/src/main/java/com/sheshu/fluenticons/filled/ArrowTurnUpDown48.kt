package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnUpDown48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnUpDown48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.893f, 39.056f)
            curveToRelative(-0.307f, 0.77f, -1.18f, 1.145f, -1.949f, 0.838f)
            curveToRelative(-0.77f, -0.308f, -1.144f, -1.18f, -0.837f, -1.95f)
            lineTo(20.702f, 6.391f)
            curveToRelative(0.83f, -2.077f, 3.76f, -2.103f, 4.627f, -0.041f)
            lineToRelative(12.293f, 29.258f)
            lineToRelative(3.513f, -7.728f)
            curveToRelative(0.343f, -0.755f, 1.232f, -1.088f, 1.986f, -0.745f)
            curveToRelative(0.754f, 0.343f, 1.088f, 1.232f, 0.745f, 1.986f)
            lineToRelative(-5f, 11f)
            curveToRelative(-0.335f, 0.737f, -1.195f, 1.075f, -1.943f, 0.764f)
            lineToRelative(-12f, -5f)
            curveToRelative(-0.764f, -0.319f, -1.126f, -1.197f, -0.807f, -1.962f)
            curveToRelative(0.318f, -0.764f, 1.197f, -1.126f, 1.961f, -0.807f)
            lineToRelative(8.781f, 3.659f)
            lineTo(23.036f, 8.637f)
            lineToRelative(-12.143f, 30.42f)
            close()
        }
    }.build()
}
