package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flash16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flash16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.873f, 1f)
            curveTo(5.43f, 1f, 5.04f, 1.29f, 4.915f, 1.714f)
            lineTo(3.03f, 8.036f)
            curveTo(2.887f, 8.516f, 3.248f, 9f, 3.749f, 9f)
            horizontalLineToRelative(1.584f)
            lineToRelative(-1.28f, 4.389f)
            curveToRelative(-0.384f, 1.316f, 1.324f, 2.2f, 2.178f, 1.128f)
            lineToRelative(6.607f, -8.3f)
            curveTo(13.229f, 5.726f, 12.879f, 5f, 12.25f, 5f)
            horizontalLineToRelative(-2.03f)
            lineToRelative(0.994f, -2.649f)
            curveTo(11.46f, 1.697f, 10.977f, 1f, 10.279f, 1f)
            horizontalLineTo(5.873f)
            close()
        }
    }.build()
}
