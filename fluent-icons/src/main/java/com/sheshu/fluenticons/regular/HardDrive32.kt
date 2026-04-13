package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.HardDrive32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HardDrive32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.984f, 6.797f)
            curveTo(7.534f, 5.696f, 8.66f, 5f, 9.89f, 5f)
            horizontalLineToRelative(12.218f)
            curveToRelative(1.231f, 0f, 2.357f, 0.696f, 2.907f, 1.797f)
            lineToRelative(4.535f, 9.07f)
            curveToRelative(0.295f, 0.59f, 0.449f, 1.24f, 0.449f, 1.9f)
            verticalLineToRelative(4.983f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 26f, 2f, 24.545f, 2f, 22.75f)
            verticalLineToRelative(-4.983f)
            curveToRelative(0f, -0.66f, 0.154f, -1.31f, 0.449f, -1.9f)
            lineToRelative(4.535f, -9.07f)
            close()
            moveTo(23.228f, 7.69f)
            curveTo(23.015f, 7.268f, 22.582f, 7f, 22.108f, 7f)
            horizontalLineTo(9.891f)
            curveTo(9.417f, 7f, 8.984f, 7.268f, 8.773f, 7.691f)
            lineToRelative(-3.656f, 7.312f)
            curveTo(5.16f, 15f, 5.205f, 15f, 5.25f, 15f)
            horizontalLineToRelative(21.5f)
            curveToRelative(0.045f, 0f, 0.09f, 0f, 0.133f, 0.003f)
            lineTo(23.228f, 7.69f)
            close()
            moveTo(4f, 18.25f)
            verticalLineToRelative(4.5f)
            curveTo(4f, 23.44f, 4.56f, 24f, 5.25f, 24f)
            horizontalLineToRelative(21.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(5.25f)
            curveTo(4.56f, 17f, 4f, 17.56f, 4f, 18.25f)
            close()
            moveToRelative(20.5f, 3.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            close()
        }
    }.build()
}
