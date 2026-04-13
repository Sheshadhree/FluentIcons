package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ThumbLike20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ThumbLike20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.483f, 1.704f)
            curveToRelative(-0.799f, -0.837f, -2.092f, -0.387f, -2.431f, 0.59f)
            curveTo(9.772f, 3.1f, 9.408f, 4.066f, 9.054f, 4.777f)
            curveTo(7.994f, 6.903f, 7.376f, 8.112f, 5.67f, 9.626f)
            curveToRelative(-0.227f, 0.2f, -0.518f, 0.363f, -0.84f, 0.49f)
            curveToRelative(-1.13f, 0.446f, -2.192f, 1.616f, -1.914f, 3.005f)
            lineToRelative(0.353f, 1.765f)
            curveToRelative(0.186f, 0.928f, 0.88f, 1.672f, 1.793f, 1.922f)
            lineToRelative(5.6f, 1.527f)
            curveToRelative(2.546f, 0.694f, 5.14f, -0.94f, 5.612f, -3.537f)
            lineToRelative(0.684f, -3.761f)
            curveToRelative(0.334f, -1.842f, -1.08f, -3.537f, -2.952f, -3.537f)
            horizontalLineToRelative(-0.883f)
            lineToRelative(0.01f, -0.052f)
            curveToRelative(0.08f, -0.409f, 0.176f, -0.97f, 0.24f, -1.583f)
            curveToRelative(0.065f, -0.61f, 0.1f, -1.285f, 0.049f, -1.913f)
            curveToRelative(-0.05f, -0.616f, -0.184f, -1.249f, -0.504f, -1.73f)
            curveToRelative(-0.11f, -0.164f, -0.272f, -0.348f, -0.435f, -0.518f)
            close()
        }
    }.build()
}
