package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BoardHeart20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BoardHeart20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 7f)
            verticalLineTo(3f)
            horizontalLineTo(6f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(6.5f)
            close()
            moveToRelative(1.251f, 8.41f)
            lineToRelative(3.43f, 3.457f)
            curveToRelative(0.177f, 0.177f, 0.461f, 0.177f, 0.637f, 0f)
            lineToRelative(3.431f, -3.457f)
            curveToRelative(1.001f, -1.008f, 1.001f, -2.644f, 0f, -3.653f)
            curveToRelative(-0.356f, -0.36f, -0.791f, -0.59f, -1.249f, -0.694f)
            curveToRelative(-0.797f, -0.18f, -1.663f, 0.027f, -2.302f, 0.62f)
            lineToRelative(-0.075f, 0.074f)
            lineTo(14.5f, 11.88f)
            lineToRelative(-0.123f, -0.123f)
            lineToRelative(-0.075f, -0.073f)
            curveToRelative(-1.006f, -0.936f, -2.574f, -0.911f, -3.551f, 0.073f)
            curveToRelative(-0.077f, 0.077f, -0.148f, 0.159f, -0.213f, 0.243f)
            curveToRelative(-0.704f, 0.912f, -0.717f, 2.191f, -0.038f, 3.117f)
            curveToRelative(0.075f, 0.102f, 0.159f, 0.2f, 0.251f, 0.293f)
            close()
            moveTo(9.5f, 17f)
            verticalLineToRelative(-1.584f)
            curveToRelative(-0.667f, -1.126f, -0.667f, -2.54f, 0f, -3.665f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(3.5f)
            close()
            moveToRelative(5f, -6.426f)
            curveToRelative(0.751f, -0.49f, 1.646f, -0.666f, 2.5f, -0.53f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(7.661f)
            curveToRelative(1.19f, -0.851f, 2.783f, -0.88f, 4f, -0.087f)
            close()
        }
    }.build()
}
