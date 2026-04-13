package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HighlightAccent16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HighlightAccent16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 2f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(3f)
            curveTo(2.724f, 5.5f, 2.5f, 5.276f, 2.5f, 5f)
            verticalLineTo(2f)
            horizontalLineToRelative(11f)
            close()
            moveToRelative(-8f, 6.5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(1.867f)
            curveToRelative(0f, 0.703f, -0.369f, 1.354f, -0.971f, 1.716f)
            lineTo(5.5f, 14.5f)
            verticalLineToRelative(-6f)
            close()
        }
    }.build()
}
