package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChevronCircleUp32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronCircleUp32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 16f)
            curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(22.627f, 4f, 16f, 4f)
            reflectiveCurveTo(4f, 9.373f, 4f, 16f)
            close()
            moveToRelative(12f, 14f)
            curveTo(8.268f, 30f, 2f, 23.732f, 2f, 16f)
            reflectiveCurveTo(8.268f, 2f, 16f, 2f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            reflectiveCurveToRelative(-6.268f, 14f, -14f, 14f)
            close()
            moveTo(9.293f, 18.707f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(5.878f, -5.878f)
            curveToRelative(0.052f, -0.052f, 0.06f, -0.06f, 0.11f, -0.102f)
            curveToRelative(0.235f, -0.196f, 0.46f, -0.296f, 0.719f, -0.293f)
            curveToRelative(0.26f, -0.003f, 0.519f, 0.095f, 0.717f, 0.293f)
            curveToRelative(0.036f, 0.036f, 0.072f, 0.066f, 0.112f, 0.101f)
            lineToRelative(5.878f, 5.879f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineTo(16f, 13.414f)
            lineToRelative(-5.293f, 5.293f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            close()
        }
    }.build()
}
