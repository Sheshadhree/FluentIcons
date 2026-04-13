package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Toolbox20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Toolbox20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB9C0C7),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(3.14286f, 3f),
                end = Offset(3.97135f, 6.83734f)
            )
        ) {
            moveTo(6f, 4.75f)
            curveTo(6f, 3.784f, 6.784f, 3f, 7.75f, 3f)
            horizontalLineToRelative(4.5f)
            curveTo(13.216f, 3f, 14f, 3.784f, 14f, 4.75f)
            verticalLineTo(7.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineTo(4.75f)
            curveToRelative(0f, -0.138f, -0.112f, -0.25f, -0.25f, -0.25f)
            horizontalLineToRelative(-4.5f)
            curveTo(7.612f, 4.5f, 7.5f, 4.612f, 7.5f, 4.75f)
            verticalLineTo(7.5f)
            horizontalLineTo(6f)
            verticalLineTo(4.75f)
            close()
            moveTo(16f, 17f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(9.5f)
            horizontalLineTo(2f)
            verticalLineTo(15f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF97DBD),
                    1f to Color(0xFFD7257D)
                ),
                start = Offset(0.999998f, 4.5f),
                end = Offset(1.30279f, 14.0754f)
            )
        ) {
            moveTo(4f, 6f)
            curveTo(2.895f, 6f, 2f, 6.895f, 2f, 8f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(16f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFEFEFEF),
                    1f to Color(0xFFDADADA)
                ),
                start = Offset(3.14286f, 9f),
                end = Offset(3.52042f, 11.6231f)
            )
        ) {
            moveTo(6.75f, 9f)
            curveTo(7.164f, 9f, 7.5f, 9.336f, 7.5f, 9.75f)
            verticalLineToRelative(1.5f)
            curveTo(7.5f, 11.664f, 7.164f, 12f, 6.75f, 12f)
            reflectiveCurveTo(6f, 11.664f, 6f, 11.25f)
            verticalLineToRelative(-1.5f)
            curveTo(6f, 9.336f, 6.336f, 9f, 6.75f, 9f)
            close()
            moveToRelative(6.5f, 0f)
            curveTo(13.664f, 9f, 14f, 9.336f, 14f, 9.75f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-1.5f)
            curveTo(12.5f, 9.336f, 12.836f, 9f, 13.25f, 9f)
            close()
        }
    }.build()
}
