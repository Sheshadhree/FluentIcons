package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Heart24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Heart24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(-2.37582f, -0.938375f),
                end = Offset(8.13523f, 21.3776f)
            )
        ) {
            moveTo(12.82f, 5.58f)
            lineToRelative(-0.821f, 0.822f)
            lineToRelative(-0.823f, -0.823f)
            curveToRelative(-2.1f, -2.1f, -5.503f, -2.1f, -7.602f, 0f)
            curveToRelative(-2.099f, 2.099f, -2.099f, 5.502f, 0f, 7.601f)
            lineToRelative(7.896f, 7.896f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(7.902f, -7.897f)
            curveToRelative(2.094f, -2.106f, 2.098f, -5.5f, -0.002f, -7.6f)
            curveToRelative(-2.103f, -2.102f, -5.507f, -2.102f, -7.61f, 0f)
            close()
        }
    }.build()
}
