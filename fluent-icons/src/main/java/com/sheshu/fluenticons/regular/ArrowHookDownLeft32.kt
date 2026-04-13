package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowHookDownLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookDownLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.36f, 7.009f)
            curveTo(23.06f, 7.196f, 26f, 10.255f, 26f, 14f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            horizontalLineTo(9.414f)
            lineToRelative(3.293f, 3.293f)
            lineToRelative(0.068f, 0.076f)
            curveToRelative(0.32f, 0.393f, 0.298f, 0.972f, -0.068f, 1.338f)
            curveToRelative(-0.366f, 0.366f, -0.945f, 0.389f, -1.338f, 0.068f)
            lineToRelative(-0.076f, -0.068f)
            lineToRelative(-5f, -5f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(5f, -5f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineTo(9.414f, 19f)
            horizontalLineTo(19f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            curveToRelative(0f, -2.675f, -2.101f, -4.86f, -4.743f, -4.993f)
            lineTo(19f, 9f)
            horizontalLineToRelative(-9f)
            curveTo(9.448f, 9f, 9f, 8.552f, 9f, 8f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(9f)
            lineToRelative(0.36f, 0.009f)
            close()
        }
    }.build()
}
