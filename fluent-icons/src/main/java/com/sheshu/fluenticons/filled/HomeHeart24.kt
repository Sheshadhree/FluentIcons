package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HomeHeart24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HomeHeart24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.45f, 2.533f)
            curveToRelative(-0.837f, -0.707f, -2.063f, -0.707f, -2.9f, 0f)
            lineTo(3.8f, 8.228f)
            curveTo(3.291f, 8.655f, 3f, 9.284f, 3f, 9.948f)
            verticalLineToRelative(9.305f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(8.617f)
            lineToRelative(-2.063f, -2.136f)
            curveToRelative(-1.48f, -1.532f, -1.696f, -3.857f, -0.668f, -5.62f)
            curveToRelative(0.446f, -0.765f, 1.116f, -1.404f, 1.924f, -1.8f)
            curveToRelative(1.42f, -0.694f, 3.117f, -0.579f, 4.44f, 0.337f)
            curveToRelative(1.19f, -0.824f, 2.68f, -1f, 4f, -0.523f)
            verticalLineTo(9.948f)
            curveToRelative(0f, -0.664f, -0.292f, -1.293f, -0.8f, -1.72f)
            lineToRelative(-6.75f, -5.695f)
            close()
            moveToRelative(8.527f, 15.64f)
            curveToRelative(1.364f, -1.412f, 1.364f, -3.702f, 0f, -5.114f)
            curveToRelative(-0.15f, -0.154f, -0.309f, -0.292f, -0.476f, -0.413f)
            curveToRelative(-1.362f, -0.982f, -3.25f, -0.845f, -4.465f, 0.413f)
            horizontalLineToRelative(-0.072f)
            curveToRelative(-1.072f, -1.11f, -2.668f, -1.347f, -3.964f, -0.713f)
            curveToRelative(-0.625f, 0.306f, -1.15f, 0.803f, -1.5f, 1.404f)
            curveToRelative(-0.81f, 1.39f, -0.636f, 3.223f, 0.523f, 4.423f)
            lineToRelative(4.442f, 4.598f)
            curveToRelative(0.296f, 0.305f, 0.774f, 0.305f, 1.07f, 0f)
            lineToRelative(4.442f, -4.598f)
            close()
        }
    }.build()
}
