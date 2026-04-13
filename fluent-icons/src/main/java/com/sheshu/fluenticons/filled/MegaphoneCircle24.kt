package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MegaphoneCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MegaphoneCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 22f)
            curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            reflectiveCurveTo(2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            close()
            moveToRelative(-4f, -7.566f)
            lineToRelative(-0.861f, -0.319f)
            curveToRelative(-0.687f, -0.254f, -1.143f, -0.909f, -1.143f, -1.641f)
            verticalLineToRelative(-0.95f)
            curveToRelative(0f, -0.733f, 0.456f, -1.388f, 1.143f, -1.642f)
            lineToRelative(7.501f, -2.775f)
            curveToRelative(1.143f, -0.423f, 2.357f, 0.423f, 2.357f, 1.641f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.219f, -1.214f, 2.065f, -2.357f, 1.642f)
            lineToRelative(-1.434f, -0.531f)
            curveToRelative(-0.228f, 1.219f, -1.297f, 2.141f, -2.581f, 2.141f)
            curveTo(9.175f, 18.5f, 8f, 17.325f, 8f, 15.875f)
            verticalLineToRelative(-1.441f)
            close()
            moveToRelative(3.75f, 1.387f)
            verticalLineToRelative(0.054f)
            curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
            reflectiveCurveTo(9.5f, 16.496f, 9.5f, 15.875f)
            verticalLineToRelative(-0.887f)
            lineToRelative(2.25f, 0.833f)
            close()
        }
    }.build()
}
