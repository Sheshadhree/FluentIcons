package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Molecule16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Molecule16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            curveToRelative(0f, 0.464f, 0.105f, 0.903f, 0.293f, 1.295f)
            lineToRelative(-2.34f, 1.17f)
            curveTo(5.542f, 7.172f, 5.041f, 7f, 4.5f, 7f)
            curveTo(3.12f, 7f, 2f, 8.12f, 2f, 9.5f)
            reflectiveCurveTo(3.12f, 12f, 4.5f, 12f)
            curveToRelative(0.96f, 0f, 1.793f, -0.541f, 2.212f, -1.335f)
            lineToRelative(2.297f, 1.148f)
            curveTo(9.003f, 11.875f, 9f, 11.937f, 9f, 12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            curveToRelative(-0.684f, 0f, -1.288f, 0.343f, -1.648f, 0.867f)
            lineToRelative(-2.359f, -1.18f)
            curveTo(6.998f, 9.627f, 7f, 9.563f, 7f, 9.5f)
            curveToRelative(0f, -0.463f, -0.126f, -0.897f, -0.345f, -1.268f)
            lineTo(8.878f, 7.12f)
            curveTo(9.42f, 7.664f, 10.17f, 8f, 11f, 8f)
            close()
        }
    }.build()
}
