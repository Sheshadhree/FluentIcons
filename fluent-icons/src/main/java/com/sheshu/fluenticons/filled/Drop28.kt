package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Drop28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Drop28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.47f, 2.22f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.523f, 0.523f, 2.494f, 2.614f, 4.34f, 5.315f)
            curveToRelative(1.823f, 2.67f, 3.63f, 6.083f, 3.63f, 9.215f)
            curveToRelative(0f, 3.041f, -0.917f, 5.374f, -2.49f, 6.947f)
            curveTo(18.442f, 25.267f, 16.299f, 26f, 14f, 26f)
            curveToRelative(-2.298f, 0f, -4.441f, -0.733f, -6.01f, -2.303f)
            curveTo(6.416f, 22.124f, 5.5f, 19.79f, 5.5f, 16.75f)
            curveToRelative(0f, -3.132f, 1.807f, -6.545f, 3.63f, -9.215f)
            curveToRelative(1.846f, -2.7f, 3.817f, -4.792f, 4.34f, -5.315f)
            close()
        }
    }.build()
}
