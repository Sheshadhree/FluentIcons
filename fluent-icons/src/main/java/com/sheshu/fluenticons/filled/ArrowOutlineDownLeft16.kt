package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowOutlineDownLeft16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowOutlineDownLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.151f, 1.44f)
            curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0f)
            lineTo(5.004f, 5.464f)
            lineTo(3.907f, 4.368f)
            curveToRelative(-0.75f, -0.75f, -2.033f, -0.285f, -2.13f, 0.77f)
            lineToRelative(-0.772f, 8.5f)
            curveToRelative(-0.07f, 0.777f, 0.58f, 1.429f, 1.358f, 1.358f)
            lineToRelative(8.499f, -0.773f)
            curveToRelative(1.055f, -0.096f, 1.52f, -1.379f, 0.77f, -2.128f)
            lineToRelative(-1.098f, -1.099f)
            lineTo(14.56f, 6.97f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0f, -2.121f)
            lineToRelative(-3.409f, -3.41f)
            close()
        }
    }.build()
}
