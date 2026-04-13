package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Person16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Person16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(5.37804f, 8.79761f),
                end = Offset(7.61628f, 14.7542f)
            )
        ) {
            moveTo(11.5f, 8f)
            curveTo(12.328f, 8f, 13f, 8.672f, 13f, 9.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.971f, -1.86f, 4f, -5f, 4f)
            curveToRelative(-3.14f, 0f, -5f, -2.029f, -5f, -4f)
            verticalLineTo(9.5f)
            curveTo(3f, 8.672f, 3.672f, 8f, 4.5f, 8f)
            horizontalLineToRelative(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(8f, 7.28571f),
                end = Offset(11.1641f, 17.1388f)
            )
        ) {
            moveTo(11.5f, 8f)
            curveTo(12.328f, 8f, 13f, 8.672f, 13f, 9.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.971f, -1.86f, 4f, -5f, 4f)
            curveToRelative(-3.14f, 0f, -5f, -2.029f, -5f, -4f)
            verticalLineTo(9.5f)
            curveTo(3f, 8.672f, 3.672f, 8f, 4.5f, 8f)
            horizontalLineToRelative(7f)
            close()
            moveTo(8f, 1.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveTo(9.519f, 7f, 8f, 7f)
            reflectiveCurveTo(5.25f, 5.769f, 5.25f, 4.25f)
            reflectiveCurveTo(6.481f, 1.5f, 8f, 1.5f)
            close()
        }
    }.build()
}
