package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TemperatureDegreeFahrenheit20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TemperatureDegreeFahrenheit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 6.5f)
            curveTo(4f, 5.672f, 4.672f, 5f, 5.5f, 5f)
            reflectiveCurveTo(7f, 5.672f, 7f, 6.5f)
            reflectiveCurveTo(6.328f, 8f, 5.5f, 8f)
            reflectiveCurveTo(4f, 7.328f, 4f, 6.5f)
            close()
            moveTo(5.5f, 4f)
            curveTo(4.12f, 4f, 3f, 5.12f, 3f, 6.5f)
            reflectiveCurveTo(4.12f, 9f, 5.5f, 9f)
            reflectiveCurveTo(8f, 7.88f, 8f, 6.5f)
            reflectiveCurveTo(6.88f, 4f, 5.5f, 4f)
            close()
            moveToRelative(5f, 0f)
            curveTo(10.224f, 4f, 10f, 4.224f, 10f, 4.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.276f, 9f, 16f, 9f)
            horizontalLineToRelative(-5f)
            verticalLineTo(5f)
            horizontalLineToRelative(5.5f)
            curveTo(16.776f, 5f, 17f, 4.776f, 17f, 4.5f)
            reflectiveCurveTo(16.776f, 4f, 16.5f, 4f)
            horizontalLineToRelative(-6f)
            close()
        }
    }.build()
}
