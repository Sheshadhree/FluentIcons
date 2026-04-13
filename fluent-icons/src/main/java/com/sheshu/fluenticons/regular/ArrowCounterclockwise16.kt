package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCounterclockwise16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCounterclockwise16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 8f)
            curveToRelative(0f, -2.761f, -2.24f, -5f, -5f, -5f)
            curveToRelative(-1.637f, 0f, -3.09f, 0.785f, -4.002f, 2f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(6.275f, 6f, 6f, 6f)
            horizontalLineTo(3f)
            curveTo(2.723f, 6f, 2.5f, 5.776f, 2.5f, 5.5f)
            verticalLineToRelative(-3f)
            curveTo(2.5f, 2.224f, 2.723f, 2f, 3f, 2f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(1.531f)
            curveTo(4.6f, 2.786f, 6.207f, 2f, 8f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            curveToRelative(-3.13f, 0f, -5.7f, -2.396f, -5.975f, -5.455f)
            curveTo(1.999f, 8.27f, 2.202f, 8.027f, 2.477f, 8.002f)
            curveTo(2.752f, 7.977f, 2.995f, 8.18f, 3.019f, 8.455f)
            curveTo(3.25f, 11.003f, 5.391f, 13f, 8f, 13f)
            curveToRelative(2.762f, 0f, 5f, -2.239f, 5f, -5f)
            close()
        }
    }.build()
}
