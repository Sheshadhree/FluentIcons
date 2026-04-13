package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Play20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Play20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.22f, 8.687f)
            curveToRelative(1.036f, 0.57f, 1.036f, 2.056f, 0f, 2.626f)
            lineToRelative(-9.997f, 5.499f)
            curveTo(6.223f, 17.362f, 5f, 16.639f, 5f, 15.499f)
            verticalLineTo(4.501f)
            curveToRelative(0f, -1.14f, 1.224f, -1.863f, 2.223f, -1.313f)
            lineToRelative(9.997f, 5.499f)
            close()
            moveToRelative(-0.482f, 1.75f)
            curveToRelative(0.345f, -0.19f, 0.345f, -0.685f, 0f, -0.875f)
            lineTo(6.741f, 4.063f)
            curveTo(6.408f, 3.88f, 6f, 4.121f, 6f, 4.501f)
            verticalLineToRelative(10.998f)
            curveToRelative(0f, 0.38f, 0.408f, 0.621f, 0.741f, 0.438f)
            lineToRelative(9.997f, -5.5f)
            close()
        }
    }.build()
}
