package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnUpDown48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnUpDown48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.407f, 38.474f)
            curveToRelative(-0.262f, 0.639f, -0.992f, 0.944f, -1.63f, 0.683f)
            curveToRelative(-0.64f, -0.262f, -0.945f, -0.992f, -0.683f, -1.63f)
            lineTo(20.918f, 6.214f)
            curveToRelative(0.763f, -1.862f, 3.401f, -1.862f, 4.164f, 0f)
            lineToRelative(12.373f, 30.209f)
            lineToRelative(4.168f, -8.713f)
            curveToRelative(0.297f, -0.623f, 1.044f, -0.886f, 1.667f, -0.589f)
            curveToRelative(0.622f, 0.298f, 0.886f, 1.045f, 0.588f, 1.667f)
            lineToRelative(-5.5f, 11.5f)
            curveToRelative(-0.287f, 0.6f, -0.994f, 0.87f, -1.608f, 0.615f)
            lineToRelative(-12f, -5f)
            curveToRelative(-0.638f, -0.266f, -0.939f, -0.998f, -0.674f, -1.635f)
            curveToRelative(0.266f, -0.637f, 0.998f, -0.938f, 1.635f, -0.673f)
            lineToRelative(9.483f, 3.952f)
            lineTo(23f, 7.727f)
            lineTo(10.407f, 38.474f)
            close()
        }
    }.build()
}
