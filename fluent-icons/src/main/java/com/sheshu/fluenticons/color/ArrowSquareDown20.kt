package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ArrowSquareDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ArrowSquareDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(3.5f, 5.625f),
                end = Offset(14.5f, 14.375f)
            )
        ) {
            moveTo(5f, 3f)
            curveTo(3.895f, 3f, 3f, 3.895f, 3f, 5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(7.53846f, 6.61538f),
                end = Offset(14f, 20.6154f)
            )
        ) {
            moveTo(10.5f, 6.5f)
            curveTo(10.5f, 6.224f, 10.276f, 6f, 10f, 6f)
            reflectiveCurveTo(9.5f, 6.224f, 9.5f, 6.5f)
            verticalLineToRelative(5.793f)
            lineTo(6.854f, 9.647f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(3.5f, -3.5f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineTo(10.5f, 12.293f)
            verticalLineTo(6.5f)
            close()
        }
    }.build()
}
