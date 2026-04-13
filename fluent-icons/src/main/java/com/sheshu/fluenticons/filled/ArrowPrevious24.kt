package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowPrevious24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowPrevious24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            curveTo(5.487f, 3f, 5.064f, 3.386f, 5.007f, 3.883f)
            lineTo(5f, 4f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            curveToRelative(0.513f, 0f, 0.936f, -0.386f, 0.993f, -0.883f)
            lineTo(7f, 20f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(12.707f, 0.293f)
            curveToRelative(-0.36f, -0.36f, -0.928f, -0.388f, -1.32f, -0.083f)
            lineToRelative(-0.094f, 0.083f)
            lineToRelative(-8f, 8f)
            curveToRelative(-0.36f, 0.36f, -0.388f, 0.928f, -0.083f, 1.32f)
            lineToRelative(0.083f, 0.094f)
            lineToRelative(8f, 8f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.36f, -0.36f, 0.388f, -0.928f, 0.083f, -1.32f)
            lineToRelative(-0.083f, -0.094f)
            lineTo(11.414f, 12f)
            lineToRelative(7.293f, -7.293f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            close()
        }
    }.build()
}
