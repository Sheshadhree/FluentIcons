package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineFlowDiagonalUpRight32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineFlowDiagonalUpRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26.707f, 6.707f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineTo(11.618f, 18.968f)
            curveTo(10.732f, 18.358f, 9.657f, 18f, 8.5f, 18f)
            curveTo(5.462f, 18f, 3f, 20.462f, 3f, 23.5f)
            reflectiveCurveTo(5.462f, 29f, 8.5f, 29f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            curveToRelative(0f, -1.157f, -0.358f, -2.232f, -0.968f, -3.117f)
            lineTo(26.707f, 6.707f)
            close()
        }
    }.build()
}
