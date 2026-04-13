package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HandPoint16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HandPoint16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 0.998f)
            curveTo(6.894f, 0.998f, 5.997f, 1.894f, 5.997f, 3f)
            verticalLineToRelative(4.205f)
            lineTo(5.371f, 6.927f)
            curveToRelative(-1.47f, -0.652f, -3.194f, -0.221f, -4.185f, 1.045f)
            curveTo(0.828f, 8.43f, 1.011f, 9.092f, 1.53f, 9.32f)
            curveToRelative(2f, 0.877f, 3.206f, 1.604f, 3.985f, 2.268f)
            curveToRelative(0.765f, 0.65f, 1.134f, 1.252f, 1.44f, 1.918f)
            curveToRelative(0.456f, 0.993f, 1.483f, 1.62f, 2.6f, 1.47f)
            lineToRelative(2.07f, -0.28f)
            curveToRelative(1.015f, -0.137f, 1.844f, -0.88f, 2.092f, -1.873f)
            lineToRelative(0.681f, -2.733f)
            curveToRelative(0.498f, -1.997f, -0.827f, -3.99f, -2.86f, -4.305f)
            lineTo(10f, 5.546f)
            verticalLineTo(2.999f)
            curveToRelative(0f, -1.105f, -0.896f, -2.001f, -2.001f, -2.001f)
            close()
        }
    }.build()
}
