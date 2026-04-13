package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FolderOpenVertical20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderOpenVertical20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 4.5f)
            curveTo(17f, 3.12f, 15.88f, 2f, 14.5f, 2f)
            horizontalLineTo(7.529f)
            lineToRelative(2.716f, 1.568f)
            curveToRelative(1.083f, 0.626f, 1.75f, 1.781f, 1.75f, 3.031f)
            verticalLineTo(16f)
            horizontalLineTo(12.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(9.707f)
            lineToRelative(1.56f, -1.56f)
            curveTo(16.843f, 7.864f, 17f, 7.483f, 17f, 7.085f)
            verticalLineTo(4.5f)
            close()
            moveTo(9.745f, 4.434f)
            curveToRelative(0.774f, 0.447f, 1.25f, 1.272f, 1.25f, 2.165f)
            verticalLineToRelative(10.396f)
            curveToRelative(0f, 1.54f, -1.666f, 2.502f, -3f, 1.732f)
            lineTo(4.25f, 16.565f)
            curveTo(3.477f, 16.12f, 3f, 15.293f, 3f, 14.4f)
            verticalLineTo(4.004f)
            curveToRelative(0f, -1.54f, 1.667f, -2.502f, 3f, -1.732f)
            lineToRelative(3.745f, 2.162f)
            close()
        }
    }.build()
}
