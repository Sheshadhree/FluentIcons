package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StoreMicrosoft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StoreMicrosoft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 2.5f)
            verticalLineTo(4f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 4f, 2f, 4.224f, 2f, 4.5f)
            verticalLineToRelative(10f)
            curveTo(2f, 15.88f, 3.12f, 17f, 4.5f, 17f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-10f)
            curveTo(18f, 4.224f, 17.776f, 4f, 17.5f, 4f)
            horizontalLineTo(13f)
            verticalLineTo(2.5f)
            curveTo(13f, 1.672f, 12.328f, 1f, 11.5f, 1f)
            horizontalLineToRelative(-3f)
            curveTo(7.672f, 1f, 7f, 1.672f, 7f, 2.5f)
            close()
            moveTo(8.5f, 2f)
            horizontalLineToRelative(3f)
            curveTo(11.776f, 2f, 12f, 2.224f, 12f, 2.5f)
            verticalLineTo(4f)
            horizontalLineTo(8f)
            verticalLineTo(2.5f)
            curveTo(8f, 2.224f, 8.224f, 2f, 8.5f, 2f)
            close()
            moveToRelative(-2f, 8f)
            verticalLineTo(7f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(0f, 4f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(7f, -4f)
            horizontalLineToRelative(-3f)
            verticalLineTo(7f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(-3f, 4f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
