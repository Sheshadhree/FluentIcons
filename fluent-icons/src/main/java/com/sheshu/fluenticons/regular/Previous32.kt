package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Previous32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Previous32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(4f, 4.448f, 4f, 5f)
            verticalLineToRelative(22f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(5f)
            close()
            moveToRelative(22.003f, 1.504f)
            curveToRelative(0f, -2.002f, -2.236f, -3.192f, -3.897f, -2.073f)
            lineToRelative(-14.003f, 9.432f)
            curveTo(8.637f, 14.85f, 8.63f, 17.005f, 10.09f, 18f)
            lineToRelative(14.003f, 9.56f)
            curveToRelative(1.66f, 1.132f, 3.91f, -0.056f, 3.91f, -2.066f)
            verticalLineTo(6.506f)
            close()
            moveToRelative(-2.78f, -0.414f)
            curveToRelative(0.333f, -0.224f, 0.78f, 0.014f, 0.78f, 0.414f)
            verticalLineToRelative(18.991f)
            curveToRelative(0f, 0.402f, -0.45f, 0.64f, -0.782f, 0.413f)
            lineTo(11.218f, 16.35f)
            curveToRelative(-0.292f, -0.2f, -0.29f, -0.63f, 0.002f, -0.828f)
            lineTo(25.224f, 6.09f)
            close()
        }
    }.build()
}
