package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HeartOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HeartOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(1.855f, 1.856f)
            curveToRelative(-0.174f, 0.135f, -0.34f, 0.283f, -0.5f, 0.443f)
            curveToRelative(-2.1f, 2.099f, -2.1f, 5.502f, 0f, 7.601f)
            lineToRelative(7.895f, 7.896f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(3.744f, -3.742f)
            lineToRelative(4.445f, 4.447f)
            curveToRelative(0.293f, 0.292f, 0.768f, 0.292f, 1.061f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.061f)
            lineTo(3.28f, 2.22f)
            close()
            moveToRelative(17.152f, 10.959f)
            lineToRelative(-2.036f, 2.035f)
            lineTo(7.19f, 4.008f)
            curveToRelative(1.436f, -0.05f, 2.89f, 0.474f, 3.986f, 1.57f)
            lineToRelative(0.823f, 0.824f)
            lineToRelative(0.82f, -0.822f)
            curveToRelative(2.104f, -2.103f, 5.508f, -2.103f, 7.611f, 0f)
            curveToRelative(2.1f, 2.1f, 2.096f, 5.493f, 0.002f, 7.599f)
            close()
        }
    }.build()
}
