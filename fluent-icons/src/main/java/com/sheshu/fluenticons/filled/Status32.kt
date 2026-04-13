package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Status32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Status32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.318f, 3.318f)
            curveToRelative(1.757f, -1.757f, 4.607f, -1.757f, 6.364f, 0f)
            curveToRelative(1.757f, 1.757f, 1.757f, 4.607f, 0f, 6.364f)
            lineToRelative(-8.66f, 8.66f)
            curveToRelative(-0.36f, 0.36f, -0.804f, 0.621f, -1.292f, 0.762f)
            lineToRelative(-6.453f, 1.857f)
            curveToRelative(-0.35f, 0.1f, -0.727f, 0.003f, -0.984f, -0.254f)
            reflectiveCurveToRelative(-0.355f, -0.634f, -0.254f, -0.983f)
            lineToRelative(1.857f, -6.454f)
            curveToRelative(0.14f, -0.488f, 0.403f, -0.933f, 0.762f, -1.292f)
            lineToRelative(8.66f, -8.66f)
            close()
            moveTo(16f, 6f)
            curveToRelative(0.48f, 0f, 0.953f, 0.034f, 1.415f, 0.1f)
            lineToRelative(1.693f, -1.693f)
            curveTo(18.117f, 4.14f, 17.075f, 4f, 16f, 4f)
            curveTo(9.373f, 4f, 4f, 9.373f, 4f, 16f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.373f, 12f, -12f)
            curveToRelative(0f, -1.075f, -0.141f, -2.117f, -0.407f, -3.108f)
            lineToRelative(-1.692f, 1.693f)
            curveTo(25.966f, 15.047f, 26f, 15.52f, 26f, 16f)
            curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(6f, 21.523f, 6f, 16f)
            reflectiveCurveTo(10.477f, 6f, 16f, 6f)
            close()
        }
    }.build()
}
