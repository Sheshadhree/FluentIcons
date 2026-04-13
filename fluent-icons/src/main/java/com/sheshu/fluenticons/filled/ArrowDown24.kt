package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.716f, 13.704f)
            curveToRelative(0.388f, -0.393f, 0.383f, -1.026f, -0.01f, -1.414f)
            curveToRelative(-0.394f, -0.387f, -1.027f, -0.383f, -1.415f, 0.01f)
            lineToRelative(-5.29f, 5.371f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            curveToRelative(-0.553f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(13.665f)
            lineTo(5.714f, 12.3f)
            curveToRelative(-0.387f, -0.394f, -1.02f, -0.398f, -1.414f, -0.01f)
            curveToRelative(-0.393f, 0.387f, -0.398f, 1.02f, -0.01f, 1.413f)
            lineToRelative(6.822f, 6.925f)
            curveToRelative(0.49f, 0.497f, 1.291f, 0.497f, 1.78f, 0f)
            lineToRelative(6.823f, -6.925f)
            close()
        }
    }.build()
}
