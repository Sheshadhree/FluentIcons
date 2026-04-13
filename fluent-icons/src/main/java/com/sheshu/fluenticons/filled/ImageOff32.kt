package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageOff32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageOff32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26.896f, 28.31f)
            lineToRelative(1.397f, 1.397f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-26f, -26f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineTo(3.69f, 5.105f)
            curveTo(3.253f, 5.798f, 3f, 6.62f, 3f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 0.849f, 0.235f, 1.643f, 0.644f, 2.32f)
            lineToRelative(10.589f, -10.588f)
            curveToRelative(0.1f, -0.1f, 0.205f, -0.189f, 0.316f, -0.268f)
            lineToRelative(1.546f, 1.545f)
            curveToRelative(-0.157f, -0.03f, -0.326f, 0.016f, -0.448f, 0.137f)
            lineTo(5.03f, 28.262f)
            curveTo(5.74f, 28.73f, 6.588f, 29f, 7.5f, 29f)
            horizontalLineToRelative(17f)
            curveToRelative(0.88f, 0f, 1.701f, -0.253f, 2.395f, -0.69f)
            close()
            moveToRelative(2.018f, -2.93f)
            curveTo(28.971f, 25.094f, 29f, 24.8f, 29f, 24.5f)
            verticalLineToRelative(-17f)
            curveTo(29f, 5.015f, 26.986f, 3f, 24.5f, 3f)
            horizontalLineToRelative(-17f)
            curveTo(7.2f, 3f, 6.905f, 3.03f, 6.62f, 3.086f)
            lineToRelative(22.294f, 22.293f)
            close()
            moveTo(25f, 10f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
        }
    }.build()
}
