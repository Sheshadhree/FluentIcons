package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextColor24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextColor24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.75f, 14.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.008f, 2.25f, 2.25f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 22f, 3f, 20.993f, 3f, 19.75f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.242f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(12.5f)
            close()
            moveToRelative(0f, 1.5f)
            horizontalLineTo(5.25f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.335f, 0.75f, -0.75f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            close()
            moveTo(7.053f, 11.97f)
            lineToRelative(3.753f, -9.496f)
            curveToRelative(0.236f, -0.595f, 1.043f, -0.63f, 1.345f, -0.104f)
            lineToRelative(0.05f, 0.105f)
            lineToRelative(3.747f, 9.5f)
            curveToRelative(0.152f, 0.386f, -0.037f, 0.821f, -0.423f, 0.973f)
            curveToRelative(-0.353f, 0.14f, -0.748f, -0.008f, -0.929f, -0.33f)
            lineToRelative(-0.044f, -0.092f)
            lineTo(13.556f, 10f)
            horizontalLineTo(9.443f)
            lineToRelative(-0.995f, 2.52f)
            curveToRelative(-0.14f, 0.354f, -0.518f, 0.542f, -0.877f, 0.454f)
            lineToRelative(-0.097f, -0.031f)
            curveToRelative(-0.353f, -0.14f, -0.54f, -0.518f, -0.453f, -0.876f)
            lineToRelative(0.032f, -0.098f)
            lineToRelative(3.753f, -9.495f)
            lineToRelative(-3.753f, 9.495f)
            close()
            moveToRelative(4.45f, -7.178f)
            lineTo(10.036f, 8.5f)
            horizontalLineToRelative(2.928f)
            lineToRelative(-1.461f, -3.708f)
            close()
        }
    }.build()
}
