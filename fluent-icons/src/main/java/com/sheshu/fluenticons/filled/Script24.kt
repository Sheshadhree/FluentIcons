package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Script24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Script24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 2.038f)
            verticalLineTo(2f)
            curveToRelative(-0.067f, 0f, -0.134f, 0.002f, -0.2f, 0.007f)
            verticalLineTo(2f)
            horizontalLineTo(7.75f)
            curveTo(5.955f, 2f, 4.5f, 3.455f, 4.5f, 5.25f)
            verticalLineTo(15.5f)
            horizontalLineToRelative(7.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.268f, 1.095f, 2.25f, 2.527f, 2.25f)
            curveToRelative(1.292f, 0f, 2.31f, -0.777f, 2.497f, -1.882f)
            curveToRelative(0.004f, -0.059f, 0.006f, -0.12f, 0.007f, -0.18f)
            verticalLineTo(4.608f)
            curveToRelative(0f, -1.094f, 0.59f, -2.051f, 1.469f, -2.57f)
            close()
            moveTo(1f, 17.902f)
            curveTo(1f, 17.404f, 1.404f, 17f, 1.902f, 17f)
            horizontalLineTo(12f)
            verticalLineToRelative(2.85f)
            horizontalLineToRelative(0.001f)
            curveToRelative(0.021f, 0.807f, 0.298f, 1.546f, 0.751f, 2.15f)
            horizontalLineTo(4f)
            curveToRelative(-1.623f, 0f, -3f, -1.235f, -3f, -2.925f)
            verticalLineToRelative(-1.173f)
            close()
            moveTo(23.25f, 4.375f)
            verticalLineToRelative(2.66f)
            curveToRelative(0f, 0.947f, -0.767f, 1.715f, -1.714f, 1.715f)
            horizontalLineTo(20f)
            verticalLineTo(4.375f)
            curveToRelative(0f, -0.897f, 0.727f, -1.625f, 1.625f, -1.625f)
            reflectiveCurveToRelative(1.625f, 0.728f, 1.625f, 1.625f)
            close()
        }
    }.build()
}
