package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudCheckmark20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudCheckmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(2.817f, 0f, 4.415f, 1.923f, 4.647f, 4.246f)
            horizontalLineToRelative(0.07f)
            curveTo(16.532f, 6.246f, 18f, 7.758f, 18f, 9.623f)
            curveToRelative(0f, 0.095f, -0.004f, 0.19f, -0.011f, 0.283f)
            curveTo(16.935f, 8.592f, 15.316f, 7.75f, 13.5f, 7.75f)
            curveToRelative(-3.007f, 0f, -5.475f, 2.309f, -5.729f, 5.25f)
            horizontalLineTo(5.282f)
            curveTo(3.47f, 13f, 2f, 11.488f, 2f, 9.623f)
            curveToRelative(0f, -1.865f, 1.47f, -3.377f, 3.282f, -3.377f)
            horizontalLineToRelative(0.071f)
            curveTo(5.587f, 3.908f, 7.183f, 2f, 10f, 2f)
            close()
            moveToRelative(8f, 11.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(9f, 15.985f, 9f, 13.5f)
            reflectiveCurveTo(11.015f, 9f, 13.5f, 9f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveToRelative(-2.146f, -1.854f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(12.5f, 14.293f)
            lineToRelative(-0.646f, -0.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}
