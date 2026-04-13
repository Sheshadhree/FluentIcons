package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TemperatureDegreeFahrenheit48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TemperatureDegreeFahrenheit48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 14.5f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            close()
            moveToRelative(4f, -6.5f)
            curveTo(7.91f, 8f, 5f, 10.91f, 5f, 14.5f)
            reflectiveCurveTo(7.91f, 21f, 11.5f, 21f)
            reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
            reflectiveCurveTo(15.09f, 8f, 11.5f, 8f)
            close()
            moveToRelative(12.75f, 0f)
            curveTo(23.56f, 8f, 23f, 8.56f, 23f, 9.25f)
            verticalLineToRelative(29.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(25f)
            horizontalLineToRelative(13.25f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(25.5f)
            verticalLineToRelative(-12f)
            horizontalLineToRelative(15.25f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(41.44f, 8f, 40.75f, 8f)
            horizontalLineToRelative(-16.5f)
            close()
        }
    }.build()
}
