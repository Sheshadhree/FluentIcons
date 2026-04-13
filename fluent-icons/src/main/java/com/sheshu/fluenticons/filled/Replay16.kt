package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Replay16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Replay16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 3.668f)
            verticalLineTo(2.5f)
            curveTo(2.5f, 2.224f, 2.276f, 2f, 2f, 2f)
            reflectiveCurveTo(1.5f, 2.224f, 1.5f, 2.5f)
            verticalLineToRelative(3f)
            curveTo(1.5f, 5.776f, 1.724f, 6f, 2f, 6f)
            horizontalLineToRelative(2.5f)
            curveTo(4.776f, 6f, 5f, 5.776f, 5f, 5.5f)
            reflectiveCurveTo(4.776f, 5f, 4.5f, 5f)
            horizontalLineTo(2.802f)
            curveToRelative(1.037f, -1.793f, 2.976f, -3f, 5.197f, -3f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            curveToRelative(-3.145f, 0f, -5.725f, -2.42f, -5.98f, -5.5f)
            curveTo(1.998f, 8.225f, 1.776f, 8f, 1.5f, 8f)
            reflectiveCurveTo(0.997f, 8.225f, 1.017f, 8.5f)
            curveTo(1.273f, 12.133f, 4.3f, 15f, 7.999f, 15f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            curveTo(5.77f, 1f, 3.782f, 2.043f, 2.5f, 3.668f)
            close()
            moveToRelative(4.996f, 1.465f)
            curveTo(6.83f, 4.753f, 6f, 5.233f, 6f, 6.002f)
            verticalLineToRelative(3.997f)
            curveToRelative(0f, 0.768f, 0.83f, 1.25f, 1.496f, 0.869f)
            lineToRelative(3.498f, -2f)
            curveToRelative(0.672f, -0.383f, 0.672f, -1.352f, 0f, -1.736f)
            lineTo(7.496f, 5.133f)
            close()
        }
    }.build()
}
