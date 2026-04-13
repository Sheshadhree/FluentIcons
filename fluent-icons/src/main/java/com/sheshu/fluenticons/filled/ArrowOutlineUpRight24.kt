package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowOutlineUpRight24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowOutlineUpRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.832f, 2.012f)
            curveToRelative(1.242f, -0.138f, 2.292f, 0.912f, 2.154f, 2.154f)
            lineToRelative(-1.34f, 12.061f)
            curveToRelative(-0.18f, 1.625f, -2.161f, 2.32f, -3.317f, 1.164f)
            lineToRelative(-1.267f, -1.267f)
            lineToRelative(-5.304f, 5.303f)
            curveToRelative(-0.761f, 0.762f, -1.996f, 0.762f, -2.758f, 0f)
            lineToRelative(-5.429f, -5.429f)
            curveToRelative(-0.761f, -0.761f, -0.761f, -1.996f, 0f, -2.758f)
            lineToRelative(5.304f, -5.303f)
            lineToRelative(-1.268f, -1.268f)
            curveTo(5.451f, 5.513f, 6.146f, 3.533f, 7.771f, 3.352f)
            lineToRelative(12.061f, -1.34f)
            close()
        }
    }.build()
}
