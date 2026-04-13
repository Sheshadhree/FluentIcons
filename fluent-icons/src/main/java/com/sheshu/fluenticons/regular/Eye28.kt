package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Eye28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Eye28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.256f, 16f)
            horizontalLineToRelative(0.006f)
            horizontalLineToRelative(-0.01f)
            horizontalLineToRelative(0.005f)
            close()
            moveToRelative(-0.704f, -0.52f)
            curveToRelative(0.1f, 0.318f, 0.387f, 0.518f, 0.704f, 0.52f)
            curveToRelative(0.07f, 0f, 0.148f, -0.02f, 0.226f, -0.04f)
            curveToRelative(0.39f, -0.12f, 0.61f, -0.55f, 0.48f, -0.94f)
            curveTo(25.932f, 14.93f, 22.932f, 6f, 14f, 6f)
            reflectiveCurveTo(2.067f, 14.93f, 2.037f, 15.02f)
            curveToRelative(-0.13f, 0.39f, 0.09f, 0.81f, 0.48f, 0.94f)
            curveToRelative(0.4f, 0.13f, 0.82f, -0.09f, 0.95f, -0.48f)
            lineToRelative(0.003f, -0.005f)
            curveTo(3.603f, 15.085f, 6.207f, 7.5f, 14.01f, 7.5f)
            curveToRelative(7.842f, 0f, 10.432f, 7.65f, 10.542f, 7.98f)
            close()
            moveTo(10.5f, 16f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveToRelative(-1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
            close()
            moveToRelative(3.5f, -5f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            close()
        }
    }.build()
}
