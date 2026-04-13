package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.History28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.History28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD373FC),
                    1f to Color(0xFF6D37CD)
                ),
                start = Offset(11.9875f, 22.2669f),
                end = Offset(26.7363f, 16.667f)
            )
        ) {
            moveTo(14f, 7f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(3f, 4.29412f),
                end = Offset(8.90494f, 29.019f)
            )
        ) {
            moveTo(14f, 5f)
            curveToRelative(-2.143f, 0f, -4.111f, 0.748f, -5.658f, 2f)
            horizontalLineTo(10f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(6f)
            curveTo(5.457f, 9f, 5.016f, 8.568f, 5f, 8.029f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(1.514f)
            curveTo(8.901f, 3.944f, 11.34f, 3f, 14f, 3f)
            curveToRelative(6.075f, 0f, 11f, 4.925f, 11f, 11f)
            reflectiveCurveToRelative(-4.925f, 11f, -11f, 11f)
            reflectiveCurveTo(3f, 20.075f, 3f, 14f)
            curveToRelative(0f, -0.37f, 0.018f, -0.737f, 0.054f, -1.099f)
            curveToRelative(0.055f, -0.55f, 0.545f, -0.95f, 1.094f, -0.896f)
            curveToRelative(0.55f, 0.054f, 0.951f, 0.544f, 0.897f, 1.094f)
            curveTo(5.014f, 13.395f, 5f, 13.695f, 5f, 14f)
            curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
            reflectiveCurveToRelative(-4.03f, -9f, -9f, -9f)
            close()
        }
    }.build()
}
