package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Triangle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Triangle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.154f, 4.683f)
            curveToRelative(1.236f, -2.242f, 4.458f, -2.241f, 5.693f, 0f)
            lineToRelative(10.742f, 19.5f)
            curveTo(30.783f, 26.347f, 29.216f, 29f, 26.743f, 29f)
            horizontalLineTo(5.25f)
            curveToRelative(-2.474f, 0f, -4.04f, -2.653f, -2.846f, -4.819f)
            lineToRelative(10.75f, -19.498f)
            close()
            moveToRelative(3.941f, 0.966f)
            curveToRelative(-0.475f, -0.862f, -1.714f, -0.863f, -2.19f, 0f)
            lineTo(4.157f, 25.147f)
            curveTo(3.696f, 25.98f, 4.3f, 27f, 5.251f, 27f)
            horizontalLineToRelative(21.492f)
            curveToRelative(0.95f, 0f, 1.553f, -1.02f, 1.095f, -1.853f)
            lineTo(17.094f, 5.65f)
            close()
        }
    }.build()
}
