package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Apps32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Apps32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF889096)
                ),
                start = Offset(3f, 3f),
                end = Offset(15.9644f, 16.9616f)
            )
        ) {
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(29f, 28f),
                end = Offset(16f, 15f)
            )
        ) {
            moveTo(26f, 15f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(16f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(16f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF55595E),
                    1f to Color(0xFF383B3D)
                ),
                start = Offset(3f, 15f),
                end = Offset(17f, 24f)
            )
        ) {
            moveTo(17f, 28f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(16f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(12f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(12f)
            close()
            moveToRelative(3.2f, -25.047f)
            curveToRelative(1.27f, -1.269f, 3.328f, -1.268f, 4.597f, 0f)
            lineToRelative(4.248f, 4.25f)
            curveToRelative(1.27f, 1.268f, 1.27f, 3.326f, 0f, 4.595f)
            lineToRelative(-4.25f, 4.248f)
            curveToRelative(-1.269f, 1.268f, -3.327f, 1.268f, -4.596f, 0f)
            lineToRelative(-4.249f, -4.25f)
            curveToRelative(-1.269f, -1.269f, -1.269f, -3.326f, 0f, -4.595f)
            lineToRelative(4.25f, -4.248f)
            close()
        }
    }.build()
}
