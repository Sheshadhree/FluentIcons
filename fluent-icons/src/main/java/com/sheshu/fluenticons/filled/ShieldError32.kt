package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShieldError32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShieldError32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.445f, 2.168f)
            curveToRelative(0.336f, -0.224f, 0.774f, -0.224f, 1.11f, 0f)
            curveToRelative(2.916f, 1.944f, 6.76f, 3.858f, 11.545f, 4.337f)
            curveTo(28.61f, 6.556f, 29f, 6.986f, 29f, 7.5f)
            verticalLineTo(16f)
            curveToRelative(0f, 3.88f, -2.124f, 7.169f, -4.701f, 9.546f)
            curveToRelative(-2.572f, 2.372f, -5.736f, 3.971f, -8.114f, 4.417f)
            lineTo(16f, 29.997f)
            lineToRelative(-0.185f, -0.034f)
            curveToRelative(-2.377f, -0.446f, -5.542f, -2.045f, -8.114f, -4.417f)
            curveTo(5.124f, 23.169f, 3f, 19.88f, 3f, 16f)
            verticalLineTo(7.5f)
            curveToRelative(0f, -0.514f, 0.39f, -0.944f, 0.9f, -0.995f)
            curveToRelative(4.785f, -0.479f, 8.63f, -2.393f, 11.545f, -4.337f)
            close()
            moveTo(16f, 21.5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(16f, 8f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
        }
    }.build()
}
