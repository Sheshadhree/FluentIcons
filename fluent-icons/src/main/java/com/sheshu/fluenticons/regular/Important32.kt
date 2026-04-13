package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Important32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Important32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 8f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            curveToRelative(0f, 1.45f, -0.421f, 3.348f, -1.046f, 5.315f)
            curveToRelative(-0.613f, 1.932f, -1.372f, 3.776f, -1.942f, 5.066f)
            curveTo(16.854f, 18.737f, 16.48f, 19f, 16f, 19f)
            reflectiveCurveToRelative(-0.854f, -0.263f, -1.012f, -0.62f)
            curveToRelative(-0.57f, -1.289f, -1.329f, -3.133f, -1.942f, -5.065f)
            curveTo(12.42f, 11.348f, 12f, 9.45f, 12f, 8f)
            close()
            moveToRelative(4f, -6f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            curveToRelative(0f, 3.523f, 1.986f, 8.536f, 3.16f, 11.19f)
            curveTo(13.654f, 20.31f, 14.773f, 21f, 16f, 21f)
            curveToRelative(1.226f, 0f, 2.345f, -0.69f, 2.84f, -1.81f)
            curveTo(20.015f, 16.535f, 22f, 11.522f, 22f, 8f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            close()
            moveToRelative(1.5f, 24.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveTo(15.172f, 28f, 16f, 28f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            close()
            moveToRelative(2f, 0f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveTo(14.067f, 23f, 16f, 23f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            close()
        }
    }.build()
}
