package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRedo32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRedo32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(27.002f, 4.256f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(6.181f)
            lineTo(19.905f, 5.64f)
            curveToRelative(-1.221f, -1.294f, -3.252f, -2.326f, -5.481f, -2.542f)
            curveToRelative(-2.28f, -0.222f, -4.817f, 0.407f, -6.929f, 2.52f)
            curveToRelative(-2.149f, 2.148f, -2.712f, 4.659f, -2.5f, 6.83f)
            curveToRelative(0.205f, 2.104f, 1.143f, 3.958f, 2.119f, 4.935f)
            lineToRelative(0.001f, 0.002f)
            lineTo(18.322f, 28.68f)
            curveToRelative(0.486f, 0.49f, 1.277f, 0.494f, 1.768f, 0.007f)
            curveToRelative(0.49f, -0.486f, 0.493f, -1.277f, 0.007f, -1.767f)
            lineToRelative(-11.21f, -11.3f)
            lineToRelative(-0.004f, -0.004f)
            curveToRelative(-0.523f, -0.523f, -1.245f, -1.818f, -1.4f, -3.412f)
            curveToRelative(-0.15f, -1.528f, 0.228f, -3.268f, 1.78f, -4.82f)
            curveToRelative(1.525f, -1.525f, 3.298f, -1.957f, 4.92f, -1.8f)
            curveToRelative(1.669f, 0.163f, 3.128f, 0.947f, 3.907f, 1.774f)
            lineToRelative(0.007f, 0.007f)
            lineToRelative(4.939f, 5.155f)
            horizontalLineToRelative(-6.437f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(9.153f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(4.256f)
            close()
        }
    }.build()
}
