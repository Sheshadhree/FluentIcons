package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HourglassOneQuarter16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HourglassOneQuarter16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.113f, 11f)
            lineToRelative(-0.095f, 0.08f)
            curveToRelative(-0.296f, 0.257f, -0.518f, 0.496f, -0.683f, 0.806f)
            curveToRelative(-0.13f, 0.247f, -0.256f, 0.595f, -0.31f, 1.114f)
            horizontalLineToRelative(5.946f)
            curveToRelative(-0.054f, -0.52f, -0.179f, -0.868f, -0.31f, -1.114f)
            curveToRelative(-0.164f, -0.31f, -0.386f, -0.55f, -0.681f, -0.806f)
            lineTo(9.885f, 11f)
            horizontalLineTo(6.113f)
            close()
        }
    }.build()
}
