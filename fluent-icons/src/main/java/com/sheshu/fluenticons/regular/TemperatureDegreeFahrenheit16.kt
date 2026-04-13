package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TemperatureDegreeFahrenheit16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TemperatureDegreeFahrenheit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(1f, -2f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            close()
            moveToRelative(4f, 0f)
            curveTo(8.224f, 3f, 8f, 3.224f, 8f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(8f, 12.776f, 8.224f, 13f, 8.5f, 13f)
            reflectiveCurveTo(9f, 12.776f, 9f, 12.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.276f, 7f, 13f, 7f)
            horizontalLineTo(9f)
            verticalLineTo(4f)
            horizontalLineToRelative(4.5f)
            curveTo(13.776f, 4f, 14f, 3.776f, 14f, 3.5f)
            reflectiveCurveTo(13.776f, 3f, 13.5f, 3f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
