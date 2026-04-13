package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarWeekStart20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarWeekStart20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 3f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineToRelative(-9f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 4f, 4f, 4.672f, 4f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(4f, 15.328f, 4.672f, 16f, 5.5f, 16f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            curveTo(16f, 4.672f, 15.328f, 4f, 14.5f, 4f)
            close()
            moveToRelative(-8f, 2f)
            curveToRelative(0.245f, 0f, 0.45f, 0.177f, 0.492f, 0.41f)
            lineTo(7f, 6.5f)
            verticalLineToRelative(7f)
            curveTo(7f, 13.776f, 6.776f, 14f, 6.5f, 14f)
            curveToRelative(-0.245f, 0f, -0.45f, -0.177f, -0.492f, -0.41f)
            lineTo(6f, 13.5f)
            verticalLineToRelative(-7f)
            curveTo(6f, 6.224f, 6.224f, 6f, 6.5f, 6f)
            close()
        }
    }.build()
}
