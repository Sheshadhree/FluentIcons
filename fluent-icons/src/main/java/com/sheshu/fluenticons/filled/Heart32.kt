package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Heart32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Heart32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.53f, 7.122f)
            curveTo(12.551f, 2.956f, 6.356f, 2.96f, 3.384f, 7.131f)
            curveToRelative(-2.056f, 2.883f, -1.801f, 6.814f, 0.609f, 9.409f)
            lineToRelative(11.275f, 12.14f)
            curveTo(15.457f, 28.884f, 15.722f, 29f, 16f, 29f)
            curveToRelative(0.278f, 0f, 0.543f, -0.116f, 0.732f, -0.319f)
            lineTo(28f, 16.583f)
            curveToRelative(2.437f, -2.616f, 2.681f, -6.59f, 0.584f, -9.485f)
            curveToRelative(-3.01f, -4.155f, -9.216f, -4.114f, -12.171f, 0.081f)
            lineToRelative(-0.417f, 0.593f)
            lineToRelative(-0.465f, -0.65f)
            close()
        }
    }.build()
}
