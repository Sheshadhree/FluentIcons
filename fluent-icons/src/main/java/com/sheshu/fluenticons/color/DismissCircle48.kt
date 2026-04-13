package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DismissCircle48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DismissCircle48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF83F54),
                    1f to Color(0xFFCA2134)
                ),
                start = Offset(10.25f, 6.5f),
                end = Offset(36.5f, 45.25f)
            )
        ) {
            moveTo(24f, 4f)
            curveToRelative(11.046f, 0f, 20f, 8.954f, 20f, 20f)
            reflectiveCurveToRelative(-8.954f, 20f, -20f, 20f)
            reflectiveCurveTo(4f, 35.046f, 4f, 24f)
            reflectiveCurveTo(12.954f, 4f, 24f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFFECBE6)
                ),
                start = Offset(16.708f, 24.7292f),
                end = Offset(25.2996f, 33.6631f)
            )
        ) {
            moveTo(17.782f, 16.025f)
            lineToRelative(0.102f, 0.091f)
            lineTo(24f, 22.233f)
            lineToRelative(6.116f, -6.117f)
            curveToRelative(0.456f, -0.455f, 1.176f, -0.486f, 1.666f, -0.091f)
            lineToRelative(0.102f, 0.091f)
            curveToRelative(0.456f, 0.456f, 0.486f, 1.176f, 0.091f, 1.666f)
            lineToRelative(-0.091f, 0.102f)
            lineTo(25.767f, 24f)
            lineToRelative(6.117f, 6.116f)
            curveToRelative(0.456f, 0.456f, 0.486f, 1.176f, 0.091f, 1.666f)
            lineToRelative(-0.091f, 0.102f)
            curveToRelative(-0.456f, 0.456f, -1.175f, 0.486f, -1.666f, 0.091f)
            lineToRelative(-0.102f, -0.091f)
            lineTo(24f, 25.767f)
            lineToRelative(-6.116f, 6.117f)
            curveToRelative(-0.456f, 0.456f, -1.175f, 0.486f, -1.666f, 0.091f)
            lineToRelative(-0.102f, -0.091f)
            curveToRelative(-0.455f, -0.456f, -0.486f, -1.175f, -0.091f, -1.666f)
            lineToRelative(0.091f, -0.102f)
            lineTo(22.233f, 24f)
            lineToRelative(-6.117f, -6.116f)
            curveToRelative(-0.455f, -0.456f, -0.486f, -1.175f, -0.091f, -1.666f)
            lineToRelative(0.091f, -0.102f)
            curveToRelative(0.456f, -0.455f, 1.176f, -0.486f, 1.666f, -0.091f)
            close()
        }
    }.build()
}
