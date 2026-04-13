package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentLightning24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentLightning24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(6.974f)
            lineToRelative(3.588f, -4.097f)
            curveToRelative(0.945f, -1.078f, 0.26f, -2.738f, -1.109f, -2.891f)
            lineToRelative(1f, -1.777f)
            curveToRelative(0.562f, -1f, -0.16f, -2.235f, -1.308f, -2.235f)
            horizontalLineTo(4.317f)
            curveTo(4.21f, 11f, 4.103f, 11.012f, 4f, 11.034f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            close()
            moveToRelative(1.5f, 0.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(5.5f)
            lineToRelative(-6f, -6f)
            close()
            moveTo(4.318f, 12f)
            horizontalLineToRelative(4.827f)
            curveToRelative(0.383f, 0f, 0.623f, 0.412f, 0.436f, 0.745f)
            lineTo(7.751f, 16f)
            horizontalLineToRelative(1.495f)
            curveToRelative(0.645f, 0f, 0.99f, 0.76f, 0.564f, 1.244f)
            lineToRelative(-4.823f, 5.508f)
            curveToRelative(-0.505f, 0.576f, -1.443f, 0.085f, -1.258f, -0.657f)
            lineTo(4.5f, 19f)
            horizontalLineTo(1.498f)
            curveToRelative(-0.367f, 0f, -0.609f, -0.381f, -0.453f, -0.713f)
            lineToRelative(2.82f, -6f)
            curveTo(3.948f, 12.112f, 4.124f, 12f, 4.318f, 12f)
            close()
        }
    }.build()
}
