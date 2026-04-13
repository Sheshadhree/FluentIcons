package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Drop28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Drop28",
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
            moveTo(14f, 3.836f)
            curveToRelative(-0.809f, 0.873f, -2.257f, 2.535f, -3.63f, 4.546f)
            curveTo(8.567f, 11.018f, 7f, 14.105f, 7f, 16.75f)
            curveToRelative(0f, 2.736f, 0.818f, 4.654f, 2.05f, 5.886f)
            curveTo(10.286f, 23.872f, 12.018f, 24.5f, 14f, 24.5f)
            curveToRelative(1.982f, 0f, 3.714f, -0.628f, 4.95f, -1.864f)
            curveToRelative(1.232f, -1.232f, 2.05f, -3.15f, 2.05f, -5.886f)
            curveToRelative(0f, -2.645f, -1.568f, -5.732f, -3.37f, -8.368f)
            curveTo(16.258f, 6.37f, 14.81f, 4.709f, 14f, 3.836f)
            close()
        }
    }.build()
}
