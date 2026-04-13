package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CircleEdit24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleEdit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 3.5f)
            curveToRelative(-4.694f, 0f, -8.5f, 3.806f, -8.5f, 8.5f)
            curveToRelative(0f, 4.457f, 3.43f, 8.113f, 7.795f, 8.471f)
            lineToRelative(-0.234f, 0.936f)
            curveToRelative(-0.046f, 0.184f, -0.066f, 0.366f, -0.064f, 0.543f)
            curveTo(5.945f, 21.447f, 2f, 17.184f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            curveToRelative(5.27f, 0f, 9.589f, 4.077f, 9.972f, 9.25f)
            curveToRelative(-0.402f, -0.166f, -0.83f, -0.25f, -1.257f, -0.25f)
            horizontalLineToRelative(-0.002f)
            curveToRelative(-0.09f, 0f, -0.18f, 0.004f, -0.27f, 0.011f)
            curveTo(19.953f, 6.783f, 16.36f, 3.5f, 12f, 3.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.715f, 12f)
            horizontalLineToRelative(-0.002f)
            curveToRelative(-0.585f, 0f, -1.17f, 0.223f, -1.615f, 0.67f)
            lineToRelative(-5.902f, 5.902f)
            curveToRelative(-0.345f, 0.344f, -0.589f, 0.775f, -0.707f, 1.247f)
            lineToRelative(-0.458f, 1.831f)
            curveToRelative(-0.199f, 0.796f, 0.523f, 1.517f, 1.319f, 1.318f)
            lineToRelative(1.83f, -0.457f)
            curveToRelative(0.473f, -0.118f, 0.904f, -0.363f, 1.248f, -0.707f)
            lineToRelative(5.902f, -5.902f)
            curveToRelative(0.893f, -0.893f, 0.893f, -2.34f, 0f, -3.232f)
            curveTo(21.884f, 12.223f, 21.3f, 12f, 20.715f, 12f)
            close()
        }
    }.build()
}
