package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Cube20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cube20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.703f, 6.043f)
            curveTo(5.451f, 5.93f, 5.155f, 6.044f, 5.043f, 6.296f)
            curveTo(4.931f, 6.55f, 5.045f, 6.844f, 5.297f, 6.956f)
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
            moveTo(11.3f, 2.48f)
            curveToRelative(-0.835f, -0.334f, -1.765f, -0.334f, -2.6f, 0f)
            lineTo(2.943f, 4.784f)
            curveTo(2.373f, 5.012f, 2f, 5.563f, 2f, 6.176f)
            verticalLineToRelative(7.646f)
            curveToRelative(0f, 0.614f, 0.373f, 1.165f, 0.943f, 1.393f)
            lineTo(8.7f, 17.518f)
            curveToRelative(0.835f, 0.334f, 1.765f, 0.334f, 2.6f, 0f)
            lineToRelative(5.757f, -2.303f)
            curveToRelative(0.57f, -0.228f, 0.943f, -0.78f, 0.943f, -1.393f)
            verticalLineTo(6.176f)
            curveToRelative(0f, -0.613f, -0.373f, -1.165f, -0.943f, -1.392f)
            lineTo(11.3f, 2.48f)
            close()
            moveTo(9.07f, 3.409f)
            curveToRelative(0.597f, -0.238f, 1.261f, -0.238f, 1.857f, 0f)
            lineToRelative(5.758f, 2.303f)
            curveTo(16.876f, 5.788f, 17f, 5.972f, 17f, 6.176f)
            verticalLineToRelative(7.646f)
            curveToRelative(0f, 0.205f, -0.125f, 0.389f, -0.314f, 0.465f)
            lineToRelative(-5.758f, 2.303f)
            curveToRelative(-0.596f, 0.238f, -1.26f, 0.238f, -1.857f, 0f)
            lineToRelative(-5.757f, -2.303f)
            curveTo(3.124f, 14.21f, 3f, 14.027f, 3f, 13.822f)
            verticalLineTo(6.176f)
            curveToRelative(0f, -0.204f, 0.124f, -0.388f, 0.314f, -0.464f)
            lineTo(9.072f, 3.41f)
            close()
        }
    }.build()
}
