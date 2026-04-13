package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleDown32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleDown32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.843f, 27.32f)
            lineToRelative(10.75f, -19.5f)
            curveToRelative(1.194f, -2.166f, -0.373f, -4.819f, -2.846f, -4.819f)
            horizontalLineTo(5.255f)
            curveToRelative(-2.473f, 0f, -4.04f, 2.652f, -2.847f, 4.818f)
            lineTo(13.15f, 27.32f)
            curveToRelative(1.236f, 2.242f, 4.457f, 2.242f, 5.693f, 0f)
            close()
            moveToRelative(-3.94f, -0.966f)
            lineTo(4.16f, 6.855f)
            curveTo(3.7f, 6.022f, 4.303f, 5.002f, 5.255f, 5.002f)
            horizontalLineToRelative(21.492f)
            curveToRelative(0.95f, 0f, 1.553f, 1.02f, 1.094f, 1.854f)
            lineToRelative(-10.75f, 19.498f)
            curveToRelative(-0.475f, 0.862f, -1.714f, 0.862f, -2.189f, 0f)
            close()
        }
    }.build()
}
