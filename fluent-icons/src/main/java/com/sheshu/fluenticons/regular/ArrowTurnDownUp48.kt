package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTurnDownUp48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTurnDownUp48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(38.378f, 6.71f)
            curveToRelative(-0.287f, -0.6f, -0.994f, -0.87f, -1.608f, -0.614f)
            lineToRelative(-12f, 5f)
            curveToRelative(-0.638f, 0.266f, -0.939f, 0.998f, -0.674f, 1.635f)
            curveToRelative(0.266f, 0.637f, 0.998f, 0.939f, 1.635f, 0.673f)
            lineToRelative(9.483f, -3.951f)
            lineTo(23f, 39.273f)
            lineTo(10.407f, 8.525f)
            curveToRelative(-0.262f, -0.638f, -0.992f, -0.944f, -1.63f, -0.683f)
            curveToRelative(-0.64f, 0.262f, -0.945f, 0.992f, -0.683f, 1.631f)
            lineToRelative(12.824f, 31.31f)
            curveToRelative(0.763f, 1.864f, 3.401f, 1.864f, 4.164f, 0f)
            lineToRelative(12.373f, -30.207f)
            lineToRelative(4.168f, 8.713f)
            curveToRelative(0.297f, 0.622f, 1.044f, 0.886f, 1.667f, 0.588f)
            curveToRelative(0.622f, -0.298f, 0.886f, -1.044f, 0.588f, -1.667f)
            lineToRelative(-5.5f, -11.5f)
            close()
        }
    }.build()
}
