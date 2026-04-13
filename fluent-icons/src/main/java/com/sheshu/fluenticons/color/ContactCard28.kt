package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ContactCard28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ContactCard28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFB3E0FF),
                    1f to Color(0xFF8CD0FF)
                ),
                start = Offset(10.5741f, 4f),
                end = Offset(17.2476f, 23.7725f)
            )
        ) {
            moveTo(2.004f, 6.75f)
            curveTo(2.004f, 5.231f, 3.235f, 4f, 4.754f, 4f)
            horizontalLineTo(23.25f)
            curveTo(24.769f, 4f, 26f, 5.231f, 26f, 6.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 1.52f, -1.232f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(4.753f)
            curveToRelative(-1.519f, 0f, -2.75f, -1.231f, -2.75f, -2.75f)
            verticalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.446512f to Color(0x00FF6CE8),
                    1f to Color(0xFFFF6CE8)
                ),
                start = Offset(17.716f, 6.45615f),
                end = Offset(23.4133f, 34.901f)
            ),
            fillAlpha = 0.7f
        ) {
            moveTo(2.004f, 6.75f)
            curveTo(2.004f, 5.231f, 3.235f, 4f, 4.754f, 4f)
            horizontalLineTo(23.25f)
            curveTo(24.769f, 4f, 26f, 5.231f, 26f, 6.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 1.52f, -1.232f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(4.753f)
            curveToRelative(-1.519f, 0f, -2.75f, -1.231f, -2.75f, -2.75f)
            verticalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0078D4),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(17.8636f, 10.3654f),
                end = Offset(20.0976f, 21.1666f)
            )
        ) {
            moveTo(15f, 11.75f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveTo(15.75f, 15f)
            curveTo(15.336f, 15f, 15f, 15.336f, 15f, 15.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(21.664f, 15f, 21.25f, 15f)
            horizontalLineToRelative(-5.5f)
            close()
            moveTo(7f, 14.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineTo(16f)
            reflectiveCurveToRelative(-0.5f, 2.5f, -3.5f, 2.5f)
            reflectiveCurveTo(6f, 16f, 6f, 16f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(4.25f, -2.75f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            reflectiveCurveToRelative(-1.75f, -0.784f, -1.75f, -1.75f)
            reflectiveCurveTo(8.534f, 10f, 9.5f, 10f)
            reflectiveCurveToRelative(1.75f, 0.784f, 1.75f, 1.75f)
            close()
        }
    }.build()
}
