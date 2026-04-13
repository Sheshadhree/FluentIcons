package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pill20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pill20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.147f, 3.147f)
            curveToRelative(1.576f, -1.576f, 4.131f, -1.576f, 5.707f, 0f)
            curveToRelative(1.576f, 1.576f, 1.576f, 4.131f, 0f, 5.707f)
            lineToRelative(-8f, 8f)
            curveToRelative(-1.576f, 1.576f, -4.131f, 1.576f, -5.707f, 0f)
            curveToRelative(-1.576f, -1.576f, -1.576f, -4.131f, 0f, -5.707f)
            lineToRelative(8f, -8f)
            close()
            moveToRelative(5f, 0.707f)
            curveToRelative(-1.186f, -1.186f, -3.108f, -1.186f, -4.293f, 0f)
            lineTo(8.208f, 7.5f)
            lineToRelative(4.292f, 4.293f)
            lineToRelative(3.647f, -3.646f)
            curveToRelative(1.185f, -1.186f, 1.185f, -3.108f, 0f, -4.293f)
            close()
            moveTo(8.854f, 14.147f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.357f, 0.357f, -0.936f, 0.357f, -1.293f, 0f)
            curveTo(5.264f, 15.557f, 5.14f, 15.5f, 5f, 15.5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.223f, -0.5f, 0.5f)
            curveToRelative(0f, 0.14f, 0.058f, 0.265f, 0.15f, 0.356f)
            curveToRelative(0.748f, 0.745f, 1.958f, 0.744f, 2.704f, -0.003f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            close()
        }
    }.build()
}
