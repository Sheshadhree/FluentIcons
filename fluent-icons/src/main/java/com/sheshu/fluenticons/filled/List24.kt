package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.List24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.List24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 17f)
            horizontalLineToRelative(12f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.513f, -0.386f, 0.936f, -0.883f, 0.993f)
            lineTo(15f, 19f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            curveToRelative(0f, -0.513f, 0.386f, -0.936f, 0.883f, -0.993f)
            lineTo(3f, 17f)
            horizontalLineToRelative(12f)
            horizontalLineTo(3f)
            close()
            moveToRelative(0f, -6f)
            horizontalLineToRelative(18f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.513f, -0.386f, 0.935f, -0.883f, 0.993f)
            lineTo(21f, 13f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            curveToRelative(0f, -0.513f, 0.386f, -0.935f, 0.883f, -0.993f)
            lineTo(3f, 11f)
            horizontalLineToRelative(18f)
            horizontalLineTo(3f)
            close()
            moveToRelative(0f, -6f)
            horizontalLineToRelative(15f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.513f, -0.386f, 0.936f, -0.883f, 0.993f)
            lineTo(18f, 7f)
            horizontalLineTo(3f)
            curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
            curveToRelative(0f, -0.513f, 0.386f, -0.936f, 0.883f, -0.993f)
            lineTo(3f, 5f)
            horizontalLineToRelative(15f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
