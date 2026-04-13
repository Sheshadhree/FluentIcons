package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlagOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagOff16",
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
            moveTo(13f, 10f)
            horizontalLineToRelative(-0.879f)
            lineToRelative(-8f, -8f)
            horizontalLineTo(13f)
            curveToRelative(0.407f, 0f, 0.643f, 0.46f, 0.407f, 0.79f)
            lineTo(11.114f, 6f)
            lineToRelative(2.293f, 3.21f)
            curveTo(13.643f, 9.54f, 13.407f, 10f, 13f, 10f)
            close()
        }
    }.build()
}
