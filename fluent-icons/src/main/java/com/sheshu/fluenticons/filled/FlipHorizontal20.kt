package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlipHorizontal20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipHorizontal20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.878f, 15.66f)
            curveTo(17.74f, 15.872f, 17.503f, 16f, 17.25f, 16f)
            horizontalLineToRelative(-5.5f)
            curveTo(11.336f, 16f, 11f, 15.664f, 11f, 15.25f)
            verticalLineTo(2.75f)
            curveToRelative(0f, -0.355f, 0.248f, -0.66f, 0.596f, -0.734f)
            curveToRelative(0.347f, -0.073f, 0.698f, 0.107f, 0.84f, 0.432f)
            lineToRelative(5.5f, 12.5f)
            curveToRelative(0.102f, 0.232f, 0.08f, 0.5f, -0.058f, 0.712f)
            close()
            moveTo(12.5f, 6.317f)
            verticalLineTo(14.5f)
            horizontalLineToRelative(3.6f)
            lineToRelative(-3.6f, -8.183f)
            close()
            moveTo(2.5f, 16f)
            curveToRelative(-0.17f, 0f, -0.33f, -0.087f, -0.421f, -0.23f)
            curveToRelative(-0.092f, -0.144f, -0.104f, -0.325f, -0.033f, -0.48f)
            lineToRelative(6f, -13f)
            curveToRelative(0.098f, -0.213f, 0.332f, -0.329f, 0.561f, -0.278f)
            curveTo(8.837f, 2.062f, 9f, 2.265f, 9f, 2.5f)
            verticalLineToRelative(13f)
            curveTo(9f, 15.776f, 8.776f, 16f, 8.5f, 16f)
            horizontalLineToRelative(-6f)
            close()
        }
    }.build()
}
