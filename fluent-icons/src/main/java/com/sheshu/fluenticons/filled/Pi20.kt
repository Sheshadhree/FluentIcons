package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pi20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pi20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.401f, 4.783f)
            curveToRelative(-0.166f, 0.321f, -0.179f, 0.759f, -0.117f, 1.07f)
            curveToRelative(0.081f, 0.407f, -0.183f, 0.802f, -0.589f, 0.883f)
            curveToRelative(-0.406f, 0.08f, -0.801f, -0.183f, -0.882f, -0.59f)
            curveTo(1.71f, 5.627f, 1.696f, 4.814f, 2.07f, 4.093f)
            curveTo(2.48f, 3.3f, 3.292f, 2.75f, 4.542f, 2.75f)
            horizontalLineTo(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-2.25f)
            verticalLineToRelative(9.415f)
            curveToRelative(0f, 1.5f, 0.453f, 1.892f, 0.693f, 2.004f)
            curveToRelative(0.322f, 0.151f, 0.809f, 0.079f, 1.217f, -0.129f)
            curveToRelative(0.369f, -0.188f, 0.82f, -0.04f, 1.008f, 0.329f)
            curveToRelative(0.188f, 0.369f, 0.041f, 0.82f, -0.328f, 1.008f)
            curveToRelative(-0.592f, 0.301f, -1.605f, 0.585f, -2.533f, 0.15f)
            curveToRelative(-1.01f, -0.472f, -1.557f, -1.607f, -1.557f, -3.362f)
            verticalLineTo(4.25f)
            horizontalLineTo(8.237f)
            curveToRelative(-0.09f, 1.533f, -0.289f, 3.961f, -0.606f, 6.325f)
            curveToRelative(-0.166f, 1.237f, -0.367f, 2.465f, -0.603f, 3.542f)
            curveToRelative(-0.234f, 1.064f, -0.514f, 2.032f, -0.857f, 2.718f)
            curveToRelative(-0.186f, 0.37f, -0.636f, 0.521f, -1.006f, 0.336f)
            curveToRelative(-0.371f, -0.185f, -0.521f, -0.636f, -0.336f, -1.006f)
            curveToRelative(0.257f, -0.514f, 0.506f, -1.333f, 0.734f, -2.37f)
            curveToRelative(0.224f, -1.022f, 0.418f, -2.207f, 0.581f, -3.42f)
            curveToRelative(0.306f, -2.274f, 0.5f, -4.617f, 0.59f, -6.125f)
            horizontalLineTo(4.542f)
            curveToRelative(-0.744f, 0f, -1.012f, 0.284f, -1.14f, 0.533f)
            close()
        }
    }.build()
}
