package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlashlightOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlashlightOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(18.5f, 18.5f)
            curveToRelative(0.292f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(19.06f, 15f)
            lineToRelative(1.41f, -1.409f)
            curveToRelative(0.878f, -0.879f, 0.878f, -2.303f, 0f, -3.182f)
            lineTo(13.59f, 3.53f)
            curveToRelative(-0.878f, -0.878f, -2.303f, -0.878f, -3.181f, 0f)
            lineToRelative(-1.41f, 1.41f)
            lineTo(19.06f, 15f)
            close()
            moveTo(13f, 16.06f)
            lineTo(7.94f, 11f)
            lineToRelative(-4.91f, 4.909f)
            curveToRelative(-0.879f, 0.879f, -0.879f, 2.303f, 0f, 3.182f)
            lineToRelative(1.88f, 1.879f)
            curveToRelative(0.878f, 0.878f, 2.303f, 0.878f, 3.182f, 0f)
            lineTo(13f, 16.06f)
            close()
            moveToRelative(-3.47f, -0.53f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.292f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.768f, 0f, 1.06f)
            close()
        }
    }.build()
}
