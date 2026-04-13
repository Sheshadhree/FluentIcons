package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EraserMedium20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EraserMedium20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.44f, 11.2f)
            curveToRelative(-0.587f, 0.586f, -0.587f, 1.536f, 0f, 2.122f)
            lineToRelative(4.242f, 4.242f)
            curveToRelative(0.586f, 0.586f, 1.535f, 0.586f, 2.121f, 0f)
            lineToRelative(0.72f, -0.72f)
            curveToRelative(-0.156f, -0.331f, -0.28f, -0.681f, -0.369f, -1.045f)
            lineToRelative(-1.058f, 1.058f)
            curveToRelative(-0.195f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineToRelative(-4.242f, -4.242f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.707f)
            lineToRelative(1.69f, -1.69f)
            lineTo(9f, 14.381f)
            curveTo(9.064f, 11.399f, 11.501f, 9f, 14.5f, 9f)
            curveToRelative(0.838f, 0f, 1.633f, 0.188f, 2.344f, 0.523f)
            lineToRelative(0.72f, -0.72f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0f, -2.121f)
            lineToRelative(-4.242f, -4.243f)
            curveToRelative(-0.586f, -0.586f, -1.536f, -0.586f, -2.122f, 0f)
            lineTo(2.44f, 11.2f)
            close()
            moveTo(14.5f, 19f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(16.985f, 10f, 14.5f, 10f)
            reflectiveCurveTo(10f, 12.015f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, 4.5f, 4.5f, 4.5f)
            close()
        }
    }.build()
}
