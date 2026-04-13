package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DocumentFolder16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DocumentFolder16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFBB45EA),
                    1f to Color(0xFF9C6CFE)
                ),
                start = Offset(14.2f, 13.5385f),
                end = Offset(15.2471f, 5.06908f)
            )
        ) {
            moveTo(5f, 5.5f)
            curveTo(5f, 4.672f, 5.672f, 4f, 6.5f, 4f)
            horizontalLineToRelative(5f)
            curveTo(12.328f, 4f, 13f, 4.672f, 13f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(5.672f, 12f, 5f, 11.328f, 5f, 10.5f)
            verticalLineToRelative(-5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.3375f to Color(0x005750E2),
                    1f to Color(0xFF5750E2)
                ),
                start = Offset(13f, 6.76923f),
                end = Offset(11f, 6.76923f)
            )
        ) {
            moveTo(5f, 5.5f)
            curveTo(5f, 4.672f, 5.672f, 4f, 6.5f, 4f)
            horizontalLineToRelative(5f)
            curveTo(12.328f, 4f, 13f, 4.672f, 13f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(5.672f, 12f, 5f, 11.328f, 5f, 10.5f)
            verticalLineToRelative(-5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.228038f to Color(0xFF2764E7),
                    0.684836f to Color(0xFF5CD1FF),
                    1f to Color(0xFF6CE0FF)
                ),
                center = Offset(5.4f, 10f),
                radius = 9.26379f
            )
        ) {
            moveTo(3f, 3.5f)
            curveTo(3f, 2.672f, 3.672f, 2f, 4.5f, 2f)
            horizontalLineToRelative(5f)
            curveTo(10.328f, 2f, 11f, 2.672f, 11f, 3.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(3.672f, 12f, 3f, 11.328f, 3f, 10.5f)
            verticalLineToRelative(-7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.240824f to Color(0xFFFFD638),
                    0.637257f to Color(0xFFFAB500),
                    0.98516f to Color(0xFFCA6407)
                ),
                start = Offset(4.57143f, 5f),
                end = Offset(4.57143f, 17.2727f)
            )
        ) {
            moveTo(3.5f, 5f)
            curveTo(2.672f, 5f, 2f, 5.672f, 2f, 6.5f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.586f)
            curveToRelative(-0.132f, 0f, -0.26f, -0.053f, -0.353f, -0.146f)
            lineTo(6.146f, 5.439f)
            curveTo(5.866f, 5.158f, 5.484f, 5f, 5.086f, 5f)
            horizontalLineTo(3.5f)
            close()
        }
    }.build()
}
