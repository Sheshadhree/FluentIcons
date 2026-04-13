package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Lightbulb32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Lightbulb32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 12f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            reflectiveCurveToRelative(9f, 4.03f, 9f, 9f)
            curveToRelative(0f, 2.616f, -1.115f, 4.97f, -2.897f, 6.615f)
            curveToRelative(-0.604f, 0.557f, -1.113f, 1.28f, -1.293f, 2.146f)
            lineTo(20.135f, 24f)
            horizontalLineToRelative(-8.27f)
            lineToRelative(-0.675f, -3.239f)
            curveToRelative(-0.18f, -0.866f, -0.689f, -1.589f, -1.293f, -2.146f)
            curveTo(8.115f, 16.97f, 7f, 14.615f, 7f, 12f)
            close()
            moveToRelative(5.073f, 13f)
            horizontalLineToRelative(7.854f)
            lineToRelative(-0.419f, 2.01f)
            curveTo(19.267f, 28.17f, 18.245f, 29f, 17.061f, 29f)
            horizontalLineToRelative(-2.122f)
            curveToRelative(-1.184f, 0f, -2.206f, -0.83f, -2.447f, -1.99f)
            lineTo(12.073f, 25f)
            close()
            moveTo(16f, 2f)
            curveTo(10.477f, 2f, 6f, 6.477f, 6f, 12f)
            curveToRelative(0f, 2.906f, 1.24f, 5.523f, 3.22f, 7.35f)
            curveToRelative(0.5f, 0.461f, 0.865f, 1.01f, 0.991f, 1.615f)
            lineToRelative(1.302f, 6.249f)
            curveTo(11.851f, 28.837f, 13.281f, 30f, 14.939f, 30f)
            horizontalLineToRelative(2.122f)
            curveToRelative(1.657f, 0f, 3.088f, -1.163f, 3.426f, -2.786f)
            lineToRelative(1.302f, -6.249f)
            curveToRelative(0.126f, -0.604f, 0.492f, -1.154f, 0.992f, -1.615f)
            curveTo(24.76f, 17.523f, 26f, 14.906f, 26f, 12f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            close()
        }
    }.build()
}
