package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlidePlay20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlidePlay20",
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
            curveTo(9.072f, 15.523f, 9f, 15.02f, 9f, 14.5f)
            curveTo(9f, 11.462f, 11.462f, 9f, 14.5f, 9f)
            curveToRelative(1.33f, 0f, 2.55f, 0.472f, 3.5f, 1.257f)
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
