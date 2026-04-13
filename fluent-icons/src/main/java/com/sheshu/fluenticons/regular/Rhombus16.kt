package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Rhombus16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Rhombus16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.892f, 4.069f)
            curveTo(4.165f, 3.42f, 4.8f, 3f, 5.504f, 3f)
            horizontalLineToRelative(7.748f)
            curveToRelative(1.252f, 0f, 2.1f, 1.277f, 1.611f, 2.431f)
            lineToRelative(-2.747f, 6.502f)
            curveToRelative(-0.274f, 0.648f, -0.909f, 1.069f, -1.612f, 1.069f)
            horizontalLineTo(2.756f)
            curveToRelative(-1.253f, 0f, -2.1f, -1.278f, -1.612f, -2.432f)
            lineToRelative(2.748f, -6.5f)
            close()
            moveTo(5.504f, 4f)
            curveTo(5.202f, 4f, 4.93f, 4.18f, 4.813f, 4.458f)
            lineTo(2.065f, 10.96f)
            curveToRelative(-0.21f, 0.494f, 0.154f, 1.042f, 0.69f, 1.042f)
            horizontalLineToRelative(7.749f)
            curveToRelative(0.301f, 0f, 0.573f, -0.18f, 0.69f, -0.458f)
            lineToRelative(2.748f, -6.502f)
            curveTo(14.152f, 4.548f, 13.788f, 4f, 13.252f, 4f)
            horizontalLineTo(5.503f)
            close()
        }
    }.build()
}
