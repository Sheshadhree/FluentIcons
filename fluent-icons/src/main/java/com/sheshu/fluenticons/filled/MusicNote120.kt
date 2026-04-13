package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MusicNote120: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MusicNote120",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.147f, 2.022f)
            curveTo(9.995f, 1.976f, 9.831f, 2.004f, 9.703f, 2.098f)
            reflectiveCurveTo(9.5f, 2.34f, 9.5f, 2.5f)
            verticalLineToRelative(9.905f)
            curveTo(8.916f, 11.845f, 8.123f, 11.5f, 7.25f, 11.5f)
            curveTo(5.455f, 11.5f, 4f, 12.955f, 4f, 14.75f)
            reflectiveCurveTo(5.455f, 18f, 7.25f, 18f)
            reflectiveCurveToRelative(3.25f, -1.455f, 3.25f, -3.25f)
            curveToRelative(0f, -0.06f, -0.002f, -0.12f, -0.005f, -0.18f)
            curveToRelative(0.003f, -0.023f, 0.005f, -0.046f, 0.005f, -0.07f)
            verticalLineTo(7.177f)
            lineToRelative(5.853f, 1.8f)
            curveToRelative(0.152f, 0.048f, 0.316f, 0.02f, 0.444f, -0.075f)
            curveTo(16.925f, 8.808f, 17f, 8.66f, 17f, 8.5f)
            verticalLineTo(5.977f)
            curveToRelative(0f, -1.097f, -0.716f, -2.067f, -1.765f, -2.39f)
            lineToRelative(-5.088f, -1.565f)
            close()
        }
    }.build()
}
