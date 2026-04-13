package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Calendar16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Calendar16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(10.1667f, 15.1667f),
                end = Offset(6.66667f, 5f)
            )
        ) {
            moveTo(14f, 11.5f)
            verticalLineToRelative(-6f)
            lineToRelative(-6f, -1f)
            lineToRelative(-6f, 1f)
            verticalLineToRelative(6f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00DCF8FF),
                    1f to Color(0xB2FF6CE8)
                ),
                start = Offset(9.28571f, 8.38636f),
                end = Offset(11.0248f, 16.1535f)
            )
        ) {
            moveTo(14f, 11.5f)
            verticalLineToRelative(-6f)
            lineToRelative(-6f, -1f)
            lineToRelative(-6f, 1f)
            verticalLineToRelative(6f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(7.36239f, 7.03881f),
                end = Offset(8.56597f, 15.0431f)
            )
        ) {
            moveTo(5.248f, 8.997f)
            curveToRelative(0.414f, 0f, 0.749f, -0.335f, 0.749f, -0.748f)
            curveToRelative(0f, -0.414f, -0.335f, -0.749f, -0.748f, -0.749f)
            curveTo(4.835f, 7.5f, 4.5f, 7.835f, 4.5f, 8.248f)
            curveToRelative(0f, 0.414f, 0.335f, 0.749f, 0.748f, 0.749f)
            close()
            moveToRelative(0.749f, 1.752f)
            curveToRelative(0f, 0.413f, -0.335f, 0.748f, -0.748f, 0.748f)
            curveToRelative(-0.414f, 0f, -0.749f, -0.335f, -0.749f, -0.748f)
            curveTo(4.5f, 10.335f, 4.835f, 10f, 5.248f, 10f)
            curveToRelative(0.414f, 0f, 0.749f, 0.335f, 0.749f, 0.748f)
            close()
            moveTo(8f, 8.996f)
            curveToRelative(0.414f, 0f, 0.749f, -0.335f, 0.749f, -0.748f)
            reflectiveCurveTo(8.414f, 7.5f, 8f, 7.5f)
            curveToRelative(-0.413f, 0f, -0.748f, 0.335f, -0.748f, 0.748f)
            curveToRelative(0f, 0.414f, 0.335f, 0.749f, 0.748f, 0.749f)
            close()
            moveToRelative(0.749f, 1.752f)
            curveToRelative(0f, 0.413f, -0.335f, 0.748f, -0.749f, 0.748f)
            curveToRelative(-0.413f, 0f, -0.748f, -0.335f, -0.748f, -0.748f)
            reflectiveCurveTo(7.587f, 10f, 8f, 10f)
            curveToRelative(0.414f, 0f, 0.749f, 0.335f, 0.749f, 0.748f)
            close()
            moveToRelative(2f, -1.752f)
            curveToRelative(0.413f, 0f, 0.748f, -0.335f, 0.748f, -0.748f)
            curveToRelative(0f, -0.414f, -0.335f, -0.749f, -0.748f, -0.749f)
            curveTo(10.335f, 7.5f, 10f, 7.835f, 10f, 8.248f)
            curveToRelative(0f, 0.414f, 0.335f, 0.749f, 0.748f, 0.749f)
            close()
            moveTo(14f, 4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(12f)
            verticalLineTo(4.5f)
            close()
        }
    }.build()
}
