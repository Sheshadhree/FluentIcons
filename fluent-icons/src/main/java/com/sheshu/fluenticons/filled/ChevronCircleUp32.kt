package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronCircleUp32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronCircleUp32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 30f)
            curveTo(8.268f, 30f, 2f, 23.732f, 2f, 16f)
            reflectiveCurveTo(8.268f, 2f, 16f, 2f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            reflectiveCurveToRelative(-6.268f, 14f, -14f, 14f)
            close()
            moveTo(9.293f, 17.293f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineTo(16f, 13.414f)
            lineToRelative(5.293f, 5.293f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-5.878f, -5.879f)
            lineToRelative(-0.033f, -0.028f)
            curveToRelative(-0.027f, -0.024f, -0.053f, -0.047f, -0.08f, -0.073f)
            curveTo(16.52f, 11.114f, 16.26f, 11.017f, 16f, 11.02f)
            curveToRelative(-0.26f, -0.003f, -0.484f, 0.097f, -0.718f, 0.293f)
            curveToRelative(-0.05f, 0.041f, -0.06f, 0.05f, -0.11f, 0.1f)
            verticalLineToRelative(0.002f)
            lineToRelative(-5.88f, 5.878f)
            close()
        }
    }.build()
}
