package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronUpDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronUpDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.79f, 8.387f)
            curveToRelative(0.305f, 0.392f, 0.278f, 0.96f, -0.083f, 1.32f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineTo(12f, 4.414f)
            lineTo(6.707f, 9.707f)
            lineTo(6.613f, 9.79f)
            curveToRelative(-0.392f, 0.305f, -0.96f, 0.278f, -1.32f, -0.083f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(6f, -6f)
            lineToRelative(0.094f, -0.083f)
            curveToRelative(0.392f, -0.305f, 0.96f, -0.278f, 1.32f, 0.083f)
            lineToRelative(6f, 6f)
            lineToRelative(0.083f, 0.094f)
            close()
            moveTo(5.21f, 15.613f)
            curveToRelative(-0.305f, -0.392f, -0.278f, -0.96f, 0.083f, -1.32f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineTo(12f, 19.586f)
            lineToRelative(5.293f, -5.293f)
            lineToRelative(0.094f, -0.083f)
            curveToRelative(0.392f, -0.305f, 0.96f, -0.278f, 1.32f, 0.083f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-6f, 6f)
            lineToRelative(-0.094f, 0.083f)
            curveToRelative(-0.392f, 0.305f, -0.96f, 0.278f, -1.32f, -0.083f)
            lineToRelative(-6f, -6f)
            lineToRelative(-0.083f, -0.094f)
            close()
        }
    }.build()
}
