package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarStar16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarStar16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 6f)
            horizontalLineTo(2f)
            verticalLineToRelative(5.5f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(2.1f)
            curveTo(6.216f, 13.25f, 6f, 12.4f, 6f, 11.5f)
            curveTo(6f, 8.462f, 8.462f, 6f, 11.5f, 6f)
            close()
            moveTo(14f, 4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(12f)
            verticalLineTo(4.5f)
            close()
            moveToRelative(2f, 7f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(7f, 13.985f, 7f, 11.5f)
            reflectiveCurveTo(9.015f, 7f, 11.5f, 7f)
            reflectiveCurveTo(16f, 9.015f, 16f, 11.5f)
            close()
            moveToRelative(-4.024f, -2.64f)
            curveToRelative(-0.15f, -0.48f, -0.802f, -0.48f, -0.952f, 0f)
            lineToRelative(-0.477f, 1.532f)
            horizontalLineTo(9f)
            curveToRelative(-0.484f, 0f, -0.686f, 0.647f, -0.294f, 0.944f)
            lineToRelative(1.25f, 0.947f)
            lineToRelative(-0.477f, 1.532f)
            curveToRelative(-0.15f, 0.48f, 0.378f, 0.88f, 0.77f, 0.583f)
            lineToRelative(1.25f, -0.947f)
            lineToRelative(1.25f, 0.947f)
            curveToRelative(0.392f, 0.297f, 0.92f, -0.103f, 0.77f, -0.583f)
            lineToRelative(-0.477f, -1.532f)
            lineToRelative(1.25f, -0.947f)
            curveToRelative(0.392f, -0.297f, 0.19f, -0.944f, -0.294f, -0.944f)
            horizontalLineToRelative(-1.546f)
            lineToRelative(-0.477f, -1.531f)
            close()
        }
    }.build()
}
