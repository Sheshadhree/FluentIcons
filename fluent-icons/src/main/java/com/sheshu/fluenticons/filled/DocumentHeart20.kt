package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentHeart20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentHeart20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 6.5f)
            verticalLineTo(2f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 2f, 4f, 2.672f, 4f, 3.5f)
            verticalLineToRelative(5.503f)
            curveTo(4.702f, 9.03f, 5.398f, 9.248f, 6.003f, 9.657f)
            curveToRelative(1.498f, -1.012f, 3.55f, -0.855f, 4.875f, 0.47f)
            curveToRelative(1.504f, 1.505f, 1.504f, 3.942f, 0f, 5.446f)
            lineTo(8.45f, 18f)
            horizontalLineToRelative(6.05f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(-4.5f)
            curveTo(10.671f, 8f, 10f, 7.328f, 10f, 6.5f)
            close()
            moveToRelative(1f, 0f)
            verticalLineTo(2.25f)
            lineTo(15.75f, 7f)
            horizontalLineTo(11.5f)
            curveTo(11.225f, 7f, 11f, 6.776f, 11f, 6.5f)
            close()
            moveToRelative(-4.863f, 4.335f)
            curveToRelative(1.113f, -1.113f, 2.918f, -1.113f, 4.031f, 0f)
            curveToRelative(1.113f, 1.113f, 1.113f, 2.918f, 0f, 4.031f)
            lineTo(6.354f, 18.68f)
            curveToRelative(-0.195f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineToRelative(-3.814f, -3.814f)
            curveToRelative(-1.113f, -1.113f, -1.113f, -2.918f, 0f, -4.031f)
            curveToRelative(1.113f, -1.113f, 2.918f, -1.113f, 4.031f, 0f)
            lineToRelative(0.137f, 0.136f)
            lineToRelative(0.136f, -0.136f)
            close()
            moveToRelative(4.031f, 4.031f)
            lineToRelative(-0.353f, -0.353f)
            close()
        }
    }.build()
}
