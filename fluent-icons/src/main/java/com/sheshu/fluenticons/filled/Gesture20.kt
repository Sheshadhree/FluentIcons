package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Gesture20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Gesture20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 4.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(16.5f, 5.164f, 16.5f, 4.75f)
            reflectiveCurveTo(16.836f, 4f, 17.25f, 4f)
            reflectiveCurveTo(18f, 4.336f, 18f, 4.75f)
            close()
            moveTo(3.5f, 16.25f)
            curveTo(3.5f, 16.664f, 3.164f, 17f, 2.75f, 17f)
            reflectiveCurveTo(2f, 16.664f, 2f, 16.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            close()
            moveTo(5.75f, 4f)
            curveTo(5.397f, 4f, 5.091f, 4.247f, 5.017f, 4.592f)
            curveTo(4.942f, 4.937f, 5.119f, 5.288f, 5.441f, 5.433f)
            lineToRelative(9.064f, 4.1f)
            lineToRelative(-9.59f, 4.796f)
            curveToRelative(-0.37f, 0.185f, -0.521f, 0.636f, -0.336f, 1.006f)
            reflectiveCurveToRelative(0.636f, 0.521f, 1.006f, 0.336f)
            lineToRelative(11f, -5.5f)
            curveToRelative(0.26f, -0.13f, 0.42f, -0.396f, 0.415f, -0.686f)
            curveToRelative(-0.006f, -0.289f, -0.177f, -0.55f, -0.44f, -0.668f)
            lineTo(9.227f, 5.5f)
            horizontalLineToRelative(5.522f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(15.164f, 4f, 14.75f, 4f)
            horizontalLineTo(5.751f)
            close()
        }
    }.build()
}
