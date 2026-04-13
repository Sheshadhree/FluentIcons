package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CallEnd16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CallEnd16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.827f, 9.7f)
            lineToRelative(0.138f, -0.754f)
            curveToRelative(0.137f, -0.748f, -0.133f, -1.533f, -0.71f, -2.063f)
            curveTo(12.883f, 5.623f, 10.74f, 4.996f, 7.825f, 5f)
            curveToRelative(-2.91f, 0.004f, -4.988f, 0.636f, -6.234f, 1.895f)
            curveToRelative(-0.528f, 0.533f, -0.72f, 1.324f, -0.505f, 2.075f)
            lineToRelative(0.216f, 0.754f)
            curveToRelative(0.202f, 0.704f, 0.884f, 1.175f, 1.594f, 1.1f)
            lineToRelative(1.424f, -0.149f)
            curveToRelative(0.611f, -0.064f, 1.094f, -0.517f, 1.198f, -1.126f)
            lineToRelative(0.274f, -1.604f)
            curveTo(6.47f, 7.625f, 7.203f, 7.454f, 7.99f, 7.43f)
            curveToRelative(0.787f, -0.024f, 1.508f, 0.103f, 2.162f, 0.382f)
            lineToRelative(0.442f, 1.714f)
            curveToRelative(0.159f, 0.617f, 0.69f, 1.078f, 1.315f, 1.14f)
            lineToRelative(1.432f, 0.144f)
            curveToRelative(0.72f, 0.072f, 1.355f, -0.402f, 1.485f, -1.11f)
            close()
        }
    }.build()
}
