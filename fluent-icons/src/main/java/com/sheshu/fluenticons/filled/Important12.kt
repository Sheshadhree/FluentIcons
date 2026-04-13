package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Important12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Important12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.283f, 2.98f)
            curveTo(4.133f, 1.935f, 4.944f, 1f, 6f, 1f)
            reflectiveCurveToRelative(1.867f, 0.935f, 1.717f, 1.98f)
            lineTo(7.142f, 7.01f)
            curveTo(7.06f, 7.578f, 6.574f, 8f, 6f, 8f)
            reflectiveCurveTo(4.94f, 7.578f, 4.86f, 7.01f)
            lineTo(4.283f, 2.98f)
            close()
            moveTo(7f, 10f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
        }
    }.build()
}
