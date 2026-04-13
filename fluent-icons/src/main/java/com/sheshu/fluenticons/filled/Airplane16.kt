package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Airplane16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Airplane16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.907f, 1f)
            curveTo(7.35f, 1f, 6.924f, 1.497f, 7.008f, 2.047f)
            lineTo(7.69f, 6.481f)
            lineTo(5.806f, 6.652f)
            lineTo(4.567f, 4.485f)
            curveTo(4.396f, 4.185f, 4.077f, 4f, 3.731f, 4f)
            curveTo(3.328f, 4f, 3f, 4.327f, 3f, 4.731f)
            verticalLineToRelative(2.176f)
            lineTo(1.974f, 7f)
            curveTo(1.433f, 7.014f, 1f, 7.457f, 1f, 8f)
            curveToRelative(0f, 0.543f, 0.433f, 0.986f, 0.974f, 1f)
            lineTo(3f, 9.093f)
            verticalLineToRelative(2.176f)
            curveTo(3f, 11.672f, 3.328f, 12f, 3.731f, 12f)
            curveToRelative(0.346f, 0f, 0.665f, -0.185f, 0.836f, -0.485f)
            lineToRelative(1.239f, -2.167f)
            lineTo(7.69f, 9.519f)
            lineToRelative(-0.682f, 4.434f)
            curveTo(6.924f, 14.503f, 7.35f, 15f, 7.907f, 15f)
            curveToRelative(0.514f, 0f, 0.98f, -0.299f, 1.196f, -0.766f)
            lineToRelative(2.032f, -4.402f)
            curveTo(11.75f, 9.888f, 12.382f, 10f, 13f, 10f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            curveToRelative(-0.618f, 0f, -1.25f, 0.112f, -1.865f, 0.168f)
            lineTo(9.103f, 1.766f)
            curveTo(8.888f, 1.299f, 8.421f, 1f, 7.907f, 1f)
            close()
        }
    }.build()
}
