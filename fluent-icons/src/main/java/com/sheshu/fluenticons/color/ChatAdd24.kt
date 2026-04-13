package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ChatAdd24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ChatAdd24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFFCC23D1)
                ),
                start = Offset(2.71429f, 5.75056f),
                end = Offset(20.178f, 35.521f)
            )
        ) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            curveToRelative(-1.64f, 0f, -3.225f, -0.396f, -4.644f, -1.142f)
            lineToRelative(-4.29f, 1.117f)
            curveToRelative(-0.455f, 0.119f, -0.92f, -0.154f, -1.037f, -0.608f)
            curveToRelative(-0.037f, -0.14f, -0.037f, -0.288f, 0f, -0.428f)
            lineToRelative(1.116f, -4.289f)
            curveTo(2.397f, 15.23f, 2f, 13.643f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveToRelative(0.75f, 5.75f)
            curveTo(12.75f, 7.336f, 12.414f, 7f, 12f, 7f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-3.5f)
            curveTo(7.336f, 11.25f, 7f, 11.586f, 7f, 12f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-3.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-3.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF)
                ),
                start = Offset(7.87472f, 7.17558f),
                end = Offset(9.53735f, 17.8934f)
            )
        ) {
            moveTo(12.75f, 7.75f)
            curveTo(12.75f, 7.336f, 12.414f, 7f, 12f, 7f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-3.5f)
            curveTo(7.336f, 11.25f, 7f, 11.586f, 7f, 12f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-3.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
