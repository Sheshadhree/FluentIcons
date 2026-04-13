package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoClip32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoClip32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 4f)
            curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
            verticalLineToRelative(15f)
            curveTo(2f, 25.985f, 4.015f, 28f, 6.5f, 28f)
            horizontalLineToRelative(19f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-15f)
            curveTo(30f, 6.015f, 27.985f, 4f, 25.5f, 4f)
            horizontalLineToRelative(-19f)
            close()
            moveToRelative(5.5f, 8.001f)
            curveToRelative(0f, -0.755f, 0.805f, -1.237f, 1.47f, -0.882f)
            lineToRelative(7.498f, 3.999f)
            curveToRelative(0.705f, 0.376f, 0.705f, 1.388f, 0f, 1.764f)
            lineToRelative(-7.497f, 3.999f)
            curveTo(12.805f, 21.236f, 12f, 20.753f, 12f, 19.999f)
            verticalLineTo(12f)
            close()
        }
    }.build()
}
