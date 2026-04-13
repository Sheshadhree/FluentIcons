package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Hourglass20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Hourglass20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.69f, 5.4f)
            curveTo(13.89f, 4.96f, 13.995f, 4.483f, 14f, 4f)
            horizontalLineTo(6f)
            curveToRelative(0.006f, 0.484f, 0.115f, 0.961f, 0.32f, 1.4f)
            curveToRelative(0.208f, 0.45f, 0.515f, 0.847f, 0.9f, 1.16f)
            lineToRelative(1.82f, 1.52f)
            curveTo(9.32f, 8.315f, 9.546f, 8.608f, 9.7f, 8.94f)
            curveTo(9.86f, 9.27f, 9.941f, 9.633f, 9.94f, 10f)
            curveToRelative(0.001f, 0.367f, -0.08f, 0.73f, -0.24f, 1.06f)
            curveToRelative(-0.154f, 0.332f, -0.38f, 0.625f, -0.66f, 0.86f)
            lineToRelative(-1.82f, 1.52f)
            curveToRelative(-0.385f, 0.313f, -0.692f, 0.71f, -0.9f, 1.16f)
            curveTo(6.115f, 15.039f, 6.006f, 15.516f, 6f, 16f)
            horizontalLineToRelative(8f)
            curveToRelative(-0.005f, -0.483f, -0.11f, -0.96f, -0.31f, -1.4f)
            curveToRelative(-0.214f, -0.45f, -0.525f, -0.845f, -0.91f, -1.16f)
            lineTo(11f, 11.91f)
            curveToRelative(-0.277f, -0.232f, -0.499f, -0.522f, -0.65f, -0.85f)
            curveToRelative(-0.177f, -0.326f, -0.276f, -0.69f, -0.29f, -1.06f)
            curveToRelative(0.014f, -0.37f, 0.113f, -0.734f, 0.29f, -1.06f)
            curveToRelative(0.151f, -0.328f, 0.373f, -0.618f, 0.65f, -0.85f)
            lineToRelative(1.78f, -1.53f)
            curveToRelative(0.385f, -0.315f, 0.696f, -0.71f, 0.91f, -1.16f)
            close()
        }
    }.build()
}
