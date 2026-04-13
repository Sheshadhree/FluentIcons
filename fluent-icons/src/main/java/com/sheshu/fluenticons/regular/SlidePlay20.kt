package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlidePlay20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlidePlay20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineToRelative(6.5f)
            curveTo(2f, 14.769f, 3.231f, 16f, 4.75f, 16f)
            horizontalLineToRelative(4.457f)
            curveToRelative(-0.091f, -0.322f, -0.154f, -0.657f, -0.185f, -1f)
            horizontalLineTo(4.75f)
            curveTo(3.784f, 15f, 3f, 14.216f, 3f, 13.25f)
            verticalLineToRelative(-6.5f)
            curveTo(3f, 5.784f, 3.784f, 5f, 4.75f, 5f)
            horizontalLineToRelative(10.5f)
            curveTo(16.216f, 5f, 17f, 5.784f, 17f, 6.75f)
            verticalLineTo(9.6f)
            curveToRelative(0.358f, 0.183f, 0.693f, 0.404f, 1f, 0.657f)
            verticalLineTo(6.75f)
            curveTo(18f, 5.231f, 16.769f, 4f, 15.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveTo(19f, 14.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(10f, 16.985f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveToRelative(-6f, 1.495f)
            curveToRelative(0f, 0.389f, 0.424f, 0.629f, 0.757f, 0.429f)
            lineToRelative(2.5f, -1.497f)
            curveToRelative(0.325f, -0.194f, 0.325f, -0.664f, 0f, -0.858f)
            lineToRelative(-2.5f, -1.497f)
            curveTo(13.424f, 12.372f, 13f, 12.612f, 13f, 13f)
            verticalLineToRelative(2.994f)
            close()
        }
    }.build()
}
