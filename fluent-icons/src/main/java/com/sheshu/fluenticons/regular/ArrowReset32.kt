package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowReset32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowReset32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.707f, 3.293f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineTo(5.414f, 8f)
            horizontalLineTo(17.5f)
            curveTo(23.299f, 8f, 28f, 12.701f, 28f, 18.5f)
            reflectiveCurveTo(23.299f, 29f, 17.5f, 29f)
            reflectiveCurveTo(7f, 24.299f, 7f, 18.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 4.694f, 3.806f, 8.5f, 8.5f, 8.5f)
            reflectiveCurveToRelative(8.5f, -3.806f, 8.5f, -8.5f)
            reflectiveCurveToRelative(-3.806f, -8.5f, -8.5f, -8.5f)
            horizontalLineTo(5.414f)
            lineToRelative(3.293f, 3.293f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-5f, -5f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(5f, -5f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            close()
        }
    }.build()
}
