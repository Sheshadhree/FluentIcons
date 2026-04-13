package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NumberCircle828: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle828",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 3.5f)
            curveTo(8.201f, 3.5f, 3.5f, 8.201f, 3.5f, 14f)
            reflectiveCurveTo(8.201f, 24.5f, 14f, 24.5f)
            reflectiveCurveTo(24.5f, 19.799f, 24.5f, 14f)
            reflectiveCurveTo(19.799f, 3.5f, 14f, 3.5f)
            close()
            moveTo(2f, 14f)
            curveTo(2f, 7.373f, 7.373f, 2f, 14f, 2f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(2f, 20.627f, 2f, 14f)
            close()
            moveToRelative(12f, -5.5f)
            curveToRelative(1.438f, 0f, 2.5f, 1.063f, 2.5f, 2.25f)
            reflectiveCurveTo(15.438f, 13f, 14f, 13f)
            reflectiveCurveToRelative(-2.5f, -1.063f, -2.5f, -2.25f)
            reflectiveCurveTo(12.562f, 8.5f, 14f, 8.5f)
            close()
            moveToRelative(2.501f, 5.176f)
            curveTo(17.407f, 12.998f, 18f, 11.955f, 18f, 10.75f)
            curveTo(18f, 8.623f, 16.151f, 7f, 14f, 7f)
            curveToRelative(-2.152f, 0f, -4f, 1.623f, -4f, 3.75f)
            curveToRelative(0f, 1.205f, 0.593f, 2.248f, 1.499f, 2.926f)
            curveTo(10.313f, 14.377f, 9.5f, 15.57f, 9.5f, 17f)
            curveToRelative(0f, 2.306f, 2.12f, 4f, 4.5f, 4f)
            reflectiveCurveToRelative(4.5f, -1.694f, 4.5f, -4f)
            curveToRelative(0f, -1.429f, -0.813f, -2.623f, -1.999f, -3.324f)
            close()
            moveTo(14f, 14.5f)
            curveToRelative(1.761f, 0f, 3f, 1.216f, 3f, 2.5f)
            reflectiveCurveToRelative(-1.239f, 2.5f, -3f, 2.5f)
            reflectiveCurveToRelative(-3f, -1.216f, -3f, -2.5f)
            reflectiveCurveToRelative(1.239f, -2.5f, 3f, -2.5f)
            close()
        }
    }.build()
}
