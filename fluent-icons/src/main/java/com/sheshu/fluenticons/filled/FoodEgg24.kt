package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FoodEgg24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FoodEgg24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 12.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(13f, 11.164f, 13f, 10.75f)
            reflectiveCurveTo(12.664f, 10f, 12.25f, 10f)
            curveTo(11.007f, 10f, 10f, 11.007f, 10f, 12.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            close()
            moveTo(13.5f, 2f)
            curveToRelative(-3.117f, 0f, -5.812f, 1.825f, -7.285f, 4.494f)
            curveToRelative(-0.24f, 0.435f, -0.609f, 0.813f, -1.056f, 1.115f)
            curveTo(3.25f, 8.9f, 2f, 11.18f, 2f, 13.75f)
            curveTo(2f, 17.696f, 4.967f, 21f, 8.75f, 21f)
            curveToRelative(0.324f, 0f, 0.643f, -0.024f, 0.955f, -0.072f)
            curveToRelative(0.87f, -0.132f, 1.792f, 0f, 2.567f, 0.38f)
            curveTo(13.17f, 21.753f, 14.182f, 22f, 15.25f, 22f)
            curveToRelative(3.728f, 0f, 6.75f, -3.022f, 6.75f, -6.75f)
            curveToRelative(0f, -0.42f, -0.038f, -0.832f, -0.112f, -1.232f)
            curveToRelative(-0.07f, -0.373f, -0.08f, -0.739f, -0.024f, -1.082f)
            curveToRelative(0.09f, -0.54f, 0.136f, -1.095f, 0.136f, -1.661f)
            curveTo(22f, 6.221f, 18.26f, 2f, 13.5f, 2f)
            close()
            moveToRelative(3.75f, 10.5f)
            curveToRelative(0f, 2.623f, -2.127f, 4.75f, -4.75f, 4.75f)
            reflectiveCurveToRelative(-4.75f, -2.127f, -4.75f, -4.75f)
            reflectiveCurveToRelative(2.127f, -4.75f, 4.75f, -4.75f)
            reflectiveCurveToRelative(4.75f, 2.127f, 4.75f, 4.75f)
            close()
        }
    }.build()
}
