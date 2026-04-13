package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.WeatherMoon28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.WeatherMoon28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.823f, 2.302f)
            curveToRelative(-0.156f, 0.185f, -0.214f, 0.433f, -0.155f, 0.668f)
            curveToRelative(0.652f, 2.6f, 1.105f, 6.518f, -0.608f, 9.945f)
            curveToRelative(-0.859f, 1.716f, -2.396f, 3.02f, -4.17f, 4.003f)
            curveToRelative(-1.77f, 0.98f, -3.72f, 1.61f, -5.32f, 2.004f)
            curveToRelative(-0.229f, 0.057f, -0.418f, 0.218f, -0.51f, 0.435f)
            curveToRelative(-0.093f, 0.218f, -0.077f, 0.466f, 0.042f, 0.67f)
            curveTo(5.179f, 23.598f, 9.049f, 26f, 13.48f, 26f)
            curveToRelative(6.628f, 0f, 12f, -5.372f, 12f, -12f)
            curveToRelative(0f, -6.299f, -4.853f, -11.464f, -11.024f, -11.96f)
            curveToRelative(-0.241f, -0.02f, -0.477f, 0.078f, -0.633f, 0.262f)
            close()
            moveToRelative(1.54f, 1.366f)
            curveTo(20.262f, 4.556f, 23.98f, 8.845f, 23.98f, 14f)
            curveToRelative(0f, 5.8f, -4.7f, 10.5f, -10.5f, 10.5f)
            curveToRelative(-3.518f, 0f, -6.634f, -1.73f, -8.54f, -4.39f)
            curveToRelative(1.462f, -0.416f, 3.122f, -1.018f, 4.677f, -1.88f)
            curveToRelative(1.924f, -1.066f, 3.742f, -2.56f, 4.784f, -4.644f)
            curveToRelative(1.717f, -3.433f, 1.501f, -7.207f, 0.961f, -9.918f)
            close()
        }
    }.build()
}
