package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pulse24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pulse24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.471f, 7.237f)
            lineToRelative(3.056f, 12.992f)
            curveToRelative(0.233f, 0.993f, 1.63f, 1.04f, 1.929f, 0.065f)
            lineToRelative(2.945f, -9.58f)
            lineToRelative(0.384f, 1.527f)
            curveToRelative(0.113f, 0.444f, 0.512f, 0.756f, 0.97f, 0.756f)
            horizontalLineTo(21f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            curveToRelative(0f, -0.553f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-2.466f)
            lineToRelative(-1.069f, -4.241f)
            curveToRelative(-0.247f, -0.982f, -1.628f, -1.017f, -1.925f, -0.05f)
            lineToRelative(-2.912f, 9.472f)
            lineTo(9.475f, 2.771f)
            curveToRelative(-0.24f, -1.02f, -1.688f, -1.03f, -1.943f, -0.014f)
            lineToRelative(-2.065f, 8.24f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, 0.447f, -1f, 1f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(3.247f)
            curveToRelative(0.459f, 0f, 0.859f, -0.312f, 0.97f, -0.757f)
            lineToRelative(1.254f, -5.003f)
            close()
        }
    }.build()
}
