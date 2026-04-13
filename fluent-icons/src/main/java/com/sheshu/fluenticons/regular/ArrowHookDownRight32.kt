package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowHookDownRight32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookDownRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 7f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-9f)
            lineToRelative(-0.257f, 0.007f)
            curveTo(10.101f, 9.14f, 8f, 11.325f, 8f, 14f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            horizontalLineToRelative(9.586f)
            lineToRelative(-3.293f, -3.293f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineToRelative(5f, 5f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-5f, 5f)
            lineToRelative(-0.076f, 0.068f)
            curveToRelative(-0.393f, 0.32f, -0.972f, 0.298f, -1.338f, -0.068f)
            curveToRelative(-0.366f, -0.366f, -0.389f, -0.945f, -0.068f, -1.338f)
            lineToRelative(0.068f, -0.076f)
            lineTo(22.586f, 21f)
            horizontalLineTo(13f)
            curveToRelative(-3.866f, 0f, -7f, -3.134f, -7f, -7f)
            curveToRelative(0f, -3.745f, 2.941f, -6.804f, 6.64f, -6.991f)
            lineTo(13f, 7f)
            horizontalLineToRelative(9f)
            close()
        }
    }.build()
}
