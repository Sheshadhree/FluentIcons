package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EraserSegment24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EraserSegment24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.651f, 2.638f)
            curveToRelative(0.886f, -0.878f, 2.317f, -0.867f, 3.19f, 0.023f)
            lineToRelative(4.91f, 5.008f)
            curveToRelative(0.861f, 0.878f, 0.858f, 2.285f, -0.007f, 3.158f)
            lineTo(12.16f, 19.5f)
            horizontalLineToRelative(3.954f)
            curveToRelative(0.318f, -1.015f, 1.266f, -1.75f, 2.385f, -1.75f)
            curveToRelative(1.38f, 0f, 2.5f, 1.119f, 2.5f, 2.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            curveToRelative(-1.12f, 0f, -2.067f, -0.736f, -2.386f, -1.75f)
            horizontalLineTo(9.848f)
            curveToRelative(-0.606f, 0.03f, -1.222f, -0.184f, -1.69f, -0.642f)
            lineTo(3.06f, 15.35f)
            curveToRelative(-0.896f, -0.879f, -0.899f, -2.32f, -0.007f, -3.204f)
            lineToRelative(9.598f, -9.508f)
            close()
            moveTo(9.801f, 19.5f)
            curveToRelative(0.17f, -0.015f, 0.337f, -0.089f, 0.467f, -0.22f)
            lineToRelative(1.468f, -1.483f)
            lineToRelative(-6.099f, -6.1f)
            lineToRelative(-1.529f, 1.515f)
            curveToRelative(-0.297f, 0.294f, -0.296f, 0.775f, 0.003f, 1.068f)
            lineToRelative(5.099f, 5.008f)
            curveToRelative(0.15f, 0.147f, 0.345f, 0.218f, 0.54f, 0.214f)
            verticalLineTo(19.5f)
            horizontalLineTo(9.8f)
            close()
        }
    }.build()
}
