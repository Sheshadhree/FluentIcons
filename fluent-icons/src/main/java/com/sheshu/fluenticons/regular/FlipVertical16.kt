package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlipVertical16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlipVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.763f, 1.075f)
            curveTo(12.91f, 1.165f, 13f, 1.327f, 13f, 1.5f)
            verticalLineToRelative(5f)
            curveTo(13f, 6.776f, 12.776f, 7f, 12.5f, 7f)
            horizontalLineToRelative(-10f)
            curveTo(2.268f, 7f, 2.067f, 6.84f, 2.013f, 6.615f)
            curveTo(1.96f, 6.389f, 2.07f, 6.157f, 2.276f, 6.053f)
            lineToRelative(10f, -5f)
            curveToRelative(0.155f, -0.078f, 0.34f, -0.07f, 0.487f, 0.022f)
            close()
            moveTo(4.618f, 6f)
            horizontalLineTo(12f)
            verticalLineTo(2.309f)
            lineTo(4.618f, 6f)
            close()
            moveTo(13f, 14.5f)
            curveToRelative(0f, 0.173f, -0.09f, 0.334f, -0.237f, 0.425f)
            curveToRelative(-0.147f, 0.091f, -0.332f, 0.1f, -0.487f, 0.022f)
            lineToRelative(-10f, -5f)
            curveTo(2.07f, 9.844f, 1.96f, 9.611f, 2.013f, 9.385f)
            curveTo(2.067f, 9.16f, 2.268f, 9f, 2.5f, 9f)
            horizontalLineToRelative(10f)
            curveTo(12.776f, 9f, 13f, 9.224f, 13f, 9.5f)
            verticalLineToRelative(5f)
            close()
        }
    }.build()
}
