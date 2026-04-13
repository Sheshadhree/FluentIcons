package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Eye48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Eye48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(41.56f, 26.13f)
            curveToRelative(0.17f, 0.53f, 0.66f, 0.87f, 1.19f, 0.87f)
            curveToRelative(0.13f, 0f, 0.25f, -0.02f, 0.38f, -0.06f)
            curveToRelative(0.65f, -0.21f, 1.02f, -0.91f, 0.81f, -1.57f)
            lineToRelative(-0.001f, -0.003f)
            curveTo(43.85f, 25.1f, 38.841f, 10f, 23.999f, 10f)
            curveTo(9.16f, 10f, 4.15f, 25.1f, 4.062f, 25.367f)
            lineTo(4.06f, 25.37f)
            curveToRelative(-0.21f, 0.66f, 0.15f, 1.36f, 0.81f, 1.57f)
            curveToRelative(0.66f, 0.21f, 1.36f, -0.15f, 1.57f, -0.81f)
            curveTo(6.62f, 25.57f, 10.95f, 12.5f, 24f, 12.5f)
            curveToRelative(13.05f, 0f, 17.38f, 13.07f, 17.56f, 13.63f)
            close()
            moveTo(24f, 36f)
            curveToRelative(4.97f, 0f, 9f, -4.03f, 9f, -9f)
            reflectiveCurveToRelative(-4.03f, -9f, -9f, -9f)
            reflectiveCurveToRelative(-9f, 4.03f, -9f, 9f)
            reflectiveCurveToRelative(4.03f, 9f, 9f, 9f)
            close()
        }
    }.build()
}
