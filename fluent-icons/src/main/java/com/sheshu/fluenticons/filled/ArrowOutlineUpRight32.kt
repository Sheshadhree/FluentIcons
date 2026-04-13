package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowOutlineUpRight32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowOutlineUpRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.969f, 29.125f)
            curveToRelative(1.171f, 1.171f, 3.07f, 1.171f, 4.242f, 0f)
            lineToRelative(6.904f, -6.904f)
            lineToRelative(1.749f, 1.75f)
            curveToRelative(2.122f, 2.12f, 5.755f, 0.763f, 5.966f, -2.23f)
            lineToRelative(1.167f, -16.53f)
            curveToRelative(0.128f, -1.82f, -1.384f, -3.332f, -3.204f, -3.203f)
            lineTo(10.26f, 3.175f)
            curveTo(7.266f, 3.387f, 5.91f, 7.02f, 8.032f, 9.142f)
            lineTo(9.78f, 10.89f)
            lineToRelative(-6.9f, 6.902f)
            curveToRelative(-1.172f, 1.171f, -1.172f, 3.071f, 0f, 4.243f)
            lineToRelative(7.09f, 7.09f)
            close()
        }
    }.build()
}
