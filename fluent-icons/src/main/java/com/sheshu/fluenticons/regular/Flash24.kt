package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Flash24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Flash24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.425f, 2.83f)
            curveTo(7.602f, 2.332f, 8.074f, 2f, 8.603f, 2f)
            horizontalLineToRelative(6.453f)
            curveToRelative(0.853f, 0f, 1.456f, 0.836f, 1.186f, 1.645f)
            lineTo(14.79f, 8f)
            horizontalLineToRelative(3.96f)
            curveToRelative(1.103f, 0f, 1.665f, 1.327f, 0.897f, 2.12f)
            lineTo(8.586f, 21.536f)
            curveToRelative(-1.054f, 1.088f, -2.872f, 0.106f, -2.541f, -1.372f)
            lineToRelative(1.27f, -5.668f)
            lineToRelative(-1.57f, -0.006f)
            curveToRelative(-1.206f, -0.004f, -2.046f, -1.2f, -1.641f, -2.337f)
            lineTo(7.425f, 2.83f)
            close()
            moveTo(8.779f, 3.5f)
            lineToRelative(-3.262f, 9.156f)
            curveTo(5.459f, 12.82f, 5.579f, 12.99f, 5.75f, 12.99f)
            lineTo(8.253f, 13f)
            curveToRelative(0.227f, 0f, 0.441f, 0.105f, 0.583f, 0.282f)
            curveToRelative(0.142f, 0.178f, 0.195f, 0.41f, 0.146f, 0.632f)
            lineToRelative(-1.473f, 6.578f)
            lineTo(18.159f, 9.5f)
            horizontalLineToRelative(-4.41f)
            curveToRelative(-0.24f, 0f, -0.467f, -0.116f, -0.607f, -0.312f)
            curveToRelative(-0.141f, -0.195f, -0.18f, -0.447f, -0.104f, -0.675f)
            lineTo(14.71f, 3.5f)
            horizontalLineTo(8.78f)
            close()
        }
    }.build()
}
