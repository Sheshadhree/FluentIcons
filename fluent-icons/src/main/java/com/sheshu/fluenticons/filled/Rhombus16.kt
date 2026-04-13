package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Rhombus16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rhombus16",
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
        }
    }.build()
}
