package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextPeriodAsterisk20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextPeriodAsterisk20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.996f, 4.496f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveToRelative(-0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(2.465f)
            lineToRelative(-2.341f, -0.76f)
            curveTo(8.392f, 6.114f, 8.11f, 6.258f, 8.025f, 6.52f)
            curveToRelative(-0.086f, 0.263f, 0.058f, 0.545f, 0.32f, 0.63f)
            lineToRelative(2.345f, 0.763f)
            lineTo(9.24f, 9.91f)
            curveToRelative(-0.163f, 0.223f, -0.114f, 0.536f, 0.11f, 0.698f)
            curveToRelative(0.223f, 0.162f, 0.536f, 0.113f, 0.698f, -0.11f)
            lineToRelative(1.45f, -1.996f)
            lineToRelative(1.45f, 1.995f)
            curveToRelative(0.162f, 0.224f, 0.474f, 0.273f, 0.698f, 0.111f)
            curveToRelative(0.223f, -0.162f, 0.273f, -0.475f, 0.11f, -0.698f)
            lineToRelative(-1.45f, -1.996f)
            lineToRelative(2.348f, -0.763f)
            curveToRelative(0.263f, -0.086f, 0.406f, -0.368f, 0.321f, -0.63f)
            curveToRelative(-0.085f, -0.263f, -0.367f, -0.407f, -0.63f, -0.322f)
            lineToRelative(-2.349f, 0.764f)
            verticalLineTo(4.496f)
            close()
            moveTo(6f, 16f)
            curveToRelative(0.552f, 0f, 1f, -0.447f, 1f, -1f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            curveToRelative(0f, 0.553f, 0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
