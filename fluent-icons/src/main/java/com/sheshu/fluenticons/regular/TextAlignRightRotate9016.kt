package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAlignRightRotate9016: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAlignRightRotate9016",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 5f)
            curveTo(12.776f, 5f, 13f, 5.224f, 13f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(12f, 14.776f, 12f, 14.5f)
            verticalLineToRelative(-9f)
            curveTo(12f, 5.224f, 12.224f, 5f, 12.5f, 5f)
            close()
            moveToRelative(-4f, -4f)
            curveTo(8.776f, 1f, 9f, 1.224f, 9f, 1.5f)
            verticalLineToRelative(13f)
            curveTo(9f, 14.776f, 8.776f, 15f, 8.5f, 15f)
            reflectiveCurveTo(8f, 14.776f, 8f, 14.5f)
            verticalLineToRelative(-13f)
            curveTo(8f, 1.224f, 8.224f, 1f, 8.5f, 1f)
            close()
            moveToRelative(-4f, 8f)
            curveTo(4.776f, 9f, 5f, 9.224f, 5f, 9.5f)
            verticalLineToRelative(5f)
            curveTo(5f, 14.776f, 4.776f, 15f, 4.5f, 15f)
            reflectiveCurveTo(4f, 14.776f, 4f, 14.5f)
            verticalLineToRelative(-5f)
            curveTo(4f, 9.224f, 4.224f, 9f, 4.5f, 9f)
            close()
        }
    }.build()
}
