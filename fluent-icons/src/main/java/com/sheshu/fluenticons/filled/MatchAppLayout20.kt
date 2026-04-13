package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MatchAppLayout20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MatchAppLayout20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 7f)
            curveTo(2.672f, 7f, 2f, 7.672f, 2f, 8.5f)
            verticalLineToRelative(3f)
            curveTo(2f, 12.328f, 2.672f, 13f, 3.5f, 13f)
            horizontalLineToRelative(4f)
            curveTo(8.328f, 13f, 9f, 12.328f, 9f, 11.5f)
            verticalLineToRelative(-3f)
            curveTo(9f, 7.672f, 8.328f, 7f, 7.5f, 7f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(9f, 0f)
            curveTo(11.672f, 7f, 11f, 7.672f, 11f, 8.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveTo(18f, 7.672f, 17.328f, 7f, 16.5f, 7f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
