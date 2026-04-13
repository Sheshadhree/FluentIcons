package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 14f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(4.463f)
            lineTo(4.309f, 7.75f)
            curveToRelative(-0.276f, 0.31f, -0.75f, 0.335f, -1.06f, 0.06f)
            curveToRelative(-0.308f, -0.276f, -0.334f, -0.75f, -0.058f, -1.06f)
            lineTo(7.441f, 2f)
            curveTo(7.583f, 1.842f, 7.787f, 1.75f, 8f, 1.75f)
            curveToRelative(0.213f, 0f, 0.417f, 0.09f, 0.559f, 0.25f)
            lineToRelative(4.25f, 4.75f)
            curveToRelative(0.276f, 0.309f, 0.25f, 0.783f, -0.059f, 1.059f)
            curveToRelative(-0.309f, 0.276f, -0.783f, 0.25f, -1.059f, -0.059f)
            lineTo(8.75f, 4.463f)
            verticalLineToRelative(8.787f)
            curveTo(8.75f, 13.664f, 8.414f, 14f, 8f, 14f)
            close()
        }
    }.build()
}
