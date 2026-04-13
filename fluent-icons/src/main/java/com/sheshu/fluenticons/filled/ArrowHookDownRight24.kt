package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookDownRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookDownRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 6f)
            horizontalLineTo(16f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-5.5f)
            curveTo(6.91f, 4f, 4f, 6.91f, 4f, 10.5f)
            reflectiveCurveTo(6.91f, 17f, 10.5f, 17f)
            horizontalLineToRelative(5.14f)
            lineToRelative(-1.933f, 1.933f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(3.53f, -3.529f)
            curveToRelative(0.09f, -0.091f, 0.161f, -0.196f, 0.21f, -0.308f)
            curveTo(18.949f, 16.36f, 19f, 16.186f, 19f, 16f)
            curveToRelative(0f, -0.29f, -0.123f, -0.55f, -0.32f, -0.733f)
            lineToRelative(-0.027f, -0.029f)
            lineToRelative(-3.531f, -3.53f)
            curveToRelative(-0.391f, -0.391f, -1.024f, -0.391f, -1.415f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.023f, 0f, 1.413f)
            lineTo(15.586f, 15f)
            horizontalLineTo(10.5f)
            curveTo(8.015f, 15f, 6f, 12.985f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 6f, 10.5f, 6f)
            close()
        }
    }.build()
}
