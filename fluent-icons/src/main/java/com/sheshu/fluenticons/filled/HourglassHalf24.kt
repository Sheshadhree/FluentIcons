package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HourglassHalf24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HourglassHalf24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 19.5f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.066f, 0f, 0.13f, -0.026f, 0.177f, -0.073f)
            curveToRelative(0.047f, -0.047f, 0.073f, -0.11f, 0.073f, -0.177f)
            verticalLineToRelative(-0.6f)
            curveToRelative(-0.005f, -0.524f, -0.137f, -1.038f, -0.384f, -1.5f)
            curveToRelative(-0.247f, -0.461f, -0.603f, -0.856f, -1.036f, -1.15f)
            lineTo(14f, 14.52f)
            curveToRelative(-0.42f, -0.278f, -0.77f, -0.65f, -1.02f, -1.089f)
            curveToRelative(-0.25f, -0.437f, -0.394f, -0.928f, -0.42f, -1.431f)
            horizontalLineToRelative(-1.12f)
            curveToRelative(-0.026f, 0.503f, -0.17f, 0.994f, -0.42f, 1.431f)
            curveToRelative(-0.25f, 0.438f, -0.6f, 0.811f, -1.02f, 1.089f)
            lineTo(7.92f, 16f)
            curveToRelative(-0.433f, 0.294f, -0.789f, 0.689f, -1.036f, 1.15f)
            curveToRelative(-0.247f, 0.462f, -0.379f, 0.976f, -0.384f, 1.5f)
            verticalLineToRelative(0.6f)
            curveToRelative(0f, 0.066f, 0.026f, 0.13f, 0.073f, 0.177f)
            curveTo(6.62f, 19.474f, 6.683f, 19.5f, 6.75f, 19.5f)
            close()
        }
    }.build()
}
