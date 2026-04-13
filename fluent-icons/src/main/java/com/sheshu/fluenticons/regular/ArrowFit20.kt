package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowFit20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowFit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.354f, 6.646f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineTo(3.707f, 9f)
            horizontalLineTo(8.5f)
            curveTo(8.776f, 9f, 9f, 9.224f, 9f, 9.5f)
            reflectiveCurveTo(8.776f, 10f, 8.5f, 10f)
            horizontalLineTo(3.707f)
            lineToRelative(1.647f, 1.646f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-2.5f, -2.5f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(2.5f, -2.5f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            close()
            moveToRelative(9.292f, 0f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(-2.5f, 2.5f)
            curveToRelative(-0.196f, 0.196f, -0.512f, 0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            lineTo(16.293f, 10f)
            horizontalLineTo(11.5f)
            curveTo(11.224f, 10f, 11f, 9.776f, 11f, 9.5f)
            reflectiveCurveTo(11.224f, 9f, 11.5f, 9f)
            horizontalLineToRelative(4.793f)
            lineToRelative(-1.647f, -1.646f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}
