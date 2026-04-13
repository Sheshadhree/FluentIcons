package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowReply16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowReply16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.354f, 3.647f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineTo(3.707f, 7f)
            horizontalLineTo(8.5f)
            curveToRelative(3.038f, 0f, 5.5f, 2.462f, 5.5f, 5.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(13f, 12.776f, 13f, 12.5f)
            curveTo(13f, 10.015f, 10.985f, 8f, 8.5f, 8f)
            horizontalLineTo(3.707f)
            lineToRelative(2.647f, 2.646f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-3.5f, -3.5f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(3.5f, -3.5f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            close()
        }
    }.build()
}
