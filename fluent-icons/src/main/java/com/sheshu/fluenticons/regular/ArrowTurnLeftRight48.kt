package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnLeftRight48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnLeftRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(39.474f, 9.407f)
            curveToRelative(0.639f, -0.262f, 0.944f, -0.992f, 0.683f, -1.63f)
            curveToRelative(-0.262f, -0.64f, -0.992f, -0.945f, -1.63f, -0.683f)
            lineTo(7.214f, 19.918f)
            curveToRelative(-1.862f, 0.763f, -1.862f, 3.401f, 0f, 4.164f)
            lineToRelative(30.209f, 12.373f)
            lineToRelative(-8.713f, 4.168f)
            curveToRelative(-0.623f, 0.297f, -0.886f, 1.044f, -0.589f, 1.667f)
            curveToRelative(0.298f, 0.622f, 1.045f, 0.886f, 1.667f, 0.588f)
            lineToRelative(11.5f, -5.5f)
            curveToRelative(0.6f, -0.287f, 0.87f, -0.994f, 0.615f, -1.608f)
            lineToRelative(-5f, -12f)
            curveToRelative(-0.266f, -0.638f, -0.998f, -0.939f, -1.635f, -0.674f)
            curveToRelative(-0.637f, 0.266f, -0.938f, 0.998f, -0.673f, 1.635f)
            lineToRelative(3.952f, 9.483f)
            lineTo(8.727f, 22f)
            lineTo(39.474f, 9.407f)
            close()
        }
    }.build()
}
