package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlagOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlagOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.293f, 10f)
            lineToRelative(4.853f, 4.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(3f, 3.707f)
            verticalLineTo(13.5f)
            curveTo(3f, 13.776f, 3.224f, 14f, 3.5f, 14f)
            reflectiveCurveTo(4f, 13.776f, 4f, 13.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(5.293f)
            close()
            moveToRelative(-1f, -1f)
            horizontalLineTo(4f)
            verticalLineTo(4.707f)
            lineTo(8.293f, 9f)
            close()
            moveToRelative(3.735f, 0f)
            horizontalLineToRelative(-0.907f)
            lineToRelative(1f, 1f)
            horizontalLineTo(13f)
            curveToRelative(0.407f, 0f, 0.643f, -0.46f, 0.407f, -0.79f)
            lineTo(11.114f, 6f)
            lineToRelative(2.293f, -3.21f)
            curveTo(13.643f, 2.46f, 13.407f, 2f, 13f, 2f)
            horizontalLineTo(4.121f)
            lineToRelative(1f, 1f)
            horizontalLineToRelative(6.907f)
            lineToRelative(-1.935f, 2.71f)
            curveToRelative(-0.124f, 0.173f, -0.124f, 0.407f, 0f, 0.58f)
            lineTo(12.028f, 9f)
            close()
        }
    }.build()
}
