package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Broom24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Broom24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.453f, 1.923f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.06f)
            lineTo(16.14f, 9.297f)
            curveToRelative(-0.146f, -0.181f, -0.304f, -0.356f, -0.472f, -0.524f)
            curveToRelative(-0.19f, -0.19f, -0.39f, -0.367f, -0.596f, -0.53f)
            lineToRelative(6.32f, -6.32f)
            curveToRelative(0.294f, -0.293f, 0.768f, -0.293f, 1.061f, 0f)
            close()
            moveTo(15.03f, 9.347f)
            curveToRelative(-2.246f, -2.245f, -5.886f, -2.245f, -8.132f, 0f)
            lineTo(6.653f, 9.591f)
            lineToRelative(8.132f, 8.132f)
            lineToRelative(0.244f, -0.244f)
            curveToRelative(2.245f, -2.245f, 2.245f, -5.886f, 0f, -8.132f)
            close()
            moveTo(1.885f, 12.966f)
            lineToRelative(3.613f, -2.409f)
            lineToRelative(8.32f, 8.321f)
            lineToRelative(-2.408f, 3.613f)
            curveToRelative(-0.124f, 0.187f, -0.326f, 0.308f, -0.55f, 0.33f)
            curveToRelative(-0.224f, 0.023f, -0.445f, -0.056f, -0.604f, -0.215f)
            lineTo(1.77f, 14.12f)
            curveToRelative(-0.158f, -0.159f, -0.238f, -0.38f, -0.216f, -0.604f)
            curveToRelative(0.023f, -0.223f, 0.144f, -0.425f, 0.33f, -0.55f)
            close()
        }
    }.build()
}
