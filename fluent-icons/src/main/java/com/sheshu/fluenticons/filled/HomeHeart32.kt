package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HomeHeart32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HomeHeart32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.105f, 2.777f)
            curveToRelative(-1.214f, -1.032f, -2.996f, -1.032f, -4.21f, 0f)
            lineToRelative(-9.75f, 8.287f)
            curveTo(3.42f, 11.682f, 3f, 12.587f, 3f, 13.54f)
            verticalLineTo(26.5f)
            curveTo(3f, 27.88f, 4.12f, 29f, 5.5f, 29f)
            horizontalLineToRelative(12.61f)
            lineToRelative(-3.986f, -4.293f)
            curveToRelative(-2.247f, -2.42f, -2.152f, -6.246f, 0.22f, -8.545f)
            curveToRelative(2.32f, -2.247f, 5.91f, -2.18f, 8.153f, 0.002f)
            curveToRelative(1.758f, -1.713f, 4.348f, -2.124f, 6.503f, -1.138f)
            verticalLineTo(13.54f)
            curveToRelative(0f, -0.953f, -0.419f, -1.858f, -1.145f, -2.476f)
            lineToRelative(-9.75f, -8.287f)
            close()
            moveToRelative(4.392f, 15.726f)
            lineToRelative(-0.646f, -0.818f)
            curveToRelative(-1.618f, -2.053f, -4.592f, -2.258f, -6.463f, -0.446f)
            curveToRelative(-1.784f, 1.73f, -1.858f, 4.623f, -0.165f, 6.447f)
            lineToRelative(6.459f, 6.955f)
            curveToRelative(0.444f, 0.478f, 1.186f, 0.479f, 1.63f, 0f)
            lineToRelative(6.462f, -6.949f)
            curveToRelative(1.698f, -1.826f, 1.623f, -4.726f, -0.167f, -6.457f)
            curveToRelative(-1.872f, -1.81f, -4.846f, -1.604f, -6.464f, 0.449f)
            lineToRelative(-0.646f, 0.82f)
            close()
        }
    }.build()
}
