package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarStar16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarStar16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 2f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(2.1f)
            curveToRelative(-0.317f, -0.162f, -0.651f, -0.294f, -1f, -0.393f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            verticalLineToRelative(5.5f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineToRelative(1.707f)
            curveToRelative(0.099f, 0.349f, 0.23f, 0.683f, 0.393f, 1f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(10f)
            verticalLineTo(4.5f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            close()
            moveToRelative(4.5f, 8.5f)
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
