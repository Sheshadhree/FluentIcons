package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Hexagon48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Hexagon48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.427f, 8.5f)
            curveToRelative(-0.272f, 0f, -0.523f, 0.148f, -0.655f, 0.385f)
            lineToRelative(-8.208f, 14.75f)
            curveToRelative(-0.126f, 0.227f, -0.126f, 0.503f, 0f, 0.73f)
            lineToRelative(8.208f, 14.75f)
            curveToRelative(0.132f, 0.237f, 0.383f, 0.385f, 0.655f, 0.385f)
            horizontalLineToRelative(17.148f)
            curveToRelative(0.272f, 0f, 0.523f, -0.148f, 0.656f, -0.385f)
            lineToRelative(8.207f, -14.75f)
            curveToRelative(0.126f, -0.227f, 0.126f, -0.503f, 0f, -0.73f)
            lineTo(33.23f, 8.885f)
            curveTo(33.098f, 8.648f, 32.847f, 8.5f, 32.575f, 8.5f)
            horizontalLineTo(15.427f)
            close()
            moveToRelative(-2.84f, -0.83f)
            curveTo(13.161f, 6.64f, 14.247f, 6f, 15.427f, 6f)
            horizontalLineToRelative(17.148f)
            curveToRelative(1.18f, 0f, 2.267f, 0.64f, 2.84f, 1.67f)
            lineToRelative(8.208f, 14.75f)
            curveToRelative(0.546f, 0.982f, 0.546f, 2.178f, 0f, 3.16f)
            lineToRelative(-8.208f, 14.75f)
            curveToRelative(-0.573f, 1.03f, -1.66f, 1.67f, -2.84f, 1.67f)
            horizontalLineTo(15.427f)
            curveToRelative(-1.18f, 0f, -2.266f, -0.64f, -2.84f, -1.67f)
            lineTo(4.38f, 25.58f)
            curveToRelative(-0.547f, -0.982f, -0.547f, -2.178f, 0f, -3.16f)
            lineToRelative(8.207f, -14.75f)
            close()
        }
    }.build()
}
