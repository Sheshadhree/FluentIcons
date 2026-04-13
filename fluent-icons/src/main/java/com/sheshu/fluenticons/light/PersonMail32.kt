package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.PersonMail32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PersonMail32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveTo(8f, 9f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            close()
            moveToRelative(-2.5f, 9f)
            curveTo(3.567f, 18f, 2f, 19.567f, 2f, 21.5f)
            verticalLineToRelative(0.667f)
            curveToRelative(0f, 2.147f, 2.76f, 7.82f, 11.968f, 7.833f)
            curveToRelative(-0.157f, -0.315f, -0.278f, -0.652f, -0.357f, -1.003f)
            curveTo(5.168f, 28.841f, 3f, 23.66f, 3f, 22.166f)
            verticalLineTo(21.5f)
            curveTo(3f, 20.12f, 4.12f, 19f, 5.5f, 19f)
            horizontalLineToRelative(8.111f)
            curveToRelative(0.08f, -0.35f, 0.2f, -0.686f, 0.357f, -1f)
            horizontalLineTo(5.5f)
            close()
            moveTo(18f, 17f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(0.198f)
            lineToRelative(8f, 4.444f)
            lineToRelative(8f, -4.444f)
            verticalLineTo(20f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(18f)
            close()
            moveToRelative(13f, 4.913f)
            lineToRelative(-7.636f, 4.243f)
            curveToRelative(-0.226f, 0.126f, -0.502f, 0.126f, -0.728f, 0f)
            lineTo(15f, 21.914f)
            verticalLineTo(28f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(10f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineToRelative(-6.087f)
            close()
        }
    }.build()
}
