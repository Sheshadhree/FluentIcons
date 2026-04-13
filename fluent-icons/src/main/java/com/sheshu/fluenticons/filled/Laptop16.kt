package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Laptop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Laptop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.5f)
            curveTo(3f, 4.672f, 3.672f, 4f, 4.5f, 4f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 4f, 13f, 4.672f, 13f, 5.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 11f, 3f, 10.328f, 3f, 9.5f)
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
