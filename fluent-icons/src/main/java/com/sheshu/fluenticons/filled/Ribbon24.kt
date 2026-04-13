package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Ribbon24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Ribbon24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.002f, 15.244f)
            lineTo(17f, 21.245f)
            curveToRelative(0f, 0.608f, -0.685f, 0.963f, -1.182f, 0.613f)
            lineTo(12f, 19.171f)
            lineToRelative(-3.817f, 2.687f)
            curveToRelative(-0.496f, 0.35f, -1.181f, -0.005f, -1.181f, -0.613f)
            lineToRelative(-0.002f, -6f)
            curveTo(8.37f, 16.344f, 10.108f, 17f, 12f, 17f)
            curveToRelative(1.893f, 0f, 3.632f, -0.657f, 5.002f, -1.756f)
            close()
            moveTo(12f, 2f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            close()
        }
    }.build()
}
