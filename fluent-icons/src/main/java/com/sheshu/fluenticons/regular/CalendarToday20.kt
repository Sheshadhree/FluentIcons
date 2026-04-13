package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarToday20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarToday20",
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
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(7f)
            horizontalLineTo(4f)
            verticalLineToRelative(7.5f)
            curveTo(4f, 15.328f, 4.672f, 16f, 5.5f, 16f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-3f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineToRelative(-9f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 4f, 4f, 4.672f, 4f, 5.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(12f)
            verticalLineTo(5.5f)
            curveTo(16f, 4.672f, 15.328f, 4f, 14.5f, 4f)
            close()
            moveTo(11f, 9f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveTo(9f, 9.552f, 9f, 9f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(0.884f, 5.07f)
            curveToRelative(-0.177f, 0.212f, -0.492f, 0.24f, -0.704f, 0.064f)
            lineToRelative(-0.68f, -0.566f)
            verticalLineTo(17.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-3.932f)
            lineToRelative(-0.68f, 0.566f)
            curveToRelative(-0.212f, 0.177f, -0.527f, 0.148f, -0.704f, -0.064f)
            curveToRelative(-0.177f, -0.212f, -0.148f, -0.527f, 0.064f, -0.704f)
            lineToRelative(1.5f, -1.25f)
            curveToRelative(0.185f, -0.155f, 0.455f, -0.155f, 0.64f, 0f)
            lineToRelative(1.5f, 1.25f)
            curveToRelative(0.212f, 0.177f, 0.24f, 0.492f, 0.064f, 0.704f)
            close()
        }
    }.build()
}
