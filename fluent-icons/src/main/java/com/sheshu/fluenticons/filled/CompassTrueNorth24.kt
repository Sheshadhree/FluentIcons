package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CompassTrueNorth24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CompassTrueNorth24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-4.694f, 0f, -8.5f, 3.806f, -8.5f, 8.5f)
            reflectiveCurveToRelative(3.806f, 8.5f, 8.5f, 8.5f)
            reflectiveCurveToRelative(8.5f, -3.806f, 8.5f, -8.5f)
            reflectiveCurveToRelative(-3.806f, -8.5f, -8.5f, -8.5f)
            close()
            moveToRelative(-0.002f, 1.497f)
            curveToRelative(0.402f, 0f, 0.804f, 0.188f, 1.046f, 0.564f)
            lineToRelative(0.094f, 0.173f)
            lineToRelative(1.94f, 4.319f)
            curveToRelative(0.556f, 1.237f, 0.556f, 2.654f, 0f, 3.892f)
            lineToRelative(-1.94f, 4.319f)
            curveToRelative(-0.442f, 0.983f, -1.839f, 0.983f, -2.28f, 0f)
            lineToRelative(-1.941f, -4.319f)
            curveToRelative(-0.556f, -1.238f, -0.556f, -2.655f, 0f, -3.892f)
            lineToRelative(0.132f, -0.294f)
            lineToRelative(0.021f, -0.051f)
            lineToRelative(1.785f, -3.974f)
            lineToRelative(0.094f, -0.173f)
            curveToRelative(0.242f, -0.376f, 0.644f, -0.564f, 1.046f, -0.564f)
            horizontalLineToRelative(0.003f)
            close()
            moveToRelative(1.808f, 8.09f)
            curveToRelative(-0.174f, 0.097f, -0.36f, 0.177f, -0.56f, 0.234f)
            curveToRelative(-0.817f, 0.235f, -1.684f, 0.235f, -2.5f, 0f)
            curveToRelative(-0.199f, -0.057f, -0.384f, -0.135f, -0.556f, -0.231f)
            curveToRelative(0.028f, 0.081f, 0.06f, 0.162f, 0.096f, 0.241f)
            lineToRelative(1.711f, 3.81f)
            lineToRelative(1.713f, -3.81f)
            curveToRelative(0.036f, -0.08f, 0.066f, -0.162f, 0.096f, -0.244f)
            close()
        }
    }.build()
}
