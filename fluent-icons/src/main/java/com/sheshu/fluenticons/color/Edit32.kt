package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Edit32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Edit32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(17.2893f, 11.4173f),
                end = Offset(20.4693f, 19.854f)
            )
        ) {
            moveTo(4.356f, 20.729f)
            lineTo(19.69f, 5.396f)
            lineToRelative(6.914f, 6.914f)
            lineTo(11.27f, 27.643f)
            lineToRelative(-5.579f, -1.336f)
            lineToRelative(-1.336f, -5.578f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.255f to Color(0xFFFFD394),
                    1f to Color(0xFFFF921F)
                ),
                start = Offset(0.0943297f, 23.0982f),
                end = Offset(7.47293f, 30.3328f)
            )
        ) {
            moveTo(4.357f, 20.73f)
            lineToRelative(0.497f, -0.5f)
            reflectiveCurveToRelative(0.275f, 2.396f, 2.397f, 4.518f)
            reflectiveCurveToRelative(4.517f, 2.397f, 4.517f, 2.397f)
            lineToRelative(-0.497f, 0.498f)
            curveToRelative(-0.504f, 0.505f, -1.144f, 0.852f, -1.841f, 1.002f)
            lineToRelative(-6.22f, 1.333f)
            curveToRelative(-0.332f, 0.07f, -0.677f, -0.031f, -0.917f, -0.27f)
            curveToRelative(-0.24f, -0.24f, -0.342f, -0.586f, -0.27f, -0.917f)
            lineToRelative(1.332f, -6.221f)
            curveToRelative(0.15f, -0.697f, 0.497f, -1.337f, 1.002f, -1.84f)
            close()
            moveTo(21.65f, 3.434f)
            curveToRelative(1.91f, -1.91f, 5.005f, -1.91f, 6.915f, 0f)
            curveToRelative(1.909f, 1.91f, 1.909f, 5.005f, 0f, 6.914f)
            lineToRelative(-3.73f, 3.73f)
            lineToRelative(-6.914f, -6.915f)
            lineToRelative(3.73f, -3.729f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFFFE994)
                ),
                start = Offset(22.4602f, 11.5231f),
                end = Offset(15.56f, 8.59451f)
            )
        ) {
            moveTo(24.32f, 14.593f)
            lineToRelative(2.83f, -2.83f)
            reflectiveCurveToRelative(-2.398f, -0.278f, -4.517f, -2.397f)
            curveToRelative(-2.12f, -2.12f, -2.397f, -4.518f, -2.397f, -4.518f)
            lineToRelative(-2.83f, 2.83f)
            reflectiveCurveToRelative(0.276f, 2.4f, 2.396f, 4.519f)
            curveToRelative(2.119f, 2.119f, 4.518f, 2.396f, 4.518f, 2.396f)
            close()
        }
    }.build()
}
