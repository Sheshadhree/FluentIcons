package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentPill20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentPill20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            verticalLineToRelative(4.5f)
            curveTo(10f, 7.328f, 10.672f, 8f, 11.5f, 8f)
            horizontalLineTo(16f)
            verticalLineToRelative(0.913f)
            curveToRelative(-0.754f, 0.105f, -1.481f, 0.447f, -2.06f, 1.027f)
            lineToRelative(-4f, 4f)
            curveToRelative(-1.1f, 1.098f, -1.345f, 2.725f, -0.738f, 4.06f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 18f, 4f, 17.328f, 4f, 16.5f)
            verticalLineToRelative(-13f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineTo(10f)
            close()
            moveToRelative(1f, 0.25f)
            verticalLineTo(6.5f)
            curveTo(11f, 6.776f, 11.224f, 7f, 11.5f, 7f)
            horizontalLineToRelative(4.25f)
            lineTo(11f, 2.25f)
            close()
            moveToRelative(7.354f, 8.397f)
            curveToRelative(-1.024f, -1.024f, -2.684f, -1.024f, -3.708f, 0f)
            lineToRelative(-4f, 4f)
            curveToRelative(-1.023f, 1.023f, -1.023f, 2.683f, 0f, 3.707f)
            curveToRelative(1.024f, 1.024f, 2.684f, 1.024f, 3.707f, 0f)
            lineToRelative(4f, -4f)
            curveToRelative(1.024f, -1.024f, 1.024f, -2.684f, 0f, -3.707f)
            close()
            moveToRelative(-3f, 0.707f)
            curveToRelative(0.633f, -0.633f, 1.66f, -0.633f, 2.292f, 0f)
            curveToRelative(0.634f, 0.633f, 0.634f, 1.66f, 0f, 2.293f)
            lineTo(16f, 15.293f)
            lineTo(13.707f, 13f)
            lineToRelative(1.646f, -1.646f)
            close()
            moveToRelative(-1.5f, 4.292f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-1f, 1f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(1f, -1f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            close()
        }
    }.build()
}
