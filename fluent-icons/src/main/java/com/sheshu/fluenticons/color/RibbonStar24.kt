package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.RibbonStar24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.RibbonStar24",
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
                center = Offset(12.0014f, 11.8791f),
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
            curveToRelative(1.37f, 1.099f, 3.108f, 1.755f, 5f, 1.755f)
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
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB03111),
                    1f to Color(0xFFE67505)
                ),
                center = Offset(13.7019f, 12f),
                radius = 11.8734f
            )
        ) {
            moveTo(12.229f, 5.642f)
            lineToRelative(0.912f, 1.853f)
            lineToRelative(2.044f, 0.295f)
            curveToRelative(0.21f, 0.03f, 0.293f, 0.288f, 0.142f, 0.435f)
            lineToRelative(-1.479f, 1.44f)
            lineToRelative(0.35f, 2.036f)
            curveToRelative(0.035f, 0.209f, -0.184f, 0.368f, -0.371f, 0.269f)
            lineTo(12f, 11.008f)
            lineToRelative(-1.827f, 0.962f)
            curveToRelative(-0.188f, 0.099f, -0.406f, -0.06f, -0.37f, -0.269f)
            lineToRelative(0.35f, -2.035f)
            lineToRelative(-1.48f, -1.44f)
            curveTo(8.521f, 8.078f, 8.605f, 7.82f, 8.815f, 7.79f)
            lineToRelative(2.043f, -0.295f)
            lineToRelative(0.913f, -1.853f)
            curveToRelative(0.093f, -0.19f, 0.364f, -0.19f, 0.458f, 0f)
            close()
        }
    }.build()
}
