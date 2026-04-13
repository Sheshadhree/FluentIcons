package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Search12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Search12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 1f)
            curveTo(2.79f, 1f, 1f, 2.79f, 1f, 5f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            curveToRelative(0.833f, 0f, 1.607f, -0.255f, 2.248f, -0.69f)
            lineToRelative(2.472f, 2.47f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.06f)
            lineTo(8.31f, 7.248f)
            curveTo(8.745f, 6.608f, 9f, 5.834f, 9f, 5f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveTo(2.5f, 5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveTo(7.5f, 3.62f, 7.5f, 5f)
            reflectiveCurveTo(6.38f, 7.5f, 5f, 7.5f)
            reflectiveCurveTo(2.5f, 6.38f, 2.5f, 5f)
            close()
        }
    }.build()
}
