package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cube20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cube20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.7f, 2.48f)
            curveToRelative(0.835f, -0.333f, 1.765f, -0.333f, 2.6f, 0f)
            lineToRelative(5.757f, 2.304f)
            curveTo(17.627f, 5.012f, 18f, 5.563f, 18f, 6.176f)
            verticalLineToRelative(7.646f)
            curveToRelative(0f, 0.614f, -0.373f, 1.165f, -0.943f, 1.393f)
            lineTo(11.3f, 17.518f)
            curveToRelative(-0.835f, 0.334f, -1.765f, 0.334f, -2.6f, 0f)
            lineToRelative(-5.757f, -2.303f)
            curveTo(2.373f, 14.987f, 2f, 14.435f, 2f, 13.822f)
            verticalLineTo(6.176f)
            curveToRelative(0f, -0.613f, 0.373f, -1.165f, 0.943f, -1.392f)
            lineTo(8.7f, 2.48f)
            close()
            moveTo(5.703f, 6.044f)
            curveToRelative(-0.252f, -0.114f, -0.548f, 0f, -0.66f, 0.252f)
            curveToRelative(-0.112f, 0.254f, 0.002f, 0.548f, 0.254f, 0.66f)
            lineTo(9.5f, 8.824f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(8.824f)
            lineToRelative(4.203f, -1.868f)
            curveToRelative(0.252f, -0.112f, 0.366f, -0.407f, 0.254f, -0.66f)
            curveToRelative(-0.112f, -0.252f, -0.408f, -0.366f, -0.66f, -0.253f)
            lineTo(10f, 7.953f)
            lineToRelative(-4.297f, -1.91f)
            close()
        }
    }.build()
}
