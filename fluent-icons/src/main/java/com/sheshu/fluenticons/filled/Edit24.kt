package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Edit24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Edit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.891f, 3.048f)
            curveToRelative(1.397f, -1.397f, 3.663f, -1.397f, 5.06f, 0f)
            curveToRelative(1.398f, 1.397f, 1.398f, 3.663f, 0.001f, 5.06f)
            lineTo(20.06f, 9.002f)
            lineTo(15f, 3.94f)
            lineToRelative(0.891f, -0.892f)
            close()
            moveTo(13.94f, 5.001f)
            lineTo(3.94f, 15f)
            curveToRelative(-0.406f, 0.406f, -0.692f, 0.917f, -0.825f, 1.476f)
            lineTo(2.02f, 21.078f)
            curveToRelative(-0.06f, 0.253f, 0.015f, 0.52f, 0.2f, 0.704f)
            curveToRelative(0.184f, 0.184f, 0.45f, 0.26f, 0.704f, 0.199f)
            lineToRelative(4.601f, -1.096f)
            curveToRelative(0.56f, -0.133f, 1.07f, -0.418f, 1.477f, -0.825f)
            lineTo(19f, 10.061f)
            lineToRelative(-5.061f, -5.06f)
            close()
        }
    }.build()
}
