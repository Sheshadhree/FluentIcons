package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextColor20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColor20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.464f, 2.314f)
            curveTo(10.388f, 2.124f, 10.204f, 2f, 10f, 2f)
            curveTo(9.796f, 2f, 9.612f, 2.124f, 9.536f, 2.314f)
            lineToRelative(-3f, 7.5f)
            curveToRelative(-0.103f, 0.257f, 0.022f, 0.548f, 0.278f, 0.65f)
            curveToRelative(0.257f, 0.103f, 0.548f, -0.022f, 0.65f, -0.278f)
            lineToRelative(1.073f, -2.682f)
            horizontalLineToRelative(2.926f)
            lineToRelative(1.073f, 2.682f)
            curveToRelative(0.102f, 0.256f, 0.393f, 0.38f, 0.65f, 0.278f)
            curveToRelative(0.256f, -0.102f, 0.38f, -0.393f, 0.278f, -0.65f)
            lineToRelative(-3f, -7.5f)
            close()
            moveTo(10f, 3.846f)
            lineToRelative(1.063f, 2.658f)
            horizontalLineTo(8.937f)
            lineTo(10f, 3.846f)
            close()
            moveTo(4.5f, 12f)
            curveTo(3.672f, 12f, 3f, 12.672f, 3f, 13.5f)
            verticalLineToRelative(3f)
            curveTo(3f, 17.328f, 3.672f, 18f, 4.5f, 18f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}
