package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Video48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Video48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.25f, 10f)
            curveTo(6.798f, 10f, 4f, 12.798f, 4f, 16.25f)
            verticalLineToRelative(15.5f)
            curveTo(4f, 35.202f, 6.798f, 38f, 10.25f, 38f)
            horizontalLineToRelative(15.5f)
            curveToRelative(3.452f, 0f, 6.25f, -2.798f, 6.25f, -6.25f)
            verticalLineToRelative(-1.101f)
            lineToRelative(6.907f, 4.769f)
            curveToRelative(2.156f, 1.488f, 5.096f, -0.055f, 5.096f, -2.675f)
            verticalLineTo(15.256f)
            curveToRelative(0f, -2.62f, -2.94f, -4.163f, -5.096f, -2.675f)
            lineTo(32f, 17.351f)
            verticalLineTo(16.25f)
            curveToRelative(0f, -3.452f, -2.798f, -6.25f, -6.25f, -6.25f)
            horizontalLineToRelative(-15.5f)
            close()
            moveTo(32f, 20.388f)
            lineToRelative(8.327f, -5.75f)
            curveToRelative(0.498f, -0.343f, 1.176f, 0.013f, 1.176f, 0.618f)
            verticalLineToRelative(17.487f)
            curveToRelative(0f, 0.605f, -0.678f, 0.96f, -1.176f, 0.617f)
            lineTo(32f, 27.61f)
            verticalLineToRelative(-7.222f)
            close()
            moveTo(6.5f, 16.25f)
            curveToRelative(0f, -2.071f, 1.679f, -3.75f, 3.75f, -3.75f)
            horizontalLineToRelative(15.5f)
            curveToRelative(2.071f, 0f, 3.75f, 1.679f, 3.75f, 3.75f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineToRelative(-15.5f)
            curveToRelative(-2.071f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            verticalLineToRelative(-15.5f)
            close()
        }
    }.build()
}
