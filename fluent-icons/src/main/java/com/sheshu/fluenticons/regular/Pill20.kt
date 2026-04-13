package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Pill20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pill20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.854f, 13.147f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(-1.5f, 1.5f)
            curveTo(6.608f, 16.1f, 5.4f, 16.102f, 4.651f, 15.358f)
            curveTo(4.558f, 15.267f, 4.5f, 15.14f, 4.5f, 15f)
            curveToRelative(0f, -0.277f, 0.223f, -0.5f, 0.5f, -0.5f)
            curveToRelative(0.138f, 0f, 0.263f, 0.056f, 0.353f, 0.146f)
            curveToRelative(0.357f, 0.357f, 0.936f, 0.357f, 1.293f, 0f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.195f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            close()
            moveToRelative(2.293f, -10f)
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
            moveTo(11.793f, 12.5f)
            lineTo(7.5f, 8.207f)
            lineToRelative(-3.646f, 3.647f)
            curveToRelative(-1.186f, 1.185f, -1.186f, 3.107f, 0f, 4.293f)
            curveToRelative(1.185f, 1.185f, 3.107f, 1.185f, 4.293f, 0f)
            lineToRelative(3.646f, -3.647f)
            close()
        }
    }.build()
}
