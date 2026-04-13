package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarPhone16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarPhone16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 14f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(8.75f)
            curveTo(9.231f, 6f, 8f, 7.231f, 8f, 8.75f)
            verticalLineTo(14f)
            close()
            moveToRelative(6f, -9.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(12f)
            verticalLineTo(4.5f)
            close()
            moveTo(9f, 8.75f)
            curveTo(9f, 7.784f, 9.784f, 7f, 10.75f, 7f)
            horizontalLineToRelative(2.5f)
            curveTo(14.216f, 7f, 15f, 7.784f, 15f, 8.75f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-2.5f)
            curveTo(9.784f, 16f, 9f, 15.216f, 9f, 14.25f)
            verticalLineToRelative(-5.5f)
            close()
            moveTo(11.5f, 13f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 13f, 12.5f, 13f)
            horizontalLineToRelative(-1f)
            close()
        }
    }.build()
}
