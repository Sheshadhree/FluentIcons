package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DividerShort16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DividerShort16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 3f)
            curveTo(7.776f, 3f, 8f, 3.224f, 8f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(8f, 12.776f, 7.776f, 13f, 7.5f, 13f)
            reflectiveCurveTo(7f, 12.776f, 7f, 12.5f)
            verticalLineToRelative(-9f)
            curveTo(7f, 3.224f, 7.224f, 3f, 7.5f, 3f)
            close()
        }
    }.build()
}
