package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Laptop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Laptop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 4f)
            curveTo(3.672f, 4f, 3f, 4.672f, 3f, 5.5f)
            verticalLineToRelative(4f)
            curveTo(3f, 10.328f, 3.672f, 11f, 4.5f, 11f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveTo(13f, 4.672f, 12.328f, 4f, 11.5f, 4f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(4f, 5.5f)
            curveTo(4f, 5.224f, 4.224f, 5f, 4.5f, 5f)
            horizontalLineToRelative(7f)
            curveTo(11.776f, 5f, 12f, 5.224f, 12f, 5.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-7f)
            curveTo(4.224f, 10f, 4f, 9.776f, 4f, 9.5f)
            verticalLineToRelative(-4f)
            close()
            moveTo(2.5f, 12f)
            curveTo(2.224f, 12f, 2f, 12.224f, 2f, 12.5f)
            reflectiveCurveTo(2.224f, 13f, 2.5f, 13f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 12f, 13.5f, 12f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}
