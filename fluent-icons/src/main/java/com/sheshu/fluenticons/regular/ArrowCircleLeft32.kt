package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.707f, 22.707f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineTo(12.414f, 17f)
            horizontalLineTo(22f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-9.586f)
            lineToRelative(4.293f, -4.293f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-6f, 6f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(6f, 6f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            close()
            moveTo(16f, 30f)
            curveToRelative(7.732f, 0f, 14f, -6.268f, 14f, -14f)
            reflectiveCurveTo(23.732f, 2f, 16f, 2f)
            reflectiveCurveTo(2f, 8.268f, 2f, 16f)
            reflectiveCurveToRelative(6.268f, 14f, 14f, 14f)
            close()
            moveToRelative(12f, -14f)
            curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(4f, 22.627f, 4f, 16f)
            reflectiveCurveTo(9.373f, 4f, 16f, 4f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            close()
        }
    }.build()
}
