package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Fluent32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Fluent32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.447f, 2.106f)
            curveToRelative(-0.281f, -0.141f, -0.613f, -0.141f, -0.894f, 0f)
            lineToRelative(-8f, 4f)
            curveTo(8.214f, 6.275f, 8f, 6.62f, 8f, 7f)
            verticalLineToRelative(17.5f)
            curveToRelative(0f, 0.361f, 0.195f, 0.695f, 0.51f, 0.872f)
            lineToRelative(8f, 4.5f)
            curveToRelative(0.31f, 0.174f, 0.688f, 0.17f, 0.995f, -0.009f)
            curveTo(17.81f, 29.683f, 18f, 29.355f, 18f, 29f)
            verticalLineToRelative(-9.382f)
            lineToRelative(7.447f, -3.724f)
            curveTo(25.786f, 15.725f, 26f, 15.38f, 26f, 15f)
            reflectiveCurveToRelative(-0.214f, -0.725f, -0.553f, -0.894f)
            lineTo(19.237f, 11f)
            lineToRelative(6.21f, -3.106f)
            curveTo(25.786f, 7.725f, 26f, 7.38f, 26f, 7f)
            reflectiveCurveToRelative(-0.214f, -0.725f, -0.553f, -0.894f)
            lineToRelative(-8f, -4f)
            close()
        }
    }.build()
}
