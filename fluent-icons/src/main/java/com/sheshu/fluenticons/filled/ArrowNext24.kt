package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowNext24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowNext24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 3f)
            curveToRelative(0.513f, 0f, 0.936f, 0.386f, 0.993f, 0.883f)
            lineTo(19f, 4f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            curveToRelative(-0.513f, 0f, -0.936f, -0.386f, -0.993f, -0.883f)
            lineTo(17f, 20f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveTo(5.293f, 3.293f)
            curveToRelative(0.36f, -0.36f, 0.928f, -0.388f, 1.32f, -0.083f)
            lineToRelative(0.094f, 0.083f)
            lineToRelative(8f, 8f)
            curveToRelative(0.36f, 0.36f, 0.388f, 0.928f, 0.083f, 1.32f)
            lineToRelative(-0.083f, 0.094f)
            lineToRelative(-8f, 8f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.36f, -0.36f, -0.388f, -0.928f, -0.083f, -1.32f)
            lineToRelative(0.083f, -0.094f)
            lineTo(12.586f, 12f)
            lineTo(5.293f, 4.707f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            close()
        }
    }.build()
}
