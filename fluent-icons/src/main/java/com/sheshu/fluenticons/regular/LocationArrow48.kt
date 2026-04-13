package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LocationArrow48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LocationArrow48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(43.827f, 7.403f)
            curveToRelative(0.777f, -2.021f, -1.21f, -4.008f, -3.231f, -3.23f)
            lineTo(5.603f, 17.632f)
            curveToRelative(-2.265f, 0.87f, -2.086f, 4.133f, 0.26f, 4.75f)
            lineToRelative(14.933f, 3.93f)
            curveToRelative(0.436f, 0.115f, 0.777f, 0.455f, 0.891f, 0.89f)
            lineToRelative(3.93f, 14.933f)
            curveToRelative(0.617f, 2.347f, 3.88f, 2.526f, 4.75f, 0.262f)
            lineToRelative(13.46f, -34.994f)
            close()
            moveToRelative(-2.334f, -0.897f)
            lineTo(28.034f, 41.499f)
            lineToRelative(-3.93f, -14.932f)
            curveToRelative(-0.343f, -1.308f, -1.364f, -2.329f, -2.671f, -2.672f)
            lineTo(6.5f, 19.965f)
            lineTo(41.493f, 6.506f)
            close()
        }
    }.build()
}
