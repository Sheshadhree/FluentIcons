package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.682f, 17.215f)
            curveToRelative(0.567f, 1.047f, 2.07f, 1.047f, 2.637f, 0f)
            lineToRelative(6.5f, -12f)
            curveToRelative(0.541f, -0.998f, -0.182f, -2.213f, -1.319f, -2.213f)
            horizontalLineTo(3.501f)
            curveToRelative(-1.136f, 0f, -1.86f, 1.215f, -1.319f, 2.214f)
            lineToRelative(6.5f, 11.998f)
            close()
            moveToRelative(1.758f, -0.477f)
            curveToRelative(-0.189f, 0.35f, -0.69f, 0.35f, -0.879f, 0f)
            lineTo(3.061f, 4.74f)
            curveTo(2.882f, 4.407f, 3.123f, 4f, 3.502f, 4f)
            horizontalLineTo(16.5f)
            curveToRelative(0.379f, 0f, 0.62f, 0.405f, 0.44f, 0.739f)
            lineToRelative(-6.5f, 11.998f)
            close()
        }
    }.build()
}
