package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Flag48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Flag48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFF63686E)
                ),
                start = Offset(10f, 48.1786f),
                end = Offset(8.96607f, 31.4767f)
            )
        ) {
            moveTo(8.75f, 44f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(31f)
            horizontalLineTo(10f)
            verticalLineToRelative(11.75f)
            curveTo(10f, 43.44f, 9.44f, 44f, 8.75f, 44f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(-0.156252f, -1.71429f),
                end = Offset(15.051f, 34.4667f)
            )
        ) {
            moveTo(7.5f, 7.25f)
            curveTo(7.5f, 6.56f, 8.06f, 6f, 8.75f, 6f)
            horizontalLineToRelative(32.5f)
            curveToRelative(0.471f, 0f, 0.902f, 0.265f, 1.115f, 0.686f)
            curveToRelative(0.213f, 0.42f, 0.171f, 0.924f, -0.108f, 1.304f)
            lineTo(33.801f, 19.5f)
            lineToRelative(8.456f, 11.51f)
            curveToRelative(0.28f, 0.38f, 0.321f, 0.884f, 0.108f, 1.305f)
            curveTo(42.152f, 32.735f, 41.721f, 33f, 41.25f, 33f)
            horizontalLineTo(9f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineTo(7.25f)
            close()
        }
    }.build()
}
