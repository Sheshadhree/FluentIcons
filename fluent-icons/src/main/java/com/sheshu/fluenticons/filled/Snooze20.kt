package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Snooze20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Snooze20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.75f, 4f)
            curveTo(10.336f, 4f, 10f, 4.336f, 10f, 4.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.883f)
            lineToRelative(-4.455f, 5.265f)
            curveToRelative(-0.19f, 0.223f, -0.231f, 0.536f, -0.108f, 0.8f)
            curveTo(10.193f, 11.832f, 10.458f, 12f, 10.75f, 12f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-3.883f)
            lineToRelative(4.456f, -5.266f)
            curveToRelative(0.188f, -0.223f, 0.23f, -0.535f, 0.107f, -0.8f)
            curveTo(16.808f, 4.17f, 16.542f, 4f, 16.25f, 4f)
            horizontalLineToRelative(-5.5f)
            close()
            moveToRelative(-7f, 6f)
            curveTo(3.336f, 10f, 3f, 10.336f, 3f, 10.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(1.966f)
            lineToRelative(-2.558f, 3.29f)
            curveToRelative(-0.176f, 0.226f, -0.208f, 0.532f, -0.082f, 0.79f)
            curveTo(3.202f, 15.836f, 3.464f, 16f, 3.75f, 16f)
            horizontalLineToRelative(3.5f)
            curveTo(7.664f, 16f, 8f, 15.664f, 8f, 15.25f)
            reflectiveCurveTo(7.664f, 14.5f, 7.25f, 14.5f)
            horizontalLineTo(5.284f)
            lineToRelative(2.558f, -3.29f)
            curveToRelative(0.176f, -0.226f, 0.208f, -0.532f, 0.082f, -0.79f)
            curveTo(7.798f, 10.164f, 7.536f, 10f, 7.25f, 10f)
            horizontalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
