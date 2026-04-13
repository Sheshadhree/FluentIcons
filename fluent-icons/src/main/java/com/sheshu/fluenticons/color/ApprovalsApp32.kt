package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ApprovalsApp32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ApprovalsApp32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(3f, 2.76471f),
                end = Offset(12.1278f, 35.8883f)
            )
        ) {
            moveTo(14.707f, 1.293f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(2.3f, 2.3f)
            curveTo(8.6f, 5.221f, 3f, 10.956f, 3f, 18f)
            curveToRelative(0f, 7.18f, 5.82f, 13f, 13f, 13f)
            reflectiveCurveToRelative(13f, -5.82f, 13f, -13f)
            verticalLineToRelative(-0.08f)
            curveTo(28.997f, 17.4f, 28.56f, 17f, 28.042f, 17f)
            horizontalLineToRelative(-0.086f)
            curveTo(27.42f, 17f, 27f, 17.462f, 27f, 18f)
            curveToRelative(0f, 6.075f, -4.925f, 11f, -11f, 11f)
            reflectiveCurveTo(5f, 24.075f, 5f, 18f)
            curveTo(5f, 12.066f, 9.698f, 7.23f, 15.578f, 7.008f)
            lineToRelative(-2.285f, 2.285f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(4f, -4f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-4f, -4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF42B870),
                    1f to Color(0xFF309C61)
                ),
                start = Offset(22.6563f, 13.4f),
                end = Offset(9.07989f, 20.1491f)
            )
        ) {
            moveTo(22.707f, 14.707f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineTo(16f, 18.586f)
            lineToRelative(-2.293f, -2.293f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(3f, 3f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(6f, -6f)
            close()
        }
    }.build()
}
