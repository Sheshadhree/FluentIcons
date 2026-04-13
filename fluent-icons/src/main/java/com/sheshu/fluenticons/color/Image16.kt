package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Image16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Image16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.337728f to Color(0xFF0FAFFF),
                    0.529425f to Color(0xFF367AF2)
                ),
                center = Offset(-2.71429f, -4.75f),
                radius = 33.182f
            )
        ) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(6.28571f, 7.99707f),
                end = Offset(7.5721f, 14.3471f)
            )
        ) {
            moveTo(13.586f, 12.879f)
            curveTo(13.138f, 13.554f, 12.37f, 14f, 11.5f, 14f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.871f, 0f, -1.638f, -0.446f, -2.086f, -1.121f)
            lineToRelative(4.384f, -4.384f)
            curveToRelative(0.664f, -0.664f, 1.74f, -0.664f, 2.404f, 0f)
            lineToRelative(4.384f, 4.384f)
            close()
            moveTo(11.5f, 5.502f)
            curveToRelative(0f, 0.554f, -0.448f, 1.002f, -1.002f, 1.002f)
            curveToRelative(-0.553f, 0f, -1.002f, -0.448f, -1.002f, -1.002f)
            curveToRelative(0f, -0.553f, 0.449f, -1.002f, 1.002f, -1.002f)
            curveToRelative(0.554f, 0f, 1.002f, 0.449f, 1.002f, 1.002f)
            close()
        }
    }.build()
}
