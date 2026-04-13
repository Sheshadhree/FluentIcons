package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowForward16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowForward16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.646f, 3.647f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(12.293f, 7f)
            horizontalLineTo(7.5f)
            curveTo(4.462f, 7f, 2f, 9.462f, 2f, 12.5f)
            curveTo(2f, 12.776f, 2.224f, 13f, 2.5f, 13f)
            reflectiveCurveTo(3f, 12.776f, 3f, 12.5f)
            curveTo(3f, 10.015f, 5.015f, 8f, 7.5f, 8f)
            horizontalLineToRelative(4.793f)
            lineToRelative(-2.646f, 2.646f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(3.5f, -3.5f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-3.5f, -3.5f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            close()
        }
    }.build()
}
