package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudArrowRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudArrowRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(5.958f, 2f, 4.273f, 3.53f, 4.03f, 5.507f)
            curveTo(2.338f, 5.62f, 1f, 7.03f, 1f, 8.75f)
            curveTo(1f, 10.545f, 2.455f, 12f, 4.25f, 12f)
            horizontalLineToRelative(0.957f)
            curveTo(5.072f, 11.523f, 5f, 11.02f, 5f, 10.5f)
            curveTo(5f, 7.462f, 7.462f, 5f, 10.5f, 5f)
            curveToRelative(0.49f, 0f, 0.965f, 0.064f, 1.417f, 0.184f)
            curveTo(11.54f, 3.366f, 9.93f, 2f, 8f, 2f)
            close()
            moveToRelative(2.5f, 4f)
            curveTo(8.015f, 6f, 6f, 8.015f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 15f, 10.5f, 15f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(12.985f, 6f, 10.5f, 6f)
            close()
            moveToRelative(2.353f, 4.854f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(11.293f, 11f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 11f, 8f, 10.776f, 8f, 10.5f)
            reflectiveCurveTo(8.224f, 10f, 8.5f, 10f)
            horizontalLineToRelative(2.793f)
            lineToRelative(-1.147f, -1.146f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.048f, 0.047f, 0.084f, 0.103f, 0.108f, 0.162f)
            curveTo(12.986f, 10.367f, 13f, 10.43f, 13f, 10.497f)
            verticalLineToRelative(0.006f)
            curveToRelative(0f, 0.067f, -0.014f, 0.13f, -0.038f, 0.188f)
            curveToRelative(-0.024f, 0.058f, -0.06f, 0.113f, -0.106f, 0.16f)
            lineToRelative(-0.003f, 0.003f)
            close()
        }
    }.build()
}
