package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TemperatureDegreeFahrenheit16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TemperatureDegreeFahrenheit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 5.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(1f, -2.5f)
            curveTo(3.12f, 3f, 2f, 4.12f, 2f, 5.5f)
            reflectiveCurveTo(3.12f, 8f, 4.5f, 8f)
            reflectiveCurveTo(7f, 6.88f, 7f, 5.5f)
            reflectiveCurveTo(5.88f, 3f, 4.5f, 3f)
            close()
            moveToRelative(4.25f, 0f)
            curveTo(8.336f, 3f, 8f, 3.336f, 8f, 3.75f)
            verticalLineToRelative(8.5f)
            curveTo(8f, 12.664f, 8.336f, 13f, 8.75f, 13f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(3.75f)
            curveTo(13.664f, 8.5f, 14f, 8.164f, 14f, 7.75f)
            reflectiveCurveTo(13.664f, 7f, 13.25f, 7f)
            horizontalLineTo(9.5f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(4.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(14.164f, 3f, 13.75f, 3f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
