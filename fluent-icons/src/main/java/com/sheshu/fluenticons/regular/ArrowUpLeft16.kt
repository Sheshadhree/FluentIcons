package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 3f)
            curveTo(8.776f, 3f, 9f, 2.776f, 9f, 2.5f)
            reflectiveCurveTo(8.776f, 2f, 8.5f, 2f)
            horizontalLineToRelative(-6f)
            curveTo(2.224f, 2f, 2f, 2.224f, 2f, 2.5f)
            verticalLineToRelative(6f)
            curveTo(2f, 8.776f, 2.224f, 9f, 2.5f, 9f)
            reflectiveCurveTo(3f, 8.776f, 3f, 8.5f)
            verticalLineTo(3.707f)
            lineToRelative(10.146f, 10.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(3.707f, 3f)
            horizontalLineTo(8.5f)
            close()
        }
    }.build()
}
