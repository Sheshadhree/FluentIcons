package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DismissCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DismissCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFF83F54),
                    1f to Color(0xFFCA2134)
                ),
                start = Offset(3.875f, 2.75f),
                end = Offset(13f, 16f)
            )
        ) {
            moveTo(8f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFFECBE6)
                ),
                start = Offset(6.01126f, 8.19887f),
                end = Offset(8.35442f, 10.6354f)
            )
        ) {
            moveTo(5.896f, 5.896f)
            curveTo(6.07f, 5.723f, 6.34f, 5.704f, 6.534f, 5.84f)
            lineToRelative(0.07f, 0.057f)
            lineTo(8f, 7.293f)
            lineToRelative(1.396f, -1.397f)
            curveTo(9.57f, 5.723f, 9.84f, 5.704f, 10.034f, 5.84f)
            lineToRelative(0.07f, 0.057f)
            curveToRelative(0.173f, 0.174f, 0.192f, 0.443f, 0.057f, 0.638f)
            lineToRelative(-0.057f, 0.07f)
            lineTo(8.707f, 8f)
            lineToRelative(1.397f, 1.396f)
            curveToRelative(0.173f, 0.174f, 0.192f, 0.443f, 0.057f, 0.638f)
            lineToRelative(-0.057f, 0.07f)
            curveTo(9.93f, 10.277f, 9.66f, 10.296f, 9.466f, 10.16f)
            lineToRelative(-0.07f, -0.057f)
            lineTo(8f, 8.707f)
            lineToRelative(-1.396f, 1.397f)
            curveTo(6.43f, 10.277f, 6.16f, 10.296f, 5.966f, 10.16f)
            lineToRelative(-0.07f, -0.057f)
            curveTo(5.723f, 9.93f, 5.704f, 9.66f, 5.84f, 9.466f)
            lineToRelative(0.057f, -0.07f)
            lineTo(7.293f, 8f)
            lineTo(5.896f, 6.604f)
            curveTo(5.723f, 6.43f, 5.704f, 6.16f, 5.84f, 5.966f)
            lineToRelative(0.057f, -0.07f)
            close()
        }
    }.build()
}
