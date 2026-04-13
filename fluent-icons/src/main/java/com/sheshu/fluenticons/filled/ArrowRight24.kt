package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.704f, 4.284f)
            curveToRelative(-0.393f, -0.388f, -1.026f, -0.383f, -1.414f, 0.01f)
            curveToRelative(-0.387f, 0.394f, -0.383f, 1.027f, 0.01f, 1.414f)
            lineTo(17.672f, 11f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, 0.447f, -1f, 1f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(13.665f)
            lineTo(12.3f, 18.285f)
            curveToRelative(-0.394f, 0.387f, -0.398f, 1.02f, -0.01f, 1.414f)
            curveToRelative(0.387f, 0.393f, 1.02f, 0.398f, 1.413f, 0.01f)
            lineToRelative(6.925f, -6.822f)
            curveToRelative(0.497f, -0.49f, 0.497f, -1.291f, 0f, -1.78f)
            lineToRelative(-6.925f, -6.823f)
            close()
        }
    }.build()
}
