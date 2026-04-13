package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TemperatureDegreeCelsius16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TemperatureDegreeCelsius16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 5.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(1f, -2.5f)
            curveTo(2.12f, 3f, 1f, 4.12f, 1f, 5.5f)
            reflectiveCurveTo(2.12f, 8f, 3.5f, 8f)
            reflectiveCurveTo(6f, 6.88f, 6f, 5.5f)
            reflectiveCurveTo(4.88f, 3f, 3.5f, 3f)
            close()
            moveTo(11f, 4.5f)
            curveTo(9.401f, 4.5f, 8f, 5.76f, 8f, 8f)
            reflectiveCurveToRelative(1.401f, 3.5f, 3f, 3.5f)
            curveToRelative(0.882f, 0f, 1.703f, -0.382f, 2.263f, -1.101f)
            curveTo(13.444f, 10.166f, 13.709f, 10f, 14.004f, 10f)
            curveToRelative(0.564f, 0f, 0.954f, 0.565f, 0.644f, 1.036f)
            curveTo(13.84f, 12.262f, 12.525f, 13f, 11f, 13f)
            curveToRelative(-2.543f, 0f, -4.5f, -2.053f, -4.5f, -5f)
            reflectiveCurveTo(8.457f, 3f, 11f, 3f)
            curveToRelative(1.525f, 0f, 2.84f, 0.738f, 3.648f, 1.964f)
            curveTo(14.958f, 5.435f, 14.568f, 6f, 14.004f, 6f)
            curveToRelative(-0.295f, 0f, -0.56f, -0.166f, -0.741f, -0.399f)
            curveTo(12.703f, 4.882f, 11.882f, 4.5f, 11f, 4.5f)
            close()
        }
    }.build()
}
