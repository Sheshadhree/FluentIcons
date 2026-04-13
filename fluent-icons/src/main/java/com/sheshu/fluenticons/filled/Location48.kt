package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Location48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Location48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4f)
            curveToRelative(9.389f, 0f, 17f, 7.611f, 17f, 17f)
            curveToRelative(0f, 2.884f, -0.718f, 5.6f, -1.985f, 7.98f)
            curveToRelative(-0.094f, 0.175f, -0.19f, 0.348f, -0.29f, 0.52f)
            curveToRelative(-0.451f, 0.781f, -0.963f, 1.523f, -1.53f, 2.22f)
            curveToRelative(-0.07f, 0.087f, -0.143f, 0.174f, -0.215f, 0.26f)
            lineToRelative(-0.002f, 0.001f)
            lineTo(36.962f, 32f)
            horizontalLineTo(37f)
            lineTo(26.911f, 42.709f)
            curveToRelative(-1.579f, 1.676f, -4.243f, 1.676f, -5.822f, 0f)
            lineTo(11f, 32f)
            horizontalLineToRelative(0.038f)
            lineToRelative(-0.018f, -0.02f)
            lineTo(11f, 31.955f)
            curveToRelative(-0.614f, -0.728f, -1.169f, -1.51f, -1.655f, -2.335f)
            lineToRelative(-0.07f, -0.12f)
            curveTo(7.827f, 27f, 7f, 24.096f, 7f, 21f)
            curveToRelative(0f, -9.389f, 7.611f, -17f, 17f, -17f)
            close()
            moveToRelative(0f, 11f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            close()
        }
    }.build()
}
