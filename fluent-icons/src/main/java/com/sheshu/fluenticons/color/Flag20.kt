package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Flag20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Flag20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF889096),
                    1f to Color(0xFF63686E)
                ),
                start = Offset(5.5f, 20.5f),
                end = Offset(5f, 11.5f)
            )
        ) {
            moveTo(4.75f, 11.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(4f, 17.914f, 4f, 17.5f)
            verticalLineTo(12f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(1.15607f, 0.142857f),
                end = Offset(6.77687f, 13.5549f)
            )
        ) {
            moveTo(4f, 12.5f)
            curveTo(4f, 12.776f, 4.224f, 13f, 4.5f, 13f)
            horizontalLineToRelative(12f)
            curveToRelative(0.4f, 0f, 0.637f, -0.445f, 0.416f, -0.777f)
            lineTo(14.101f, 8f)
            lineToRelative(2.815f, -4.223f)
            curveTo(17.137f, 3.445f, 16.899f, 3f, 16.5f, 3f)
            horizontalLineToRelative(-12f)
            curveTo(4.224f, 3f, 4f, 3.224f, 4f, 3.5f)
            verticalLineToRelative(9f)
            close()
        }
    }.build()
}
