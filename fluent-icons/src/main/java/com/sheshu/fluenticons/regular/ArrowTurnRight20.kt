package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.146f, 3.147f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            lineToRelative(4f, 4f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(14.293f, 8f)
            horizontalLineTo(8f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(6.5f)
            curveTo(6f, 16.776f, 5.776f, 17f, 5.5f, 17f)
            reflectiveCurveTo(5f, 16.776f, 5f, 16.5f)
            verticalLineTo(10f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(6.293f)
            lineToRelative(-3.147f, -3.147f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            close()
        }
    }.build()
}
