package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.VideoClip32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.VideoClip32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 12.001f)
            verticalLineTo(20f)
            curveToRelative(0f, 0.755f, 0.805f, 1.237f, 1.47f, 0.882f)
            lineToRelative(7.498f, -3.999f)
            curveToRelative(0.705f, -0.376f, 0.705f, -1.388f, 0f, -1.764f)
            lineToRelative(-7.497f, -3.999f)
            curveTo(12.805f, 10.764f, 12f, 11.246f, 12f, 12.001f)
            close()
            moveTo(6.5f, 28f)
            horizontalLineToRelative(19f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-15f)
            curveTo(30f, 6.015f, 27.985f, 4f, 25.5f, 4f)
            horizontalLineToRelative(-19f)
            curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
            verticalLineToRelative(15f)
            curveTo(2f, 25.985f, 4.015f, 28f, 6.5f, 28f)
            close()
            moveToRelative(19f, -1f)
            horizontalLineToRelative(-19f)
            curveTo(4.567f, 27f, 3f, 25.433f, 3f, 23.5f)
            verticalLineToRelative(-15f)
            curveTo(3f, 6.567f, 4.567f, 5f, 6.5f, 5f)
            horizontalLineToRelative(19f)
            curveTo(27.433f, 5f, 29f, 6.567f, 29f, 8.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            close()
        }
    }.build()
}
