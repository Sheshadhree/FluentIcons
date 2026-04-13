package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarInfo16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarInfo16",
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
            moveToRelative(-3.125f, 5f)
            curveToRelative(0f, -0.345f, 0.28f, -0.625f, 0.625f, -0.625f)
            reflectiveCurveToRelative(0.625f, 0.28f, 0.625f, 0.625f)
            reflectiveCurveToRelative(-0.28f, 0.625f, -0.625f, 0.625f)
            reflectiveCurveToRelative(-0.625f, -0.28f, -0.625f, -0.625f)
            close()
            moveToRelative(1.125f, 4f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(11f, 13.776f, 11f, 13.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(2f)
            close()
            moveToRelative(-5f, -2f)
            curveTo(7f, 9.015f, 9.015f, 7f, 11.5f, 7f)
            reflectiveCurveTo(16f, 9.015f, 16f, 11.5f)
            reflectiveCurveTo(13.985f, 16f, 11.5f, 16f)
            reflectiveCurveTo(7f, 13.985f, 7f, 11.5f)
            close()
            moveToRelative(8f, 0f)
            curveTo(15f, 9.567f, 13.433f, 8f, 11.5f, 8f)
            reflectiveCurveTo(8f, 9.567f, 8f, 11.5f)
            reflectiveCurveTo(9.567f, 15f, 11.5f, 15f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            close()
        }
    }.build()
}
