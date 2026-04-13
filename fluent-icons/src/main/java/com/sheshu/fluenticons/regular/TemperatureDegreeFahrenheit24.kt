package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TemperatureDegreeFahrenheit24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TemperatureDegreeFahrenheit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 8f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveTo(8f, 7.172f, 8f, 8f)
            reflectiveCurveTo(7.328f, 9.5f, 6.5f, 9.5f)
            reflectiveCurveTo(5f, 8.828f, 5f, 8f)
            close()
            moveToRelative(1.5f, -3f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(5.75f, 0f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(13f, 18.664f, 13f, 18.25f)
            verticalLineTo(12.5f)
            horizontalLineToRelative(5.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(19.164f, 11f, 18.75f, 11f)
            horizontalLineTo(13f)
            verticalLineTo(6.5f)
            horizontalLineToRelative(6.25f)
            curveTo(19.664f, 6.5f, 20f, 6.164f, 20f, 5.75f)
            reflectiveCurveTo(19.664f, 5f, 19.25f, 5f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
