package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.284f, 10.295f)
            curveToRelative(-0.388f, 0.393f, -0.383f, 1.027f, 0.01f, 1.414f)
            curveToRelative(0.394f, 0.388f, 1.027f, 0.383f, 1.414f, -0.01f)
            lineTo(11f, 6.329f)
            verticalLineToRelative(13.67f)
            curveToRelative(0f, 0.553f, 0.447f, 1f, 1f, 1f)
            curveToRelative(0.552f, 0f, 1f, -0.447f, 1f, -1f)
            verticalLineTo(6.335f)
            lineToRelative(5.285f, 5.364f)
            curveToRelative(0.387f, 0.393f, 1.02f, 0.398f, 1.414f, 0.01f)
            curveToRelative(0.393f, -0.387f, 0.398f, -1.02f, 0.01f, -1.414f)
            lineTo(12.887f, 3.37f)
            curveToRelative(-0.49f, -0.497f, -1.291f, -0.497f, -1.78f, 0f)
            lineToRelative(-6.823f, 6.924f)
            close()
        }
    }.build()
}
