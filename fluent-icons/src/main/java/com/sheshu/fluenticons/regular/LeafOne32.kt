package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LeafOne32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LeafOne32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.95f, 3.808f)
            curveToRelative(-1.077f, -1.077f, -2.823f, -1.077f, -3.9f, 0f)
            lineToRelative(-5.121f, 5.12f)
            curveToRelative(-3.905f, 3.906f, -3.905f, 10.238f, 0f, 14.143f)
            curveToRelative(1.698f, 1.698f, 3.854f, 2.658f, 6.071f, 2.879f)
            verticalLineTo(29f)
            curveToRelative(0f, 0.553f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.447f, 1f, -1f)
            verticalLineToRelative(-3.05f)
            curveToRelative(2.216f, -0.221f, 4.373f, -1.181f, 6.071f, -2.88f)
            curveToRelative(3.905f, -3.904f, 3.905f, -10.236f, 0f, -14.141f)
            lineTo(17.95f, 3.808f)
            close()
            moveTo(17f, 23.938f)
            verticalLineTo(15f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineToRelative(8.938f)
            curveToRelative(-1.703f, -0.214f, -3.35f, -0.974f, -4.657f, -2.281f)
            curveToRelative(-3.124f, -3.125f, -3.124f, -8.19f, 0f, -11.314f)
            lineToRelative(5.121f, -5.121f)
            curveToRelative(0.296f, -0.296f, 0.776f, -0.296f, 1.072f, 0f)
            lineToRelative(5.12f, 5.121f)
            curveToRelative(3.125f, 3.124f, 3.125f, 8.19f, 0f, 11.314f)
            curveToRelative(-1.306f, 1.307f, -2.953f, 2.067f, -4.656f, 2.28f)
            close()
        }
    }.build()
}
