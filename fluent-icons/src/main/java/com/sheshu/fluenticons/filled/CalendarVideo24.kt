package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarVideo24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarVideo24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.25f, 4.5f)
            curveToRelative(0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
            horizontalLineToRelative(9f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            horizontalLineTo(1.25f)
            close()
            moveToRelative(0f, 1.5f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(0.75f)
            verticalLineTo(13.5f)
            curveToRelative(0f, -2.347f, 1.903f, -4.25f, 4.25f, -4.25f)
            horizontalLineToRelative(6f)
            curveToRelative(0.435f, 0f, 0.855f, 0.065f, 1.25f, 0.187f)
            verticalLineTo(6f)
            horizontalLineTo(1.25f)
            close()
            moveToRelative(14.25f, 4.25f)
            curveToRelative(0.443f, 0f, 0.865f, 0.089f, 1.25f, 0.25f)
            curveToRelative(1.13f, 0.47f, 1.937f, 1.561f, 1.997f, 2.848f)
            lineToRelative(2.474f, -1.8f)
            curveTo(22.377f, 10.707f, 24f, 11.533f, 24f, 12.964f)
            verticalLineToRelative(7.072f)
            curveToRelative(0f, 1.43f, -1.623f, 2.257f, -2.78f, 1.415f)
            lineToRelative(-2.473f, -1.8f)
            curveToRelative(-0.08f, 1.725f, -1.503f, 3.099f, -3.247f, 3.099f)
            horizontalLineToRelative(-6f)
            curveToRelative(-1.795f, 0f, -3.25f, -1.455f, -3.25f, -3.25f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
            horizontalLineToRelative(6f)
            close()
        }
    }.build()
}
