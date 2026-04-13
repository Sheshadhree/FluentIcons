package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowOutlineDownLeft32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowOutlineDownLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.036f, 2.879f)
            curveToRelative(-1.172f, -1.172f, -3.071f, -1.172f, -4.243f, 0f)
            lineTo(10.89f, 9.782f)
            lineTo(9.14f, 8.033f)
            curveTo(7.02f, 5.912f, 3.386f, 7.27f, 3.175f, 10.262f)
            lineToRelative(-1.167f, 16.53f)
            curveToRelative(-0.129f, 1.82f, 1.384f, 3.332f, 3.204f, 3.204f)
            lineToRelative(16.533f, -1.168f)
            curveToRelative(2.993f, -0.212f, 4.35f, -3.845f, 2.228f, -5.967f)
            lineToRelative(-1.75f, -1.748f)
            lineToRelative(6.903f, -6.902f)
            curveToRelative(1.171f, -1.171f, 1.171f, -3.07f, 0f, -4.242f)
            lineToRelative(-7.09f, -7.09f)
            close()
        }
    }.build()
}
