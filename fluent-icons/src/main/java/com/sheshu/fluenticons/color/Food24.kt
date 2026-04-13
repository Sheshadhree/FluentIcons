package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Food24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Food24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(11.9231f, 3.24984f),
                end = Offset(28.955f, 8.91993f)
            )
        ) {
            moveTo(18.75f, 2f)
            curveTo(15.574f, 2f, 13f, 4.574f, 13f, 7.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(0.697f)
            lineToRelative(-0.023f, 0.352f)
            curveToRelative(-0.047f, 0.699f, -0.11f, 1.64f, -0.172f, 2.611f)
            curveTo(15.128f, 16.886f, 15f, 18.983f, 15f, 19.497f)
            curveToRelative(0f, 1.381f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
            curveToRelative(0f, -0.539f, -0.14f, -2.614f, -0.27f, -4.522f)
            lineToRelative(-0.005f, -0.083f)
            curveToRelative(-0.119f, -1.747f, -0.225f, -3.324f, -0.225f, -3.642f)
            verticalLineToRelative(-8.5f)
            curveTo(19.5f, 2.336f, 19.164f, 2f, 18.75f, 2f)
            close()
            moveTo(3.744f, 2.816f)
            curveTo(3.776f, 2.339f, 4.175f, 2f, 4.62f, 2f)
            curveTo(5.106f, 2f, 5.5f, 2.394f, 5.5f, 2.88f)
            verticalLineToRelative(4.494f)
            curveToRelative(0f, 0.345f, 0.28f, 0.625f, 0.625f, 0.625f)
            reflectiveCurveTo(6.75f, 7.719f, 6.75f, 7.374f)
            verticalLineTo(2.75f)
            curveTo(6.75f, 2.336f, 7.086f, 2f, 7.5f, 2f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(4.624f)
            curveToRelative(0f, 0.345f, 0.28f, 0.625f, 0.625f, 0.625f)
            reflectiveCurveTo(9.5f, 7.719f, 9.5f, 7.374f)
            verticalLineTo(2.88f)
            curveTo(9.5f, 2.394f, 9.894f, 2f, 10.38f, 2f)
            curveToRelative(0.445f, 0f, 0.843f, 0.339f, 0.877f, 0.816f)
            curveTo(11.3f, 3.428f, 11.5f, 6.37f, 11.5f, 8f)
            curveToRelative(0f, 1.35f, -0.67f, 2.544f, -1.692f, 3.267f)
            curveToRelative(-0.216f, 0.153f, -0.268f, 0.315f, -0.263f, 0.397f)
            curveTo(9.668f, 13.542f, 10f, 18.682f, 10f, 19.497f)
            curveToRelative(0f, 1.381f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(5f, 20.878f, 5f, 19.497f)
            curveToRelative(0f, -0.816f, 0.332f, -5.955f, 0.455f, -7.833f)
            curveToRelative(0.005f, -0.082f, -0.047f, -0.244f, -0.263f, -0.397f)
            curveTo(4.17f, 10.544f, 3.5f, 9.35f, 3.5f, 8f)
            curveToRelative(0f, -1.63f, 0.2f, -4.572f, 0.244f, -5.184f)
            close()
        }
    }.build()
}
