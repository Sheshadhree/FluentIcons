package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.VideoMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.VideoMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(4f)
            curveToRelative(1.195f, 0f, 2.194f, 0.838f, 2.441f, 1.96f)
            lineToRelative(1.122f, -0.748f)
            curveToRelative(0.83f, -0.554f, 1.944f, 0.041f, 1.944f, 1.04f)
            verticalLineToRelative(4.497f)
            curveToRelative(0f, 0.998f, -1.113f, 1.593f, -1.944f, 1.04f)
            lineToRelative(-1.122f, -0.748f)
            curveTo(11.694f, 11.161f, 10.695f, 12f, 9.5f, 12f)
            horizontalLineToRelative(-4f)
            curveTo(4.12f, 12f, 3f, 10.88f, 3f, 9.5f)
            verticalLineToRelative(-4f)
            close()
            moveToRelative(9f, 3.378f)
            lineToRelative(1.618f, 1.079f)
            curveToRelative(0.166f, 0.11f, 0.389f, -0.009f, 0.389f, -0.208f)
            verticalLineTo(5.252f)
            curveToRelative(0f, -0.2f, -0.223f, -0.32f, -0.39f, -0.208f)
            lineTo(12f, 6.122f)
            verticalLineToRelative(2.756f)
            close()
            moveTo(5.5f, 4f)
            curveTo(4.672f, 4f, 4f, 4.672f, 4f, 5.5f)
            verticalLineToRelative(4f)
            curveTo(4f, 10.328f, 4.672f, 11f, 5.5f, 11f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveTo(11f, 4.672f, 10.328f, 4f, 9.5f, 4f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(2f, 5.5f)
            curveToRelative(-0.607f, 0.456f, -1f, 1.182f, -1f, 2f)
            verticalLineToRelative(2f)
            curveTo(1f, 11.986f, 3.015f, 14f, 5.5f, 14f)
            horizontalLineToRelative(2f)
            curveToRelative(0.818f, 0f, 1.544f, -0.393f, 2f, -1f)
            horizontalLineToRelative(-4f)
            curveTo(3.567f, 13f, 2f, 11.433f, 2f, 9.5f)
            verticalLineToRelative(-4f)
            close()
        }
    }.build()
}
