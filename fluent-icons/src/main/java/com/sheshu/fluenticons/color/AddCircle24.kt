package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AddCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AddCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(2.71429f, 5.75f),
                end = Offset(16.5167f, 20.0902f)
            )
        ) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFE3FFD9)
                ),
                start = Offset(8.875f, 8.02007f),
                end = Offset(11.9433f, 18.8516f)
            )
        ) {
            moveTo(12f, 7f)
            curveToRelative(-0.38f, 0f, -0.694f, 0.282f, -0.743f, 0.648f)
            lineTo(11.25f, 7.75f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-3.5f)
            curveTo(7.336f, 11.25f, 7f, 11.586f, 7f, 12f)
            curveToRelative(0f, 0.38f, 0.282f, 0.694f, 0.648f, 0.743f)
            lineTo(7.75f, 12.75f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            curveToRelative(0.38f, 0f, 0.694f, -0.282f, 0.743f, -0.648f)
            lineToRelative(0.007f, -0.102f)
            verticalLineToRelative(-3.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            curveToRelative(0f, -0.38f, -0.282f, -0.694f, -0.648f, -0.743f)
            lineTo(16.25f, 11.25f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-3.5f)
            curveTo(12.75f, 7.336f, 12.414f, 7f, 12f, 7f)
            close()
        }
    }.build()
}
