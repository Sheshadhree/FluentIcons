package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Prohibited32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Prohibited32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.032f, 23.2f)
            curveTo(5.448f, 21.23f, 4.5f, 18.725f, 4.5f, 16f)
            curveTo(4.5f, 9.649f, 9.649f, 4.5f, 16f, 4.5f)
            curveToRelative(2.725f, 0f, 5.23f, 0.948f, 7.2f, 2.532f)
            lineTo(7.032f, 23.2f)
            close()
            moveTo(8.8f, 24.968f)
            lineTo(24.968f, 8.8f)
            curveToRelative(1.584f, 1.97f, 2.532f, 4.475f, 2.532f, 7.2f)
            curveToRelative(0f, 6.351f, -5.149f, 11.5f, -11.5f, 11.5f)
            curveToRelative(-2.725f, 0f, -5.23f, -0.948f, -7.2f, -2.532f)
            close()
            moveTo(2f, 16f)
            curveToRelative(0f, 7.732f, 6.268f, 14f, 14f, 14f)
            reflectiveCurveToRelative(14f, -6.268f, 14f, -14f)
            reflectiveCurveTo(23.732f, 2f, 16f, 2f)
            reflectiveCurveTo(2f, 8.268f, 2f, 16f)
            close()
        }
    }.build()
}
