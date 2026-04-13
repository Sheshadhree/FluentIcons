package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowEject20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowEject20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.598f, 5.2f)
            curveToRelative(0.2f, -0.267f, 0.6f, -0.267f, 0.8f, 0f)
            lineToRelative(4.499f, 6.001f)
            curveToRelative(0.247f, 0.33f, 0.012f, 0.8f, -0.4f, 0.8f)
            horizontalLineTo(5.503f)
            curveToRelative(-0.412f, 0f, -0.647f, -0.47f, -0.4f, -0.8f)
            lineToRelative(4.495f, -6f)
            close()
            moveToRelative(1.6f, -0.6f)
            curveToRelative(-0.6f, -0.8f, -1.8f, -0.8f, -2.4f, 0f)
            lineToRelative(-4.496f, 6.002f)
            curveToRelative(-0.74f, 0.989f, -0.035f, 2.4f, 1.2f, 2.4f)
            horizontalLineToRelative(8.995f)
            curveToRelative(1.236f, 0f, 1.941f, -1.412f, 1.2f, -2.4f)
            lineTo(11.199f, 4.6f)
            close()
            moveTo(4f, 15f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(3.724f, 16f, 4f, 16f)
            horizontalLineToRelative(12f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.276f, 15f, 16f, 15f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}
