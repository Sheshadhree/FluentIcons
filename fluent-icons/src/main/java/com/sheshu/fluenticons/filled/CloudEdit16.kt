package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudEdit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudEdit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(5.958f, 2f, 4.273f, 3.53f, 4.03f, 5.507f)
            curveTo(2.338f, 5.62f, 1f, 7.03f, 1f, 8.75f)
            curveTo(1f, 10.545f, 2.455f, 12f, 4.25f, 12f)
            horizontalLineToRelative(1.225f)
            curveToRelative(0.152f, -0.501f, 0.426f, -0.958f, 0.798f, -1.33f)
            lineToRelative(4.829f, -4.83f)
            curveToRelative(0.248f, -0.247f, 0.53f, -0.44f, 0.83f, -0.578f)
            curveTo(11.586f, 3.405f, 9.957f, 2f, 8f, 2f)
            close()
            moveToRelative(-1.02f, 9.377f)
            lineToRelative(4.83f, -4.83f)
            curveToRelative(0.73f, -0.73f, 1.914f, -0.73f, 2.644f, 0f)
            curveToRelative(0.73f, 0.731f, 0.73f, 1.915f, 0f, 2.646f)
            lineToRelative(-4.83f, 4.829f)
            curveToRelative(-0.281f, 0.282f, -0.634f, 0.481f, -1.02f, 0.578f)
            lineToRelative(-1.498f, 0.374f)
            curveToRelative(-0.651f, 0.163f, -1.242f, -0.427f, -1.079f, -1.078f)
            lineToRelative(0.375f, -1.498f)
            curveToRelative(0.096f, -0.386f, 0.296f, -0.74f, 0.578f, -1.02f)
            close()
        }
    }.build()
}
