package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSortUp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSortUp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.293f, 8.293f)
            lineToRelative(3.995f, -4f)
            curveToRelative(0.36f, -0.36f, 0.928f, -0.388f, 1.32f, -0.084f)
            lineToRelative(0.094f, 0.083f)
            lineToRelative(4.006f, 4f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.415f)
            curveToRelative(-0.36f, 0.36f, -0.927f, 0.388f, -1.32f, 0.084f)
            lineToRelative(-0.094f, -0.083f)
            lineToRelative(-2.293f, -2.291f)
            verticalLineToRelative(11.584f)
            curveToRelative(0f, 0.512f, -0.386f, 0.935f, -0.883f, 0.993f)
            lineTo(12f, 20f)
            curveToRelative(-0.513f, 0f, -0.935f, -0.386f, -0.993f, -0.884f)
            lineTo(11f, 19.001f)
            verticalLineTo(7.41f)
            lineTo(8.708f, 9.707f)
            curveToRelative(-0.36f, 0.36f, -0.928f, 0.388f, -1.32f, 0.084f)
            lineTo(7.293f, 9.707f)
            curveToRelative(-0.36f, -0.36f, -0.388f, -0.927f, -0.084f, -1.32f)
            lineToRelative(0.084f, -0.094f)
            lineToRelative(3.995f, -4f)
            lineToRelative(-3.995f, 4f)
            close()
        }
    }.build()
}
