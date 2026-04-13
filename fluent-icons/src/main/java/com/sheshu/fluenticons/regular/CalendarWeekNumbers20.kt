package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarWeekNumbers20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarWeekNumbers20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(4f, 5.5f)
            curveTo(4f, 4.672f, 4.672f, 4f, 5.5f, 4f)
            horizontalLineToRelative(9f)
            curveTo(15.328f, 4f, 16f, 4.672f, 16f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 16f, 4f, 15.328f, 4f, 14.5f)
            verticalLineToRelative(-9f)
            close()
            moveToRelative(3f, 1f)
            curveTo(7f, 6.224f, 6.776f, 6f, 6.5f, 6f)
            reflectiveCurveTo(6f, 6.224f, 6f, 6.5f)
            verticalLineToRelative(1f)
            curveTo(6f, 7.776f, 6.224f, 8f, 6.5f, 8f)
            reflectiveCurveTo(7f, 7.776f, 7f, 7.5f)
            verticalLineToRelative(-1f)
            close()
            moveTo(6.5f, 9f)
            curveTo(6.776f, 9f, 7f, 9.224f, 7f, 9.5f)
            verticalLineToRelative(1f)
            curveTo(7f, 10.776f, 6.776f, 11f, 6.5f, 11f)
            reflectiveCurveTo(6f, 10.776f, 6f, 10.5f)
            verticalLineToRelative(-1f)
            curveTo(6f, 9.224f, 6.224f, 9f, 6.5f, 9f)
            close()
            moveTo(7f, 12.5f)
            curveTo(7f, 12.224f, 6.776f, 12f, 6.5f, 12f)
            reflectiveCurveTo(6f, 12.224f, 6f, 12.5f)
            verticalLineToRelative(1f)
            curveTo(6f, 13.776f, 6.224f, 14f, 6.5f, 14f)
            reflectiveCurveTo(7f, 13.776f, 7f, 13.5f)
            verticalLineToRelative(-1f)
            close()
        }
    }.build()
}
