package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.KeyboardShift20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.KeyboardShift20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.861f, 2.528f)
            curveToRelative(0.598f, -0.704f, 1.68f, -0.704f, 2.278f, 0f)
            lineToRelative(6.62f, 7.803f)
            curveToRelative(0.553f, 0.651f, 0.093f, 1.654f, -0.759f, 1.654f)
            horizontalLineToRelative(-3.01f)
            verticalLineToRelative(5.012f)
            curveToRelative(0f, 0.554f, -0.446f, 1.003f, -0.997f, 1.003f)
            horizontalLineTo(7.007f)
            curveToRelative(-0.551f, 0f, -0.998f, -0.449f, -0.998f, -1.003f)
            verticalLineToRelative(-5.012f)
            horizontalLineTo(3f)
            curveToRelative(-0.85f, 0f, -1.31f, -1.003f, -0.759f, -1.654f)
            lineToRelative(6.621f, -7.803f)
            close()
            moveToRelative(1.518f, 0.65f)
            curveToRelative(-0.199f, -0.234f, -0.56f, -0.234f, -0.759f, 0f)
            lineTo(3f, 10.983f)
            horizontalLineToRelative(3.508f)
            curveToRelative(0.276f, 0f, 0.499f, 0.224f, 0.499f, 0.501f)
            verticalLineToRelative(5.514f)
            horizontalLineToRelative(5.986f)
            verticalLineToRelative(-5.514f)
            curveToRelative(0f, -0.277f, 0.223f, -0.501f, 0.499f, -0.501f)
            horizontalLineTo(17f)
            lineTo(10.38f, 3.18f)
            close()
        }
    }.build()
}
