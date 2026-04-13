package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Add24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Add24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.883f, 3.007f)
            lineTo(12f, 3f)
            curveToRelative(0.513f, 0f, 0.935f, 0.386f, 0.993f, 0.883f)
            lineTo(13f, 4f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(7f)
            curveToRelative(0.513f, 0f, 0.936f, 0.386f, 0.993f, 0.883f)
            lineTo(21f, 12f)
            curveToRelative(0f, 0.513f, -0.386f, 0.935f, -0.883f, 0.993f)
            lineTo(20f, 13f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.513f, -0.386f, 0.936f, -0.883f, 0.993f)
            lineTo(12f, 21f)
            curveToRelative(-0.513f, 0f, -0.935f, -0.386f, -0.993f, -0.883f)
            lineTo(11f, 20f)
            verticalLineToRelative(-7f)
            horizontalLineTo(4f)
            curveToRelative(-0.513f, 0f, -0.936f, -0.386f, -0.993f, -0.883f)
            lineTo(3f, 12f)
            curveToRelative(0f, -0.513f, 0.386f, -0.935f, 0.883f, -0.993f)
            lineTo(4f, 11f)
            horizontalLineToRelative(7f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.513f, 0.386f, -0.936f, 0.883f, -0.993f)
            lineTo(12f, 3f)
            lineToRelative(-0.117f, 0.007f)
            close()
        }
    }.build()
}
