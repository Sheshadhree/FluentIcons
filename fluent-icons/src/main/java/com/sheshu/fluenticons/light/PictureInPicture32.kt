package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.PictureInPicture32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PictureInPicture32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 3f)
            curveTo(4.015f, 3f, 2f, 5.015f, 2f, 7.5f)
            verticalLineToRelative(15f)
            curveTo(2f, 24.985f, 4.015f, 27f, 6.5f, 27f)
            horizontalLineToRelative(8.229f)
            curveToRelative(-0.1f, -0.32f, -0.17f, -0.655f, -0.204f, -1f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 26f, 3f, 24.433f, 3f, 22.5f)
            verticalLineToRelative(-15f)
            curveTo(3f, 5.567f, 4.567f, 4f, 6.5f, 4f)
            horizontalLineToRelative(19f)
            curveTo(27.433f, 4f, 29f, 5.567f, 29f, 7.5f)
            verticalLineToRelative(8.229f)
            curveToRelative(0.352f, 0.11f, 0.687f, 0.259f, 1f, 0.44f)
            verticalLineTo(7.5f)
            curveTo(30f, 5.015f, 27.985f, 3f, 25.5f, 3f)
            horizontalLineToRelative(-19f)
            close()
            moveTo(16f, 20.5f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(8f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-8f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}
