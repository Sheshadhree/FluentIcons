package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowFlowDiagonalUpRight16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowFlowDiagonalUpRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 3f)
            curveTo(8.224f, 3f, 8f, 3.224f, 8f, 3.5f)
            reflectiveCurveTo(8.224f, 4f, 8.5f, 4f)
            horizontalLineToRelative(2.793f)
            lineTo(5.879f, 9.414f)
            curveTo(5.484f, 9.152f, 5.009f, 9f, 4.5f, 9f)
            curveTo(3.12f, 9f, 2f, 10.12f, 2f, 11.5f)
            reflectiveCurveTo(3.12f, 14f, 4.5f, 14f)
            reflectiveCurveTo(7f, 12.88f, 7f, 11.5f)
            curveToRelative(0f, -0.51f, -0.152f, -0.983f, -0.414f, -1.379f)
            lineTo(12f, 4.707f)
            verticalLineTo(7.5f)
            curveTo(12f, 7.776f, 12.224f, 8f, 12.5f, 8f)
            reflectiveCurveTo(13f, 7.776f, 13f, 7.5f)
            verticalLineToRelative(-4f)
            curveTo(13f, 3.224f, 12.776f, 3f, 12.5f, 3f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
