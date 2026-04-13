package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowFlowDiagonalUpRight12: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowFlowDiagonalUpRight12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1.5f)
            curveTo(6f, 1.224f, 6.224f, 1f, 6.5f, 1f)
            horizontalLineToRelative(4f)
            curveTo(10.776f, 1f, 11f, 1.224f, 11f, 1.5f)
            verticalLineToRelative(4f)
            curveTo(11f, 5.776f, 10.776f, 6f, 10.5f, 6f)
            reflectiveCurveTo(10f, 5.776f, 10f, 5.5f)
            verticalLineTo(2.707f)
            lineTo(5.586f, 7.121f)
            curveTo(5.848f, 7.516f, 6f, 7.991f, 6f, 8.5f)
            curveTo(6f, 9.88f, 4.88f, 11f, 3.5f, 11f)
            reflectiveCurveTo(1f, 9.88f, 1f, 8.5f)
            reflectiveCurveTo(2.12f, 6f, 3.5f, 6f)
            curveToRelative(0.51f, 0f, 0.984f, 0.152f, 1.379f, 0.414f)
            lineTo(9.293f, 2f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 2f, 6f, 1.776f, 6f, 1.5f)
            close()
        }
    }.build()
}
