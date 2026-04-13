package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarRecord16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarRecord16",
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
            moveTo(11.5f, 8f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveTo(13.433f, 15f, 11.5f, 15f)
            reflectiveCurveTo(8f, 13.433f, 8f, 11.5f)
            reflectiveCurveTo(9.567f, 8f, 11.5f, 8f)
            close()
            moveToRelative(0f, 8f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(13.985f, 7f, 11.5f, 7f)
            reflectiveCurveTo(7f, 9.015f, 7f, 11.5f)
            reflectiveCurveTo(9.015f, 16f, 11.5f, 16f)
            close()
            moveToRelative(2.5f, -4.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(9f, 12.88f, 9f, 11.5f)
            reflectiveCurveTo(10.12f, 9f, 11.5f, 9f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
        }
    }.build()
}
