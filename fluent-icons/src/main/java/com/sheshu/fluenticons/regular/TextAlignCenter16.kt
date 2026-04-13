package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAlignCenter16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAlignCenter16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 3.5f)
            curveTo(3f, 3.224f, 3.224f, 3f, 3.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(12.776f, 3f, 13f, 3.224f, 13f, 3.5f)
            reflectiveCurveTo(12.776f, 4f, 12.5f, 4f)
            horizontalLineToRelative(-9f)
            curveTo(3.224f, 4f, 3f, 3.776f, 3f, 3.5f)
            close()
            moveToRelative(-2f, 4f)
            curveTo(1f, 7.224f, 1.224f, 7f, 1.5f, 7f)
            horizontalLineToRelative(13f)
            curveTo(14.776f, 7f, 15f, 7.224f, 15f, 7.5f)
            reflectiveCurveTo(14.776f, 8f, 14.5f, 8f)
            horizontalLineToRelative(-13f)
            curveTo(1.224f, 8f, 1f, 7.776f, 1f, 7.5f)
            close()
            moveToRelative(4f, 4f)
            curveTo(5f, 11.224f, 5.224f, 11f, 5.5f, 11f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.776f, 12f, 10.5f, 12f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 12f, 5f, 11.776f, 5f, 11.5f)
            close()
        }
    }.build()
}
