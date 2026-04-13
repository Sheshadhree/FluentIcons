package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ChatAdd32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ChatAdd32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(3f, 7.25041f),
                end = Offset(27.4465f, 48.9276f)
            )
        ) {
            moveTo(16f, 2f)
            curveToRelative(7.732f, 0f, 14f, 6.268f, 14f, 14f)
            reflectiveCurveToRelative(-6.268f, 14f, -14f, 14f)
            curveToRelative(-2.368f, 0f, -4.602f, -0.589f, -6.56f, -1.629f)
            lineToRelative(-5.528f, 1.572f)
            curveToRelative(-1.13f, 0.322f, -2.174f, -0.723f, -1.853f, -1.853f)
            lineToRelative(1.572f, -5.527f)
            curveTo(2.59f, 20.605f, 2f, 18.37f, 2f, 16f)
            curveTo(2f, 8.268f, 8.267f, 2f, 16f, 2f)
            close()
            moveToRelative(0f, 7f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF)
                ),
                start = Offset(10.2246f, 9.24582f),
                end = Offset(12.5523f, 24.2508f)
            )
        ) {
            moveTo(16f, 9f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
        }
    }.build()
}
