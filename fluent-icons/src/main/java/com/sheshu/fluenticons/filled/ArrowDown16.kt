package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(8.787f)
            lineToRelative(2.941f, -3.287f)
            curveToRelative(0.276f, -0.309f, 0.75f, -0.335f, 1.06f, -0.059f)
            curveToRelative(0.308f, 0.276f, 0.334f, 0.75f, 0.058f, 1.06f)
            lineTo(8.559f, 14f)
            curveTo(8.417f, 14.158f, 8.213f, 14.25f, 8f, 14.25f)
            curveToRelative(-0.213f, 0f, -0.417f, -0.09f, -0.559f, -0.25f)
            lineToRelative(-4.25f, -4.75f)
            curveTo(2.915f, 8.941f, 2.941f, 8.467f, 3.25f, 8.191f)
            curveToRelative(0.309f, -0.276f, 0.783f, -0.25f, 1.059f, 0.059f)
            lineToRelative(2.941f, 3.287f)
            verticalLineTo(2.75f)
            curveTo(7.25f, 2.336f, 7.586f, 2f, 8f, 2f)
            close()
        }
    }.build()
}
