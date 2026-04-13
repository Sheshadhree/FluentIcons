package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flash28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flash28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.406f, 2.852f)
            curveTo(8.606f, 2.338f, 9.1f, 2f, 9.65f, 2f)
            horizontalLineToRelative(8.516f)
            curveToRelative(0.927f, 0f, 1.57f, 0.922f, 1.252f, 1.792f)
            lineTo(17.324f, 9.5f)
            horizontalLineToRelative(4.837f)
            curveToRelative(1.178f, 0f, 1.777f, 1.416f, 0.957f, 2.262f)
            lineTo(9.784f, 25.503f)
            curveToRelative(-1.14f, 1.175f, -3.106f, 0.117f, -2.753f, -1.482f)
            lineToRelative(1.66f, -7.521f)
            horizontalLineTo(5.917f)
            curveToRelative(-1.347f, 0f, -2.274f, -1.353f, -1.787f, -2.61f)
            lineTo(8.405f, 2.853f)
            close()
        }
    }.build()
}
