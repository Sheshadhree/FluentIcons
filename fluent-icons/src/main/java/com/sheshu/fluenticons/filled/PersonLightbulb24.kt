package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonLightbulb24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonLightbulb24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 16f)
            curveToRelative(0f, -0.711f, 0.149f, -1.387f, 0.416f, -2f)
            horizontalLineTo(6.253f)
            curveToRelative(-1.242f, 0f, -2.25f, 1.007f, -2.25f, 2.25f)
            verticalLineToRelative(0.919f)
            curveToRelative(0f, 0.572f, 0.18f, 1.13f, 0.511f, 1.596f)
            curveTo(6.056f, 20.929f, 8.58f, 22f, 12f, 22f)
            curveToRelative(1.175f, 0f, 2.245f, -0.126f, 3.205f, -0.38f)
            lineToRelative(-0.346f, -1.731f)
            curveTo(13.727f, 18.974f, 13f, 17.572f, 13f, 16f)
            close()
            moveToRelative(4f, -8.995f)
            curveToRelative(0f, -2.761f, -2.238f, -5f, -5f, -5f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            curveToRelative(2.762f, 0f, 5f, -2.239f, 5f, -5f)
            close()
            moveTo(22f, 16f)
            curveToRelative(0f, 1.38f, -0.699f, 2.598f, -1.763f, 3.317f)
            lineTo(20.101f, 20f)
            horizontalLineToRelative(-4.2f)
            lineToRelative(-0.137f, -0.683f)
            curveTo(14.7f, 18.597f, 14f, 17.38f, 14f, 16f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            curveToRelative(2.209f, 0f, 4f, 1.79f, 4f, 4f)
            close()
            moveToRelative(-5.9f, 5f)
            lineToRelative(0.16f, 0.794f)
            curveTo(16.4f, 22.495f, 17.014f, 23f, 17.73f, 23f)
            horizontalLineToRelative(0.54f)
            curveToRelative(0.716f, 0f, 1.331f, -0.505f, 1.472f, -1.206f)
            lineTo(19.9f, 21f)
            horizontalLineToRelative(-3.8f)
            close()
        }
    }.build()
}
