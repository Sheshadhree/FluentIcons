package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Headphones24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Headphones24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -4.694f, -3.806f, -8.5f, -8.5f, -8.5f)
            reflectiveCurveTo(3.5f, 7.306f, 3.5f, 12f)
            verticalLineToRelative(2f)
            horizontalLineTo(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-7f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
        }
    }.build()
}
