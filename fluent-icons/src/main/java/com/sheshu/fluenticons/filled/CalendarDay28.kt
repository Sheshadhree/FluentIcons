package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarDay28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarDay28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.75f, 3f)
            curveTo(23.545f, 3f, 25f, 4.455f, 25f, 6.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 25f, 3f, 23.545f, 3f, 21.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(15.5f)
            close()
            moveTo(19f, 12f)
            horizontalLineTo(9f)
            curveToRelative(-0.513f, 0f, -0.935f, 0.386f, -0.993f, 0.883f)
            lineTo(8f, 13f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.513f, 0.386f, 0.936f, 0.883f, 0.993f)
            lineTo(9f, 20f)
            horizontalLineToRelative(10f)
            curveToRelative(0.513f, 0f, 0.936f, -0.386f, 0.993f, -0.883f)
            lineTo(20f, 19f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.513f, -0.386f, -0.935f, -0.883f, -0.993f)
            lineTo(19f, 12f)
            close()
            moveToRelative(-0.5f, 1.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-9f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(9f)
            close()
            moveTo(19f, 8f)
            horizontalLineTo(9f)
            lineTo(8.898f, 8.007f)
            curveTo(8.532f, 8.057f, 8.25f, 8.37f, 8.25f, 8.75f)
            reflectiveCurveToRelative(0.282f, 0.694f, 0.648f, 0.743f)
            lineTo(9f, 9.5f)
            horizontalLineToRelative(10f)
            lineToRelative(0.102f, -0.007f)
            curveToRelative(0.366f, -0.05f, 0.648f, -0.363f, 0.648f, -0.743f)
            reflectiveCurveToRelative(-0.282f, -0.694f, -0.648f, -0.743f)
            lineTo(19f, 8f)
            close()
        }
    }.build()
}
