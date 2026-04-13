package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlertBadge20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlertBadge20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.45f, 16.002f)
            curveTo(12.218f, 17.142f, 11.21f, 18f, 10f, 18f)
            curveToRelative(-1.209f, 0f, -2.217f, -0.858f, -2.45f, -1.998f)
            horizontalLineToRelative(4.9f)
            close()
            moveTo(9.998f, 2f)
            curveToRelative(1.09f, 0f, 2.113f, 0.28f, 2.995f, 0.77f)
            curveTo(12.383f, 3.32f, 12f, 4.115f, 12f, 5f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            curveToRelative(0.35f, 0f, 0.687f, -0.06f, 1f, -0.17f)
            verticalLineToRelative(3.578f)
            lineToRelative(0.953f, 2.587f)
            lineToRelative(0.026f, 0.085f)
            lineToRelative(0.015f, 0.086f)
            lineToRelative(0.005f, 0.089f)
            curveToRelative(0f, 0.315f, -0.195f, 0.59f, -0.522f, 0.707f)
            lineToRelative(-0.113f, 0.033f)
            lineToRelative(-0.115f, 0.01f)
            horizontalLineTo(3.752f)
            curveToRelative(-0.089f, 0f, -0.177f, -0.016f, -0.26f, -0.047f)
            curveToRelative(-0.287f, -0.105f, -0.475f, -0.372f, -0.482f, -0.716f)
            lineToRelative(0.004f, -0.117f)
            lineToRelative(0.034f, -0.13f)
            lineToRelative(0.951f, -2.584f)
            lineTo(4f, 7.793f)
            lineToRelative(0.005f, -0.225f)
            curveTo(4.127f, 4.451f, 6.77f, 2f, 9.998f, 2f)
            close()
            moveTo(15f, 7f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
    }.build()
}
