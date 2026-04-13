package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AirplaneLanding24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AirplaneLanding24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 5.039f)
            verticalLineToRelative(0.778f)
            lineToRelative(3.027f, 1.202f)
            horizontalLineToRelative(2.119f)
            lineToRelative(-1.25f, -2.808f)
            curveTo(13.002f, 2.202f, 10f, 2.841f, 10f, 5.039f)
            close()
            moveToRelative(2.72f, 2.935f)
            lineTo(8.5f, 6.297f)
            verticalLineToRelative(-1.54f)
            curveToRelative(0f, -1.738f, -2.259f, -2.414f, -3.213f, -0.961f)
            lineToRelative(-1.91f, 2.908f)
            curveToRelative(-0.79f, 1.206f, -0.292f, 2.834f, 1.039f, 3.39f)
            lineToRelative(3.503f, 1.464f)
            lineToRelative(-2.045f, 1.898f)
            curveToRelative(-1.627f, 1.511f, -0.004f, 4.165f, 2.082f, 3.405f)
            lineToRelative(6.761f, -2.464f)
            lineToRelative(3.463f, 1.446f)
            curveToRelative(1.34f, 0.56f, 2.82f, -0.425f, 2.82f, -1.878f)
            verticalLineToRelative(-1.23f)
            curveToRelative(0f, -2.604f, -2.111f, -4.716f, -4.715f, -4.716f)
            horizontalLineToRelative(-3.326f)
            curveToRelative(-0.082f, 0f, -0.162f, -0.015f, -0.238f, -0.045f)
            close()
            moveTo(3f, 20.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(20.664f, 21f, 20.25f, 21f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 21f, 3f, 20.664f, 3f, 20.25f)
            close()
        }
    }.build()
}
