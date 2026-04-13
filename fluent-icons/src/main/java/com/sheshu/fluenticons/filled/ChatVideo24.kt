package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChatVideo24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatVideo24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 12f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            reflectiveCurveTo(2f, 6.477f, 2f, 12f)
            curveToRelative(0f, 1.643f, 0.397f, 3.23f, 1.145f, 4.65f)
            lineToRelative(-1.116f, 4.29f)
            curveToRelative(-0.037f, 0.14f, -0.037f, 0.288f, 0f, 0.428f)
            curveToRelative(0.118f, 0.454f, 0.582f, 0.727f, 1.036f, 0.608f)
            lineToRelative(4.29f, -1.117f)
            curveTo(8.776f, 21.604f, 10.36f, 22f, 12f, 22f)
            curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
            close()
            moveTo(12f, 8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(9f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(3f, 5.162f)
            verticalLineToRelative(-2.324f)
            lineToRelative(1.734f, -1.642f)
            curveTo(17.212f, 8.744f, 18f, 9.083f, 18f, 9.741f)
            verticalLineToRelative(4.518f)
            curveToRelative(0f, 0.658f, -0.788f, 0.997f, -1.266f, 0.545f)
            lineTo(15f, 13.162f)
            close()
        }
    }.build()
}
