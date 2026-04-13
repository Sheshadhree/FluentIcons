package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Dismiss24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Dismiss24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.21f, 4.387f)
            lineToRelative(0.083f, -0.094f)
            curveToRelative(0.36f, -0.36f, 0.928f, -0.388f, 1.32f, -0.083f)
            lineToRelative(0.094f, 0.083f)
            lineTo(12f, 10.585f)
            lineToRelative(6.293f, -6.292f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineTo(13.415f, 12f)
            lineToRelative(6.292f, 6.293f)
            curveToRelative(0.36f, 0.36f, 0.388f, 0.928f, 0.083f, 1.32f)
            lineToRelative(-0.083f, 0.094f)
            curveToRelative(-0.36f, 0.36f, -0.928f, 0.388f, -1.32f, 0.083f)
            lineToRelative(-0.094f, -0.083f)
            lineTo(12f, 13.415f)
            lineToRelative(-6.293f, 6.292f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineTo(10.585f, 12f)
            lineTo(4.293f, 5.707f)
            curveToRelative(-0.36f, -0.36f, -0.388f, -0.928f, -0.083f, -1.32f)
            lineToRelative(0.083f, -0.094f)
            lineTo(4.21f, 4.387f)
            close()
        }
    }.build()
}
