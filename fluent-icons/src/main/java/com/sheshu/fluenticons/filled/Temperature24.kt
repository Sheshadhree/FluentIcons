package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Temperature24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Temperature24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(2.142f, 0f, 3.891f, 1.684f, 3.995f, 3.8f)
            lineTo(16f, 6f)
            lineToRelative(0.001f, 6.728f)
            lineToRelative(0.055f, 0.058f)
            curveToRelative(0.796f, 0.868f, 1.297f, 1.971f, 1.416f, 3.16f)
            lineToRelative(0.021f, 0.276f)
            lineTo(17.5f, 16.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveToRelative(-5.5f, -2.462f, -5.5f, -5.5f)
            curveToRelative(0f, -1.305f, 0.458f, -2.538f, 1.266f, -3.511f)
            lineToRelative(0.178f, -0.205f)
            lineTo(8f, 12.727f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.073f, 1.577f, -3.778f, 3.597f, -3.98f)
            lineTo(11.8f, 2.005f)
            lineTo(12f, 2f)
            close()
            moveToRelative(0f, 2f)
            curveToRelative(-1.054f, 0f, -1.918f, 0.816f, -1.995f, 1.85f)
            lineTo(10f, 6f)
            verticalLineToRelative(7.593f)
            lineToRelative(-0.333f, 0.298f)
            curveTo(8.929f, 14.551f, 8.5f, 15.491f, 8.5f, 16.5f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            curveToRelative(0f, -0.937f, -0.37f, -1.813f, -1.013f, -2.462f)
            lineToRelative(-0.153f, -0.146f)
            lineToRelative(-0.333f, -0.298f)
            lineTo(14f, 6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
            moveToRelative(0f, 4f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(5.208f)
            curveToRelative(0.883f, 0.386f, 1.5f, 1.267f, 1.5f, 2.292f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            curveToRelative(0f, -1.025f, 0.617f, -1.906f, 1.5f, -2.292f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
