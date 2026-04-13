package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.People28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.People28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 14f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(11.985f, 5f, 9.5f, 5f)
            reflectiveCurveTo(5f, 7.015f, 5f, 9.5f)
            reflectiveCurveTo(7.015f, 14f, 9.5f, 14f)
            close()
            moveToRelative(7.6f, 7.619f)
            curveTo(17.863f, 21.854f, 18.814f, 22f, 20f, 22f)
            curveToRelative(6f, 0f, 6f, -3.75f, 6f, -3.75f)
            curveToRelative(0f, -1.243f, -1.008f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-6.656f)
            curveToRelative(0.56f, 0.584f, 0.904f, 1.377f, 0.904f, 2.25f)
            verticalLineToRelative(0.555f)
            lineToRelative(-0.003f, 0.083f)
            curveToRelative(-0.004f, 0.064f, -0.01f, 0.145f, -0.02f, 0.242f)
            curveToRelative(-0.02f, 0.192f, -0.06f, 0.448f, -0.134f, 0.748f)
            curveToRelative(-0.122f, 0.487f, -0.342f, 1.102f, -0.74f, 1.74f)
            close()
            moveTo(23.5f, 10.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveTo(18.067f, 7f, 20f, 7f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            close()
            moveTo(2f, 18.25f)
            curveTo(2f, 17.007f, 3.007f, 16f, 4.25f, 16f)
            horizontalLineToRelative(10.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(0.5f)
            reflectiveCurveTo(17f, 24f, 9.5f, 24f)
            reflectiveCurveTo(2f, 18.75f, 2f, 18.75f)
            verticalLineToRelative(-0.5f)
            close()
        }
    }.build()
}
