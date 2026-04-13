package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.458f, 3.293f)
            curveToRelative(-0.39f, -0.39f, -1.023f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.023f, 0f, 1.414f)
            lineTo(17.337f, 7f)
            horizontalLineTo(10.5f)
            curveTo(8.015f, 7f, 6f, 9.015f, 6f, 11.5f)
            verticalLineTo(20f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-8.5f)
            curveTo(8f, 10.12f, 9.12f, 9f, 10.5f, 9f)
            horizontalLineToRelative(7.335f)
            lineToRelative(-2.792f, 2.791f)
            curveToRelative(-0.39f, 0.391f, -0.39f, 1.024f, 0f, 1.415f)
            curveToRelative(0.39f, 0.39f, 1.023f, 0.39f, 1.414f, 0f)
            lineToRelative(4.25f, -4.25f)
            curveTo(20.895f, 8.77f, 21f, 8.516f, 21f, 8.25f)
            curveToRelative(0f, -0.266f, -0.105f, -0.52f, -0.293f, -0.707f)
            lineToRelative(-4.249f, -4.25f)
            close()
        }
    }.build()
}
