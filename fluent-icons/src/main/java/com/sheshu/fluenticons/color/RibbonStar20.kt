package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.RibbonStar20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.RibbonStar20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF163697),
                    1f to Color(0xFF29C3FF)
                ),
                center = Offset(10f, 10.4863f),
                radius = 10.2442f
            )
        ) {
            moveTo(10f, 12.755f)
            curveToRelative(1.487f, 0f, 2.866f, -0.464f, 4f, -1.255f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.187f, -0.105f, 0.359f, -0.271f, 0.444f)
            curveToRelative(-0.167f, 0.086f, -0.367f, 0.072f, -0.52f, -0.037f)
            lineTo(10f, 16f)
            lineToRelative(-3.21f, 1.907f)
            curveToRelative(-0.152f, 0.108f, -0.352f, 0.123f, -0.519f, 0.037f)
            curveTo(6.105f, 17.86f, 6f, 17.687f, 6f, 17.5f)
            verticalLineToRelative(-6f)
            curveToRelative(1.134f, 0.79f, 2.513f, 1.255f, 4f, 1.255f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.771547f to Color(0xFFFFCD0F),
                    0.990707f to Color(0xFFE67505)
                ),
                center = Offset(-21.9286f, -40f),
                radius = 66.981f
            )
        ) {
            moveTo(16f, 8f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB03111),
                    1f to Color(0xFFE67505)
                ),
                center = Offset(11.4385f, 10.4697f),
                radius = 9.99207f
            )
        ) {
            moveTo(10.164f, 5.102f)
            curveToRelative(-0.062f, -0.136f, -0.255f, -0.136f, -0.318f, 0f)
            lineTo(9.13f, 6.655f)
            curveToRelative(-0.026f, 0.055f, -0.078f, 0.093f, -0.138f, 0.1f)
            lineTo(7.293f, 6.957f)
            curveToRelative(-0.148f, 0.017f, -0.208f, 0.2f, -0.098f, 0.302f)
            lineTo(8.451f, 8.42f)
            curveToRelative(0.044f, 0.041f, 0.064f, 0.103f, 0.053f, 0.163f)
            lineTo(8.17f, 10.26f)
            curveToRelative(-0.029f, 0.147f, 0.127f, 0.26f, 0.257f, 0.187f)
            lineTo(9.92f, 9.612f)
            curveToRelative(0.053f, -0.03f, 0.118f, -0.03f, 0.17f, 0f)
            lineToRelative(1.493f, 0.835f)
            curveToRelative(0.13f, 0.073f, 0.286f, -0.04f, 0.257f, -0.187f)
            lineToRelative(-0.333f, -1.677f)
            curveToRelative(-0.012f, -0.06f, 0.008f, -0.122f, 0.053f, -0.163f)
            lineToRelative(1.255f, -1.161f)
            curveToRelative(0.11f, -0.102f, 0.05f, -0.285f, -0.098f, -0.302f)
            lineTo(11.02f, 6.755f)
            curveToRelative(-0.06f, -0.007f, -0.113f, -0.045f, -0.139f, -0.1f)
            lineToRelative(-0.716f, -1.553f)
            close()
        }
    }.build()
}
