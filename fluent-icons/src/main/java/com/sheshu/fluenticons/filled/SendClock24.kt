package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SendClock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SendClock24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.283f, 13.452f)
            lineToRelative(7.532f, -1.255f)
            curveToRelative(0.084f, -0.014f, 0.15f, -0.08f, 0.164f, -0.164f)
            curveToRelative(0.018f, -0.11f, -0.055f, -0.213f, -0.164f, -0.23f)
            lineToRelative(-7.532f, -1.256f)
            curveToRelative(-0.176f, -0.03f, -0.323f, -0.15f, -0.386f, -0.318f)
            lineTo(2.3f, 3.272f)
            curveToRelative(-0.248f, -0.64f, 0.421f, -1.25f, 1.035f, -0.943f)
            lineToRelative(18f, 9f)
            curveToRelative(0.443f, 0.221f, 0.53f, 0.772f, 0.263f, 1.125f)
            curveTo(20.48f, 11.544f, 19.053f, 11f, 17.5f, 11f)
            curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
            curveToRelative(0f, 0.112f, 0.003f, 0.223f, 0.008f, 0.333f)
            lineToRelative(-7.674f, 3.838f)
            curveToRelative(-0.614f, 0.306f, -1.283f, -0.304f, -1.035f, -0.943f)
            lineToRelative(2.598f, -6.958f)
            curveToRelative(0.063f, -0.167f, 0.21f, -0.288f, 0.386f, -0.318f)
            close()
            moveTo(23f, 17.5f)
            curveToRelative(0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
            reflectiveCurveTo(12f, 14.462f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            close()
            moveTo(17.5f, 14f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(20.276f, 18f, 20f, 18f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
