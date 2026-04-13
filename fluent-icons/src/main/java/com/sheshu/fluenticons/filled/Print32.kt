package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Print32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Print32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 6.5f)
            verticalLineTo(8f)
            horizontalLineTo(7f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            verticalLineToRelative(7.5f)
            curveTo(2f, 22.433f, 3.567f, 24f, 5.5f, 24f)
            horizontalLineTo(7f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(11f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(24f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(13f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            horizontalLineToRelative(-1f)
            verticalLineTo(6.5f)
            curveTo(24f, 4.567f, 22.433f, 3f, 20.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(9.567f, 3f, 8f, 4.567f, 8f, 6.5f)
            close()
            moveTo(11.5f, 5f)
            horizontalLineToRelative(9f)
            curveTo(21.328f, 5f, 22f, 5.672f, 22f, 6.5f)
            verticalLineTo(8f)
            horizontalLineTo(10f)
            verticalLineTo(6.5f)
            curveTo(10f, 5.672f, 10.672f, 5f, 11.5f, 5f)
            close()
            moveTo(9f, 19.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-11f)
            curveTo(9.672f, 27f, 9f, 26.328f, 9f, 25.5f)
            verticalLineToRelative(-6f)
            close()
        }
    }.build()
}
