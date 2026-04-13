package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookmarkMultiple48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookmarkMultiple48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.668f, 6.5f)
            horizontalLineToRelative(14.081f)
            curveToRelative(4.28f, 0f, 7.75f, 3.47f, 7.75f, 7.75f)
            verticalLineToRelative(24.081f)
            curveTo(37.994f, 37.467f, 39f, 35.851f, 39f, 34f)
            verticalLineTo(14.25f)
            curveTo(39f, 8.59f, 34.41f, 4f, 28.75f, 4f)
            horizontalLineTo(19f)
            curveToRelative(-1.85f, 0f, -3.466f, 1.005f, -4.331f, 2.5f)
            close()
            moveTo(14f, 9f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            verticalLineToRelative(28.75f)
            curveToRelative(0f, 0.461f, 0.254f, 0.885f, 0.66f, 1.102f)
            curveToRelative(0.407f, 0.218f, 0.9f, 0.194f, 1.283f, -0.062f)
            lineTo(21.5f, 36.752f)
            lineToRelative(10.557f, 7.038f)
            curveToRelative(0.383f, 0.256f, 0.876f, 0.28f, 1.283f, 0.062f)
            curveToRelative(0.406f, -0.217f, 0.66f, -0.641f, 0.66f, -1.102f)
            verticalLineTo(14f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            horizontalLineTo(14f)
            close()
        }
    }.build()
}
