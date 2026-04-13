package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DocumentFolder20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DocumentFolder20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFBB45EA),
                    1f to Color(0xFF9C6CFE)
                ),
                start = Offset(17.5f, 19.5f),
                end = Offset(19.6893f, 5.87875f)
            )
        ) {
            moveTo(6f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(8f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.3375f to Color(0x005750E2),
                    1f to Color(0xFF5750E2)
                ),
                start = Offset(16f, 8.5f),
                end = Offset(13.5f, 8.5f)
            )
        ) {
            moveTo(6f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(8f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.228038f to Color(0xFF2764E7),
                    0.684836f to Color(0xFF5CD1FF),
                    1f to Color(0xFF6CE0FF)
                ),
                center = Offset(7f, 14f),
                radius = 13.2098f
            )
        ) {
            moveTo(4f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.240824f to Color(0xFFFFD638),
                    0.637257f to Color(0xFFFAB500),
                    0.98516f to Color(0xFFCA6407)
                ),
                start = Offset(6f, 7f),
                end = Offset(6f, 22f)
            )
        ) {
            moveTo(5f, 7f)
            curveTo(3.895f, 7f, 3f, 7.895f, 3f, 9f)
            verticalLineToRelative(6.5f)
            curveTo(3f, 16.88f, 4.12f, 18f, 5.5f, 18f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(14f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-1.879f)
            curveToRelative(-0.265f, 0f, -0.52f, -0.105f, -0.707f, -0.293f)
            lineTo(8.293f, 7.586f)
            curveTo(7.918f, 7.21f, 7.409f, 7f, 6.879f, 7f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
