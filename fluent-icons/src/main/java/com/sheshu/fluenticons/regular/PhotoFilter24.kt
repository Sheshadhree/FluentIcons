package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PhotoFilter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhotoFilter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 2f)
            curveToRelative(3.384f, 0f, 6.245f, 2.242f, 7.179f, 5.321f)
            curveTo(19.759f, 8.255f, 22f, 11.116f, 22f, 14.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-3.384f, 0f, -6.245f, -2.242f, -7.179f, -5.321f)
            curveTo(4.241f, 15.745f, 2f, 12.884f, 2f, 9.5f)
            curveTo(2f, 5.358f, 5.358f, 2f, 9.5f, 2f)
            close()
            moveToRelative(7.486f, 7.037f)
            lineToRelative(0.01f, 0.22f)
            lineTo(17f, 9.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-0.155f, 0f, -0.309f, -0.005f, -0.462f, -0.014f)
            curveToRelative(0.944f, 2.073f, 3.035f, 3.514f, 5.462f, 3.514f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            curveToRelative(0f, -2.427f, -1.441f, -4.518f, -3.514f, -5.463f)
            close()
            moveTo(9.5f, 3.5f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            curveToRelative(0f, 2.427f, 1.441f, 4.518f, 3.514f, 5.463f)
            lineToRelative(-0.01f, -0.22f)
            lineTo(7f, 14.5f)
            curveTo(7f, 10.358f, 10.358f, 7f, 14.5f, 7f)
            curveToRelative(0.155f, 0f, 0.309f, 0.005f, 0.462f, 0.014f)
            curveTo(14.018f, 4.941f, 11.927f, 3.5f, 9.5f, 3.5f)
            close()
        }
    }.build()
}
