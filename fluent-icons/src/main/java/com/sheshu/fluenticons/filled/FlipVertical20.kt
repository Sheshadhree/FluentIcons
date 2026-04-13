package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlipVertical20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipVertical20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.66f, 2.122f)
            curveTo(15.872f, 2.26f, 16f, 2.497f, 16f, 2.75f)
            verticalLineToRelative(5.5f)
            curveTo(16f, 8.664f, 15.664f, 9f, 15.25f, 9f)
            horizontalLineTo(2.75f)
            curveTo(2.395f, 9f, 2.09f, 8.752f, 2.016f, 8.404f)
            curveToRelative(-0.073f, -0.347f, 0.107f, -0.698f, 0.432f, -0.84f)
            lineToRelative(12.5f, -5.5f)
            curveToRelative(0.232f, -0.103f, 0.5f, -0.08f, 0.712f, 0.058f)
            close()
            moveTo(6.317f, 7.5f)
            horizontalLineTo(14.5f)
            verticalLineTo(3.9f)
            lineTo(6.317f, 7.5f)
            close()
            moveTo(16f, 17.5f)
            curveToRelative(0f, 0.17f, -0.087f, 0.33f, -0.23f, 0.421f)
            curveToRelative(-0.144f, 0.092f, -0.325f, 0.104f, -0.48f, 0.033f)
            lineToRelative(-13f, -6f)
            curveToRelative(-0.213f, -0.098f, -0.329f, -0.332f, -0.278f, -0.561f)
            curveTo(2.062f, 11.163f, 2.265f, 11f, 2.5f, 11f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(6f)
            close()
        }
    }.build()
}
