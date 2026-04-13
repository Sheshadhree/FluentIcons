package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.ImageShadow32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ImageShadow32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 8.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(16f, 9.328f, 16f, 8.5f)
            reflectiveCurveTo(16.672f, 7f, 17.5f, 7f)
            reflectiveCurveTo(19f, 7.672f, 19f, 8.5f)
            close()
            moveTo(6.5f, 2f)
            curveTo(4.015f, 2f, 2f, 4.015f, 2f, 6.5f)
            verticalLineToRelative(13f)
            curveTo(2f, 21.985f, 4.015f, 24f, 6.5f, 24f)
            horizontalLineToRelative(13f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-13f)
            curveTo(24f, 4.015f, 21.985f, 2f, 19.5f, 2f)
            horizontalLineToRelative(-13f)
            close()
            moveTo(3f, 6.5f)
            curveTo(3f, 4.567f, 4.567f, 3f, 6.5f, 3f)
            horizontalLineToRelative(13f)
            curveTo(21.433f, 3f, 23f, 4.567f, 23f, 6.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.786f, -0.26f, 1.512f, -0.697f, 2.096f)
            lineToRelative(-8.1f, -8.101f)
            curveToRelative(-0.665f, -0.664f, -1.741f, -0.664f, -2.405f, 0f)
            lineToRelative(-8.101f, 8.101f)
            curveTo(3.259f, 21.012f, 3f, 20.286f, 3f, 19.5f)
            verticalLineToRelative(-13f)
            close()
            moveToRelative(1.404f, 15.803f)
            lineToRelative(8.101f, -8.1f)
            curveToRelative(0.273f, -0.274f, 0.717f, -0.274f, 0.99f, 0f)
            lineToRelative(8.101f, 8.1f)
            curveTo(21.012f, 22.741f, 20.286f, 23f, 19.5f, 23f)
            horizontalLineToRelative(-13f)
            curveToRelative(-0.786f, 0f, -1.512f, -0.26f, -2.096f, -0.697f)
            close()
            moveTo(8f, 25.5f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(9f)
            curveToRelative(4.694f, 0f, 8.5f, -3.806f, 8.5f, -8.5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -2.485f, -2.016f, -4.5f, -4.5f, -4.5f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}
