package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarRecord20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarRecord20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 7f)
            verticalLineToRelative(2.6f)
            curveTo(16.25f, 9.216f, 15.4f, 9f, 14.5f, 9f)
            curveTo(11.462f, 9f, 9f, 11.462f, 9f, 14.5f)
            curveToRelative(0f, 0.9f, 0.216f, 1.75f, 0.6f, 2.5f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(14f)
            close()
            moveToRelative(-2.5f, -4f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            close()
            moveToRelative(0f, 8f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveTo(16.433f, 18f, 14.5f, 18f)
            reflectiveCurveTo(11f, 16.433f, 11f, 14.5f)
            reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
            close()
            moveToRelative(0f, 8f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(16.985f, 10f, 14.5f, 10f)
            reflectiveCurveTo(10f, 12.015f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            close()
            moveToRelative(2.5f, -4.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(12f, 15.88f, 12f, 14.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
        }
    }.build()
}
