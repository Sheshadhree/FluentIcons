package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarStar20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarStar20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 5.5f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(4.1f)
            curveToRelative(-0.162f, -0.317f, -0.294f, -0.651f, -0.393f, -1f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 16f, 4f, 15.328f, 4f, 14.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(2.207f)
            curveToRelative(0.349f, 0.099f, 0.683f, 0.23f, 1f, 0.393f)
            verticalLineTo(5.5f)
            close()
            moveTo(5.5f, 4f)
            horizontalLineToRelative(9f)
            curveTo(15.328f, 4f, 16f, 4.672f, 16f, 5.5f)
            verticalLineTo(6f)
            horizontalLineTo(4f)
            verticalLineTo(5.5f)
            curveTo(4f, 4.672f, 4.672f, 4f, 5.5f, 4f)
            close()
            moveTo(19f, 14.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(10f, 16.985f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveToRelative(-4.024f, -2.64f)
            curveToRelative(-0.15f, -0.48f, -0.802f, -0.48f, -0.952f, 0f)
            lineToRelative(-0.477f, 1.532f)
            horizontalLineTo(12f)
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
            horizontalLineToRelative(-1.545f)
            lineToRelative(-0.478f, -1.531f)
            close()
        }
    }.build()
}
