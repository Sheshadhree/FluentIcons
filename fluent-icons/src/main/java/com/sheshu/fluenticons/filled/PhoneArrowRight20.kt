package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneArrowRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneArrowRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3.5f)
            curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(13.328f, 2f, 14f, 2.672f, 14f, 3.5f)
            verticalLineToRelative(5.522f)
            curveTo(11.361f, 9.26f, 9.26f, 11.362f, 9.022f, 14f)
            horizontalLineTo(7.5f)
            curveTo(7.224f, 14f, 7f, 14.224f, 7f, 14.5f)
            reflectiveCurveTo(7.224f, 15f, 7.5f, 15f)
            horizontalLineToRelative(1.522f)
            curveToRelative(0.103f, 1.134f, 0.55f, 2.17f, 1.235f, 3f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 18f, 4f, 17.328f, 4f, 16.5f)
            verticalLineToRelative(-13f)
            close()
            moveTo(14.5f, 10f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            reflectiveCurveTo(16.985f, 19f, 14.5f, 19f)
            reflectiveCurveTo(10f, 16.985f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            close()
            moveToRelative(2.353f, 4.854f)
            lineToRelative(0.003f, -0.003f)
            curveToRelative(0.047f, -0.047f, 0.082f, -0.102f, 0.106f, -0.16f)
            curveTo(16.986f, 14.633f, 17f, 14.57f, 17f, 14.503f)
            verticalLineToRelative(-0.006f)
            curveToRelative(0f, -0.067f, -0.014f, -0.13f, -0.038f, -0.188f)
            curveToRelative(-0.024f, -0.06f, -0.06f, -0.115f, -0.108f, -0.163f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(15.293f, 14f)
            horizontalLineTo(12.5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(2.793f)
            lineToRelative(-1.147f, 1.146f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(2f, -2f)
            close()
        }
    }.build()
}
