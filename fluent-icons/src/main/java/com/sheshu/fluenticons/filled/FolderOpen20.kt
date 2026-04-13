package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FolderOpen20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderOpen20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 3f)
            curveTo(3.12f, 3f, 2f, 4.12f, 2f, 5.5f)
            verticalLineToRelative(6.971f)
            lineToRelative(1.568f, -2.716f)
            curveTo(4.194f, 8.672f, 5.35f, 8.005f, 6.6f, 8.005f)
            horizontalLineTo(16f)
            verticalLineTo(7.5f)
            curveTo(16f, 6.12f, 14.88f, 5f, 13.5f, 5f)
            horizontalLineTo(9.707f)
            lineToRelative(-1.56f, -1.56f)
            curveTo(7.864f, 3.157f, 7.483f, 3f, 7.085f, 3f)
            horizontalLineTo(4.5f)
            close()
            moveToRelative(-0.066f, 7.255f)
            curveTo(4.881f, 9.48f, 5.706f, 9.005f, 6.6f, 9.005f)
            horizontalLineToRelative(10.396f)
            curveToRelative(1.54f, 0f, 2.502f, 1.666f, 1.732f, 3f)
            lineToRelative(-2.162f, 3.745f)
            curveTo(16.12f, 16.523f, 15.293f, 17f, 14.4f, 17f)
            horizontalLineTo(4.004f)
            curveToRelative(-1.54f, 0f, -2.502f, -1.667f, -1.732f, -3f)
            lineToRelative(2.162f, -3.745f)
            close()
        }
    }.build()
}
