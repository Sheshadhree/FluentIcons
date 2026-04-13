package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Shifts32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Shifts32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1EC8B0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(8f, 2.66667f),
                end = Offset(20f, 29.3333f)
            )
        ) {
            moveTo(9f, 4f)
            curveTo(6.239f, 4f, 4f, 6.239f, 4f, 9f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            horizontalLineToRelative(14f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            verticalLineTo(9f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            horizontalLineTo(9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFDEDEFF)
                ),
                start = Offset(13.8809f, 8.75f),
                end = Offset(10.9318f, 18.6513f)
            )
        ) {
            moveTo(15.006f, 8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
