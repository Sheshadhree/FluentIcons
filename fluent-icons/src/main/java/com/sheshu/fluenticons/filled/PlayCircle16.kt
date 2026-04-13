package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PlayCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PlayCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            close()
            moveToRelative(8.5f, 0f)
            curveToRelative(0f, -0.18f, -0.097f, -0.346f, -0.254f, -0.435f)
            lineTo(7.62f, 6.076f)
            curveTo(7.12f, 5.793f, 6.5f, 6.155f, 6.5f, 6.73f)
            verticalLineToRelative(2.542f)
            curveToRelative(0f, 0.575f, 0.62f, 0.936f, 1.12f, 0.652f)
            lineToRelative(2.626f, -1.488f)
            curveTo(10.403f, 8.346f, 10.5f, 8.18f, 10.5f, 8f)
            close()
        }
    }.build()
}
