package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextQuote20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextQuote20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 6.5f)
            curveTo(9f, 5.12f, 7.88f, 4f, 6.5f, 4f)
            reflectiveCurveTo(4f, 5.12f, 4f, 6.5f)
            reflectiveCurveTo(5.12f, 9f, 6.5f, 9f)
            curveToRelative(0.487f, 0f, 0.942f, -0.14f, 1.326f, -0.38f)
            curveToRelative(-0.195f, 1.117f, -0.54f, 2.016f, -0.952f, 2.764f)
            curveToRelative(-0.649f, 1.18f, -1.476f, 2.011f, -2.228f, 2.762f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(0.011f, -0.012f)
            curveToRelative(0.747f, -0.747f, 1.664f, -1.664f, 2.386f, -2.976f)
            curveTo(8.48f, 10.538f, 9f, 8.83f, 9f, 6.5f)
            close()
            moveToRelative(5.826f, 2.12f)
            curveTo(14.442f, 8.86f, 13.987f, 9f, 13.5f, 9f)
            curveTo(12.12f, 9f, 11f, 7.88f, 11f, 6.5f)
            reflectiveCurveTo(12.12f, 4f, 13.5f, 4f)
            reflectiveCurveTo(16f, 5.12f, 16f, 6.5f)
            curveToRelative(0f, 2.33f, -0.52f, 4.038f, -1.25f, 5.366f)
            curveToRelative(-0.721f, 1.312f, -1.638f, 2.23f, -2.384f, 2.976f)
            lineToRelative(-0.012f, 0.012f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.752f, -0.751f, 1.579f, -1.581f, 2.228f, -2.762f)
            curveToRelative(0.412f, -0.748f, 0.757f, -1.648f, 0.952f, -2.764f)
            close()
        }
    }.build()
}
