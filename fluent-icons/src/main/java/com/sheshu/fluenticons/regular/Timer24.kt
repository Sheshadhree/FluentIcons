package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Timer24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Timer24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 5f)
            curveToRelative(4.694f, 0f, 8.5f, 3.806f, 8.5f, 8.5f)
            reflectiveCurveTo(16.694f, 22f, 12f, 22f)
            reflectiveCurveToRelative(-8.5f, -3.806f, -8.5f, -8.5f)
            reflectiveCurveTo(7.306f, 5f, 12f, 5f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveTo(12f, 8f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(12.75f, 8.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(11.25f, 13.25f)
            verticalLineToRelative(-4.5f)
            curveTo(11.25f, 8.336f, 11.586f, 8f, 12f, 8f)
            close()
            moveToRelative(7.147f, -2.886f)
            lineToRelative(0.083f, 0.06f)
            lineToRelative(1.158f, 0.964f)
            curveToRelative(0.319f, 0.265f, 0.362f, 0.738f, 0.097f, 1.056f)
            curveToRelative(-0.243f, 0.292f, -0.66f, 0.353f, -0.974f, 0.157f)
            lineTo(19.43f, 7.29f)
            lineToRelative(-1.16f, -0.964f)
            curveToRelative(-0.318f, -0.264f, -0.36f, -0.736f, -0.096f, -1.056f)
            curveToRelative(0.242f, -0.292f, 0.66f, -0.352f, 0.973f, -0.156f)
            close()
            moveTo(14.25f, 2.5f)
            curveTo(14.664f, 2.5f, 15f, 2.836f, 15f, 3.25f)
            curveToRelative(0f, 0.38f, -0.282f, 0.693f, -0.648f, 0.743f)
            lineTo(14.25f, 4f)
            horizontalLineToRelative(-4.5f)
            curveTo(9.336f, 4f, 9f, 3.664f, 9f, 3.25f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.648f, -0.743f)
            lineTo(9.75f, 2.5f)
            horizontalLineToRelative(4.5f)
            close()
        }
    }.build()
}
