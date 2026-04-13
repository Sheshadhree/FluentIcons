package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Prohibited12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Prohibited12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 6f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            reflectiveCurveTo(1f, 8.761f, 1f, 6f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            close()
            moveTo(9.5f, 6f)
            curveToRelative(0f, -0.695f, -0.203f, -1.343f, -0.552f, -1.887f)
            lineTo(4.113f, 8.948f)
            curveTo(4.657f, 9.298f, 5.305f, 9.5f, 6f, 9.5f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            close()
            moveTo(7.888f, 3.052f)
            curveTo(7.343f, 2.702f, 6.695f, 2.5f, 6f, 2.5f)
            curveTo(4.067f, 2.5f, 2.5f, 4.067f, 2.5f, 6f)
            curveToRelative(0f, 0.695f, 0.203f, 1.343f, 0.552f, 1.888f)
            lineToRelative(4.836f, -4.836f)
            close()
        }
    }.build()
}
