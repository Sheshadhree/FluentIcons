package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpRight12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpRight12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.147f, 10.854f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            lineTo(9.293f, 2f)
            horizontalLineTo(4.47f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveTo(4.194f, 1f, 4.47f, 1f)
            horizontalLineToRelative(6.03f)
            curveTo(10.776f, 1f, 11f, 1.224f, 11f, 1.5f)
            verticalLineToRelative(6f)
            curveTo(11f, 7.776f, 10.776f, 8f, 10.5f, 8f)
            reflectiveCurveTo(10f, 7.776f, 10f, 7.5f)
            verticalLineTo(2.707f)
            lineToRelative(-8.146f, 8.147f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            close()
        }
    }.build()
}
