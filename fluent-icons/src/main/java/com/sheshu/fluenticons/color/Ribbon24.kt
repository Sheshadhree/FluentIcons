package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Ribbon24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Ribbon24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF163697),
                    1f to Color(0xFF29C3FF)
                ),
                center = Offset(12.0014f, 11.879f),
                radius = 13.7943f
            )
        ) {
            moveTo(17.002f, 13.244f)
            verticalLineToRelative(8.001f)
            curveToRelative(0f, 0.608f, -0.686f, 0.963f, -1.183f, 0.613f)
            lineToRelative(-3.818f, -2.687f)
            lineToRelative(-3.816f, 2.687f)
            curveToRelative(-0.497f, 0.35f, -1.182f, -0.005f, -1.182f, -0.613f)
            lineToRelative(-0.002f, -8f)
            curveToRelative(1.37f, 1.098f, 3.108f, 1.755f, 5f, 1.755f)
            reflectiveCurveToRelative(3.631f, -0.657f, 5f, -1.756f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.771547f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(-25.25f, -47f),
                radius = 78.1445f
            )
        ) {
            moveTo(12f, 2f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            close()
        }
    }.build()
}
