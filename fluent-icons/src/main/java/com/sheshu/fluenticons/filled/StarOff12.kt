package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarOff12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarOff12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.853f, 1.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.706f, 0f)
            curveToRelative(-0.196f, 0.195f, -0.196f, 0.511f, 0f, 0.706f)
            lineToRelative(2.082f, 2.083f)
            lineTo(1.685f, 4.16f)
            curveTo(1.03f, 4.255f, 0.768f, 5.06f, 1.242f, 5.524f)
            lineToRelative(1.8f, 1.754f)
            lineToRelative(-0.425f, 2.476f)
            curveToRelative(-0.112f, 0.653f, 0.574f, 1.152f, 1.16f, 0.843f)
            lineToRelative(2.224f, -1.169f)
            lineToRelative(2.223f, 1.169f)
            curveToRelative(0.484f, 0.254f, 1.034f, -0.039f, 1.15f, -0.515f)
            lineToRelative(0.772f, 0.772f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-9f, -9f)
            close()
            moveToRelative(8.906f, 4.377f)
            lineTo(9.182f, 7.061f)
            lineTo(4.75f, 2.628f)
            lineToRelative(0.535f, -1.082f)
            curveToRelative(0.293f, -0.595f, 1.14f, -0.595f, 1.434f, 0f)
            lineTo(7.83f, 3.799f)
            lineToRelative(2.486f, 0.36f)
            curveToRelative(0.656f, 0.096f, 0.918f, 0.902f, 0.443f, 1.365f)
            close()
        }
    }.build()
}
