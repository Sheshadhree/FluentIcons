package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlipHorizontal16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlipHorizontal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.925f, 12.763f)
            curveTo(14.835f, 12.91f, 14.673f, 13f, 14.5f, 13f)
            horizontalLineToRelative(-5f)
            curveTo(9.224f, 13f, 9f, 12.776f, 9f, 12.5f)
            verticalLineToRelative(-10f)
            curveToRelative(0f, -0.232f, 0.16f, -0.433f, 0.385f, -0.487f)
            curveTo(9.611f, 1.96f, 9.844f, 2.07f, 9.947f, 2.276f)
            lineToRelative(5f, 10f)
            curveToRelative(0.078f, 0.155f, 0.07f, 0.34f, -0.022f, 0.487f)
            close()
            moveTo(10f, 4.618f)
            verticalLineTo(12f)
            horizontalLineToRelative(3.691f)
            lineTo(10f, 4.618f)
            close()
            moveTo(1.5f, 13f)
            curveToRelative(-0.173f, 0f, -0.334f, -0.09f, -0.425f, -0.237f)
            curveToRelative(-0.091f, -0.147f, -0.1f, -0.332f, -0.022f, -0.487f)
            lineToRelative(5f, -10f)
            curveTo(6.157f, 2.07f, 6.389f, 1.96f, 6.615f, 2.013f)
            curveTo(6.84f, 2.067f, 7f, 2.268f, 7f, 2.5f)
            verticalLineToRelative(10f)
            curveTo(7f, 12.776f, 6.776f, 13f, 6.5f, 13f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
