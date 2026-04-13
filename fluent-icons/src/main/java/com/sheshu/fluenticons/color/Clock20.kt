package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Clock20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Clock20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1EC8B0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(4.66667f, 1.11111f),
                end = Offset(12.6667f, 18.8889f)
            )
        ) {
            moveTo(10f, 2f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFD1D1FF)
                ),
                start = Offset(9.35f, 5.91837f),
                end = Offset(7.65047f, 10.5784f)
            )
        ) {
            moveTo(9.5f, 5f)
            curveToRelative(0.245f, 0f, 0.45f, 0.177f, 0.492f, 0.41f)
            lineTo(10f, 5.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            curveToRelative(0f, 0.245f, -0.177f, 0.45f, -0.41f, 0.492f)
            lineTo(12.5f, 11f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.245f, 0f, -0.45f, -0.177f, -0.492f, -0.41f)
            lineTo(9f, 10.5f)
            verticalLineToRelative(-5f)
            curveTo(9f, 5.224f, 9.224f, 5f, 9.5f, 5f)
            close()
        }
    }.build()
}
