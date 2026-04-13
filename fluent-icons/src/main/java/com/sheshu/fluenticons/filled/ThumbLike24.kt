package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ThumbLike24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ThumbLike24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.056f, 9.004f)
            curveToRelative(0.46f, -1.427f, 0.693f, -2.677f, 0.693f, -3.754f)
            curveToRelative(0f, -2.398f, -0.939f, -4.247f, -2.5f, -4.247f)
            curveToRelative(-0.847f, 0f, -1.109f, 0.504f, -1.437f, 1.747f)
            curveToRelative(0.018f, -0.065f, -0.163f, 0.634f, -0.215f, 0.821f)
            curveToRelative(-0.101f, 0.359f, -0.277f, 0.97f, -0.527f, 1.831f)
            curveToRelative(-0.007f, 0.023f, -0.017f, 0.045f, -0.03f, 0.065f)
            lineTo(8.174f, 9.953f)
            curveToRelative(-0.678f, 1.06f, -1.679f, 1.876f, -2.855f, 2.326f)
            lineToRelative(-1.257f, 0.482f)
            curveToRelative(-0.793f, 0.303f, -1.254f, 1.133f, -1.092f, 1.967f)
            lineToRelative(0.686f, 3.539f)
            curveToRelative(0.167f, 0.862f, 0.82f, 1.548f, 1.673f, 1.757f)
            lineToRelative(8.25f, 2.022f)
            curveToRelative(2.53f, 0.62f, 5.09f, -0.915f, 5.733f, -3.44f)
            lineToRelative(1.574f, -6.173f)
            curveToRelative(0.375f, -1.472f, -0.514f, -2.969f, -1.985f, -3.344f)
            curveToRelative(-0.222f, -0.057f, -0.45f, -0.085f, -0.68f, -0.085f)
            horizontalLineToRelative(-3.165f)
            close()
        }
    }.build()
}
