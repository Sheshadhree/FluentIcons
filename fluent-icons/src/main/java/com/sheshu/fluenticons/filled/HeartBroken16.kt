package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HeartBroken16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HeartBroken16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.354f, 3.775f)
            curveTo(6.075f, 2.678f, 4.152f, 2.73f, 2.946f, 3.936f)
            curveTo(1.68f, 5.202f, 1.686f, 7.26f, 2.958f, 8.531f)
            lineToRelative(4.707f, 4.708f)
            curveToRelative(0.195f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            lineToRelative(4.683f, -4.68f)
            curveToRelative(1.263f, -1.27f, 1.26f, -3.322f, -0.012f, -4.594f)
            curveToRelative(-1.274f, -1.274f, -3.333f, -1.28f, -4.601f, -0.012f)
            lineTo(8.414f, 3.981f)
            lineTo(7.16f, 5.903f)
            lineToRelative(2.162f, 1.825f)
            curveTo(9.43f, 7.818f, 9.495f, 7.95f, 9.5f, 8.09f)
            curveToRelative(0.005f, 0.14f, -0.047f, 0.276f, -0.146f, 0.375f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(1.116f, -1.115f)
            lineToRelative(-2.085f, -1.76f)
            curveTo(5.986f, 6.22f, 5.944f, 5.94f, 6.082f, 5.727f)
            lineToRelative(1.273f, -1.952f)
            close()
        }
    }.build()
}
