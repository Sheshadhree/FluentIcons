package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookUpRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookUpRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 18f)
            horizontalLineTo(16f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-5.5f)
            curveTo(6.91f, 20f, 4f, 17.09f, 4f, 13.5f)
            reflectiveCurveTo(6.91f, 7f, 10.5f, 7f)
            horizontalLineToRelative(5.14f)
            lineToRelative(-1.933f, -1.933f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineToRelative(3.53f, 3.529f)
            curveToRelative(0.09f, 0.091f, 0.161f, 0.196f, 0.21f, 0.308f)
            curveTo(18.949f, 7.64f, 19f, 7.814f, 19f, 8f)
            curveToRelative(0f, 0.29f, -0.123f, 0.55f, -0.32f, 0.733f)
            lineToRelative(-0.027f, 0.029f)
            lineToRelative(-3.531f, 3.53f)
            curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.415f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.023f, 0f, -1.413f)
            lineTo(15.586f, 9f)
            horizontalLineTo(10.5f)
            curveTo(8.015f, 9f, 6f, 11.015f, 6f, 13.5f)
            reflectiveCurveTo(8.015f, 18f, 10.5f, 18f)
            close()
        }
    }.build()
}
