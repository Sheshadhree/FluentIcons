package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Clock48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Clock48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1EC8B0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(11.3333f, 2.88889f),
                end = Offset(30.3333f, 45.1111f)
            )
        ) {
            moveTo(24f, 5f)
            curveToRelative(10.493f, 0f, 19f, 8.507f, 19f, 19f)
            reflectiveCurveToRelative(-8.507f, 19f, -19f, 19f)
            reflectiveCurveTo(5f, 34.493f, 5f, 24f)
            reflectiveCurveTo(13.507f, 5f, 24f, 5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFD1D1FF)
                ),
                start = Offset(22.4188f, 14.2194f),
                end = Offset(18.5686f, 25.6863f)
            )
        ) {
            moveTo(22.75f, 12f)
            curveToRelative(0.647f, 0f, 1.18f, 0.492f, 1.244f, 1.122f)
            lineTo(24f, 13.25f)
            verticalLineTo(24f)
            horizontalLineToRelative(6.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            curveToRelative(0f, 0.647f, -0.492f, 1.18f, -1.122f, 1.244f)
            lineTo(30.75f, 26.5f)
            horizontalLineToRelative(-8f)
            curveToRelative(-0.647f, 0f, -1.18f, -0.492f, -1.244f, -1.122f)
            lineTo(21.5f, 25.25f)
            verticalLineToRelative(-12f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            close()
        }
    }.build()
}
