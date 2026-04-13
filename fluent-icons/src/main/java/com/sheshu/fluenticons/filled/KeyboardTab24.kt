package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.KeyboardTab24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.KeyboardTab24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.207f, 11.293f)
            lineToRelative(-6.5f, -6.5f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.36f, 0.36f, -0.388f, 0.928f, -0.083f, 1.32f)
            lineToRelative(0.083f, 0.094f)
            lineTo(15.086f, 11f)
            horizontalLineTo(4f)
            curveToRelative(-0.513f, 0f, -0.936f, 0.386f, -0.993f, 0.883f)
            lineTo(3f, 12f)
            curveToRelative(0f, 0.513f, 0.386f, 0.935f, 0.883f, 0.993f)
            lineTo(4f, 13f)
            horizontalLineToRelative(11.086f)
            lineToRelative(-4.793f, 4.793f)
            curveToRelative(-0.36f, 0.36f, -0.388f, 0.928f, -0.083f, 1.32f)
            lineToRelative(0.083f, 0.094f)
            curveToRelative(0.36f, 0.36f, 0.928f, 0.388f, 1.32f, 0.083f)
            lineToRelative(0.094f, -0.083f)
            lineToRelative(6.5f, -6.5f)
            curveToRelative(0.36f, -0.36f, 0.388f, -0.928f, 0.083f, -1.32f)
            lineToRelative(-0.083f, -0.094f)
            lineToRelative(-6.5f, -6.5f)
            lineToRelative(6.5f, 6.5f)
            close()
            moveTo(21f, 18.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            close()
        }
    }.build()
}
