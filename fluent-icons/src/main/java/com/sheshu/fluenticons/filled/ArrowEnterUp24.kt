package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowEnterUp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowEnterUp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 21f)
            curveToRelative(0f, 0.513f, -0.386f, 0.936f, -0.883f, 0.993f)
            lineTo(19f, 22f)
            horizontalLineToRelative(-6.5f)
            curveToRelative(-1.869f, 0f, -3.395f, -1.464f, -3.495f, -3.308f)
            lineTo(9f, 18.5f)
            verticalLineTo(5.415f)
            lineTo(5.707f, 8.707f)
            curveToRelative(-0.36f, 0.36f, -0.928f, 0.388f, -1.32f, 0.083f)
            lineTo(4.293f, 8.707f)
            curveToRelative(-0.36f, -0.36f, -0.388f, -0.928f, -0.083f, -1.32f)
            lineToRelative(0.083f, -0.094f)
            lineToRelative(5f, -5f)
            curveToRelative(0.035f, -0.036f, 0.073f, -0.068f, 0.112f, -0.097f)
            lineToRelative(0.11f, -0.071f)
            lineTo(9.63f, 2.07f)
            lineToRelative(0.105f, -0.035f)
            lineToRelative(0.117f, -0.025f)
            lineToRelative(0.06f, -0.007f)
            lineTo(10f, 2f)
            lineToRelative(0.075f, 0.003f)
            lineToRelative(0.126f, 0.017f)
            lineToRelative(0.111f, 0.03f)
            lineToRelative(0.111f, 0.044f)
            lineToRelative(0.098f, 0.052f)
            lineToRelative(0.092f, 0.064f)
            lineToRelative(0.094f, 0.083f)
            lineToRelative(5f, 5f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.36f, 0.36f, -0.928f, 0.388f, -1.32f, 0.083f)
            lineToRelative(-0.094f, -0.083f)
            lineTo(11f, 5.415f)
            verticalLineTo(18.5f)
            curveToRelative(0f, 0.78f, 0.595f, 1.42f, 1.355f, 1.493f)
            lineTo(12.5f, 20f)
            horizontalLineTo(19f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            close()
        }
    }.build()
}
