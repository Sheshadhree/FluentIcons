package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Triangle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Triangle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.502f, 18f)
            curveToRelative(-1.13f, 0f, -1.854f, -1.2f, -1.326f, -2.2f)
            lineToRelative(7.395f, -14f)
            curveToRelative(0.559f, -1.06f, 2.073f, -1.068f, 2.645f, -0.016f)
            lineToRelative(7.6f, 14.002f)
            curveTo(19.358f, 16.785f, 18.635f, 18f, 17.497f, 18f)
            horizontalLineTo(2.502f)
            close()
            moveTo(2.06f, 16.267f)
            curveTo(1.884f, 16.6f, 2.126f, 17f, 2.502f, 17f)
            horizontalLineToRelative(14.995f)
            curveToRelative(0.38f, 0f, 0.62f, -0.405f, 0.44f, -0.738f)
            lineToRelative(-7.6f, -14.001f)
            curveToRelative(-0.19f, -0.35f, -0.696f, -0.348f, -0.882f, 0.005f)
            lineTo(2.06f, 16.267f)
            close()
        }
    }.build()
}
