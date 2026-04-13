package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DividerTall16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DividerTall16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 1f)
            curveTo(7.776f, 1f, 8f, 1.224f, 8f, 1.5f)
            verticalLineToRelative(13f)
            curveTo(8f, 14.776f, 7.776f, 15f, 7.5f, 15f)
            reflectiveCurveTo(7f, 14.776f, 7f, 14.5f)
            verticalLineToRelative(-13f)
            curveTo(7f, 1.224f, 7.224f, 1f, 7.5f, 1f)
            close()
        }
    }.build()
}
