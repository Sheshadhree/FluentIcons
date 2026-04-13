package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.InkingTool16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.InkingTool16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.009f, 1f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(0.406f)
            curveTo(1.003f, 2.436f, 1f, 2.468f, 1f, 2.5f)
            verticalLineToRelative(1f)
            curveTo(1f, 4.328f, 1.672f, 5f, 2.5f, 5f)
            horizontalLineToRelative(0.252f)
            lineToRelative(0.001f, 0.003f)
            horizontalLineToRelative(10.494f)
            lineTo(13.248f, 5f)
            horizontalLineTo(13.5f)
            curveTo(14.328f, 5f, 15f, 4.328f, 15f, 3.5f)
            verticalLineTo(2f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(2.01f)
            close()
            moveToRelative(4.5f, 12f)
            curveToRelative(0.01f, 0.41f, 0.108f, 0.858f, 0.31f, 1.227f)
            curveToRelative(0.215f, 0.39f, 0.599f, 0.768f, 1.173f, 0.775f)
            horizontalLineToRelative(0.016f)
            curveToRelative(0.574f, -0.007f, 0.958f, -0.385f, 1.172f, -0.775f)
            curveToRelative(0.203f, -0.369f, 0.3f, -0.817f, 0.31f, -1.227f)
            horizontalLineTo(6.51f)
            close()
            moveToRelative(3.471f, -1.548f)
            lineToRelative(2.76f, -5.45f)
            horizontalLineTo(3.26f)
            lineToRelative(2.757f, 5.45f)
            curveTo(6.187f, 11.787f, 6.532f, 12f, 6.909f, 12f)
            horizontalLineToRelative(2.179f)
            curveToRelative(0.377f, 0f, 0.722f, -0.212f, 0.892f, -0.548f)
            close()
        }
    }.build()
}
