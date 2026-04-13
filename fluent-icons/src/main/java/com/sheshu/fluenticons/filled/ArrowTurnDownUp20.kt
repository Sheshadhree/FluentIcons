package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnDownUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnDownUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.447f, 3.472f)
            curveToRelative(-0.078f, -0.195f, -0.233f, -0.349f, -0.43f, -0.423f)
            curveToRelative(-0.195f, -0.075f, -0.414f, -0.064f, -0.601f, 0.03f)
            lineToRelative(-5.001f, 2.5f)
            curveToRelative(-0.37f, 0.185f, -0.521f, 0.636f, -0.336f, 1.006f)
            reflectiveCurveToRelative(0.636f, 0.521f, 1.006f, 0.336f)
            lineToRelative(3.244f, -1.622f)
            lineToRelative(-4.32f, 9.818f)
            lineTo(5.44f, 4.455f)
            curveTo(5.276f, 4.074f, 4.835f, 3.897f, 4.455f, 4.06f)
            curveTo(4.074f, 4.224f, 3.898f, 4.665f, 4.06f, 5.045f)
            lineToRelative(4.796f, 11.192f)
            curveToRelative(0.43f, 1.005f, 1.853f, 1.012f, 2.293f, 0.011f)
            lineToRelative(4.606f, -10.466f)
            lineToRelative(1.298f, 3.246f)
            curveToRelative(0.153f, 0.385f, 0.59f, 0.572f, 0.974f, 0.418f)
            curveToRelative(0.385f, -0.153f, 0.572f, -0.59f, 0.418f, -0.974f)
            lineToRelative(-1.999f, -5f)
            close()
        }
    }.build()
}
