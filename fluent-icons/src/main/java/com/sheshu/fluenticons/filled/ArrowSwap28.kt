package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSwap28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSwap28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.293f, 3.707f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineToRelative(5f, 5f)
            curveTo(22.895f, 7.48f, 23f, 7.735f, 23f, 8f)
            curveToRelative(0f, 0.265f, -0.105f, 0.52f, -0.293f, 0.707f)
            lineToRelative(-5f, 5f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineTo(19.586f, 9f)
            horizontalLineTo(6f)
            curveTo(5.448f, 9f, 5f, 8.552f, 5f, 8f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(13.586f)
            lineToRelative(-3.293f, -3.293f)
            close()
            moveToRelative(-4.586f, 12f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-5f, 5f)
            curveTo(5.105f, 19.48f, 5f, 19.735f, 5f, 20f)
            curveToRelative(0f, 0.265f, 0.105f, 0.52f, 0.293f, 0.707f)
            lineToRelative(5f, 5f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineTo(8.414f, 21f)
            horizontalLineTo(22f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(8.414f)
            lineToRelative(3.293f, -3.293f)
            close()
        }
    }.build()
}
