package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowEject20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowEject20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.199f, 4.6f)
            curveToRelative(-0.6f, -0.8f, -1.801f, -0.8f, -2.401f, 0f)
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
