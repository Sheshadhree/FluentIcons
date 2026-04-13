package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignDistributeBottom16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignDistributeBottom16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 15f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 14f, 14.5f, 14f)
            horizontalLineToRelative(-13f)
            curveTo(1.224f, 14f, 1f, 14.224f, 1f, 14.5f)
            reflectiveCurveTo(1.224f, 15f, 1.5f, 15f)
            horizontalLineToRelative(13f)
            close()
            moveToRelative(0f, -7f)
            curveTo(14.776f, 8f, 15f, 7.776f, 15f, 7.5f)
            reflectiveCurveTo(14.776f, 7f, 14.5f, 7f)
            horizontalLineToRelative(-13f)
            curveTo(1.224f, 7f, 1f, 7.224f, 1f, 7.5f)
            reflectiveCurveTo(1.224f, 8f, 1.5f, 8f)
            horizontalLineToRelative(13f)
            close()
            moveTo(3f, 3.5f)
            curveTo(3f, 2.672f, 3.672f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 2f, 13f, 2.672f, 13f, 3.5f)
            verticalLineToRelative(1f)
            curveTo(13f, 5.328f, 12.328f, 6f, 11.5f, 6f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 6f, 3f, 5.328f, 3f, 4.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(6.5f, 9f)
            curveTo(5.672f, 9f, 5f, 9.672f, 5f, 10.5f)
            verticalLineToRelative(1f)
            curveTo(5f, 12.328f, 5.672f, 13f, 6.5f, 13f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveTo(11f, 9.672f, 10.328f, 9f, 9.5f, 9f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
