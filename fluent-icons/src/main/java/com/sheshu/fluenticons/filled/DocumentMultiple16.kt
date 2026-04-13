package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4.21f)
            curveToRelative(2.093f, 0f, 3.79f, -1.697f, 3.79f, -3.79f)
            verticalLineTo(6f)
            close()
            moveTo(7f, 1f)
            verticalLineToRelative(3.5f)
            curveTo(7f, 5.328f, 7.672f, 6f, 8.5f, 6f)
            horizontalLineToRelative(3.502f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineToRelative(-9f)
            curveTo(3f, 1.672f, 3.672f, 1f, 4.5f, 1f)
            horizontalLineTo(7f)
            close()
            moveToRelative(1f, 0.25f)
            verticalLineTo(4.5f)
            curveTo(8f, 4.776f, 8.224f, 5f, 8.5f, 5f)
            horizontalLineToRelative(3.25f)
            lineTo(8f, 1.25f)
            close()
        }
    }.build()
}
