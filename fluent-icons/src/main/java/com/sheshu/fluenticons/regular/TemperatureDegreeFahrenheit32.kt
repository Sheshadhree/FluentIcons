package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TemperatureDegreeFahrenheit32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TemperatureDegreeFahrenheit32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 9.5f)
            curveTo(5f, 8.12f, 6.12f, 7f, 7.5f, 7f)
            reflectiveCurveTo(10f, 8.12f, 10f, 9.5f)
            reflectiveCurveTo(8.88f, 12f, 7.5f, 12f)
            reflectiveCurveTo(5f, 10.88f, 5f, 9.5f)
            close()
            moveTo(7.5f, 5f)
            curveTo(5.015f, 5f, 3f, 7.015f, 3f, 9.5f)
            reflectiveCurveTo(5.015f, 14f, 7.5f, 14f)
            reflectiveCurveTo(12f, 11.985f, 12f, 9.5f)
            reflectiveCurveTo(9.985f, 5f, 7.5f, 5f)
            close()
            moveTo(16f, 5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(20f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-9f)
            horizontalLineToRelative(9f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-9f)
            verticalLineTo(7f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(16f)
            close()
        }
    }.build()
}
