package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flag32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flag32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 3f)
            curveTo(5.672f, 3f, 5f, 3.672f, 5f, 4.5f)
            verticalLineTo(28f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-7f)
            horizontalLineToRelative(21f)
            curveToRelative(0.379f, 0f, 0.725f, -0.214f, 0.894f, -0.553f)
            curveToRelative(0.17f, -0.339f, 0.133f, -0.744f, -0.094f, -1.047f)
            lineTo(23.25f, 12f)
            lineToRelative(5.55f, -7.4f)
            curveToRelative(0.227f, -0.303f, 0.264f, -0.708f, 0.094f, -1.047f)
            curveTo(28.725f, 3.214f, 28.38f, 3f, 28f, 3f)
            horizontalLineTo(6.5f)
            close()
        }
    }.build()
}
