package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShareAndroid20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareAndroid20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 5.5f)
            curveTo(17f, 6.88f, 15.88f, 8f, 14.5f, 8f)
            curveToRelative(-0.799f, 0f, -1.51f, -0.374f, -1.967f, -0.957f)
            lineTo(7.915f, 9.35f)
            curveTo(7.971f, 9.559f, 8f, 9.777f, 8f, 10f)
            curveToRelative(0f, 0.224f, -0.03f, 0.442f, -0.085f, 0.649f)
            lineToRelative(4.618f, 2.308f)
            curveTo(12.99f, 12.374f, 13.7f, 12f, 14.5f, 12f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveTo(15.88f, 17f, 14.5f, 17f)
            reflectiveCurveTo(12f, 15.88f, 12f, 14.5f)
            curveToRelative(0f, -0.224f, 0.03f, -0.442f, 0.085f, -0.649f)
            lineToRelative(-4.618f, -2.308f)
            curveTo(7.01f, 12.126f, 6.3f, 12.5f, 5.5f, 12.5f)
            curveTo(4.12f, 12.5f, 3f, 11.38f, 3f, 10f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            curveToRelative(0.799f, 0f, 1.51f, 0.374f, 1.967f, 0.957f)
            lineToRelative(4.618f, -2.308f)
            curveTo(12.029f, 5.942f, 12f, 5.724f, 12f, 5.5f)
            curveTo(12f, 4.12f, 13.12f, 3f, 14.5f, 3f)
            reflectiveCurveTo(17f, 4.12f, 17f, 5.5f)
            close()
        }
    }.build()
}
