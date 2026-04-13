package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 3f)
            curveTo(7.224f, 3f, 7f, 2.776f, 7f, 2.5f)
            reflectiveCurveTo(7.224f, 2f, 7.5f, 2f)
            horizontalLineToRelative(6f)
            curveTo(13.776f, 2f, 14f, 2.224f, 14f, 2.5f)
            verticalLineToRelative(6f)
            curveTo(14f, 8.776f, 13.776f, 9f, 13.5f, 9f)
            reflectiveCurveTo(13f, 8.776f, 13f, 8.5f)
            verticalLineTo(3.707f)
            lineTo(2.854f, 13.854f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(12.293f, 3f)
            horizontalLineTo(7.5f)
            close()
        }
    }.build()
}
