package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.RoadCone28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RoadCone28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.981f, 2f)
            curveToRelative(-0.563f, 0f, -1.057f, 0.377f, -1.206f, 0.92f)
            lineTo(5.86f, 24.5f)
            horizontalLineTo(3.083f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(2.669f, 26f, 3.083f, 26f)
            horizontalLineToRelative(21.833f)
            curveToRelative(0.415f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.335f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(22.14f)
            lineTo(16.224f, 2.92f)
            curveTo(16.074f, 2.376f, 15.58f, 2f, 15.018f, 2f)
            horizontalLineToRelative(-2.037f)
            close()
            moveTo(7.483f, 24.25f)
            lineToRelative(1.234f, -4.5f)
            horizontalLineToRelative(7.533f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(9.128f)
            lineToRelative(0.685f, -2.5f)
            horizontalLineToRelative(5.437f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-5.025f)
            lineTo(13.172f, 3.5f)
            horizontalLineToRelative(1.656f)
            lineToRelative(5.688f, 20.75f)
            horizontalLineTo(7.483f)
            close()
        }
    }.build()
}
