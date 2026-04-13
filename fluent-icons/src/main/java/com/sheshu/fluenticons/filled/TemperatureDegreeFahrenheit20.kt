package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TemperatureDegreeFahrenheit20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TemperatureDegreeFahrenheit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 7f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveTo(6.5f, 6.172f, 6.5f, 7f)
            reflectiveCurveTo(5.828f, 8.5f, 5f, 8.5f)
            reflectiveCurveTo(3.5f, 7.828f, 3.5f, 7f)
            close()
            moveTo(5f, 4f)
            curveTo(3.343f, 4f, 2f, 5.343f, 2f, 7f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(5.75f, 0f)
            curveTo(10.336f, 4f, 10f, 4.336f, 10f, 4.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(10.5f)
            horizontalLineToRelative(4.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(16.664f, 9f, 16.25f, 9f)
            horizontalLineTo(11.5f)
            verticalLineTo(5.5f)
            horizontalLineToRelative(5.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(17.164f, 4f, 16.75f, 4f)
            horizontalLineToRelative(-6f)
            close()
        }
    }.build()
}
