package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Replay32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Replay32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 4f)
            curveToRelative(-3.554f, 0f, -6.747f, 1.545f, -8.944f, 4f)
            horizontalLineTo(10f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(2.202f)
            curveTo(8.541f, 3.609f, 12.083f, 2f, 16f, 2f)
            curveToRelative(7.732f, 0f, 14f, 6.268f, 14f, 14f)
            reflectiveCurveToRelative(-6.268f, 14f, -14f, 14f)
            reflectiveCurveTo(2f, 23.732f, 2f, 16f)
            curveToRelative(0f, -0.387f, 0.016f, -0.77f, 0.046f, -1.149f)
            curveTo(2.087f, 14.361f, 2.506f, 14f, 2.998f, 14f)
            curveToRelative(0.611f, 0f, 1.073f, 0.55f, 1.031f, 1.159f)
            curveTo(4.009f, 15.437f, 4f, 15.717f, 4f, 16f)
            curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(22.627f, 4f, 16f, 4f)
            close()
            moveToRelative(-1.008f, 6.266f)
            curveTo(13.66f, 9.504f, 12f, 10.467f, 12f, 12.003f)
            verticalLineToRelative(7.995f)
            curveToRelative(0f, 1.535f, 1.659f, 2.498f, 2.992f, 1.736f)
            lineToRelative(6.998f, -3.997f)
            curveToRelative(1.344f, -0.768f, 1.344f, -2.706f, 0f, -3.473f)
            lineToRelative(-6.998f, -3.998f)
            close()
            moveTo(14f, 12.003f)
            lineTo(20.998f, 16f)
            lineTo(14f, 19.998f)
            verticalLineToRelative(-7.995f)
            close()
        }
    }.build()
}
