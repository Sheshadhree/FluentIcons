package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnBidirectionalDownRight24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnBidirectionalDownRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.707f, 3.293f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(2.294f, 2.294f)
            horizontalLineTo(11.5f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            verticalLineToRelative(7.086f)
            lineToRelative(-2.293f, -2.293f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.415f)
            lineToRelative(4f, 4f)
            curveToRelative(0.391f, 0.39f, 1.024f, 0.39f, 1.415f, 0f)
            lineToRelative(4f, -4f)
            curveToRelative(0.39f, -0.391f, 0.39f, -1.024f, 0f, -1.415f)
            curveToRelative(-0.391f, -0.39f, -1.025f, -0.39f, -1.415f, 0f)
            lineTo(9f, 18.587f)
            verticalLineToRelative(-7.086f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(7.086f)
            lineToRelative(-2.293f, 2.293f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.023f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(4f, -4f)
            curveTo(21.896f, 8.52f, 22.002f, 8.266f, 22.002f, 8f)
            curveToRelative(0f, -0.265f, -0.106f, -0.52f, -0.293f, -0.707f)
            lineToRelative(-4f, -4.001f)
            close()
        }
    }.build()
}
