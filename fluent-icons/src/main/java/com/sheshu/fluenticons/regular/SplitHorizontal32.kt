package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SplitHorizontal32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SplitHorizontal32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 15f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(26f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(3f)
            close()
            moveToRelative(5f, 11.5f)
            verticalLineToRelative(-8f)
            horizontalLineTo(6f)
            verticalLineToRelative(8f)
            curveTo(6f, 28.433f, 7.567f, 30f, 9.5f, 30f)
            horizontalLineToRelative(13f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-13f)
            curveTo(8.672f, 28f, 8f, 27.328f, 8f, 26.5f)
            close()
            moveToRelative(18f, -13f)
            verticalLineToRelative(-8f)
            curveTo(26f, 3.567f, 24.433f, 2f, 22.5f, 2f)
            horizontalLineToRelative(-13f)
            curveTo(7.567f, 2f, 6f, 3.567f, 6f, 5.5f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-8f)
            curveTo(8f, 4.672f, 8.672f, 4f, 9.5f, 4f)
            horizontalLineToRelative(13f)
            curveTo(23.328f, 4f, 24f, 4.672f, 24f, 5.5f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(2f)
            close()
        }
    }.build()
}
