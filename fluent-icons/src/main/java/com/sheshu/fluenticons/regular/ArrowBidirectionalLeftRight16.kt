package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowBidirectionalLeftRight16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowBidirectionalLeftRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.147f, 8.854f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineTo(3.707f, 8f)
            horizontalLineToRelative(8.586f)
            lineToRelative(-2.147f, -2.146f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(3f, 3f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.196f, 0.196f, -0.512f, 0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            lineTo(12.293f, 9f)
            horizontalLineTo(3.707f)
            lineToRelative(2.147f, 2.146f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(-0.196f, 0.196f, -0.512f, 0.196f, -0.708f, 0f)
            lineToRelative(-3f, -3f)
            close()
        }
    }.build()
}
