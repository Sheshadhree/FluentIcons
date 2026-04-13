package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.NumberSymbolSquare20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.NumberSymbolSquare20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0281195f to Color(0xFFE67EEA),
                    0.43755f to Color(0xFFAD64D7),
                    1f to Color(0xFF794DC5)
                ),
                start = Offset(6.4135f, 3f),
                end = Offset(14.0912f, 17f)
            )
        ) {
            moveTo(5.5f, 3f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFF9DCFA)
                ),
                start = Offset(7.89679f, 6.30775f),
                end = Offset(13.9614f, 16.7731f)
            )
        ) {
            moveTo(9.105f, 6.011f)
            curveToRelative(0.27f, 0.058f, 0.442f, 0.324f, 0.384f, 0.594f)
            lineTo(9.19f, 8f)
            horizontalLineToRelative(2.477f)
            lineToRelative(0.343f, -1.605f)
            curveToRelative(0.058f, -0.27f, 0.324f, -0.442f, 0.594f, -0.384f)
            curveToRelative(0.27f, 0.058f, 0.442f, 0.324f, 0.384f, 0.594f)
            lineTo(12.69f, 8f)
            horizontalLineToRelative(0.81f)
            curveTo(13.776f, 8f, 14f, 8.224f, 14f, 8.5f)
            reflectiveCurveTo(13.776f, 9f, 13.5f, 9f)
            horizontalLineToRelative(-1.025f)
            lineToRelative(-0.428f, 2f)
            horizontalLineTo(13f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.276f, 12f, 13f, 12f)
            horizontalLineToRelative(-1.167f)
            lineToRelative(-0.344f, 1.604f)
            curveToRelative(-0.058f, 0.27f, -0.324f, 0.442f, -0.594f, 0.385f)
            curveToRelative(-0.27f, -0.058f, -0.442f, -0.324f, -0.384f, -0.594f)
            lineTo(10.81f, 12f)
            horizontalLineTo(8.333f)
            lineToRelative(-0.344f, 1.605f)
            curveToRelative(-0.058f, 0.27f, -0.324f, 0.442f, -0.594f, 0.384f)
            curveToRelative(-0.27f, -0.058f, -0.442f, -0.324f, -0.384f, -0.594f)
            lineTo(7.311f, 12f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 12f, 6f, 11.776f, 6f, 11.5f)
            reflectiveCurveTo(6.224f, 11f, 6.5f, 11f)
            horizontalLineToRelative(1.024f)
            lineToRelative(0.43f, -2f)
            horizontalLineTo(7f)
            curveTo(6.724f, 9f, 6.5f, 8.776f, 6.5f, 8.5f)
            reflectiveCurveTo(6.724f, 8f, 7f, 8f)
            horizontalLineToRelative(1.167f)
            lineToRelative(0.344f, -1.605f)
            curveToRelative(0.058f, -0.27f, 0.324f, -0.442f, 0.594f, -0.384f)
            close()
            moveTo(8.547f, 11f)
            horizontalLineToRelative(2.477f)
            lineToRelative(0.429f, -2f)
            horizontalLineTo(8.976f)
            lineToRelative(-0.429f, 2f)
            close()
        }
    }.build()
}
