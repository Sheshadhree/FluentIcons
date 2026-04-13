package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Eye32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Eye32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(28.034f, 17.29f)
            curveToRelative(0.13f, 0.43f, 0.53f, 0.71f, 0.96f, 0.71f)
            verticalLineToRelative(-0.01f)
            curveToRelative(0.1f, 0f, 0.19f, -0.01f, 0.29f, -0.04f)
            curveToRelative(0.53f, -0.16f, 0.829f, -0.71f, 0.67f, -1.24f)
            curveTo(29.923f, 16.61f, 26.613f, 6f, 15.995f, 6f)
            reflectiveCurveTo(2.07f, 16.61f, 2.04f, 16.72f)
            curveToRelative(-0.16f, 0.53f, 0.14f, 1.08f, 0.67f, 1.24f)
            curveToRelative(0.53f, 0.16f, 1.09f, -0.14f, 1.25f, -0.67f)
            curveTo(4.069f, 16.91f, 6.889f, 8f, 15.996f, 8f)
            curveToRelative(9.104f, 0f, 11.915f, 8.903f, 12.037f, 9.29f)
            close()
            moveTo(12f, 18f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            close()
            moveToRelative(4f, -6f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            close()
        }
    }.build()
}
