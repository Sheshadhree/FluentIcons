package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Megaphone24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Megaphone24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.907f, 5.622f)
            curveTo(21.969f, 5.83f, 22f, 6.046f, 22f, 6.263f)
            verticalLineTo(17.74f)
            curveToRelative(0f, 1.242f, -1.007f, 2.25f, -2.25f, 2.25f)
            curveToRelative(-0.217f, 0f, -0.433f, -0.032f, -0.641f, -0.094f)
            lineToRelative(-5.514f, -1.64f)
            curveTo(12.938f, 19.602f, 11.558f, 20.5f, 10f, 20.5f)
            curveToRelative(-2.142f, 0f, -3.891f, -1.683f, -3.995f, -3.8f)
            lineTo(6f, 16.5f)
            lineTo(5.999f, 16f)
            lineToRelative(-2.39f, -0.711f)
            curveTo(2.655f, 15.004f, 2f, 14.127f, 2f, 13.131f)
            verticalLineTo(10.87f)
            curveToRelative(0f, -0.995f, 0.655f, -1.873f, 1.61f, -2.156f)
            lineToRelative(15.5f, -4.606f)
            curveToRelative(1.19f, -0.355f, 2.443f, 0.324f, 2.797f, 1.515f)
            close()
            moveTo(7.499f, 16.445f)
            lineTo(7.5f, 16.499f)
            curveTo(7.5f, 17.88f, 8.62f, 19f, 10f, 19f)
            curveToRelative(0.885f, 0f, 1.678f, -0.464f, 2.124f, -1.179f)
            lineToRelative(-4.625f, -1.375f)
            close()
        }
    }.build()
}
