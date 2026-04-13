package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CloudEdit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CloudEdit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            curveToRelative(1.638f, 0f, 2.97f, 1.313f, 3f, 2.943f)
            lineToRelative(0.102f, -0.102f)
            curveToRelative(0.248f, -0.248f, 0.53f, -0.441f, 0.83f, -0.58f)
            curveTo(11.586f, 3.406f, 9.957f, 2f, 8f, 2f)
            curveTo(5.958f, 2f, 4.273f, 3.53f, 4.03f, 5.507f)
            curveTo(2.338f, 5.62f, 1f, 7.03f, 1f, 8.75f)
            curveTo(1f, 10.545f, 2.455f, 12f, 4.25f, 12f)
            horizontalLineToRelative(1.225f)
            curveToRelative(0.11f, -0.361f, 0.283f, -0.7f, 0.51f, -1f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 11f, 2f, 9.993f, 2f, 8.75f)
            reflectiveCurveTo(3.007f, 6.5f, 4.25f, 6.5f)
            horizontalLineTo(4.5f)
            curveTo(4.776f, 6.5f, 5f, 6.276f, 5f, 6f)
            close()
            moveToRelative(1.98f, 5.377f)
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
