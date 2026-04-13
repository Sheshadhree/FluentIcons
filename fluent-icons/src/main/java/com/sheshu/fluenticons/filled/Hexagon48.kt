package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Hexagon48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Hexagon48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.427f, 6f)
            curveToRelative(-1.18f, 0f, -2.266f, 0.64f, -2.84f, 1.67f)
            lineTo(4.38f, 22.42f)
            curveToRelative(-0.547f, 0.982f, -0.547f, 2.178f, 0f, 3.16f)
            lineToRelative(8.207f, 14.75f)
            curveToRelative(0.574f, 1.03f, 1.66f, 1.67f, 2.84f, 1.67f)
            horizontalLineToRelative(17.148f)
            curveToRelative(1.18f, 0f, 2.267f, -0.64f, 2.84f, -1.67f)
            lineToRelative(8.208f, -14.75f)
            curveToRelative(0.546f, -0.982f, 0.546f, -2.178f, 0f, -3.16f)
            lineTo(35.415f, 7.67f)
            curveTo(34.842f, 6.64f, 33.755f, 6f, 32.575f, 6f)
            horizontalLineTo(15.427f)
            close()
        }
    }.build()
}
