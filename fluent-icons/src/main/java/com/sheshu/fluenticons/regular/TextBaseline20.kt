package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextBaseline20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextBaseline20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.461f, 3.806f)
            curveToRelative(-0.078f, -0.185f, -0.26f, -0.306f, -0.46f, -0.306f)
            curveToRelative(-0.202f, 0f, -0.383f, 0.12f, -0.461f, 0.306f)
            lineToRelative(-4f, 9.5f)
            curveToRelative(-0.108f, 0.255f, 0.012f, 0.548f, 0.266f, 0.655f)
            curveToRelative(0.255f, 0.107f, 0.548f, -0.013f, 0.655f, -0.267f)
            lineTo(8.016f, 10f)
            horizontalLineToRelative(3.968f)
            lineToRelative(1.555f, 3.694f)
            curveToRelative(0.107f, 0.254f, 0.4f, 0.374f, 0.655f, 0.267f)
            curveToRelative(0.255f, -0.107f, 0.374f, -0.4f, 0.267f, -0.655f)
            lineToRelative(-4f, -9.5f)
            close()
            moveTo(11.563f, 9f)
            horizontalLineTo(8.437f)
            lineTo(10f, 5.288f)
            lineTo(11.563f, 9f)
            close()
            moveTo(2.5f, 16f)
            curveTo(2.224f, 16f, 2f, 16.224f, 2f, 16.5f)
            reflectiveCurveTo(2.224f, 17f, 2.5f, 17f)
            horizontalLineToRelative(15f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 16f, 17.5f, 16f)
            horizontalLineToRelative(-15f)
            close()
        }
    }.build()
}
