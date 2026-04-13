package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRedo24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRedo24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 7.586f)
            lineToRelative(-3.64f, -3.635f)
            curveToRelative(-2.601f, -2.601f, -6.819f, -2.601f, -9.42f, 0f)
            reflectiveCurveToRelative(-2.601f, 6.819f, 0f, 9.42f)
            lineToRelative(8.339f, 8.337f)
            curveToRelative(0.39f, 0.39f, 1.023f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.391f, 0.39f, -1.024f, 0f, -1.415f)
            lineToRelative(-8.339f, -8.336f)
            curveToRelative(-1.82f, -1.82f, -1.82f, -4.772f, 0f, -6.592f)
            curveToRelative(1.764f, -1.763f, 4.588f, -1.818f, 6.418f, -0.165f)
            lineToRelative(0.174f, 0.166f)
            lineToRelative(3.64f, 3.633f)
            horizontalLineTo(12f)
            curveToRelative(-0.513f, 0f, -0.935f, 0.387f, -0.993f, 0.884f)
            lineTo(11f, 10f)
            curveToRelative(0f, 0.512f, 0.386f, 0.935f, 0.883f, 0.993f)
            lineTo(12f, 10.999f)
            horizontalLineToRelative(7f)
            curveToRelative(0.513f, 0f, 0.936f, -0.386f, 0.993f, -0.883f)
            lineTo(20f, 10f)
            verticalLineTo(3.002f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            curveToRelative(-0.513f, 0f, -0.935f, 0.386f, -0.993f, 0.884f)
            lineTo(18f, 3.002f)
            verticalLineToRelative(4.584f)
            lineToRelative(-3.64f, -3.635f)
            lineTo(18f, 7.586f)
            close()
        }
    }.build()
}
