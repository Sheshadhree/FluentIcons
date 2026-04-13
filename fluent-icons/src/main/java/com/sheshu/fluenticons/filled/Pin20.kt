package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pin20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pin20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.325f, 2.617f)
            curveToRelative(-0.965f, -0.965f, -2.592f, -0.7f, -3.203f, 0.52f)
            lineToRelative(-1.73f, 3.459f)
            curveTo(8.23f, 6.924f, 7.95f, 7.18f, 7.609f, 7.317f)
            lineToRelative(-3.59f, 1.437f)
            curveTo(3.352f, 9.02f, 3.175f, 9.88f, 3.683f, 10.389f)
            lineTo(6.293f, 13f)
            lineTo(3f, 16.292f)
            verticalLineTo(17f)
            horizontalLineToRelative(0.707f)
            lineTo(7f, 13.706f)
            lineToRelative(2.61f, 2.61f)
            curveToRelative(0.508f, 0.508f, 1.37f, 0.332f, 1.636f, -0.335f)
            lineToRelative(1.436f, -3.59f)
            curveToRelative(0.136f, -0.341f, 0.393f, -0.62f, 0.722f, -0.784f)
            lineToRelative(3.458f, -1.73f)
            curveToRelative(1.221f, -0.61f, 1.485f, -2.238f, 0.52f, -3.203f)
            lineToRelative(-4.057f, -4.057f)
            close()
        }
    }.build()
}
