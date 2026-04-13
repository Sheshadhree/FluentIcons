package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextColor16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColor16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveToRelative(0.2f, 0f, 0.38f, 0.12f, 0.46f, 0.303f)
            lineToRelative(3f, 7f)
            curveToRelative(0.108f, 0.254f, -0.01f, 0.548f, -0.263f, 0.657f)
            curveToRelative(-0.254f, 0.108f, -0.548f, -0.01f, -0.657f, -0.263f)
            lineTo(9.813f, 7f)
            horizontalLineTo(6.187f)
            lineTo(5.46f, 8.697f)
            curveTo(5.35f, 8.951f, 5.057f, 9.068f, 4.803f, 8.96f)
            curveTo(4.549f, 8.85f, 4.432f, 8.557f, 4.54f, 8.303f)
            lineToRelative(3f, -7f)
            curveTo(7.62f, 1.119f, 7.8f, 1f, 8f, 1f)
            close()
            moveTo(6.615f, 6f)
            horizontalLineToRelative(2.77f)
            lineTo(8f, 2.77f)
            lineTo(6.615f, 6f)
            close()
            moveTo(2f, 11.5f)
            curveTo(2f, 10.672f, 2.672f, 10f, 3.5f, 10f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.672f, 15f, 2f, 14.328f, 2f, 13.5f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
