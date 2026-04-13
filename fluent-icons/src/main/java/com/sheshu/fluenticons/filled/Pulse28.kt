package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pulse28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pulse28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.035f, 3f)
            curveToRelative(0.454f, 0.017f, 0.84f, 0.337f, 0.94f, 0.78f)
            lineToRelative(3.712f, 16.496f)
            lineToRelative(3.864f, -11.592f)
            curveToRelative(0.133f, -0.398f, 0.5f, -0.671f, 0.92f, -0.684f)
            curveToRelative(0.42f, -0.012f, 0.802f, 0.239f, 0.957f, 0.629f)
            lineTo(22.177f, 13f)
            horizontalLineTo(25f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.409f, 0f, -0.777f, -0.249f, -0.928f, -0.629f)
            lineToRelative(-0.987f, -2.465f)
            lineToRelative(-4.136f, 12.41f)
            curveToRelative(-0.142f, 0.426f, -0.55f, 0.705f, -1f, 0.683f)
            curveToRelative(-0.448f, -0.023f, -0.826f, -0.341f, -0.925f, -0.78f)
            lineTo(9.862f, 7.942f)
            lineToRelative(-1.904f, 6.346f)
            curveTo(7.83f, 14.71f, 7.442f, 15f, 7f, 15f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3.256f)
            lineToRelative(2.786f, -9.287f)
            curveTo(9.172f, 3.277f, 9.581f, 2.985f, 10.035f, 3f)
            close()
        }
    }.build()
}
