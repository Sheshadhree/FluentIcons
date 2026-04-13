package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TagLockAccent32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagLockAccent32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.684f, 4f)
            curveToRelative(-0.76f, 0f, -1.494f, 0.29f, -2.05f, 0.81f)
            lineTo(4.455f, 16.203f)
            curveToRelative(-1.342f, 1.256f, -1.377f, 3.373f, -0.078f, 4.672f)
            lineToRelative(6.326f, 6.326f)
            curveToRelative(1.174f, 1.174f, 3.023f, 1.262f, 4.298f, 0.264f)
            verticalLineTo(22f)
            curveToRelative(0f, -1.892f, 1.314f, -3.478f, 3.08f, -3.894f)
            curveTo(18.5f, 15.771f, 20.542f, 14f, 23f, 14f)
            curveToRelative(1.508f, 0f, 2.86f, 0.668f, 3.776f, 1.723f)
            lineToRelative(0.345f, -0.344f)
            curveTo(27.684f, 14.816f, 28f, 14.053f, 28f, 13.257f)
            verticalLineTo(6.5f)
            curveTo(28f, 5.12f, 26.88f, 4f, 25.5f, 4f)
            horizontalLineToRelative(-6.816f)
            close()
        }
    }.build()
}
