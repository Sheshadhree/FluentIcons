package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowHookUpLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookUpLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.369f, 6.225f)
            curveToRelative(0.393f, -0.32f, 0.972f, -0.298f, 1.338f, 0.068f)
            curveToRelative(0.366f, 0.366f, 0.389f, 0.945f, 0.068f, 1.338f)
            lineToRelative(-0.068f, 0.076f)
            lineTo(9.414f, 11f)
            horizontalLineTo(19f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            curveToRelative(0f, 3.745f, -2.941f, 6.804f, -6.64f, 6.991f)
            lineTo(19f, 25f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(9f)
            lineToRelative(0.257f, -0.007f)
            curveTo(21.899f, 22.86f, 24f, 20.675f, 24f, 18f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            horizontalLineTo(9.414f)
            lineToRelative(3.293f, 3.293f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-5f, -5f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(5f, -5f)
            lineToRelative(0.076f, -0.068f)
            close()
        }
    }.build()
}
