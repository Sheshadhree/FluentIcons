package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 8f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(4.463f)
            lineToRelative(3.287f, 2.941f)
            curveToRelative(0.309f, 0.276f, 0.335f, 0.75f, 0.059f, 1.06f)
            curveToRelative(-0.276f, 0.308f, -0.75f, 0.334f, -1.06f, 0.058f)
            lineTo(2f, 8.559f)
            curveTo(1.842f, 8.417f, 1.75f, 8.213f, 1.75f, 8f)
            curveToRelative(0f, -0.213f, 0.09f, -0.417f, 0.25f, -0.559f)
            lineToRelative(4.75f, -4.25f)
            curveToRelative(0.309f, -0.276f, 0.783f, -0.25f, 1.059f, 0.059f)
            curveToRelative(0.276f, 0.309f, 0.25f, 0.783f, -0.059f, 1.059f)
            lineTo(4.463f, 7.25f)
            horizontalLineToRelative(8.787f)
            curveTo(13.664f, 7.25f, 14f, 7.586f, 14f, 8f)
            close()
        }
    }.build()
}
