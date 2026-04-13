package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Send48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Send48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0094F0),
                    1f to Color(0xFF2052CB)
                ),
                center = Offset(5.99976f, 24f),
                radius = 14.5f
            )
        ) {
            moveTo(9.685f, 24.003f)
            lineTo(7.727f, 18f)
            lineToRelative(24.495f, 5.023f)
            curveToRelative(1.066f, 0.218f, 1.066f, 1.74f, 0f, 1.96f)
            lineTo(7.727f, 30.004f)
            lineToRelative(1.958f, -6.002f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF0094F0)
                ),
                start = Offset(4f, -12.2491f),
                end = Offset(38.2554f, 33.2698f)
            )
        ) {
            moveTo(7.262f, 4.244f)
            curveTo(5.475f, 3.351f, 3.497f, 5.056f, 4.116f, 6.955f)
            lineTo(8.13f, 19.26f)
            curveToRelative(0.232f, 0.71f, 0.838f, 1.23f, 1.573f, 1.353f)
            lineToRelative(15.86f, 2.643f)
            curveToRelative(0.835f, 0.14f, 0.835f, 1.34f, 0f, 1.48f)
            lineTo(9.704f, 27.378f)
            curveTo(8.969f, 27.5f, 8.363f, 28.022f, 8.132f, 28.73f)
            lineTo(4.116f, 41.042f)
            curveToRelative(-0.62f, 1.9f, 1.359f, 3.605f, 3.146f, 2.712f)
            lineToRelative(35.494f, -17.742f)
            curveToRelative(1.659f, -0.83f, 1.659f, -3.197f, 0f, -4.026f)
            lineTo(7.262f, 4.244f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125345f to Color(0x00DCF8FF),
                    0.768599f to Color(0xB2FF6CE8)
                ),
                start = Offset(24f, 14.7807f),
                end = Offset(34.4017f, 42.9254f)
            )
        ) {
            moveTo(7.262f, 4.244f)
            curveTo(5.475f, 3.351f, 3.497f, 5.056f, 4.116f, 6.955f)
            lineTo(8.13f, 19.26f)
            curveToRelative(0.232f, 0.71f, 0.838f, 1.23f, 1.573f, 1.353f)
            lineToRelative(15.86f, 2.643f)
            curveToRelative(0.835f, 0.14f, 0.835f, 1.34f, 0f, 1.48f)
            lineTo(9.704f, 27.378f)
            curveTo(8.969f, 27.5f, 8.363f, 28.022f, 8.132f, 28.73f)
            lineTo(4.116f, 41.042f)
            curveToRelative(-0.62f, 1.9f, 1.359f, 3.605f, 3.146f, 2.712f)
            lineToRelative(35.494f, -17.742f)
            curveToRelative(1.659f, -0.83f, 1.659f, -3.197f, 0f, -4.026f)
            lineTo(7.262f, 4.244f)
            close()
        }
    }.build()
}
