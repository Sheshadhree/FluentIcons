package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LockClosedRibbon32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LockClosedRibbon32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 20f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveTo(10f, 9f)
            horizontalLineTo(8.5f)
            curveTo(6.015f, 9f, 4f, 11.015f, 4f, 13.5f)
            verticalLineToRelative(12f)
            curveTo(4f, 27.985f, 6.015f, 30f, 8.5f, 30f)
            horizontalLineToRelative(11f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-11f)
            curveTo(7.12f, 28f, 6f, 26.88f, 6f, 25.5f)
            verticalLineToRelative(-12f)
            curveTo(6f, 12.12f, 7.12f, 11f, 8.5f, 11f)
            horizontalLineToRelative(15f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(0.018f)
            curveToRelative(0.7f, 0.049f, 1.372f, 0.201f, 2f, 0.442f)
            verticalLineTo(13.5f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            horizontalLineTo(22f)
            verticalLineTo(8f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.686f, -6f, 6f)
            verticalLineToRelative(1f)
            close()
            moveToRelative(2f, -1f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-8f)
            verticalLineTo(8f)
            close()
            moveToRelative(19f, 12.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveTo(20f, 23.538f, 20f, 20.5f)
            reflectiveCurveToRelative(2.462f, -5.5f, 5.5f, -5.5f)
            reflectiveCurveToRelative(5.5f, 2.462f, 5.5f, 5.5f)
            close()
            moveToRelative(-1f, 5.362f)
            curveToRelative(-1.217f, 1.022f, -2.787f, 1.638f, -4.5f, 1.638f)
            reflectiveCurveToRelative(-3.283f, -0.616f, -4.5f, -1.638f)
            verticalLineTo(30f)
            curveToRelative(0f, 0.785f, 0.862f, 1.264f, 1.528f, 0.849f)
            lineToRelative(2.972f, -1.85f)
            lineToRelative(2.972f, 1.85f)
            curveTo(29.138f, 31.264f, 30f, 30.785f, 30f, 29.999f)
            verticalLineToRelative(-4.137f)
            close()
        }
    }.build()
}
