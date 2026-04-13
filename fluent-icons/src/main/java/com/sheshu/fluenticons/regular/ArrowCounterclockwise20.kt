package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCounterclockwise20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCounterclockwise20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 10f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            curveToRelative(-1.777f, 0f, -3.373f, 0.772f, -4.472f, 2f)
            horizontalLineTo(7.5f)
            curveTo(7.776f, 6f, 8f, 6.224f, 8f, 6.5f)
            reflectiveCurveTo(7.776f, 7f, 7.5f, 7f)
            horizontalLineToRelative(-3f)
            curveTo(4.224f, 7f, 4f, 6.776f, 4f, 6.5f)
            verticalLineToRelative(-3f)
            curveTo(4f, 3.224f, 4.224f, 3f, 4.5f, 3f)
            reflectiveCurveTo(5f, 3.224f, 5f, 3.5f)
            verticalLineToRelative(1.601f)
            curveTo(6.27f, 3.805f, 8.04f, 3f, 10f, 3f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            curveToRelative(0f, -0.18f, 0.007f, -0.36f, 0.02f, -0.538f)
            curveToRelative(0.021f, -0.275f, 0.261f, -0.482f, 0.537f, -0.46f)
            curveToRelative(0.275f, 0.02f, 0.481f, 0.26f, 0.46f, 0.536f)
            curveTo(4.006f, 9.69f, 4f, 9.844f, 4f, 10f)
            curveToRelative(0f, 3.314f, 2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            close()
        }
    }.build()
}
