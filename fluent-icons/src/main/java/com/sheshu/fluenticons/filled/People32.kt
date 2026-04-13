package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.People32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.People32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 16f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            reflectiveCurveTo(13.538f, 5f, 10.5f, 5f)
            reflectiveCurveTo(5f, 7.462f, 5f, 10.5f)
            reflectiveCurveTo(7.462f, 16f, 10.5f, 16f)
            close()
            moveTo(23f, 16f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            close()
            moveTo(5f, 18f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(0.15f)
            reflectiveCurveTo(2f, 27f, 10.5f, 27f)
            reflectiveCurveToRelative(8.5f, -5.85f, 8.5f, -5.85f)
            verticalLineTo(21f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(5f)
            close()
            moveToRelative(18f, 7f)
            curveToRelative(-1.456f, 0f, -2.608f, -0.198f, -3.521f, -0.513f)
            curveToRelative(0.432f, -0.7f, 0.68f, -1.375f, 0.82f, -1.92f)
            curveToRelative(0.093f, -0.355f, 0.142f, -0.662f, 0.168f, -0.896f)
            curveToRelative(0.014f, -0.118f, 0.021f, -0.219f, 0.025f, -0.3f)
            curveToRelative(0.002f, -0.04f, 0.004f, -0.076f, 0.004f, -0.107f)
            lineToRelative(0.001f, -0.042f)
            verticalLineTo(21f)
            curveToRelative(0f, -1.152f, -0.433f, -2.204f, -1.145f, -3f)
            horizontalLineToRelative(8.241f)
            curveTo(28.922f, 18f, 30f, 19.077f, 30f, 20.406f)
            curveToRelative(0f, 0f, 0f, 4.594f, -7f, 4.594f)
            close()
        }
    }.build()
}
