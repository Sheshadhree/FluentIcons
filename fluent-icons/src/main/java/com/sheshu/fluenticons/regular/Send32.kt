package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Send32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Send32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.078f, 3.965f)
            curveTo(1.672f, 2.7f, 2.988f, 1.57f, 4.177f, 2.164f)
            lineToRelative(24.994f, 12.495f)
            curveToRelative(1.106f, 0.553f, 1.106f, 2.13f, 0f, 2.684f)
            lineTo(4.177f, 29.838f)
            curveToRelative(-1.188f, 0.594f, -2.505f, -0.536f, -2.099f, -1.801f)
            lineTo(5.95f, 16.001f)
            lineTo(2.078f, 3.965f)
            close()
            moveToRelative(5.65f, 13.036f)
            lineTo(4.347f, 27.517f)
            lineToRelative(23.037f, -11.516f)
            lineTo(4.346f, 4.485f)
            lineTo(7.73f, 15f)
            horizontalLineTo(19f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(7.73f)
            close()
        }
    }.build()
}
