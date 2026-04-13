package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarStar20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarStar20",
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
            verticalLineTo(6f)
            horizontalLineToRelative(14f)
            verticalLineTo(5.5f)
            close()
            moveToRelative(0f, 4.1f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineToRelative(7.5f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(4.1f)
            curveTo(9.216f, 16.25f, 9f, 15.4f, 9f, 14.5f)
            curveTo(9f, 11.462f, 11.462f, 9f, 14.5f, 9f)
            curveToRelative(0.9f, 0f, 1.75f, 0.216f, 2.5f, 0.6f)
            close()
            moveToRelative(2f, 4.9f)
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
