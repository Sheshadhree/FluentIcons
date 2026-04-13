package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Laptop48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Laptop48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(44f, 38.0001f),
                end = Offset(41.7926f, 25.3862f)
            )
        ) {
            moveTo(35.79f, 32f)
            horizontalLineTo(35.5f)
            lineToRelative(-11f, -0.5f)
            lineToRelative(-12f, 0.5f)
            horizontalLineToRelative(-0.29f)
            curveToRelative(-0.139f, 0f, -0.275f, 0.029f, -0.402f, 0.084f)
            lineToRelative(-6.663f, 2.915f)
            curveTo(4.45f, 35.303f, 4f, 35.991f, 4f, 36.75f)
            horizontalLineToRelative(40f)
            curveToRelative(0f, -0.76f, -0.45f, -1.447f, -1.145f, -1.751f)
            lineToRelative(-6.663f, -2.915f)
            curveTo(36.065f, 32.028f, 35.929f, 32f, 35.79f, 32f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFFAAB3BD)
                ),
                start = Offset(44f, 37.8214f),
                end = Offset(43.711f, 33.1966f)
            )
        ) {
            moveTo(5.25f, 35.5f)
            curveTo(4.56f, 35.5f, 4f, 36.06f, 4f, 36.75f)
            reflectiveCurveTo(4.56f, 38f, 5.25f, 38f)
            horizontalLineToRelative(37.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(5.25f)
            close()
            moveTo(8f, 12.25f)
            curveTo(8f, 9.903f, 9.903f, 8f, 12.25f, 8f)
            horizontalLineToRelative(23.5f)
            curveTo(38.097f, 8f, 40f, 9.903f, 40f, 12.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-23.5f)
            curveTo(9.903f, 32f, 8f, 30.097f, 8f, 27.75f)
            verticalLineToRelative(-15.5f)
            close()
        }
    }.build()
}
