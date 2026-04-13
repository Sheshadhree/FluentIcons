package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CircleEdit20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleEdit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            curveToRelative(0f, 3.606f, 2.727f, 6.575f, 6.23f, 6.958f)
            lineToRelative(-0.173f, 0.695f)
            curveToRelative(-0.024f, 0.096f, -0.04f, 0.192f, -0.05f, 0.286f)
            curveTo(5.058f, 17.45f, 2f, 14.082f, 2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            curveToRelative(4.12f, 0f, 7.514f, 3.115f, 7.952f, 7.12f)
            curveToRelative(-0.332f, -0.1f, -0.679f, -0.137f, -1.022f, -0.113f)
            curveTo(16.448f, 5.611f, 13.53f, 3f, 10f, 3f)
            close()
            moveToRelative(0.98f, 12.377f)
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
