package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Crown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Crown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.737f, 5.31f)
            lineTo(6.609f, 8.046f)
            curveTo(6.462f, 8.234f, 6.204f, 8.293f, 5.99f, 8.186f)
            lineTo(3.865f, 7.123f)
            curveTo(3.952f, 6.933f, 4f, 6.723f, 4f, 6.5f)
            curveTo(4f, 5.672f, 3.328f, 5f, 2.5f, 5f)
            reflectiveCurveTo(1f, 5.672f, 1f, 6.5f)
            curveToRelative(0f, 0.723f, 0.512f, 1.327f, 1.193f, 1.469f)
            lineToRelative(1.692f, 8.038f)
            curveTo(4.007f, 16.587f, 4.517f, 17f, 5.11f, 17f)
            horizontalLineToRelative(9.783f)
            curveToRelative(0.59f, 0f, 1.1f, -0.414f, 1.223f, -0.992f)
            lineToRelative(1.692f, -8.04f)
            curveTo(18.488f, 7.827f, 19f, 7.223f, 19f, 6.5f)
            curveTo(19f, 5.672f, 18.328f, 5f, 17.5f, 5f)
            reflectiveCurveTo(16f, 5.672f, 16f, 6.5f)
            curveToRelative(0f, 0.222f, 0.048f, 0.434f, 0.135f, 0.623f)
            lineTo(14.01f, 8.186f)
            curveToRelative(-0.213f, 0.107f, -0.472f, 0.048f, -0.619f, -0.14f)
            lineTo(11.263f, 5.31f)
            curveTo(11.413f, 5.075f, 11.5f, 4.797f, 11.5f, 4.5f)
            curveTo(11.5f, 3.672f, 10.828f, 3f, 10f, 3f)
            reflectiveCurveTo(8.5f, 3.672f, 8.5f, 4.5f)
            curveToRelative(0f, 0.298f, 0.087f, 0.576f, 0.237f, 0.81f)
            close()
            moveTo(10f, 14f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveTo(9.172f, 11f, 10f, 11f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(10.828f, 14f, 10f, 14f)
            close()
        }
    }.build()
}
