package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.StackVertical20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StackVertical20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(16f, 16.776f, 16f, 16.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 12f, 4f, 12.672f, 4f, 13.5f)
            verticalLineToRelative(3f)
            curveTo(4f, 16.776f, 3.776f, 17f, 3.5f, 17f)
            reflectiveCurveTo(3f, 16.776f, 3f, 16.5f)
            verticalLineToRelative(-11f)
            close()
            moveToRelative(1f, 6f)
            curveTo(4.418f, 11.186f, 4.937f, 11f, 5.5f, 11f)
            horizontalLineToRelative(9f)
            curveToRelative(0.563f, 0f, 1.082f, 0.186f, 1.5f, 0.5f)
            verticalLineToRelative(-2f)
            curveTo(16f, 8.672f, 15.328f, 8f, 14.5f, 8f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 8f, 4f, 8.672f, 4f, 9.5f)
            verticalLineToRelative(2f)
            close()
            moveToRelative(12f, -6f)
            curveTo(16f, 4.672f, 15.328f, 4f, 14.5f, 4f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 4f, 4f, 4.672f, 4f, 5.5f)
            verticalLineToRelative(2f)
            curveTo(4.418f, 7.186f, 4.937f, 7f, 5.5f, 7f)
            horizontalLineToRelative(9f)
            curveToRelative(0.563f, 0f, 1.082f, 0.186f, 1.5f, 0.5f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
