package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.646f, 1.647f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.707f, 0f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.196f, 0.195f, 0.196f, 0.511f, 0f, 0.707f)
            lineToRelative(-3.5f, 3.5f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            lineTo(11.293f, 6f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 6f, 4f, 6.672f, 4f, 7.5f)
            verticalLineToRelative(6f)
            curveTo(4f, 13.776f, 3.776f, 14f, 3.5f, 14f)
            reflectiveCurveTo(3f, 13.776f, 3f, 13.5f)
            verticalLineToRelative(-6f)
            curveTo(3f, 6.12f, 4.12f, 5f, 5.5f, 5f)
            horizontalLineToRelative(5.793f)
            lineTo(8.647f, 2.353f)
            curveToRelative(-0.196f, -0.195f, -0.196f, -0.511f, 0f, -0.707f)
            close()
        }
    }.build()
}
