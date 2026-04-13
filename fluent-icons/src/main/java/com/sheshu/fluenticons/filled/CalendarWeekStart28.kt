package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarWeekStart28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarWeekStart28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 25f)
            curveTo(4.455f, 25f, 3f, 23.545f, 3f, 21.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(15.5f)
            curveTo(23.545f, 3f, 25f, 4.455f, 25f, 6.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            close()
            moveToRelative(2.5f, -5.25f)
            curveToRelative(0.38f, 0f, 0.694f, -0.282f, 0.743f, -0.648f)
            lineTo(9.5f, 19f)
            verticalLineTo(9f)
            lineTo(9.493f, 8.898f)
            curveTo(9.443f, 8.532f, 9.13f, 8.25f, 8.75f, 8.25f)
            reflectiveCurveTo(8.056f, 8.532f, 8.007f, 8.898f)
            lineTo(8f, 9f)
            verticalLineToRelative(10f)
            lineToRelative(0.007f, 0.102f)
            curveToRelative(0.05f, 0.366f, 0.363f, 0.648f, 0.743f, 0.648f)
            close()
        }
    }.build()
}
