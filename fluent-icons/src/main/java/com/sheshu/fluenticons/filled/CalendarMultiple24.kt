package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.994f, 5.007f)
            lineToRelative(0.004f, 0.121f)
            lineTo(20f, 5.25f)
            verticalLineToRelative(11.1f)
            curveToRelative(0f, 2.016f, -1.634f, 3.65f, -3.65f, 3.65f)
            horizontalLineTo(5.25f)
            curveToRelative(-0.082f, 0f, -0.163f, -0.002f, -0.243f, -0.007f)
            curveTo(5.583f, 20.9f, 6.597f, 21.5f, 7.75f, 21.5f)
            horizontalLineToRelative(8.6f)
            curveToRelative(2.844f, 0f, 5.15f, -2.306f, 5.15f, -5.15f)
            verticalLineToRelative(-8.6f)
            curveToRelative(0f, -1.153f, -0.6f, -2.166f, -1.506f, -2.743f)
            close()
            moveTo(2f, 7.5f)
            verticalLineToRelative(8.25f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineToRelative(10.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(7.5f)
            horizontalLineTo(2f)
            close()
            moveTo(5.25f, 2f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineTo(6f)
            horizontalLineToRelative(17f)
            verticalLineTo(5.25f)
            curveTo(19f, 3.455f, 17.545f, 2f, 15.75f, 2f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}
