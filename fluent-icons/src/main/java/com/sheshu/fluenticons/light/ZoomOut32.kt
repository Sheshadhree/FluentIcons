package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.ZoomOut32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ZoomOut32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 13f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(18.776f, 14f, 18.5f, 14f)
            horizontalLineToRelative(-10f)
            curveTo(8.224f, 14f, 8f, 13.776f, 8f, 13.5f)
            reflectiveCurveTo(8.224f, 13f, 8.5f, 13f)
            horizontalLineToRelative(10f)
            close()
            moveToRelative(-5f, -11f)
            curveTo(19.851f, 2f, 25f, 7.149f, 25f, 13.5f)
            curveToRelative(0f, 2.996f, -1.147f, 5.723f, -3.023f, 7.77f)
            lineToRelative(6.877f, 6.877f)
            lineToRelative(0.064f, 0.078f)
            curveToRelative(0.128f, 0.194f, 0.106f, 0.458f, -0.064f, 0.628f)
            curveToRelative(-0.171f, 0.171f, -0.435f, 0.193f, -0.63f, 0.065f)
            lineToRelative(-0.078f, -0.064f)
            lineToRelative(-6.877f, -6.877f)
            curveTo(19.224f, 23.853f, 16.497f, 25f, 13.5f, 25f)
            curveTo(7.149f, 25f, 2f, 19.851f, 2f, 13.5f)
            reflectiveCurveTo(7.149f, 2f, 13.5f, 2f)
            close()
            moveToRelative(0f, 1f)
            curveTo(7.701f, 3f, 3f, 7.701f, 3f, 13.5f)
            reflectiveCurveTo(7.701f, 24f, 13.5f, 24f)
            reflectiveCurveTo(24f, 19.299f, 24f, 13.5f)
            reflectiveCurveTo(19.299f, 3f, 13.5f, 3f)
            close()
        }
    }.build()
}
