package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FolderOpenDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderOpenDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 17f)
            curveTo(3.12f, 17f, 2f, 15.88f, 2f, 14.5f)
            verticalLineTo(7.529f)
            lineToRelative(1.568f, 2.716f)
            curveToRelative(0.626f, 1.083f, 1.781f, 1.75f, 3.031f, 1.75f)
            horizontalLineTo(16f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(9.707f)
            lineToRelative(-1.56f, 1.56f)
            curveTo(7.864f, 16.843f, 7.483f, 17f, 7.085f, 17f)
            horizontalLineTo(4.5f)
            close()
            moveTo(4.434f, 9.745f)
            curveToRelative(0.447f, 0.774f, 1.272f, 1.25f, 2.165f, 1.25f)
            horizontalLineToRelative(10.396f)
            curveToRelative(1.54f, 0f, 2.502f, -1.666f, 1.732f, -3f)
            lineTo(16.565f, 4.25f)
            curveTo(16.12f, 3.477f, 15.293f, 3f, 14.4f, 3f)
            horizontalLineTo(4.004f)
            curveToRelative(-1.54f, 0f, -2.502f, 1.667f, -1.732f, 3f)
            lineToRelative(2.162f, 3.745f)
            close()
        }
    }.build()
}
