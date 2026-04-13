package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Toolbox32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Toolbox32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(4f, 3f),
                end = Offset(4.72373f, 7.79957f)
            )
        ) {
            moveTo(9f, 6.25f)
            curveTo(9f, 4.455f, 10.455f, 3f, 12.25f, 3f)
            horizontalLineToRelative(7.5f)
            curveTo(21.545f, 3f, 23f, 4.455f, 23f, 6.25f)
            verticalLineTo(8.5f)
            horizontalLineToRelative(-2f)
            verticalLineTo(6.25f)
            curveTo(21f, 5.56f, 20.44f, 5f, 19.75f, 5f)
            horizontalLineToRelative(-7.5f)
            curveTo(11.56f, 5f, 11f, 5.56f, 11f, 6.25f)
            verticalLineTo(8.5f)
            horizontalLineTo(9f)
            verticalLineTo(6.25f)
            close()
            moveTo(5.25f, 28f)
            curveTo(3.455f, 28f, 2f, 26.545f, 2f, 24.75f)
            verticalLineTo(15.5f)
            horizontalLineToRelative(28f)
            verticalLineToRelative(9.25f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(0.249997f, 5f),
                end = Offset(0.941879f, 24.145f)
            )
        ) {
            moveTo(2f, 11.25f)
            curveTo(2f, 9.455f, 3.455f, 8f, 5.25f, 8f)
            horizontalLineToRelative(21.5f)
            curveTo(28.545f, 8f, 30f, 9.455f, 30f, 11.25f)
            verticalLineTo(16f)
            horizontalLineTo(2f)
            verticalLineToRelative(-4.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEFEFEF),
                    1f to Color(0xFFDADADA)
                ),
                start = Offset(4f, 13f),
                end = Offset(4.85767f, 18.2139f)
            )
        ) {
            moveTo(22f, 13f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(-12f, 0f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
