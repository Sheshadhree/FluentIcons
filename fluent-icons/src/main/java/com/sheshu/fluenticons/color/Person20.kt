package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Person20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Person20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(6.32925f, 11.9306f),
                end = Offset(8.59082f, 19.153f)
            )
        ) {
            moveTo(5.009f, 11f)
            curveTo(3.903f, 11f, 3f, 11.887f, 3f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveTo(6.417f, 17.614f, 8.145f, 18f, 10f, 18f)
            curveToRelative(1.855f, 0f, 3.583f, -0.386f, 4.865f, -1.203f)
            curveTo(16.167f, 15.967f, 17f, 14.69f, 17f, 13f)
            curveToRelative(0f, -1.104f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5.009f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(10f, 10.1667f),
                end = Offset(13.1667f, 22f)
            )
        ) {
            moveTo(5.009f, 11f)
            curveTo(3.903f, 11f, 3f, 11.887f, 3f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveTo(6.417f, 17.614f, 8.145f, 18f, 10f, 18f)
            curveToRelative(1.855f, 0f, 3.583f, -0.386f, 4.865f, -1.203f)
            curveTo(16.167f, 15.967f, 17f, 14.69f, 17f, 13f)
            curveToRelative(0f, -1.104f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5.009f)
            close()
            moveTo(10f, 2f)
            curveTo(7.79f, 2f, 6f, 3.79f, 6f, 6f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
        }
    }.build()
}
