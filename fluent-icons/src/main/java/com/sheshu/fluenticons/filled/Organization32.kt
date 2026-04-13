package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Organization32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Organization32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 7f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            curveToRelative(0f, 2.42f, -1.718f, 4.437f, -4.001f, 4.9f)
            verticalLineTo(15f)
            horizontalLineToRelative(5.268f)
            curveTo(23.777f, 15f, 25f, 16.223f, 25f, 17.733f)
            verticalLineTo(20.1f)
            curveToRelative(2.282f, 0.463f, 4f, 2.481f, 4f, 4.9f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            curveToRelative(0f, -2.419f, 1.718f, -4.437f, 4f, -4.9f)
            verticalLineToRelative(-2.368f)
            curveToRelative(0f, -0.405f, -0.328f, -0.733f, -0.733f, -0.733f)
            horizontalLineTo(9.733f)
            curveTo(9.328f, 16.999f, 9f, 17.327f, 9f, 17.732f)
            verticalLineTo(20.1f)
            curveToRelative(2.282f, 0.463f, 4f, 2.481f, 4f, 4.9f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            curveToRelative(0f, -2.419f, 1.718f, -4.437f, 4f, -4.9f)
            verticalLineToRelative(-2.368f)
            curveToRelative(0f, -1.51f, 1.224f, -2.733f, 2.733f, -2.733f)
            horizontalLineTo(15f)
            verticalLineToRelative(-3.1f)
            curveTo(12.717f, 11.437f, 11f, 9.42f, 11f, 7f)
            close()
        }
    }.build()
}
