package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronCircleLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronCircleLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(30f, 16f)
            curveToRelative(0f, 7.732f, -6.268f, 14f, -14f, 14f)
            reflectiveCurveTo(2f, 23.732f, 2f, 16f)
            reflectiveCurveTo(8.268f, 2f, 16f, 2f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            close()
            moveToRelative(-12.707f, 6.707f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineTo(13.414f, 16f)
            lineToRelative(5.293f, -5.293f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-5.879f, 5.878f)
            lineToRelative(-0.028f, 0.033f)
            curveToRelative(-0.024f, 0.027f, -0.047f, 0.053f, -0.073f, 0.08f)
            curveTo(11.114f, 15.48f, 11.017f, 15.74f, 11.02f, 16f)
            curveToRelative(-0.003f, 0.26f, 0.097f, 0.484f, 0.293f, 0.718f)
            curveToRelative(0.041f, 0.05f, 0.05f, 0.06f, 0.1f, 0.11f)
            horizontalLineToRelative(0.002f)
            lineToRelative(5.878f, 5.88f)
            close()
        }
    }.build()
}
