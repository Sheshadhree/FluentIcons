package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.AddCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.AddCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(2.42857f, 4.25f),
                end = Offset(10.71f, 12.8541f)
            )
        ) {
            moveTo(2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFE3FFD9)
                ),
                start = Offset(6.125f, 5.61204f),
                end = Offset(7.96598f, 12.1109f)
            )
        ) {
            moveTo(8f, 5f)
            curveTo(7.724f, 5f, 7.5f, 5.224f, 7.5f, 5.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2f)
            curveTo(5.224f, 7.5f, 5f, 7.724f, 5f, 8f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            curveTo(7.5f, 10.776f, 7.724f, 11f, 8f, 11f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            curveTo(10.776f, 8.5f, 11f, 8.276f, 11f, 8f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-2f)
            curveTo(8.5f, 5.224f, 8.276f, 5f, 8f, 5f)
            close()
        }
    }.build()
}
