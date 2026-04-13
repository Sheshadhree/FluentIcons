package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Copy16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Copy16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4.085f)
            verticalLineTo(10.5f)
            curveToRelative(0f, 1.325f, 1.032f, 2.41f, 2.336f, 2.495f)
            lineTo(6.5f, 13f)
            horizontalLineToRelative(4.414f)
            curveToRelative(-0.206f, 0.583f, -0.761f, 1f, -1.414f, 1f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(5.5f)
            curveToRelative(0f, -0.653f, 0.417f, -1.209f, 1f, -1.415f)
            close()
            moveTo(11.5f, 2f)
            curveTo(12.328f, 2f, 13f, 2.672f, 13f, 3.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(5.672f, 12f, 5f, 11.328f, 5f, 10.5f)
            verticalLineToRelative(-7f)
            curveTo(5f, 2.672f, 5.672f, 2f, 6.5f, 2f)
            horizontalLineToRelative(5f)
            close()
        }
    }.build()
}
