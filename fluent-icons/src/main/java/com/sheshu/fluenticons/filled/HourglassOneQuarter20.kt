package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HourglassOneQuarter20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HourglassOneQuarter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.68f, 14f)
            curveToRelative(-0.141f, 0.186f, -0.262f, 0.387f, -0.36f, 0.6f)
            curveTo(6.115f, 15.039f, 6.006f, 15.516f, 6f, 16f)
            horizontalLineToRelative(8f)
            curveToRelative(-0.005f, -0.483f, -0.11f, -0.96f, -0.31f, -1.4f)
            curveToRelative(-0.101f, -0.213f, -0.225f, -0.414f, -0.367f, -0.6f)
            horizontalLineTo(6.679f)
            close()
        }
    }.build()
}
