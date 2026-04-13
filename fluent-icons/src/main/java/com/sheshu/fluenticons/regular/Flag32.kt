package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Flag32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Flag32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4.5f)
            curveTo(5f, 3.672f, 5.672f, 3f, 6.5f, 3f)
            horizontalLineTo(28f)
            curveToRelative(0.379f, 0f, 0.725f, 0.214f, 0.894f, 0.553f)
            curveToRelative(0.17f, 0.339f, 0.133f, 0.744f, -0.094f, 1.047f)
            lineTo(23.25f, 12f)
            lineToRelative(5.55f, 7.4f)
            curveToRelative(0.227f, 0.303f, 0.264f, 0.708f, 0.094f, 1.047f)
            curveTo(28.725f, 20.786f, 28.38f, 21f, 28f, 21f)
            horizontalLineTo(7f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineTo(4.5f)
            close()
            moveTo(7f, 19f)
            horizontalLineToRelative(19f)
            lineToRelative(-4.8f, -6.4f)
            curveToRelative(-0.267f, -0.356f, -0.267f, -0.844f, 0f, -1.2f)
            lineTo(26f, 5f)
            horizontalLineTo(7f)
            verticalLineToRelative(14f)
            close()
        }
    }.build()
}
