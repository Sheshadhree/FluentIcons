package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAlignLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAlignLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3.5f)
            curveTo(1f, 3.224f, 1.224f, 3f, 1.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(10.776f, 3f, 11f, 3.224f, 11f, 3.5f)
            reflectiveCurveTo(10.776f, 4f, 10.5f, 4f)
            horizontalLineToRelative(-9f)
            curveTo(1.224f, 4f, 1f, 3.776f, 1f, 3.5f)
            close()
            moveToRelative(0f, 4f)
            curveTo(1f, 7.224f, 1.224f, 7f, 1.5f, 7f)
            horizontalLineToRelative(13f)
            curveTo(14.776f, 7f, 15f, 7.224f, 15f, 7.5f)
            reflectiveCurveTo(14.776f, 8f, 14.5f, 8f)
            horizontalLineToRelative(-13f)
            curveTo(1.224f, 8f, 1f, 7.776f, 1f, 7.5f)
            close()
            moveToRelative(0f, 4f)
            curveTo(1f, 11.224f, 1.224f, 11f, 1.5f, 11f)
            horizontalLineToRelative(5f)
            curveTo(6.776f, 11f, 7f, 11.224f, 7f, 11.5f)
            reflectiveCurveTo(6.776f, 12f, 6.5f, 12f)
            horizontalLineToRelative(-5f)
            curveTo(1.224f, 12f, 1f, 11.776f, 1f, 11.5f)
            close()
        }
    }.build()
}
