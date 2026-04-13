package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(8.787f)
            lineTo(8.25f, 4.309f)
            curveToRelative(-0.31f, -0.276f, -0.335f, -0.75f, -0.06f, -1.06f)
            curveToRelative(0.276f, -0.308f, 0.75f, -0.334f, 1.06f, -0.058f)
            lineTo(14f, 7.441f)
            curveTo(14.158f, 7.583f, 14.25f, 7.787f, 14.25f, 8f)
            curveToRelative(0f, 0.213f, -0.09f, 0.417f, -0.25f, 0.559f)
            lineToRelative(-4.75f, 4.25f)
            curveToRelative(-0.309f, 0.276f, -0.783f, 0.25f, -1.059f, -0.059f)
            curveToRelative(-0.276f, -0.309f, -0.25f, -0.783f, 0.059f, -1.059f)
            lineToRelative(3.287f, -2.941f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 8.75f, 2f, 8.414f, 2f, 8f)
            close()
        }
    }.build()
}
