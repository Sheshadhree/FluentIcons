package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SoundWaveCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SoundWaveCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 8.75f)
            curveTo(11f, 8.336f, 10.664f, 8f, 10.25f, 8f)
            reflectiveCurveTo(9.5f, 8.336f, 9.5f, 8.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(11f, 15.664f, 11f, 15.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveToRelative(6f, 0f)
            curveTo(17f, 8.336f, 16.664f, 8f, 16.25f, 8f)
            reflectiveCurveTo(15.5f, 8.336f, 15.5f, 8.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(17f, 15.664f, 17f, 15.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveToRelative(-3f, 1.5f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(14f, 14.164f, 14f, 13.75f)
            verticalLineToRelative(-3.5f)
            close()
            moveToRelative(-6f, 0.5f)
            curveTo(8f, 10.336f, 7.664f, 10f, 7.25f, 10f)
            reflectiveCurveTo(6.5f, 10.336f, 6.5f, 10.75f)
            verticalLineToRelative(2.5f)
            curveTo(6.5f, 13.664f, 6.836f, 14f, 7.25f, 14f)
            reflectiveCurveTo(8f, 13.664f, 8f, 13.25f)
            verticalLineToRelative(-2.5f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            close()
            moveTo(3.5f, 12f)
            curveToRelative(0f, -4.694f, 3.806f, -8.5f, 8.5f, -8.5f)
            reflectiveCurveToRelative(8.5f, 3.806f, 8.5f, 8.5f)
            reflectiveCurveToRelative(-3.806f, 8.5f, -8.5f, 8.5f)
            reflectiveCurveToRelative(-8.5f, -3.806f, -8.5f, -8.5f)
            close()
        }
    }.build()
}
