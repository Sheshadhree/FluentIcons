package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(1.915f, 1.916f)
            curveTo(2.89f, 5.651f, 2f, 6.846f, 2f, 8.25f)
            verticalLineToRelative(7.5f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.695f, 0f, 3.086f, -1.297f, 3.237f, -2.953f)
            lineToRelative(5.732f, 5.733f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.061f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(16f, 12.818f)
            lineToRelative(5.008f, 5.008f)
            curveToRelative(0.57f, -0.274f, 0.994f, -0.848f, 0.994f, -1.578f)
            verticalLineTo(7.753f)
            curveToRelative(0f, -1.41f, -1.584f, -2.242f, -2.745f, -1.44f)
            lineTo(16f, 8.563f)
            verticalLineToRelative(4.255f)
            close()
            moveTo(8.182f, 5f)
            lineTo(15f, 11.818f)
            verticalLineTo(8.25f)
            curveTo(15f, 6.455f, 13.545f, 5f, 11.75f, 5f)
            horizontalLineTo(8.182f)
            close()
        }
    }.build()
}
