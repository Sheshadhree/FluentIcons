package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MegaphoneCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MegaphoneCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 12f)
            curveToRelative(0f, -4.694f, 3.806f, -8.5f, 8.5f, -8.5f)
            reflectiveCurveToRelative(8.5f, 3.806f, 8.5f, 8.5f)
            reflectiveCurveToRelative(-3.806f, 8.5f, -8.5f, 8.5f)
            reflectiveCurveToRelative(-8.5f, -3.806f, -8.5f, -8.5f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            close()
            moveToRelative(2.64f, 5.107f)
            curveToRelative(1.143f, -0.423f, 2.357f, 0.423f, 2.357f, 1.641f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.219f, -1.214f, 2.065f, -2.357f, 1.642f)
            lineToRelative(-1.562f, -0.578f)
            curveTo(12.7f, 17.299f, 11.745f, 18f, 10.625f, 18f)
            curveTo(9.175f, 18f, 8f, 16.825f, 8f, 15.375f)
            verticalLineToRelative(-0.941f)
            lineToRelative(-0.861f, -0.319f)
            curveToRelative(-0.687f, -0.254f, -1.143f, -0.909f, -1.143f, -1.641f)
            verticalLineToRelative(-0.95f)
            curveToRelative(0f, -0.733f, 0.456f, -1.388f, 1.143f, -1.642f)
            lineToRelative(7.501f, -2.775f)
            close()
            moveTo(9.5f, 14.988f)
            verticalLineToRelative(0.387f)
            curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
            curveToRelative(0.474f, 0f, 0.88f, -0.294f, 1.046f, -0.709f)
            lineTo(9.5f, 14.988f)
            close()
            moveToRelative(5.997f, -6.24f)
            curveToRelative(0f, -0.174f, -0.173f, -0.294f, -0.336f, -0.234f)
            lineToRelative(-7.502f, 2.775f)
            curveToRelative(-0.098f, 0.036f, -0.163f, 0.13f, -0.163f, 0.234f)
            verticalLineToRelative(0.95f)
            curveToRelative(0f, 0.105f, 0.065f, 0.199f, 0.163f, 0.235f)
            lineToRelative(7.502f, 2.775f)
            curveToRelative(0.163f, 0.06f, 0.336f, -0.06f, 0.336f, -0.235f)
            verticalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
