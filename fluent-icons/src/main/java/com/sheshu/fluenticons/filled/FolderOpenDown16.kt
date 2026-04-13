package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FolderOpenDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderOpenDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 11.495f)
            verticalLineTo(6.53f)
            lineToRelative(0.991f, 1.716f)
            curveToRelative(0.625f, 1.083f, 1.78f, 1.75f, 3.031f, 1.75f)
            horizontalLineToRelative(7.928f)
            curveToRelative(-0.232f, 1.141f, -1.24f, 2f, -2.45f, 2f)
            horizontalLineTo(7.207f)
            lineToRelative(-1.56f, 1.56f)
            curveToRelative(-0.282f, 0.282f, -0.663f, 0.44f, -1.061f, 0.44f)
            horizontalLineTo(3.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveToRelative(4.022f, -2.5f)
            horizontalLineToRelative(7.973f)
            curveToRelative(1.54f, 0f, 2.502f, -1.666f, 1.732f, -3f)
            lineTo(13.142f, 3.25f)
            curveTo(12.697f, 2.477f, 11.872f, 2f, 10.977f, 2f)
            horizontalLineTo(3.004f)
            curveToRelative(-1.54f, 0f, -2.502f, 1.667f, -1.732f, 3f)
            lineToRelative(1.585f, 2.745f)
            curveToRelative(0.447f, 0.774f, 1.272f, 1.25f, 2.165f, 1.25f)
            close()
        }
    }.build()
}
