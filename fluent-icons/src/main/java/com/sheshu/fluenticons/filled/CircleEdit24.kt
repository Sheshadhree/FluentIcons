package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CircleEdit24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleEdit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.715f, 11f)
            curveToRelative(0.427f, 0f, 0.855f, 0.084f, 1.257f, 0.25f)
            curveTo(21.59f, 6.077f, 17.27f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveToRelative(0f, 5.184f, 3.945f, 9.447f, 8.997f, 9.95f)
            curveToRelative(-0.002f, -0.177f, 0.018f, -0.358f, 0.064f, -0.543f)
            lineToRelative(0.458f, -1.83f)
            curveToRelative(0.162f, -0.648f, 0.497f, -1.24f, 0.97f, -1.712f)
            lineToRelative(5.902f, -5.903f)
            curveTo(19.03f, 11.322f, 19.874f, 11f, 20.713f, 11f)
            horizontalLineToRelative(0.002f)
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
