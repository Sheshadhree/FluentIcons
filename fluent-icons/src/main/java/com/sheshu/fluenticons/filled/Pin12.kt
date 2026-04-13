package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pin12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pin12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.052f, 1.436f)
            curveTo(7.342f, 0.726f, 6.15f, 0.9f, 5.672f, 1.783f)
            lineTo(4.145f, 4.608f)
            lineToRelative(-2.33f, 0.928f)
            curveTo(1.659f, 5.598f, 1.545f, 5.735f, 1.51f, 5.9f)
            curveTo(1.476f, 6.064f, 1.528f, 6.235f, 1.647f, 6.354f)
            lineToRelative(1.646f, 1.647f)
            lineToRelative(-2.146f, 2.146f)
            lineTo(1f, 11.001f)
            lineToRelative(0.854f, -0.147f)
            lineTo(4f, 8.708f)
            lineToRelative(1.646f, 1.646f)
            curveToRelative(0.12f, 0.119f, 0.29f, 0.17f, 0.455f, 0.136f)
            curveToRelative(0.164f, -0.034f, 0.3f, -0.148f, 0.363f, -0.304f)
            lineToRelative(0.933f, -2.332f)
            lineToRelative(2.821f, -1.526f)
            curveToRelative(0.883f, -0.477f, 1.057f, -1.67f, 0.347f, -2.38f)
            lineTo(8.052f, 1.436f)
            close()
        }
    }.build()
}
