package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PinOff32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PinOff32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.187f, 21.601f)
            lineToRelative(8.106f, 8.106f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-26f, -26f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(8.106f, 8.106f)
            lineToRelative(-3.68f, 1.226f)
            curveToRelative(-1.41f, 0.47f, -1.833f, 2.26f, -0.782f, 3.312f)
            lineToRelative(4.15f, 4.149f)
            lineTo(4f, 26.586f)
            verticalLineTo(28f)
            horizontalLineToRelative(1.415f)
            lineToRelative(6.085f, -6.086f)
            lineToRelative(4.15f, 4.149f)
            curveToRelative(1.05f, 1.051f, 2.84f, 0.629f, 3.31f, -0.782f)
            lineToRelative(1.227f, -3.68f)
            close()
            moveToRelative(7.538f, -5.345f)
            lineToRelative(-5.29f, 2.644f)
            lineTo(13.1f, 9.565f)
            lineToRelative(2.645f, -5.29f)
            curveToRelative(1.22f, -2.442f, 4.475f, -2.97f, 6.406f, -1.04f)
            lineToRelative(6.613f, 6.615f)
            curveToRelative(1.93f, 1.93f, 1.403f, 5.185f, -1.04f, 6.406f)
            close()
        }
    }.build()
}
