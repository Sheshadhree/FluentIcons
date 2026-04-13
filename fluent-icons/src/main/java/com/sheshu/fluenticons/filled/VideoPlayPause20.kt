package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoPlayPause20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoPlayPause20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 5f)
            curveTo(10.672f, 5f, 10f, 5.672f, 10f, 6.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 5.672f, 13.328f, 5f, 12.5f, 5f)
            horizontalLineToRelative(-1f)
            close()
            moveToRelative(5f, 0f)
            curveTo(15.672f, 5f, 15f, 5.672f, 15f, 6.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveTo(19f, 5.672f, 18.328f, 5f, 17.5f, 5f)
            horizontalLineToRelative(-1f)
            close()
            moveTo(3.926f, 5.45f)
            curveTo(3.094f, 4.917f, 2f, 5.514f, 2f, 6.503f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 0.984f, 1.084f, 1.582f, 1.916f, 1.058f)
            lineToRelative(5.496f, -3.461f)
            curveToRelative(0.774f, -0.488f, 0.78f, -1.614f, 0.01f, -2.11f)
            lineTo(3.926f, 5.452f)
            close()
        }
    }.build()
}
