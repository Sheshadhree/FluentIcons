package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookOpen48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookOpen48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 8f)
            curveToRelative(1.576f, 0f, 2.997f, 0.663f, 4f, 1.725f)
            curveTo(25.003f, 8.663f, 26.424f, 8f, 28f, 8f)
            horizontalLineToRelative(13f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(26f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(28f)
            curveToRelative(-1.576f, 0f, -2.997f, -0.663f, -4f, -1.725f)
            curveTo(22.997f, 39.337f, 21.576f, 40f, 20f, 40f)
            horizontalLineTo(7f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(11f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(13f)
            close()
            moveToRelative(2.5f, 26.5f)
            verticalLineToRelative(-21f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineTo(7f)
            verticalLineToRelative(26f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
            moveToRelative(3f, -21f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            verticalLineTo(11f)
            horizontalLineTo(28f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            close()
        }
    }.build()
}
