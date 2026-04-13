package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TemperatureDegreeFahrenheit24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TemperatureDegreeFahrenheit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 8.5f)
            curveTo(5f, 7.672f, 5.672f, 7f, 6.5f, 7f)
            reflectiveCurveTo(8f, 7.672f, 8f, 8.5f)
            reflectiveCurveTo(7.328f, 10f, 6.5f, 10f)
            reflectiveCurveTo(5f, 9.328f, 5f, 8.5f)
            close()
            moveTo(6.5f, 5f)
            curveTo(4.567f, 5f, 3f, 6.567f, 3f, 8.5f)
            reflectiveCurveTo(4.567f, 12f, 6.5f, 12f)
            reflectiveCurveTo(10f, 10.433f, 10f, 8.5f)
            reflectiveCurveTo(8.433f, 5f, 6.5f, 5f)
            close()
            moveTo(13f, 5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(14f)
            verticalLineTo(7f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
