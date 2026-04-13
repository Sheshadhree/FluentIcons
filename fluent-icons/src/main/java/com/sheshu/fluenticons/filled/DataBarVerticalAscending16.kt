package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataBarVerticalAscending16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataBarVerticalAscending16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 2f)
            curveTo(13.328f, 2f, 14f, 2.672f, 14f, 3.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(11f, 13.328f, 11f, 12.5f)
            verticalLineToRelative(-9f)
            curveTo(11f, 2.672f, 11.672f, 2f, 12.5f, 2f)
            close()
            moveToRelative(-4f, 3f)
            curveTo(9.328f, 5f, 10f, 5.672f, 10f, 6.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(7f, 13.328f, 7f, 12.5f)
            verticalLineToRelative(-6f)
            curveTo(7f, 5.672f, 7.672f, 5f, 8.5f, 5f)
            close()
            moveToRelative(-4f, 3f)
            curveTo(5.328f, 8f, 6f, 8.672f, 6f, 9.5f)
            verticalLineToRelative(3f)
            curveTo(6f, 13.328f, 5.328f, 14f, 4.5f, 14f)
            reflectiveCurveTo(3f, 13.328f, 3f, 12.5f)
            verticalLineToRelative(-3f)
            curveTo(3f, 8.672f, 3.672f, 8f, 4.5f, 8f)
            close()
        }
    }.build()
}
