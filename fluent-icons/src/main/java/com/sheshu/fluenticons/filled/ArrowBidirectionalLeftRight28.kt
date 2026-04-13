package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowBidirectionalLeftRight28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowBidirectionalLeftRight28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.707f, 7.295f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.023f, 0f, 1.414f)
            lineToRelative(-4.293f, 4.293f)
            horizontalLineToRelative(15.172f)
            lineToRelative(-4.293f, -4.293f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineToRelative(6f, 6f)
            curveTo(24.895f, 13.481f, 25f, 13.736f, 25f, 14.002f)
            curveToRelative(0f, 0.265f, -0.105f, 0.52f, -0.293f, 0.707f)
            lineToRelative(-6f, 6f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.415f)
            lineToRelative(4.293f, -4.292f)
            horizontalLineTo(6.414f)
            lineToRelative(4.293f, 4.292f)
            curveToRelative(0.39f, 0.391f, 0.39f, 1.024f, 0f, 1.415f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-6f, -6f)
            curveTo(3.105f, 14.52f, 3f, 14.267f, 3f, 14.002f)
            curveToRelative(0f, -0.266f, 0.105f, -0.52f, 0.293f, -0.708f)
            lineToRelative(6f, -6f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            close()
        }
    }.build()
}
