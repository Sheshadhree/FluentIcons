package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HighlightAccent20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HighlightAccent20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 3f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(4f)
            curveTo(3.724f, 7.5f, 3.5f, 7.276f, 3.5f, 7f)
            verticalLineTo(3f)
            horizontalLineToRelative(13f)
            close()
            moveToRelative(-10f, 7.5f)
            verticalLineToRelative(7f)
            lineToRelative(6.447f, -3.106f)
            curveTo(13.286f, 14.225f, 13.5f, 13.88f, 13.5f, 13.5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
