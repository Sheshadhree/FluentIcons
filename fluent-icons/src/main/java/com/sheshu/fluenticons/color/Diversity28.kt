package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Diversity28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Diversity28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF52D17C),
                    1f to Color(0xFF22918B)
                ),
                start = Offset(9.18057f, 9.78349f),
                end = Offset(22.8847f, 23.8009f)
            )
        ) {
            moveTo(20.625f, 14.595f)
            curveToRelative(-0.387f, -0.224f, -0.863f, -0.224f, -1.25f, 0f)
            lineToRelative(-3.744f, 2.161f)
            curveToRelative(-0.386f, 0.224f, -0.625f, 0.636f, -0.625f, 1.083f)
            verticalLineToRelative(4.322f)
            curveToRelative(0f, 0.447f, 0.239f, 0.86f, 0.625f, 1.083f)
            lineToRelative(3.744f, 2.161f)
            curveToRelative(0.387f, 0.223f, 0.863f, 0.223f, 1.25f, 0f)
            lineToRelative(3.743f, -2.161f)
            curveToRelative(0.387f, -0.223f, 0.625f, -0.636f, 0.625f, -1.083f)
            verticalLineTo(17.84f)
            curveToRelative(0f, -0.447f, -0.238f, -0.86f, -0.625f, -1.083f)
            lineToRelative(-3.743f, -2.161f)
            close()
            moveTo(8f, 15f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            close()
            moveToRelative(9.75f, -12f)
            curveTo(16.231f, 3f, 15f, 4.231f, 15f, 5.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineToRelative(4.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineToRelative(-4.5f)
            curveTo(25f, 4.231f, 23.769f, 3f, 22.25f, 3f)
            horizontalLineToRelative(-4.5f)
            close()
            moveTo(9.812f, 4.123f)
            curveToRelative(-0.753f, -1.497f, -2.871f, -1.497f, -3.624f, 0f)
            lineToRelative(-2.965f, 5.895f)
            curveTo(2.536f, 11.383f, 3.519f, 13f, 5.035f, 13f)
            horizontalLineToRelative(5.93f)
            curveToRelative(1.516f, 0f, 2.499f, -1.617f, 1.812f, -2.982f)
            lineTo(9.812f, 4.123f)
            close()
        }
    }.build()
}
