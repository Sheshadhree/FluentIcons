package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Warning16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Warning16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFCD0F),
                    1f to Color(0xFFFE8401)
                ),
                start = Offset(3.87217f, 0.279033f),
                end = Offset(10.7251f, 14.525f)
            )
        ) {
            moveTo(9.092f, 2.638f)
            curveToRelative(-0.477f, -0.853f, -1.705f, -0.853f, -2.182f, 0f)
            lineTo(2.157f, 11.14f)
            curveTo(1.69f, 11.973f, 2.293f, 13f, 3.247f, 13f)
            horizontalLineToRelative(9.504f)
            curveToRelative(0.955f, 0f, 1.557f, -1.027f, 1.091f, -1.86f)
            lineToRelative(-4.75f, -8.502f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF4A4A4A),
                    1f to Color(0xFF212121)
                ),
                start = Offset(6f, 5f),
                end = Offset(8.46575f, 11.5753f)
            )
        ) {
            moveTo(8.75f, 10.25f)
            curveTo(8.75f, 10.664f, 8.414f, 11f, 8f, 11f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(7.586f, 9.5f, 8f, 9.5f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            close()
            moveTo(7.5f, 8f)
            verticalLineTo(5.5f)
            curveTo(7.5f, 5.224f, 7.724f, 5f, 8f, 5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(7.5f, 8.276f, 7.5f, 8f)
            close()
        }
    }.build()
}
