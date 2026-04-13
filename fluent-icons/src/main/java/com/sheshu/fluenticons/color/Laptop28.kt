package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Laptop28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Laptop28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF63686E),
                    1f to Color(0xFF889096)
                ),
                start = Offset(26f, 21.9048f),
                end = Offset(24.9834f, 15.2506f)
            )
        ) {
            moveTo(6.754f, 19f)
            lineTo(14f, 18.5f)
            lineToRelative(7.254f, 0.5f)
            horizontalLineToRelative(0.565f)
            curveToRelative(0.12f, 0f, 0.239f, 0.022f, 0.35f, 0.064f)
            lineToRelative(3.126f, 1.172f)
            curveToRelative(0.423f, 0.158f, 0.704f, 0.562f, 0.705f, 1.014f)
            horizontalLineTo(2f)
            curveToRelative(0f, -0.451f, 0.28f, -0.855f, 0.702f, -1.013f)
            lineToRelative(3.128f, -1.173f)
            curveTo(5.942f, 19.022f, 6.061f, 19f, 6.181f, 19f)
            horizontalLineToRelative(0.573f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFFAAB3BD)
                ),
                start = Offset(26.0005f, 21.8929f),
                end = Offset(25.8271f, 19.118f)
            )
        ) {
            moveTo(2.004f, 21.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineTo(25.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(25.665f, 22f, 25.25f, 22f)
            horizontalLineTo(2.753f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveToRelative(2f, -13.5f)
            curveTo(4.004f, 6.231f, 5.235f, 5f, 6.754f, 5f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-14.5f)
            curveToRelative(-1.519f, 0f, -2.75f, -1.231f, -2.75f, -2.75f)
            verticalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
