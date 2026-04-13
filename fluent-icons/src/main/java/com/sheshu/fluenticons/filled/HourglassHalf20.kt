package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HourglassHalf20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HourglassHalf20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.94f, 10f)
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
            horizontalLineTo(9.94f)
            close()
        }
    }.build()
}
