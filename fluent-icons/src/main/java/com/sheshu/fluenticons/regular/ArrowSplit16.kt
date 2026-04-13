package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSplit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSplit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(2f)
            curveTo(11.328f, 6f, 12f, 6.672f, 12f, 7.5f)
            verticalLineToRelative(4.793f)
            lineToRelative(1.146f, -1.147f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            lineTo(11f, 12.293f)
            verticalLineTo(7.5f)
            curveTo(11f, 7.224f, 10.776f, 7f, 10.5f, 7f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 7f, 5f, 7.224f, 5f, 7.5f)
            verticalLineToRelative(4.793f)
            lineToRelative(1.146f, -1.147f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(4f, 12.293f)
            verticalLineTo(7.5f)
            curveTo(4f, 6.672f, 4.672f, 6f, 5.5f, 6f)
            horizontalLineToRelative(2f)
            verticalLineTo(2.5f)
            curveTo(7.5f, 2.224f, 7.724f, 2f, 8f, 2f)
            close()
        }
    }.build()
}
