package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShareAndroid32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareAndroid32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 7.5f)
            curveToRelative(0f, 0.368f, 0.044f, 0.726f, 0.128f, 1.068f)
            lineToRelative(-9.15f, 4.575f)
            curveTo(10.151f, 12.14f, 8.9f, 11.5f, 7.5f, 11.5f)
            curveTo(5.015f, 11.5f, 3f, 13.515f, 3f, 16f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            curveToRelative(1.4f, 0f, 2.652f, -0.64f, 3.477f, -1.643f)
            lineToRelative(9.15f, 4.575f)
            curveTo(20.045f, 23.774f, 20f, 24.132f, 20f, 24.5f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveToRelative(-2.015f, -4.5f, -4.5f, -4.5f)
            curveToRelative(-1.4f, 0f, -2.652f, 0.64f, -3.477f, 1.643f)
            lineToRelative(-9.15f, -4.575f)
            curveTo(11.956f, 16.726f, 12f, 16.368f, 12f, 16f)
            curveToRelative(0f, -0.368f, -0.044f, -0.726f, -0.127f, -1.068f)
            lineToRelative(9.15f, -4.575f)
            curveTo(21.848f, 11.36f, 23.099f, 12f, 24.5f, 12f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(26.985f, 3f, 24.5f, 3f)
            reflectiveCurveTo(20f, 5.015f, 20f, 7.5f)
            close()
        }
    }.build()
}
