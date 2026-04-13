package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.History16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.History16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD373FC),
                    1f to Color(0xFF6D37CD)
                ),
                start = Offset(6.35689f, 12.6335f),
                end = Offset(14.5859f, 8.98826f)
            )
        ) {
            moveTo(7.697f, 5f)
            curveToRelative(0.415f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineTo(7.5f)
            horizontalLineToRelative(1.25f)
            curveToRelative(0.415f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(10.112f, 9f, 9.697f, 9f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-2.5f)
            curveTo(6.947f, 5.336f, 7.284f, 5f, 7.697f, 5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(2f, 2.70588f),
                end = Offset(5.2335f, 16.1858f)
            )
        ) {
            moveTo(7.947f, 3.5f)
            curveToRelative(2.486f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            reflectiveCurveToRelative(-2.014f, 4.5f, -4.5f, 4.5f)
            curveToRelative(-2.267f, 0f, -4.144f, -1.678f, -4.454f, -3.86f)
            curveToRelative(-0.059f, -0.41f, -0.438f, -0.695f, -0.849f, -0.636f)
            curveToRelative(-0.41f, 0.058f, -0.695f, 0.438f, -0.636f, 0.848f)
            curveTo(2.422f, 11.762f, 4.923f, 14f, 7.948f, 14f)
            curveToRelative(3.313f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.687f, -6f, -6f, -6f)
            curveToRelative(-1.538f, 0f, -2.94f, 0.578f, -4f, 1.528f)
            verticalLineTo(2.75f)
            curveTo(3.947f, 2.336f, 3.611f, 2f, 3.197f, 2f)
            curveToRelative(-0.415f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.414f, 0.335f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(6.111f, 5f, 5.697f, 5f)
            horizontalLineTo(4.592f)
            curveToRelative(0.825f, -0.921f, 2.022f, -1.5f, 3.354f, -1.5f)
            close()
        }
    }.build()
}
