package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowFlowDiagonalUpRight12: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowFlowDiagonalUpRight12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 1f)
            curveTo(6.224f, 1f, 6f, 1.224f, 6f, 1.5f)
            reflectiveCurveTo(6.224f, 2f, 6.5f, 2f)
            horizontalLineToRelative(2.793f)
            lineTo(4.879f, 6.414f)
            curveTo(4.484f, 6.152f, 4.009f, 6f, 3.5f, 6f)
            curveTo(2.12f, 6f, 1f, 7.12f, 1f, 8.5f)
            reflectiveCurveTo(2.12f, 11f, 3.5f, 11f)
            reflectiveCurveTo(6f, 9.88f, 6f, 8.5f)
            curveToRelative(0f, -0.51f, -0.152f, -0.984f, -0.414f, -1.379f)
            lineTo(10f, 2.707f)
            verticalLineTo(5.5f)
            curveTo(10f, 5.776f, 10.224f, 6f, 10.5f, 6f)
            reflectiveCurveTo(11f, 5.776f, 11f, 5.5f)
            verticalLineToRelative(-4f)
            curveTo(11f, 1.224f, 10.776f, 1f, 10.5f, 1f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(2f, 8.5f)
            curveTo(2f, 7.672f, 2.672f, 7f, 3.5f, 7f)
            reflectiveCurveTo(5f, 7.672f, 5f, 8.5f)
            reflectiveCurveTo(4.328f, 10f, 3.5f, 10f)
            reflectiveCurveTo(2f, 9.328f, 2f, 8.5f)
            close()
        }
    }.build()
}
