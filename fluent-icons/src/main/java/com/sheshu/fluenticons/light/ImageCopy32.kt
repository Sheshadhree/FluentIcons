package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.ImageCopy32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ImageCopy32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 10.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(22.328f, 9f, 21.5f, 9f)
            reflectiveCurveTo(20f, 9.672f, 20f, 10.5f)
            close()
            moveTo(23.5f, 4f)
            curveTo(25.985f, 4f, 28f, 6.015f, 28f, 8.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-13f)
            curveTo(8.015f, 26f, 6f, 23.985f, 6f, 21.5f)
            verticalLineToRelative(-13f)
            curveTo(6f, 6.015f, 8.015f, 4f, 10.5f, 4f)
            horizontalLineToRelative(13f)
            close()
            moveTo(27f, 8.5f)
            curveTo(27f, 6.567f, 25.433f, 5f, 23.5f, 5f)
            horizontalLineToRelative(-13f)
            curveTo(8.567f, 5f, 7f, 6.567f, 7f, 8.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.786f, 0.26f, 1.512f, 0.697f, 2.096f)
            lineToRelative(8.101f, -8.101f)
            curveToRelative(0.664f, -0.664f, 1.74f, -0.664f, 2.404f, 0f)
            lineToRelative(8.101f, 8.101f)
            curveTo(26.741f, 23.012f, 27f, 22.286f, 27f, 21.5f)
            verticalLineToRelative(-13f)
            close()
            moveToRelative(-1.404f, 15.803f)
            lineToRelative(-8.101f, -8.1f)
            curveToRelative(-0.273f, -0.274f, -0.717f, -0.274f, -0.99f, 0f)
            lineToRelative(-8.101f, 8.1f)
            curveTo(8.988f, 24.741f, 9.714f, 25f, 10.5f, 25f)
            horizontalLineToRelative(13f)
            curveToRelative(0.786f, 0f, 1.512f, -0.26f, 2.096f, -0.697f)
            close()
            moveTo(23.33f, 28f)
            curveToRelative(-0.773f, 0.625f, -1.757f, 1f, -2.829f, 1f)
            horizontalLineToRelative(-10f)
            curveTo(6.358f, 29f, 3f, 25.642f, 3f, 21.5f)
            verticalLineToRelative(-10f)
            curveToRelative(0f, -1.072f, 0.375f, -2.056f, 1f, -2.829f)
            verticalLineTo(21.5f)
            curveToRelative(0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
            horizontalLineToRelative(12.829f)
            close()
        }
    }.build()
}
