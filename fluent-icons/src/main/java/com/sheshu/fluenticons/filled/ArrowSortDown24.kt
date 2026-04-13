package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSortDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSortDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.883f, 4.01f)
            lineTo(12f, 4.005f)
            curveToRelative(0.513f, 0f, 0.935f, 0.386f, 0.993f, 0.883f)
            lineTo(13f, 5.004f)
            verticalLineToRelative(11.584f)
            lineToRelative(2.293f, -2.294f)
            curveToRelative(0.36f, -0.36f, 0.927f, -0.389f, 1.32f, -0.084f)
            lineToRelative(0.094f, 0.083f)
            curveToRelative(0.36f, 0.36f, 0.388f, 0.928f, 0.084f, 1.32f)
            lineToRelative(-0.084f, 0.095f)
            lineToRelative(-3.996f, 4f)
            curveToRelative(-0.36f, 0.36f, -0.927f, 0.388f, -1.32f, 0.083f)
            lineToRelative(-0.094f, -0.083f)
            lineToRelative(-4.004f, -4f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.023f, 0f, -1.414f)
            curveToRelative(0.36f, -0.36f, 0.927f, -0.389f, 1.32f, -0.084f)
            lineToRelative(0.094f, 0.083f)
            lineTo(11f, 16.583f)
            verticalLineTo(5.004f)
            curveToRelative(0f, -0.512f, 0.386f, -0.935f, 0.883f, -0.992f)
            lineTo(12f, 4.004f)
            lineTo(11.883f, 4.01f)
            close()
        }
    }.build()
}
