package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TagCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(4f, -1.5f)
            verticalLineToRelative(3f)
            curveTo(6f, 12.328f, 6.672f, 13f, 7.5f, 13f)
            horizontalLineToRelative(4.058f)
            curveToRelative(0.4f, 0f, 0.789f, -0.137f, 1.1f, -0.39f)
            lineToRelative(1.786f, -1.444f)
            curveToRelative(0.742f, -0.6f, 0.742f, -1.732f, 0f, -2.332f)
            lineTo(12.658f, 7.39f)
            curveToRelative(-0.311f, -0.252f, -0.7f, -0.39f, -1.1f, -0.39f)
            horizontalLineTo(7.5f)
            curveTo(6.672f, 7f, 6f, 7.672f, 6f, 8.5f)
            close()
        }
    }.build()
}
