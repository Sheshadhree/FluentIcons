package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Clipboard32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Clipboard32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.5f, 4f)
            horizontalLineToRelative(-1.67f)
            curveTo(21.417f, 2.835f, 20.305f, 2f, 19f, 2f)
            horizontalLineToRelative(-6f)
            curveToRelative(-1.306f, 0f, -2.418f, 0.835f, -2.83f, 2f)
            horizontalLineTo(8.5f)
            curveTo(6.567f, 4f, 5f, 5.567f, 5f, 7.5f)
            verticalLineToRelative(19f)
            curveTo(5f, 28.433f, 6.567f, 30f, 8.5f, 30f)
            horizontalLineToRelative(15f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-19f)
            curveTo(27f, 5.567f, 25.433f, 4f, 23.5f, 4f)
            close()
            moveTo(13f, 4f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
