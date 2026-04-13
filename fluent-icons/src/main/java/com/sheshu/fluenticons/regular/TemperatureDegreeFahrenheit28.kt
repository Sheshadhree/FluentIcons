package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TemperatureDegreeFahrenheit28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TemperatureDegreeFahrenheit28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 8.5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            close()
            moveTo(7f, 5f)
            curveTo(5.067f, 5f, 3.5f, 6.567f, 3.5f, 8.5f)
            reflectiveCurveTo(5.067f, 12f, 7f, 12f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveTo(8.933f, 5f, 7f, 5f)
            close()
            moveToRelative(6.75f, 0f)
            curveTo(13.336f, 5f, 13f, 5.336f, 13f, 5.75f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(14.5f)
            horizontalLineToRelative(7.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(22.664f, 13f, 22.25f, 13f)
            horizontalLineTo(14.5f)
            verticalLineTo(6.5f)
            horizontalLineToRelative(8.75f)
            curveTo(23.664f, 6.5f, 24f, 6.164f, 24f, 5.75f)
            reflectiveCurveTo(23.664f, 5f, 23.25f, 5f)
            horizontalLineToRelative(-9.5f)
            close()
        }
    }.build()
}
