package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Clipboard32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Clipboard32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 2f)
            curveToRelative(1.306f, 0f, 2.418f, 0.835f, 2.83f, 2f)
            horizontalLineToRelative(1.67f)
            curveTo(25.433f, 4f, 27f, 5.567f, 27f, 7.5f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-15f)
            curveTo(6.567f, 30f, 5f, 28.433f, 5f, 26.5f)
            verticalLineToRelative(-19f)
            curveTo(5f, 5.567f, 6.567f, 4f, 8.5f, 4f)
            horizontalLineToRelative(1.67f)
            curveToRelative(0.412f, -1.165f, 1.524f, -2f, 2.83f, -2f)
            horizontalLineToRelative(6f)
            close()
            moveToRelative(-6f, 2f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-6f)
            close()
            moveTo(8.5f, 6f)
            curveTo(7.672f, 6f, 7f, 6.672f, 7f, 7.5f)
            verticalLineToRelative(19f)
            curveTo(7f, 27.328f, 7.672f, 28f, 8.5f, 28f)
            horizontalLineToRelative(15f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-19f)
            curveTo(25f, 6.672f, 24.328f, 6f, 23.5f, 6f)
            horizontalLineToRelative(-1.67f)
            curveTo(21.417f, 7.165f, 20.305f, 8f, 19f, 8f)
            horizontalLineToRelative(-6f)
            curveToRelative(-1.306f, 0f, -2.418f, -0.835f, -2.83f, -2f)
            horizontalLineTo(8.5f)
            close()
        }
    }.build()
}
