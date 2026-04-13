package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarNote16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarNote16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 6f)
            verticalLineToRelative(1f)
            horizontalLineTo(8.5f)
            curveTo(7.12f, 7f, 6f, 8.12f, 6f, 9.5f)
            verticalLineTo(14f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(12f)
            close()
            moveToRelative(-2.5f, -4f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineTo(5f)
            horizontalLineTo(2f)
            verticalLineTo(4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            close()
            moveTo(7f, 9.5f)
            curveTo(7f, 8.672f, 7.672f, 8f, 8.5f, 8f)
            horizontalLineToRelative(6f)
            curveTo(15.328f, 8f, 16f, 8.672f, 16f, 9.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-6f)
            curveTo(7.672f, 16f, 7f, 15.328f, 7f, 14.5f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(7f, 4f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-4f)
            curveTo(9.224f, 13f, 9f, 13.224f, 9f, 13.5f)
            reflectiveCurveTo(9.224f, 14f, 9.5f, 14f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            close()
            moveTo(9.5f, 10f)
            curveTo(9.224f, 10f, 9f, 10.224f, 9f, 10.5f)
            reflectiveCurveTo(9.224f, 11f, 9.5f, 11f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 10f, 13.5f, 10f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
