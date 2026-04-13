package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowClockwise16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowClockwise16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 8f)
            curveToRelative(0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
            curveToRelative(1.332f, 0f, 2.53f, 0.579f, 3.354f, 1.5f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 5f, 9f, 5.336f, 9f, 5.75f)
            reflectiveCurveTo(9.336f, 6.5f, 9.75f, 6.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-3f)
            curveTo(13.5f, 2.336f, 13.164f, 2f, 12.75f, 2f)
            reflectiveCurveTo(12f, 2.336f, 12f, 2.75f)
            verticalLineToRelative(0.778f)
            curveTo(10.939f, 2.578f, 9.537f, 2f, 8f, 2f)
            curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            curveToRelative(3.025f, 0f, 5.526f, -2.238f, 5.94f, -5.148f)
            curveToRelative(0.058f, -0.41f, -0.227f, -0.79f, -0.637f, -0.848f)
            curveToRelative(-0.41f, -0.059f, -0.79f, 0.226f, -0.848f, 0.637f)
            curveTo(12.145f, 10.822f, 10.267f, 12.5f, 8f, 12.5f)
            curveToRelative(-2.485f, 0f, -4.5f, -2.015f, -4.5f, -4.5f)
            close()
        }
    }.build()
}
