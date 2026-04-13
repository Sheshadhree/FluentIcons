package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Image32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Image32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 11f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveTo(25f, 9.067f, 25f, 11f)
            reflectiveCurveToRelative(-1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(18f, 12.933f, 18f, 11f)
            close()
            moveToRelative(3.5f, -1.5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveTo(23f, 11.828f, 23f, 11f)
            reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-17f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            close()
            moveTo(7.5f, 5f)
            curveTo(6.12f, 5f, 5f, 6.12f, 5f, 7.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 0.29f, 0.05f, 0.567f, 0.14f, 0.825f)
            lineToRelative(9.092f, -9.093f)
            curveToRelative(0.977f, -0.976f, 2.56f, -0.976f, 3.536f, 0f)
            lineToRelative(9.093f, 9.093f)
            curveTo(26.95f, 25.067f, 27f, 24.789f, 27f, 24.5f)
            verticalLineToRelative(-17f)
            curveTo(27f, 6.12f, 25.88f, 5f, 24.5f, 5f)
            horizontalLineToRelative(-17f)
            close()
            moveToRelative(18f, 21.792f)
            lineToRelative(-9.146f, -9.146f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(6.5f, 26.792f)
            curveTo(6.807f, 26.926f, 7.145f, 27f, 7.5f, 27f)
            horizontalLineToRelative(17f)
            curveToRelative(0.355f, 0f, 0.693f, -0.074f, 1f, -0.208f)
            close()
        }
    }.build()
}
