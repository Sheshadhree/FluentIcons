package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Eraser24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Eraser24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.87f, 2.669f)
            lineToRelative(4.968f, 4.968f)
            curveToRelative(0.879f, 0.879f, 0.879f, 2.304f, 0f, 3.182f)
            lineToRelative(-8.682f, 8.68f)
            lineToRelative(6.098f, 0.001f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineToRelative(0.007f, 0.102f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(18.254f, 21f)
            lineToRelative(-8.41f, 0.001f)
            curveToRelative(-0.616f, 0.034f, -1.243f, -0.185f, -1.714f, -0.655f)
            lineToRelative(-4.969f, -4.969f)
            curveToRelative(-0.878f, -0.879f, -0.878f, -2.303f, 0f, -3.182f)
            lineToRelative(9.527f, -9.526f)
            curveToRelative(0.878f, -0.879f, 2.303f, -0.879f, 3.182f, 0f)
            close()
            moveToRelative(-4.172f, 15.09f)
            lineToRelative(-5.955f, -5.956f)
            lineToRelative(-1.506f, 1.467f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.06f)
            lineToRelative(4.945f, 4.946f)
            curveToRelative(0.298f, 0.289f, 0.772f, 0.281f, 1.06f, -0.016f)
            lineToRelative(1.455f, -1.502f)
            close()
        }
    }.build()
}
