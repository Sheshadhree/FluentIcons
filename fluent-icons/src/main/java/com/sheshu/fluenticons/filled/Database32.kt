package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Database32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Database32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 14f)
            curveToRelative(3.256f, 0f, 6.3f, -0.596f, 8.606f, -1.644f)
            curveToRelative(0.823f, -0.374f, 1.668f, -0.865f, 2.394f, -1.48f)
            verticalLineTo(25f)
            curveToRelative(0f, 2.761f, -4.925f, 5f, -11f, 5f)
            reflectiveCurveTo(5f, 27.761f, 5f, 25f)
            verticalLineTo(10.876f)
            curveToRelative(0.726f, 0.615f, 1.571f, 1.106f, 2.394f, 1.48f)
            curveTo(9.7f, 13.404f, 12.744f, 14f, 16f, 14f)
            close()
            moveTo(5f, 7f)
            curveToRelative(0f, -2.761f, 4.925f, -5f, 11f, -5f)
            reflectiveCurveToRelative(11f, 2.239f, 11f, 5f)
            reflectiveCurveToRelative(-4.925f, 5f, -11f, 5f)
            reflectiveCurveTo(5f, 9.761f, 5f, 7f)
            close()
        }
    }.build()
}
