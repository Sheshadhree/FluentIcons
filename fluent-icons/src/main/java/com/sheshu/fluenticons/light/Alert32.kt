package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Alert32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Alert32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 4f)
            curveToRelative(-4.971f, 0f, -9f, 4.03f, -9f, 9f)
            verticalLineToRelative(4.804f)
            lineToRelative(-1.93f, 4.825f)
            curveTo(4.807f, 23.285f, 5.29f, 24f, 5.998f, 24f)
            horizontalLineTo(12f)
            curveToRelative(0f, 2.21f, 1.791f, 4f, 4f, 4f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            horizontalLineToRelative(6.002f)
            curveToRelative(0.707f, 0f, 1.191f, -0.715f, 0.928f, -1.371f)
            lineTo(25f, 17.804f)
            verticalLineTo(13f)
            curveToRelative(0f, -4.97f, -4.029f, -9f, -9f, -9f)
            close()
            moveToRelative(3f, 20f)
            curveToRelative(0f, 1.657f, -1.344f, 3f, -3f, 3f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            horizontalLineToRelative(6f)
            close()
            moveTo(8f, 13f)
            curveToRelative(0f, -4.418f, 3.581f, -8f, 8f, -8f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            verticalLineToRelative(4.804f)
            curveToRelative(0f, 0.127f, 0.024f, 0.253f, 0.071f, 0.371f)
            lineTo(26.001f, 23f)
            horizontalLineTo(5.998f)
            lineToRelative(1.93f, -4.825f)
            curveTo(7.975f, 18.057f, 8f, 17.931f, 8f, 17.804f)
            verticalLineTo(13f)
            close()
        }
    }.build()
}
