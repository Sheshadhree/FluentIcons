package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlowDot24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlowDot24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 2.5f)
            curveToRelative(1.025f, 0f, 1.904f, 0.617f, 2.29f, 1.5f)
            horizontalLineToRelative(8.71f)
            curveTo(18.985f, 4f, 21f, 6.015f, 21f, 8.5f)
            reflectiveCurveTo(18.985f, 13f, 16.5f, 13f)
            horizontalLineToRelative(-9f)
            curveTo(6.12f, 13f, 5f, 14.12f, 5f, 15.5f)
            reflectiveCurveTo(6.12f, 18f, 7.5f, 18f)
            horizontalLineToRelative(8.71f)
            curveToRelative(0.386f, -0.883f, 1.265f, -1.5f, 2.29f, -1.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            curveToRelative(-1.025f, 0f, -1.904f, -0.617f, -2.29f, -1.5f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 20f, 3f, 17.985f, 3f, 15.5f)
            reflectiveCurveTo(5.015f, 11f, 7.5f, 11f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(17.88f, 6f, 16.5f, 6f)
            horizontalLineTo(7.79f)
            curveTo(7.404f, 6.883f, 6.525f, 7.5f, 5.5f, 7.5f)
            curveTo(4.12f, 7.5f, 3f, 6.38f, 3f, 5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            close()
        }
    }.build()
}
