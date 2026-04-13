package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareShadow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareShadow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 1f)
            curveTo(9.88f, 1f, 11f, 2.12f, 11f, 3.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(1.5f)
            curveTo(13.88f, 5f, 15f, 6.12f, 15f, 7.5f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(7.5f)
            curveTo(6.12f, 15f, 5f, 13.88f, 5f, 12.5f)
            verticalLineTo(11f)
            horizontalLineTo(3.5f)
            curveTo(2.12f, 11f, 1f, 9.88f, 1f, 8.5f)
            verticalLineToRelative(-5f)
            curveTo(1f, 2.12f, 2.12f, 1f, 3.5f, 1f)
            horizontalLineToRelative(5f)
            close()
            moveToRelative(-5f, 1.5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
