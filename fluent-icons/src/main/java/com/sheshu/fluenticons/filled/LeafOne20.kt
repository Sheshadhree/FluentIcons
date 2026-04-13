package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LeafOne20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LeafOne20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.072f, 2.462f)
            curveToRelative(-0.588f, -0.6f, -1.556f, -0.6f, -2.144f, 0f)
            lineTo(5.691f, 5.77f)
            curveTo(3.38f, 8.131f, 3.4f, 11.913f, 5.737f, 14.25f)
            lineToRelative(0.011f, 0.012f)
            lineToRelative(0.01f, 0.009f)
            curveToRelative(1.044f, 1.044f, 2.377f, 1.623f, 3.742f, 1.736f)
            verticalLineTo(17.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-1.491f)
            curveToRelative(1.365f, -0.114f, 2.698f, -0.693f, 3.743f, -1.737f)
            lineToRelative(0.009f, -0.01f)
            lineToRelative(0.011f, -0.01f)
            curveToRelative(2.337f, -2.338f, 2.357f, -6.12f, 0.046f, -8.482f)
            lineToRelative(-3.237f, -3.307f)
            close()
            moveTo(10.5f, 14.992f)
            curveToRelative(-0.332f, 0.032f, -0.668f, 0.032f, -1f, 0f)
            verticalLineTo(9.498f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(5.492f)
            close()
        }
    }.build()
}
