package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ReadingModeMobile20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReadingModeMobile20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3.5f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineToRelative(9f)
            curveTo(15.328f, 2f, 16f, 2.672f, 16f, 3.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 18f, 4f, 17.328f, 4f, 16.5f)
            verticalLineToRelative(-13f)
            close()
            moveToRelative(2f, 3f)
            curveTo(6f, 6.776f, 6.224f, 7f, 6.5f, 7f)
            horizontalLineToRelative(7f)
            curveTo(13.776f, 7f, 14f, 6.776f, 14f, 6.5f)
            reflectiveCurveTo(13.776f, 6f, 13.5f, 6f)
            horizontalLineToRelative(-7f)
            curveTo(6.224f, 6f, 6f, 6.224f, 6f, 6.5f)
            close()
            moveTo(6.5f, 8f)
            curveTo(6.224f, 8f, 6f, 8.224f, 6f, 8.5f)
            reflectiveCurveTo(6.224f, 9f, 6.5f, 9f)
            horizontalLineToRelative(7f)
            curveTo(13.776f, 9f, 14f, 8.776f, 14f, 8.5f)
            reflectiveCurveTo(13.776f, 8f, 13.5f, 8f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(6f, 10.5f)
            curveTo(6f, 10.776f, 6.224f, 11f, 6.5f, 11f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.776f, 10f, 10.5f, 10f)
            horizontalLineToRelative(-4f)
            curveTo(6.224f, 10f, 6f, 10.224f, 6f, 10.5f)
            close()
        }
    }.build()
}
