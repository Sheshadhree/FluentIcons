package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PauseOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PauseOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.147f, 13.854f)
            lineToRelative(1f, 1f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveTo(2.053f, 3.048f, 2f, 3.267f, 2f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(2f, 13.328f, 2.672f, 14f, 3.5f, 14f)
            horizontalLineToRelative(2f)
            curveTo(6.328f, 14f, 7f, 13.328f, 7f, 12.5f)
            verticalLineTo(7.707f)
            lineToRelative(2f, 2f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.232f, 0f, 0.45f, -0.053f, 0.647f, -0.146f)
            close()
            moveTo(9f, 6.879f)
            lineToRelative(5f, 5f)
            verticalLineTo(3.5f)
            curveTo(14f, 2.672f, 13.328f, 2f, 12.5f, 2f)
            horizontalLineToRelative(-2f)
            curveTo(9.672f, 2f, 9f, 2.672f, 9f, 3.5f)
            verticalLineToRelative(3.379f)
            close()
            moveTo(4.121f, 2f)
            lineTo(7f, 4.879f)
            verticalLineTo(3.5f)
            curveTo(7f, 2.672f, 6.328f, 2f, 5.5f, 2f)
            horizontalLineTo(4.121f)
            close()
        }
    }.build()
}
