package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Molecule20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Molecule20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 6f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            curveToRelative(-1.387f, 0f, -2.609f, -0.706f, -3.326f, -1.778f)
            lineTo(8.006f, 9.056f)
            curveTo(8.62f, 9.687f, 9f, 10.55f, 9f, 11.5f)
            curveToRelative(0f, 0.372f, -0.058f, 0.73f, -0.166f, 1.067f)
            lineToRelative(2.7f, 1.388f)
            curveTo(11.992f, 13.374f, 12.702f, 13f, 13.5f, 13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveTo(14.88f, 18f, 13.5f, 18f)
            reflectiveCurveTo(11f, 16.88f, 11f, 15.5f)
            curveToRelative(0f, -0.225f, 0.03f, -0.443f, 0.086f, -0.65f)
            lineToRelative(-2.69f, -1.384f)
            curveTo(7.766f, 14.392f, 6.704f, 15f, 5.5f, 15f)
            curveTo(3.567f, 15f, 2f, 13.433f, 2f, 11.5f)
            reflectiveCurveTo(3.567f, 8f, 5.5f, 8f)
            curveToRelative(0.578f, 0f, 1.124f, 0.14f, 1.605f, 0.389f)
            lineToRelative(2.12f, -1.06f)
            curveTo(9.08f, 6.911f, 9f, 6.465f, 9f, 6f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            close()
        }
    }.build()
}
