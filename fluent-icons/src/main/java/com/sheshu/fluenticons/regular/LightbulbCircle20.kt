package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LightbulbCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LightbulbCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveToRelative(-8f, 7f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(8f, -4f)
            curveTo(8.481f, 6f, 7.25f, 7.231f, 7.25f, 8.75f)
            curveToRelative(0f, 0.883f, 0.416f, 1.67f, 1.065f, 2.173f)
            curveToRelative(0.188f, 0.146f, 0.341f, 0.363f, 0.391f, 0.63f)
            lineTo(8.79f, 12f)
            horizontalLineToRelative(2.42f)
            lineToRelative(0.084f, -0.447f)
            curveToRelative(0.05f, -0.267f, 0.203f, -0.484f, 0.391f, -0.63f)
            curveToRelative(0.649f, -0.504f, 1.065f, -1.29f, 1.065f, -2.173f)
            curveTo(12.75f, 7.231f, 11.519f, 6f, 10f, 6f)
            close()
            moveToRelative(1.023f, 7f)
            horizontalLineTo(8.977f)
            lineToRelative(0.111f, 0.592f)
            curveTo(9.133f, 13.83f, 9.34f, 14f, 9.58f, 14f)
            horizontalLineToRelative(0.84f)
            curveToRelative(0.24f, 0f, 0.447f, -0.171f, 0.492f, -0.408f)
            lineTo(11.021f, 13f)
            close()
            moveTo(6.25f, 8.75f)
            curveTo(6.25f, 6.679f, 7.929f, 5f, 10f, 5f)
            curveToRelative(2.071f, 0f, 3.75f, 1.679f, 3.75f, 3.75f)
            curveToRelative(0f, 1.205f, -0.57f, 2.278f, -1.451f, 2.963f)
            curveToRelative(-0.01f, 0.008f, -0.017f, 0.016f, -0.02f, 0.02f)
            lineToRelative(-0.002f, 0.003f)
            verticalLineToRelative(0.002f)
            lineToRelative(-0.383f, 2.038f)
            curveTo(11.761f, 14.486f, 11.142f, 15f, 10.42f, 15f)
            horizontalLineTo(9.58f)
            curveToRelative(-0.722f, 0f, -1.341f, -0.514f, -1.474f, -1.224f)
            lineToRelative(-0.383f, -2.038f)
            lineToRelative(-0.002f, -0.004f)
            curveToRelative(-0.003f, -0.005f, -0.01f, -0.013f, -0.02f, -0.021f)
            curveTo(6.82f, 11.028f, 6.25f, 9.955f, 6.25f, 8.75f)
            close()
        }
    }.build()
}
