package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextPercent20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextPercent20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.636f, 3.128f)
            curveTo(14.98f, 3.36f, 15.07f, 3.826f, 14.84f, 4.17f)
            lineTo(6.406f, 16.671f)
            curveToRelative(-0.231f, 0.343f, -0.697f, 0.434f, -1.04f, 0.202f)
            curveToRelative(-0.344f, -0.231f, -0.435f, -0.698f, -0.203f, -1.04f)
            lineTo(13.595f, 3.33f)
            curveToRelative(0.232f, -0.344f, 0.698f, -0.434f, 1.041f, -0.203f)
            close()
            moveTo(5.75f, 4.5f)
            curveTo(4.784f, 4.5f, 4f, 5.284f, 4f, 6.25f)
            reflectiveCurveTo(4.784f, 8f, 5.75f, 8f)
            reflectiveCurveTo(7.5f, 7.216f, 7.5f, 6.25f)
            reflectiveCurveTo(6.716f, 4.5f, 5.75f, 4.5f)
            close()
            moveTo(2.5f, 6.25f)
            curveTo(2.5f, 4.455f, 3.955f, 3f, 5.75f, 3f)
            reflectiveCurveTo(9f, 4.455f, 9f, 6.25f)
            reflectiveCurveTo(7.545f, 9.5f, 5.75f, 9.5f)
            reflectiveCurveTo(2.5f, 8.045f, 2.5f, 6.25f)
            close()
            moveToRelative(10f, 7.5f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            reflectiveCurveTo(16f, 12.784f, 16f, 13.75f)
            reflectiveCurveToRelative(-0.784f, 1.75f, -1.75f, 1.75f)
            reflectiveCurveToRelative(-1.75f, -0.784f, -1.75f, -1.75f)
            close()
            moveToRelative(1.75f, -3.25f)
            curveToRelative(-1.795f, 0f, -3.25f, 1.455f, -3.25f, 3.25f)
            reflectiveCurveTo(12.455f, 17f, 14.25f, 17f)
            reflectiveCurveToRelative(3.25f, -1.455f, 3.25f, -3.25f)
            reflectiveCurveToRelative(-1.455f, -3.25f, -3.25f, -3.25f)
            close()
        }
    }.build()
}
