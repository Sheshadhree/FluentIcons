package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Pentagon32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pentagon32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.09f, 2.602f)
            curveToRelative(1.139f, -0.827f, 2.681f, -0.827f, 3.82f, 0f)
            lineToRelative(10.242f, 7.441f)
            curveToRelative(1.139f, 0.828f, 1.616f, 2.295f, 1.18f, 3.634f)
            lineToRelative(-3.912f, 12.04f)
            curveToRelative(-0.435f, 1.339f, -1.682f, 2.245f, -3.09f, 2.245f)
            horizontalLineTo(9.67f)
            curveToRelative(-1.408f, 0f, -2.656f, -0.906f, -3.09f, -2.245f)
            lineToRelative(-3.913f, -12.04f)
            curveToRelative(-0.435f, -1.34f, 0.042f, -2.806f, 1.18f, -3.634f)
            lineToRelative(10.242f, -7.44f)
            close()
            moveToRelative(2.645f, 1.618f)
            curveToRelative(-0.439f, -0.318f, -1.032f, -0.318f, -1.47f, 0f)
            lineTo(5.023f, 11.661f)
            curveTo(4.585f, 11.98f, 4.402f, 12.544f, 4.57f, 13.06f)
            lineTo(8.482f, 25.1f)
            curveToRelative(0.168f, 0.515f, 0.648f, 0.863f, 1.189f, 0.863f)
            horizontalLineToRelative(12.66f)
            curveToRelative(0.541f, 0f, 1.021f, -0.348f, 1.188f, -0.863f)
            lineToRelative(3.912f, -12.04f)
            curveToRelative(0.168f, -0.515f, -0.016f, -1.08f, -0.454f, -1.398f)
            lineToRelative(-10.241f, -7.44f)
            close()
        }
    }.build()
}
