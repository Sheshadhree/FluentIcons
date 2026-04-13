package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Filter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Filter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 16f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.513f, -0.386f, 0.936f, -0.883f, 0.993f)
            lineTo(14f, 18f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            curveToRelative(0f, -0.513f, 0.386f, -0.936f, 0.883f, -0.993f)
            lineTo(10f, 16f)
            horizontalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(-2f, -5f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.513f, -0.386f, 0.935f, -0.883f, 0.993f)
            lineTo(16f, 13f)
            horizontalLineTo(8f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            curveToRelative(0f, -0.513f, 0.386f, -0.935f, 0.883f, -0.993f)
            lineTo(8f, 11f)
            horizontalLineToRelative(8f)
            horizontalLineToRelative(-8f)
            close()
            moveTo(5f, 6f)
            horizontalLineToRelative(14f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.513f, -0.386f, 0.936f, -0.883f, 0.993f)
            lineTo(19f, 8f)
            horizontalLineTo(5f)
            curveTo(4.448f, 8f, 4f, 7.552f, 4f, 7f)
            curveToRelative(0f, -0.513f, 0.386f, -0.936f, 0.883f, -0.993f)
            lineTo(5f, 6f)
            horizontalLineToRelative(14f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
