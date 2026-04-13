package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 4f)
            curveTo(8.224f, 4f, 8f, 3.776f, 8f, 3.5f)
            reflectiveCurveTo(8.224f, 3f, 8.5f, 3f)
            horizontalLineToRelative(8f)
            curveTo(16.776f, 3f, 17f, 3.224f, 17f, 3.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(16f, 11.776f, 16f, 11.5f)
            verticalLineTo(4.707f)
            lineTo(3.854f, 16.854f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(15.293f, 4f)
            horizontalLineTo(8.5f)
            close()
        }
    }.build()
}
