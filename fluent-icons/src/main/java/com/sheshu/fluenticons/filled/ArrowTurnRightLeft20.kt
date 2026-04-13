package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnRightLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnRightLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.472f, 15.447f)
            curveToRelative(-0.195f, -0.078f, -0.349f, -0.233f, -0.423f, -0.43f)
            curveToRelative(-0.075f, -0.195f, -0.064f, -0.414f, 0.03f, -0.601f)
            lineToRelative(2.5f, -5.001f)
            curveToRelative(0.185f, -0.37f, 0.636f, -0.521f, 1.006f, -0.336f)
            reflectiveCurveToRelative(0.521f, 0.636f, 0.336f, 1.006f)
            lineTo(6.299f, 13.33f)
            lineToRelative(9.818f, -4.32f)
            lineTo(5.455f, 4.44f)
            curveTo(5.074f, 4.276f, 4.897f, 3.837f, 5.06f, 3.455f)
            curveTo(5.224f, 3.074f, 5.665f, 2.898f, 6.045f, 3.06f)
            lineToRelative(11.192f, 4.796f)
            curveToRelative(1.005f, 0.43f, 1.012f, 1.853f, 0.011f, 2.293f)
            lineTo(6.782f, 14.756f)
            lineToRelative(3.246f, 1.298f)
            curveToRelative(0.385f, 0.153f, 0.572f, 0.59f, 0.418f, 0.974f)
            curveToRelative(-0.153f, 0.385f, -0.59f, 0.572f, -0.974f, 0.418f)
            lineToRelative(-5f, -1.999f)
            close()
        }
    }.build()
}
