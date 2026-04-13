package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.QuestionCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.QuestionCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(2f, 2f),
                end = Offset(18f, 18f)
            )
        ) {
            moveTo(10f, 2f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF)
                ),
                start = Offset(7.93736f, 5.6668f),
                end = Offset(10.765f, 15.2603f)
            )
        ) {
            moveTo(10f, 13.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(9.586f, 15f, 10f, 15f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(10.414f, 13.5f, 10f, 13.5f)
            close()
            moveToRelative(0f, -8f)
            curveTo(8.62f, 5.5f, 7.5f, 6.62f, 7.5f, 8f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(8.5f, 8.276f, 8.5f, 8f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            curveToRelative(0f, 0.37f, -0.134f, 0.716f, -0.368f, 0.985f)
            lineToRelative(-0.106f, 0.11f)
            lineToRelative(-0.118f, 0.1f)
            lineToRelative(-0.247f, 0.184f)
            curveToRelative(-0.129f, 0.1f, -0.245f, 0.204f, -0.356f, 0.323f)
            curveTo(9.793f, 10.248f, 9.5f, 10.988f, 9.5f, 12f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            curveToRelative(0f, -0.758f, 0.196f, -1.254f, 0.535f, -1.614f)
            lineToRelative(0.075f, -0.076f)
            lineToRelative(0.08f, -0.073f)
            lineToRelative(0.088f, -0.072f)
            lineToRelative(0.219f, -0.163f)
            lineToRelative(0.154f, -0.125f)
            curveTo(12.185f, 9.407f, 12.5f, 8.73f, 12.5f, 8f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
        }
    }.build()
}
