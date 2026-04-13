package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.KeyboardShift16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.KeyboardShift16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.395f, 2.191f)
            curveToRelative(-0.201f, -0.253f, -0.588f, -0.253f, -0.789f, 0f)
            lineToRelative(-4.6f, 5.802f)
            horizontalLineToRelative(2.482f)
            curveToRelative(0.133f, 0f, 0.261f, 0.053f, 0.355f, 0.147f)
            curveTo(5.938f, 8.234f, 5.99f, 8.361f, 5.99f, 8.494f)
            verticalLineToRelative(4.505f)
            horizontalLineToRelative(4.02f)
            verticalLineTo(8.494f)
            curveToRelative(0f, -0.277f, 0.225f, -0.5f, 0.503f, -0.5f)
            horizontalLineToRelative(2.48f)
            lineTo(8.395f, 2.19f)
            close()
            moveToRelative(-1.578f, -0.62f)
            curveToRelative(0.604f, -0.761f, 1.763f, -0.761f, 2.367f, 0f)
            lineToRelative(4.598f, 5.802f)
            curveToRelative(0.52f, 0.657f, 0.05f, 1.621f, -0.789f, 1.621f)
            horizontalLineToRelative(-1.978f)
            verticalLineTo(13f)
            curveToRelative(0f, 0.553f, -0.45f, 1.001f, -1.005f, 1.001f)
            horizontalLineTo(5.99f)
            curveToRelative(-0.555f, 0f, -1.005f, -0.448f, -1.005f, -1.001f)
            verticalLineTo(8.994f)
            horizontalLineTo(3.007f)
            curveToRelative(-0.84f, 0f, -1.31f, -0.964f, -0.789f, -1.62f)
            lineToRelative(4.6f, -5.803f)
            close()
        }
    }.build()
}
