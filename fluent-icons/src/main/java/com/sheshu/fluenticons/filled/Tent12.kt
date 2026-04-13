package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tent12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tent12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.432f, 1.457f)
            curveToRelative(-0.095f, -0.114f, -0.235f, -0.18f, -0.384f, -0.18f)
            curveToRelative(-0.148f, 0f, -0.289f, 0.066f, -0.384f, 0.18f)
            curveToRelative(-0.727f, 0.873f, -2.18f, 1.924f, -3.017f, 2.391f)
            curveToRelative(-0.137f, 0.077f, -0.23f, 0.213f, -0.252f, 0.369f)
            lineTo(1.736f, 8.998f)
            horizontalLineTo(1.504f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(8.993f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(10.36f)
            lineTo(9.701f, 4.217f)
            curveTo(9.68f, 4.06f, 9.587f, 3.925f, 9.45f, 3.848f)
            curveTo(8.613f, 3.381f, 7.16f, 2.33f, 6.432f, 1.458f)
            close()
            moveTo(4.833f, 8.998f)
            curveTo(5.24f, 8.365f, 5.651f, 7.581f, 6.035f, 6.493f)
            curveTo(6.39f, 7.492f, 6.78f, 8.268f, 7.241f, 8.998f)
            horizontalLineTo(4.833f)
            close()
        }
    }.build()
}
