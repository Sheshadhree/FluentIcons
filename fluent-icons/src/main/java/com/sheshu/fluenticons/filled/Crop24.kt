package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Crop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Crop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 15.5f)
            curveToRelative(0f, 0.78f, 0.595f, 1.42f, 1.355f, 1.493f)
            lineTo(8.5f, 17f)
            horizontalLineTo(21f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.513f, -0.386f, 0.936f, -0.883f, 0.993f)
            lineTo(21f, 19f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            curveToRelative(-0.513f, 0f, -0.936f, -0.386f, -0.993f, -0.883f)
            lineTo(17f, 21f)
            verticalLineToRelative(-2f)
            horizontalLineTo(8.5f)
            curveToRelative(-1.869f, 0f, -3.395f, -1.464f, -3.495f, -3.308f)
            lineTo(5f, 15.5f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
            curveToRelative(0f, -0.513f, 0.386f, -0.936f, 0.883f, -0.993f)
            lineTo(3f, 5f)
            horizontalLineToRelative(2f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            curveToRelative(0.513f, 0f, 0.936f, 0.386f, 0.993f, 0.883f)
            lineTo(7f, 3f)
            verticalLineToRelative(12.5f)
            close()
            moveTo(8f, 5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.869f, 0f, 3.395f, 1.464f, 3.495f, 3.308f)
            lineTo(19f, 8.5f)
            verticalLineTo(16f)
            horizontalLineToRelative(-2f)
            verticalLineTo(8.5f)
            curveToRelative(0f, -0.78f, -0.595f, -1.42f, -1.355f, -1.493f)
            lineTo(15.5f, 7f)
            horizontalLineTo(8f)
            verticalLineTo(5f)
            close()
        }
    }.build()
}
