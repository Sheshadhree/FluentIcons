package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ImageCircle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageCircle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 4f)
            curveTo(9.373f, 4f, 4f, 9.373f, 4f, 16f)
            curveToRelative(0f, 2.924f, 1.046f, 5.604f, 2.784f, 7.686f)
            lineToRelative(7.446f, -7.453f)
            curveToRelative(0.977f, -0.977f, 2.56f, -0.977f, 3.537f, 0f)
            lineToRelative(7.448f, 7.454f)
            curveTo(26.954f, 21.605f, 28f, 18.925f, 28f, 16f)
            curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
            close()
            moveToRelative(7.81f, 21.11f)
            lineToRelative(-7.457f, -7.463f)
            curveToRelative(-0.196f, -0.196f, -0.513f, -0.196f, -0.708f, 0f)
            lineTo(8.19f, 25.11f)
            curveTo(10.288f, 26.91f, 13.017f, 28f, 16f, 28f)
            curveToRelative(2.983f, 0f, 5.711f, -1.088f, 7.81f, -2.89f)
            close()
            moveTo(2f, 16f)
            curveTo(2f, 8.268f, 8.268f, 2f, 16f, 2f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            reflectiveCurveToRelative(-6.268f, 14f, -14f, 14f)
            reflectiveCurveTo(2f, 23.732f, 2f, 16f)
            close()
            moveToRelative(18.5f, -3f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
            close()
            moveToRelative(0f, 2f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveTo(22.433f, 8f, 20.5f, 8f)
            reflectiveCurveTo(17f, 9.567f, 17f, 11.5f)
            reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
            close()
        }
    }.build()
}
