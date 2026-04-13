package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CallEnd20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CallEnd20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.96f, 10.94f)
            lineToRelative(-0.16f, 0.83f)
            curveToRelative(-0.147f, 0.776f, -0.874f, 1.298f, -1.697f, 1.218f)
            lineToRelative(-1.637f, -0.158f)
            curveToRelative(-0.714f, -0.069f, -1.243f, -0.59f, -1.467f, -1.33f)
            curveToRelative(-0.304f, -1.005f, -0.5f, -1.75f, -0.5f, -1.75f)
            curveToRelative(-0.748f, -0.306f, -1.486f, -0.5f, -2.5f, -0.5f)
            reflectiveCurveToRelative(-1.738f, 0.215f, -2.5f, 0.5f)
            curveToRelative(0f, 0f, -0.204f, 0.746f, -0.5f, 1.75f)
            curveToRelative(-0.198f, 0.67f, -0.504f, 1.257f, -1.203f, 1.327f)
            lineTo(4.17f, 12.99f)
            curveToRelative(-0.812f, 0.081f, -1.591f, -0.436f, -1.822f, -1.21f)
            lineTo(2.1f, 10.951f)
            curveToRelative(-0.246f, -0.825f, -0.026f, -1.693f, 0.577f, -2.28f)
            curveToRelative(1.425f, -1.384f, 3.99f, -2.164f, 7.316f, -2.168f)
            curveToRelative(3.332f, -0.004f, 5.594f, 0.772f, 7.162f, 2.156f)
            curveToRelative(0.66f, 0.582f, 0.962f, 1.458f, 0.805f, 2.28f)
            close()
        }
    }.build()
}
