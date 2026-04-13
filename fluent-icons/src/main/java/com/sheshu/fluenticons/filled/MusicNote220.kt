package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MusicNote220: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MusicNote220",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.987f, 3.016f)
            curveToRelative(-0.096f, -0.586f, -0.695f, -0.974f, -1.285f, -0.79f)
            lineToRelative(-7f, 2.187f)
            curveTo(7.284f, 4.543f, 7f, 4.931f, 7f, 5.368f)
            verticalLineTo(13.5f)
            curveTo(6.582f, 13.186f, 6.063f, 13f, 5.5f, 13f)
            curveTo(4.12f, 13f, 3f, 14.12f, 3f, 15.5f)
            curveTo(3f, 16.881f, 4.12f, 18f, 5.5f, 18f)
            reflectiveCurveTo(8f, 16.881f, 8f, 15.5f)
            verticalLineTo(8.368f)
            lineToRelative(7f, -2.188f)
            verticalLineToRelative(5.32f)
            curveToRelative(-0.418f, -0.314f, -0.937f, -0.5f, -1.5f, -0.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            curveToRelative(0f, 1.381f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
            verticalLineTo(3.18f)
            curveToRelative(0f, -0.056f, -0.005f, -0.11f, -0.013f, -0.164f)
            close()
        }
    }.build()
}
