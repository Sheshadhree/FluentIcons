package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignDistributeLeft16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignDistributeLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 14.5f)
            curveTo(1f, 14.776f, 1.224f, 15f, 1.5f, 15f)
            reflectiveCurveTo(2f, 14.776f, 2f, 14.5f)
            verticalLineToRelative(-13f)
            curveTo(2f, 1.224f, 1.776f, 1f, 1.5f, 1f)
            reflectiveCurveTo(1f, 1.224f, 1f, 1.5f)
            verticalLineToRelative(13f)
            close()
            moveToRelative(7f, 0f)
            curveTo(8f, 14.776f, 8.224f, 15f, 8.5f, 15f)
            reflectiveCurveTo(9f, 14.776f, 9f, 14.5f)
            verticalLineToRelative(-13f)
            curveTo(9f, 1.224f, 8.776f, 1f, 8.5f, 1f)
            reflectiveCurveTo(8f, 1.224f, 8f, 1.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(4.5f, 13f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineToRelative(-7f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(1f)
            curveTo(6.328f, 3f, 7f, 3.672f, 7f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(7f, 12.328f, 6.328f, 13f, 5.5f, 13f)
            horizontalLineToRelative(-1f)
            close()
            moveTo(10f, 9.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveTo(14f, 5.672f, 13.328f, 5f, 12.5f, 5f)
            horizontalLineToRelative(-1f)
            curveTo(10.672f, 5f, 10f, 5.672f, 10f, 6.5f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}
