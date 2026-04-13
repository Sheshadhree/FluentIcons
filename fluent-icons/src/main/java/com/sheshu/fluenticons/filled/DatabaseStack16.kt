package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DatabaseStack16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DatabaseStack16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.487f)
            verticalLineTo(8f)
            curveToRelative(0f, 1.355f, 2.29f, 2.5f, 5f, 2.5f)
            reflectiveCurveToRelative(5f, -1.145f, 5f, -2.5f)
            verticalLineTo(5.487f)
            curveTo(11.943f, 6.413f, 10.136f, 7f, 8f, 7f)
            reflectiveCurveTo(4.057f, 6.413f, 3f, 5.487f)
            close()
            moveTo(8f, 6f)
            curveToRelative(2.761f, 0f, 5f, -1.119f, 5f, -2.5f)
            reflectiveCurveTo(10.761f, 1f, 8f, 1f)
            reflectiveCurveTo(3f, 2.119f, 3f, 3.5f)
            reflectiveCurveTo(5.239f, 6f, 8f, 6f)
            close()
            moveTo(3f, 9.959f)
            verticalLineTo(12.5f)
            curveTo(3f, 13.925f, 5.149f, 15f, 8f, 15f)
            reflectiveCurveToRelative(5f, -1.075f, 5f, -2.5f)
            verticalLineTo(9.959f)
            curveToRelative(-1.066f, 0.936f, -2.889f, 1.541f, -5f, 1.541f)
            reflectiveCurveToRelative(-3.934f, -0.606f, -5f, -1.541f)
            close()
        }
    }.build()
}
