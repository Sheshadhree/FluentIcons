package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Mic24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Mic24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFCAD2D9),
                    1f to Color(0xFF70777D)
                ),
                start = Offset(4.75f, 5.81259f),
                end = Offset(12.1099f, 23.1845f)
            )
        ) {
            moveTo(19.25f, 11.742f)
            lineToRelative(-0.008f, -0.119f)
            lineToRelative(-0.001f, -0.008f)
            curveToRelative(-0.066f, -0.489f, -0.485f, -0.865f, -0.991f, -0.865f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(0.498f)
            lineToRelative(-0.004f, 0.21f)
            curveToRelative(-0.11f, 2.665f, -2.304f, 4.792f, -4.996f, 4.792f)
            horizontalLineToRelative(-0.497f)
            lineToRelative(-0.212f, -0.004f)
            curveToRelative(-2.664f, -0.11f, -4.791f, -2.304f, -4.791f, -4.996f)
            verticalLineToRelative(-0.508f)
            lineToRelative(-0.008f, -0.119f)
            lineToRelative(-0.001f, -0.008f)
            curveTo(6.675f, 11.126f, 6.257f, 10.75f, 5.75f, 10.75f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(0.5f)
            lineToRelative(0.004f, 0.24f)
            verticalLineToRelative(0.005f)
            curveToRelative(0.12f, 3.501f, 2.812f, 6.35f, 6.246f, 6.715f)
            verticalLineToRelative(2.048f)
            lineToRelative(0.008f, 0.119f)
            lineToRelative(0.001f, 0.008f)
            curveToRelative(0.066f, 0.489f, 0.485f, 0.865f, 0.991f, 0.865f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-2.04f)
            curveToRelative(3.514f, -0.375f, 6.25f, -3.348f, 6.25f, -6.96f)
            verticalLineToRelative(-0.508f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(6f, -1.18182f),
                end = Offset(13.3457f, 23.8285f)
            )
        ) {
            moveTo(12f, 2f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            close()
        }
    }.build()
}
