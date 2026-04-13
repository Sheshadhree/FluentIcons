package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PulseSquare24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PulseSquare24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.749f, 3f)
            curveToRelative(1.242f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(13.502f)
            curveToRelative(0f, 1.243f, -1.008f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(5.25f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(5.25f)
            curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
            horizontalLineToRelative(13.499f)
            close()
            moveTo(9.812f, 7.95f)
            lineTo(8.255f, 11.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 11.5f, 6f, 11.836f, 6f, 12.25f)
            curveTo(6f, 12.665f, 6.336f, 13f, 6.75f, 13f)
            horizontalLineToRelative(1.995f)
            curveToRelative(0.298f, 0f, 0.568f, -0.176f, 0.687f, -0.448f)
            lineToRelative(1.035f, -2.362f)
            lineToRelative(2.337f, 5.834f)
            curveToRelative(0.24f, 0.6f, 1.077f, 0.636f, 1.367f, 0.057f)
            lineToRelative(1.542f, -3.08f)
            horizontalLineToRelative(1.537f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            curveToRelative(0f, -0.415f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.284f, 0f, -0.543f, 0.16f, -0.67f, 0.414f)
            lineToRelative(-1.004f, 2.003f)
            lineToRelative(-2.381f, -5.946f)
            curveToRelative(-0.247f, -0.618f, -1.116f, -0.632f, -1.383f, -0.023f)
            close()
        }
    }.build()
}
