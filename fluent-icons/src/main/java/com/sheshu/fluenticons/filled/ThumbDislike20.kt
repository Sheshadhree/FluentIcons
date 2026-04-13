package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ThumbDislike20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ThumbDislike20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.483f, 18.296f)
            curveToRelative(-0.799f, 0.837f, -2.092f, 0.387f, -2.431f, -0.59f)
            curveToRelative(-0.28f, -0.807f, -0.644f, -1.772f, -0.998f, -2.483f)
            curveToRelative(-1.06f, -2.126f, -1.678f, -3.336f, -3.384f, -4.85f)
            curveToRelative(-0.227f, -0.2f, -0.518f, -0.362f, -0.84f, -0.49f)
            curveTo(3.7f, 9.438f, 2.637f, 8.269f, 2.915f, 6.88f)
            lineToRelative(0.353f, -1.765f)
            curveToRelative(0.186f, -0.929f, 0.88f, -1.673f, 1.793f, -1.922f)
            lineToRelative(5.6f, -1.527f)
            curveToRelative(2.546f, -0.694f, 5.14f, 0.94f, 5.612f, 3.536f)
            lineToRelative(0.684f, 3.762f)
            curveToRelative(0.334f, 1.842f, -1.08f, 3.537f, -2.952f, 3.537f)
            horizontalLineToRelative(-0.883f)
            lineToRelative(0.01f, 0.052f)
            curveToRelative(0.08f, 0.408f, 0.176f, 0.97f, 0.24f, 1.583f)
            curveToRelative(0.065f, 0.61f, 0.1f, 1.284f, 0.049f, 1.912f)
            curveToRelative(-0.05f, 0.617f, -0.184f, 1.25f, -0.504f, 1.73f)
            curveToRelative(-0.11f, 0.164f, -0.272f, 0.348f, -0.435f, 0.519f)
            close()
        }
    }.build()
}
