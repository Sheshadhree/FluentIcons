package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Alert24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Alert24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 1.996f)
            curveToRelative(4.05f, 0f, 7.357f, 3.195f, 7.496f, 7.25f)
            lineToRelative(0.004f, 0.25f)
            verticalLineToRelative(4.097f)
            lineToRelative(1.38f, 3.156f)
            curveToRelative(0.07f, 0.158f, 0.105f, 0.329f, 0.105f, 0.5f)
            curveToRelative(0f, 0.691f, -0.56f, 1.25f, -1.25f, 1.25f)
            lineTo(15f, 18.502f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            curveToRelative(-1.598f, 0f, -2.904f, -1.249f, -2.995f, -2.823f)
            lineTo(9f, 18.499f)
            horizontalLineTo(4.275f)
            curveToRelative(-0.171f, 0f, -0.34f, -0.034f, -0.498f, -0.103f)
            curveToRelative(-0.633f, -0.275f, -0.924f, -1.01f, -0.649f, -1.644f)
            lineTo(4.5f, 13.594f)
            verticalLineTo(9.496f)
            curveToRelative(0f, -4.155f, 3.352f, -7.5f, 7.5f, -7.5f)
            close()
            moveTo(13.5f, 18.5f)
            lineToRelative(-3f, 0.002f)
            curveToRelative(0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
            curveToRelative(0.78f, 0f, 1.42f, -0.595f, 1.493f, -1.355f)
            lineTo(13.5f, 18.5f)
            close()
            moveTo(12f, 3.496f)
            curveToRelative(-3.32f, 0f, -6f, 2.674f, -6f, 6f)
            verticalLineToRelative(4.41f)
            lineTo(4.656f, 17f)
            horizontalLineToRelative(14.697f)
            lineTo(18f, 13.907f)
            verticalLineTo(9.509f)
            lineToRelative(-0.003f, -0.225f)
            curveTo(17.885f, 6.05f, 15.242f, 3.496f, 12f, 3.496f)
            close()
        }
    }.build()
}
