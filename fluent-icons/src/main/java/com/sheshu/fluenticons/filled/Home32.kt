package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Home32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Home32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.895f, 2.777f)
            curveToRelative(1.214f, -1.032f, 2.996f, -1.032f, 4.21f, 0f)
            lineToRelative(9.75f, 8.287f)
            curveTo(28.58f, 11.682f, 29f, 12.587f, 29f, 13.54f)
            verticalLineTo(26.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineTo(20f)
            curveToRelative(0f, -1.102f, -0.89f, -1.995f, -1.991f, -2f)
            horizontalLineTo(13.99f)
            curveTo(12.891f, 18.005f, 12f, 18.898f, 12f, 20f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-4f)
            curveTo(4.12f, 29f, 3f, 27.88f, 3f, 26.5f)
            verticalLineTo(13.54f)
            curveToRelative(0f, -0.953f, 0.419f, -1.858f, 1.145f, -2.476f)
            lineToRelative(9.75f, -8.287f)
            close()
        }
    }.build()
}
