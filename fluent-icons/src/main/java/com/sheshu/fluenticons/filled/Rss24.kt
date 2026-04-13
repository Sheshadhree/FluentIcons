package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Rss24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rss24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveToRelative(0.5f, 4.5f)
            curveTo(6.345f, 7.5f, 6f, 7.183f, 6f, 6.778f)
            verticalLineTo(6.723f)
            curveTo(6f, 6.33f, 6.305f, 6.002f, 6.698f, 6f)
            horizontalLineTo(6.75f)
            curveTo(12.963f, 6f, 18f, 11.037f, 18f, 17.25f)
            verticalLineToRelative(0.052f)
            curveTo(17.998f, 17.695f, 17.67f, 18f, 17.277f, 18f)
            horizontalLineToRelative(-0.055f)
            curveToRelative(-0.405f, 0f, -0.722f, -0.345f, -0.722f, -0.75f)
            curveToRelative(0f, -5.385f, -4.365f, -9.75f, -9.75f, -9.75f)
            close()
            moveTo(13.294f, 18f)
            horizontalLineToRelative(-0.09f)
            curveToRelative(-0.399f, 0f, -0.704f, -0.351f, -0.704f, -0.75f)
            curveToRelative(0f, -3.176f, -2.574f, -5.75f, -5.75f, -5.75f)
            curveTo(6.351f, 11.5f, 6f, 11.195f, 6f, 10.796f)
            verticalLineToRelative(-0.09f)
            curveToRelative(0f, -0.38f, 0.287f, -0.701f, 0.666f, -0.705f)
            lineTo(6.75f, 10f)
            curveToRelative(4.004f, 0f, 7.25f, 3.246f, 7.25f, 7.25f)
            verticalLineToRelative(0.084f)
            curveTo(13.994f, 17.713f, 13.672f, 18f, 13.293f, 18f)
            close()
            moveTo(7.5f, 18f)
            curveTo(6.672f, 18f, 6f, 17.328f, 6f, 16.5f)
            reflectiveCurveTo(6.672f, 15f, 7.5f, 15f)
            reflectiveCurveTo(9f, 15.672f, 9f, 16.5f)
            reflectiveCurveTo(8.328f, 18f, 7.5f, 18f)
            close()
        }
    }.build()
}
