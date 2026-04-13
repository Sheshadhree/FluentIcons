package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Alert16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Alert16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.152097f to Color(0xFFEB4824),
                    1f to Color(0xFBFFCD0F)
                ),
                start = Offset(8.01295f, 11.5f),
                end = Offset(8.01295f, 13.9996f)
            )
        ) {
            moveTo(10f, 12f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(13.5157f, 11.9961f),
                end = Offset(3.87915f, 3.32465f)
            )
        ) {
            moveTo(8f, 2f)
            curveTo(5.515f, 2f, 3.5f, 4.015f, 3.5f, 6.5f)
            verticalLineToRelative(2.401f)
            lineToRelative(-0.964f, 2.414f)
            curveToRelative(-0.062f, 0.154f, -0.043f, 0.328f, 0.05f, 0.465f)
            curveTo(2.679f, 11.918f, 2.834f, 12f, 3f, 12f)
            horizontalLineToRelative(10f)
            curveToRelative(0.166f, 0f, 0.321f, -0.082f, 0.414f, -0.22f)
            curveToRelative(0.093f, -0.137f, 0.112f, -0.311f, 0.05f, -0.465f)
            lineTo(12.5f, 8.9f)
            verticalLineTo(6.5f)
            curveTo(12.5f, 4.015f, 10.485f, 2f, 8f, 2f)
            close()
        }
    }.build()
}
