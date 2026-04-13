package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignDistributeTop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignDistributeTop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.5f, 1f)
            curveTo(1.224f, 1f, 1f, 1.224f, 1f, 1.5f)
            reflectiveCurveTo(1.224f, 2f, 1.5f, 2f)
            horizontalLineToRelative(13f)
            curveTo(14.776f, 2f, 15f, 1.776f, 15f, 1.5f)
            reflectiveCurveTo(14.776f, 1f, 14.5f, 1f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(0f, 7f)
            curveTo(1.224f, 8f, 1f, 8.224f, 1f, 8.5f)
            reflectiveCurveTo(1.224f, 9f, 1.5f, 9f)
            horizontalLineToRelative(13f)
            curveTo(14.776f, 9f, 15f, 8.776f, 15f, 8.5f)
            reflectiveCurveTo(14.776f, 8f, 14.5f, 8f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(8f, 6f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            curveTo(5.672f, 10f, 5f, 10.672f, 5f, 11.5f)
            verticalLineToRelative(1f)
            curveTo(5f, 13.328f, 5.672f, 14f, 6.5f, 14f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(2f, -7f)
            curveTo(12.328f, 7f, 13f, 6.328f, 13f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineToRelative(1f)
            curveTo(3f, 6.328f, 3.672f, 7f, 4.5f, 7f)
            horizontalLineToRelative(7f)
            close()
        }
    }.build()
}
