package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChatVideo24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatVideo24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(9f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(3f, 5.162f)
            verticalLineToRelative(-2.324f)
            lineToRelative(1.734f, -1.642f)
            curveTo(17.212f, 8.744f, 18f, 9.083f, 18f, 9.741f)
            verticalLineToRelative(4.518f)
            curveToRelative(0f, 0.658f, -0.788f, 0.997f, -1.266f, 0.545f)
            lineTo(15f, 13.162f)
            close()
            moveTo(22f, 12f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            reflectiveCurveTo(2f, 6.477f, 2f, 12f)
            curveToRelative(0f, 1.62f, 0.386f, 3.186f, 1.115f, 4.592f)
            lineToRelative(-1.068f, 3.823f)
            curveToRelative(-0.062f, 0.22f, -0.062f, 0.453f, 0f, 0.673f)
            curveToRelative(0.186f, 0.665f, 0.875f, 1.053f, 1.54f, 0.867f)
            lineToRelative(3.826f, -1.067f)
            curveTo(8.818f, 21.615f, 10.382f, 22f, 12f, 22f)
            curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
            close()
            moveTo(3.5f, 12f)
            curveToRelative(0f, -4.694f, 3.806f, -8.5f, 8.5f, -8.5f)
            reflectiveCurveToRelative(8.5f, 3.806f, 8.5f, 8.5f)
            reflectiveCurveToRelative(-3.806f, 8.5f, -8.5f, 8.5f)
            curveToRelative(-1.468f, 0f, -2.88f, -0.372f, -4.133f, -1.07f)
            lineToRelative(-0.27f, -0.15f)
            lineToRelative(-3.986f, 1.111f)
            lineToRelative(1.113f, -3.984f)
            lineToRelative(-0.151f, -0.27f)
            curveTo(3.873f, 14.883f, 3.5f, 13.47f, 3.5f, 12f)
            close()
        }
    }.build()
}
