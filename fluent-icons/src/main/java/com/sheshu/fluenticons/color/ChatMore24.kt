package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.ChatMore24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.ChatMore24",
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
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF)
                ),
                start = Offset(8.69977f, 9.58779f),
                end = Offset(9.2269f, 15.0246f)
            )
        ) {
            moveTo(13.252f, 13f)
            horizontalLineTo(8.75f)
            lineToRelative(-0.102f, 0.007f)
            curveTo(8.282f, 13.057f, 8f, 13.37f, 8f, 13.75f)
            reflectiveCurveToRelative(0.282f, 0.694f, 0.648f, 0.743f)
            lineTo(8.75f, 14.5f)
            horizontalLineToRelative(4.502f)
            lineToRelative(0.101f, -0.007f)
            curveToRelative(0.367f, -0.05f, 0.649f, -0.363f, 0.649f, -0.743f)
            reflectiveCurveToRelative(-0.282f, -0.694f, -0.649f, -0.743f)
            lineTo(13.252f, 13f)
            close()
            moveToRelative(1.998f, -3.5f)
            horizontalLineToRelative(-6.5f)
            lineTo(8.648f, 9.507f)
            curveTo(8.282f, 9.557f, 8f, 9.87f, 8f, 10.25f)
            reflectiveCurveToRelative(0.282f, 0.694f, 0.648f, 0.743f)
            lineTo(8.75f, 11f)
            horizontalLineToRelative(6.5f)
            lineToRelative(0.102f, -0.007f)
            curveTo(15.718f, 10.943f, 16f, 10.63f, 16f, 10.25f)
            reflectiveCurveToRelative(-0.282f, -0.694f, -0.648f, -0.743f)
            lineTo(15.25f, 9.5f)
            close()
        }
    }.build()
}
