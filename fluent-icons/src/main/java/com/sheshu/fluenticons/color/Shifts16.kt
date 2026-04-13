package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Shifts16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Shifts16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1EC8B0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(3.99707f, 1.33333f),
                end = Offset(9.99707f, 14.6667f)
            )
        ) {
            moveTo(4.497f, 2f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFDEDEFF)
                ),
                start = Offset(6.9375f, 4.375f),
                end = Offset(5.46298f, 9.32566f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.5f, 4f)
            curveTo(7.776f, 4f, 8f, 4.224f, 8f, 4.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(2.5f)
            curveTo(10.776f, 8f, 11f, 8.224f, 11f, 8.5f)
            reflectiveCurveTo(10.776f, 9f, 10.5f, 9f)
            horizontalLineToRelative(-3f)
            curveTo(7.224f, 9f, 7f, 8.776f, 7f, 8.5f)
            verticalLineToRelative(-4f)
            curveTo(7f, 4.224f, 7.224f, 4f, 7.5f, 4f)
            close()
        }
    }.build()
}
