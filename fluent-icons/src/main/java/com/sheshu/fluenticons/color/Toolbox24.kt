package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Toolbox24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Toolbox24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(3.42857f, 4.00244f),
                end = Offset(3.84021f, 7.06872f)
            )
        ) {
            moveTo(7f, 7.5f)
            verticalLineTo(6.252f)
            curveToRelative(0f, -1.242f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(5.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.008f, 2.25f, 2.25f)
            verticalLineTo(7.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineTo(6.252f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineTo(7.5f)
            horizontalLineTo(7f)
            close()
            moveTo(4.25f, 19.997f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.008f, -2.25f, -2.25f)
            verticalLineTo(11.5f)
            horizontalLineToRelative(20f)
            verticalLineToRelative(6.247f)
            curveToRelative(0f, 1.242f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(4.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(0.749998f, 5.12482f),
                end = Offset(1.12849f, 17.0941f)
            )
        ) {
            moveTo(2f, 9.25f)
            curveTo(2f, 8.007f, 3.007f, 7f, 4.25f, 7f)
            horizontalLineToRelative(15.5f)
            curveTo(20.993f, 7f, 22f, 8.007f, 22f, 9.25f)
            verticalLineTo(12f)
            horizontalLineTo(2f)
            verticalLineTo(9.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEFEFEF),
                    1f to Color(0xFFDADADA)
                ),
                start = Offset(2.57143f, 9.99982f),
                end = Offset(3.32698f, 14.3305f)
            )
        ) {
            moveTo(16.75f, 10f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(16f, 13.664f, 16f, 13.25f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
            moveToRelative(-9.5f, 0f)
            curveTo(7.664f, 10f, 8f, 10.336f, 8f, 10.75f)
            verticalLineToRelative(2.5f)
            curveTo(8f, 13.664f, 7.664f, 14f, 7.25f, 14f)
            reflectiveCurveTo(6.5f, 13.664f, 6.5f, 13.25f)
            verticalLineToRelative(-2.5f)
            curveTo(6.5f, 10.336f, 6.836f, 10f, 7.25f, 10f)
            close()
        }
    }.build()
}
