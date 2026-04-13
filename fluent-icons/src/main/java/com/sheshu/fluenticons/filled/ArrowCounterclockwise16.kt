package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCounterclockwise16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCounterclockwise16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 8f)
            curveToRelative(0f, -2.485f, -2.014f, -4.5f, -4.5f, -4.5f)
            curveToRelative(-1.332f, 0f, -2.53f, 0.579f, -3.354f, 1.5f)
            horizontalLineTo(6.25f)
            curveTo(6.664f, 5f, 7f, 5.336f, 7f, 5.75f)
            reflectiveCurveTo(6.664f, 6.5f, 6.25f, 6.5f)
            horizontalLineToRelative(-3f)
            curveTo(2.836f, 6.5f, 2.5f, 6.164f, 2.5f, 5.75f)
            verticalLineToRelative(-3f)
            curveTo(2.5f, 2.336f, 2.836f, 2f, 3.25f, 2f)
            reflectiveCurveTo(4f, 2.336f, 4f, 2.75f)
            verticalLineToRelative(0.778f)
            curveTo(5.061f, 2.578f, 6.463f, 2f, 8f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            curveToRelative(-3.025f, 0f, -5.526f, -2.238f, -5.94f, -5.148f)
            curveToRelative(-0.058f, -0.41f, 0.227f, -0.79f, 0.637f, -0.848f)
            curveToRelative(0.41f, -0.059f, 0.79f, 0.226f, 0.848f, 0.637f)
            curveTo(3.855f, 10.822f, 5.733f, 12.5f, 8f, 12.5f)
            curveToRelative(2.486f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            close()
        }
    }.build()
}
