package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Fluent32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Fluent32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.553f, 2.106f)
            curveToRelative(0.281f, -0.141f, 0.613f, -0.141f, 0.894f, 0f)
            lineToRelative(8f, 4f)
            curveTo(25.786f, 6.275f, 26f, 6.62f, 26f, 7f)
            reflectiveCurveToRelative(-0.214f, 0.725f, -0.553f, 0.894f)
            lineTo(19.237f, 11f)
            lineToRelative(6.21f, 3.106f)
            curveTo(25.786f, 14.275f, 26f, 14.62f, 26f, 15f)
            reflectiveCurveToRelative(-0.214f, 0.725f, -0.553f, 0.894f)
            lineTo(18f, 19.618f)
            verticalLineTo(29f)
            curveToRelative(0f, 0.355f, -0.189f, 0.684f, -0.495f, 0.863f)
            curveToRelative(-0.307f, 0.18f, -0.686f, 0.183f, -0.995f, 0.009f)
            lineToRelative(-8f, -4.5f)
            curveTo(8.195f, 25.195f, 8f, 24.862f, 8f, 24.5f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.379f, 0.214f, -0.725f, 0.553f, -0.894f)
            lineToRelative(8f, -4f)
            close()
            moveTo(10f, 7.618f)
            verticalLineToRelative(16.297f)
            lineToRelative(6f, 3.375f)
            verticalLineTo(19f)
            curveToRelative(0f, -0.379f, 0.214f, -0.725f, 0.553f, -0.894f)
            lineTo(22.763f, 15f)
            lineToRelative(-6.21f, -3.106f)
            curveTo(16.214f, 11.725f, 16f, 11.38f, 16f, 11f)
            reflectiveCurveToRelative(0.214f, -0.725f, 0.553f, -0.894f)
            lineTo(22.763f, 7f)
            lineTo(17f, 4.118f)
            lineToRelative(-7f, 3.5f)
            close()
        }
    }.build()
}
