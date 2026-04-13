package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Replay32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Replay32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.056f, 8f)
            curveTo(9.253f, 5.545f, 12.446f, 4f, 16f, 4f)
            curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(4f, 22.627f, 4f, 16f)
            curveToRelative(0f, -0.283f, 0.01f, -0.563f, 0.029f, -0.841f)
            curveTo(4.071f, 14.549f, 3.609f, 14f, 2.999f, 14f)
            curveToRelative(-0.492f, 0f, -0.913f, 0.361f, -0.953f, 0.851f)
            curveTo(2.017f, 15.231f, 2f, 15.613f, 2f, 16f)
            curveToRelative(0f, 7.732f, 6.268f, 14f, 14f, 14f)
            reflectiveCurveToRelative(14f, -6.268f, 14f, -14f)
            reflectiveCurveTo(23.732f, 2f, 16f, 2f)
            curveTo(12.083f, 2f, 8.541f, 3.609f, 6f, 6.202f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(4f, 3.448f, 4f, 4f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(7.056f)
            close()
            moveToRelative(7.936f, 2.266f)
            curveTo(13.66f, 9.504f, 12f, 10.467f, 12f, 12.003f)
            verticalLineToRelative(7.995f)
            curveToRelative(0f, 1.535f, 1.659f, 2.498f, 2.992f, 1.736f)
            lineToRelative(6.998f, -3.997f)
            curveToRelative(1.344f, -0.768f, 1.344f, -2.706f, 0f, -3.473f)
            lineToRelative(-6.998f, -3.998f)
            close()
        }
    }.build()
}
