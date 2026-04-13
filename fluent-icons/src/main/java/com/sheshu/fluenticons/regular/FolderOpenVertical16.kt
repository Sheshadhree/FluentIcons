package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FolderOpenVertical16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FolderOpenVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 2f)
            horizontalLineTo(6.9f)
            lineToRelative(1.6f, 0.924f)
            curveTo(9.428f, 3.46f, 10f, 4.45f, 10f, 5.522f)
            verticalLineToRelative(6.393f)
            curveToRelative(0.583f, -0.206f, 1f, -0.762f, 1f, -1.415f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.133f, 0.053f, -0.26f, 0.146f, -0.354f)
            lineToRelative(1.708f, -1.707f)
            curveTo(12.947f, 4.846f, 13f, 4.72f, 13f, 4.586f)
            verticalLineTo(3.5f)
            curveTo(13f, 2.672f, 12.328f, 2f, 11.5f, 2f)
            close()
            moveTo(2.005f, 7.069f)
            curveTo(2.002f, 7.046f, 2f, 7.023f, 2f, 7f)
            verticalLineTo(3.5f)
            curveTo(2f, 2.12f, 3.12f, 1f, 4.5f, 1f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 1f, 14f, 2.12f, 14f, 3.5f)
            verticalLineToRelative(1.086f)
            curveToRelative(0f, 0.398f, -0.158f, 0.78f, -0.44f, 1.06f)
            lineTo(12f, 7.207f)
            verticalLineTo(10.5f)
            curveToRelative(0f, 1.224f, -0.88f, 2.243f, -2.041f, 2.458f)
            curveToRelative(-0.3f, 1.647f, -2.18f, 2.586f, -3.709f, 1.704f)
            lineToRelative(-2.745f, -1.585f)
            curveToRelative(-0.929f, -0.536f, -1.5f, -1.527f, -1.5f, -2.598f)
            verticalLineToRelative(-3.41f)
            close()
            moveTo(9f, 5.522f)
            curveTo(9f, 4.807f, 8.619f, 4.147f, 8f, 3.79f)
            lineTo(5.255f, 2.205f)
            curveToRelative(-1f, -0.577f, -2.25f, 0.144f, -2.25f, 1.299f)
            verticalLineToRelative(6.975f)
            curveToRelative(0f, 0.714f, 0.38f, 1.374f, 1f, 1.732f)
            lineToRelative(2.745f, 1.585f)
            curveToRelative(1f, 0.577f, 2.25f, -0.145f, 2.25f, -1.3f)
            verticalLineTo(5.522f)
            close()
        }
    }.build()
}
