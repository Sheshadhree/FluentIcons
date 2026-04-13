package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle828: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle828",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2f)
            curveTo(7.373f, 2f, 2f, 7.373f, 2f, 14f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(20.627f, 2f, 14f, 2f)
            close()
            moveToRelative(0f, 6.5f)
            curveToRelative(-1.438f, 0f, -2.5f, 1.063f, -2.5f, 2.25f)
            reflectiveCurveTo(12.562f, 13f, 14f, 13f)
            reflectiveCurveToRelative(2.5f, -1.063f, 2.5f, -2.25f)
            reflectiveCurveTo(15.438f, 8.5f, 14f, 8.5f)
            close()
            moveToRelative(2.501f, 5.176f)
            curveTo(17.687f, 14.377f, 18.5f, 15.57f, 18.5f, 17f)
            curveToRelative(0f, 2.306f, -2.12f, 4f, -4.5f, 4f)
            reflectiveCurveToRelative(-4.5f, -1.694f, -4.5f, -4f)
            curveToRelative(0f, -1.429f, 0.813f, -2.623f, 1.999f, -3.324f)
            curveTo(10.593f, 12.998f, 10f, 11.955f, 10f, 10.75f)
            curveTo(10f, 8.623f, 11.848f, 7f, 14f, 7f)
            curveToRelative(2.151f, 0f, 4f, 1.623f, 4f, 3.75f)
            curveToRelative(0f, 1.205f, -0.593f, 2.248f, -1.499f, 2.926f)
            close()
            moveTo(14f, 14.5f)
            curveToRelative(-1.761f, 0f, -3f, 1.216f, -3f, 2.5f)
            reflectiveCurveToRelative(1.239f, 2.5f, 3f, 2.5f)
            reflectiveCurveToRelative(3f, -1.216f, 3f, -2.5f)
            reflectiveCurveToRelative(-1.239f, -2.5f, -3f, -2.5f)
            close()
        }
    }.build()
}
