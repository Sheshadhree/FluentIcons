package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Autosum16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Autosum16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.06f, 1.956f)
            curveTo(2.178f, 1.679f, 2.45f, 1.5f, 2.75f, 1.5f)
            horizontalLineToRelative(9.5f)
            curveTo(12.664f, 1.5f, 13f, 1.836f, 13f, 2.25f)
            reflectiveCurveTo(12.664f, 3f, 12.25f, 3f)
            horizontalLineTo(4.51f)
            lineToRelative(3.915f, 4.08f)
            curveToRelative(0.273f, 0.284f, 0.28f, 0.73f, 0.015f, 1.023f)
            lineTo(4.445f, 12.5f)
            horizontalLineToRelative(7.805f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(12.664f, 14f, 12.25f, 14f)
            horizontalLineToRelative(-9.5f)
            curveToRelative(-0.297f, 0f, -0.566f, -0.175f, -0.686f, -0.447f)
            curveToRelative(-0.12f, -0.27f, -0.069f, -0.588f, 0.13f, -0.807f)
            lineToRelative(4.664f, -5.133f)
            lineToRelative(-4.65f, -4.844f)
            curveTo(2.002f, 2.553f, 1.943f, 2.232f, 2.06f, 1.956f)
            close()
        }
    }.build()
}
