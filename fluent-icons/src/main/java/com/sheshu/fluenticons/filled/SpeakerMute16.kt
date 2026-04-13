package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SpeakerMute16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SpeakerMute16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 2.5f)
            curveToRelative(0f, -0.201f, -0.12f, -0.382f, -0.306f, -0.46f)
            curveTo(8.51f, 1.96f, 8.295f, 2.001f, 8.151f, 2.141f)
            lineToRelative(-2.927f, 2.85f)
            horizontalLineTo(3.5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(2.99f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.723f)
            lineToRelative(2.927f, 2.875f)
            curveToRelative(0.143f, 0.14f, 0.358f, 0.182f, 0.543f, 0.104f)
            curveTo(8.88f, 13.883f, 9f, 13.701f, 9f, 13.5f)
            verticalLineToRelative(-11f)
            close()
            moveToRelative(1.147f, 3.646f)
            curveToRelative(0.195f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            lineToRelative(1.147f, 1.147f)
            lineToRelative(1.146f, -1.147f)
            curveToRelative(0.195f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineTo(12.708f, 8f)
            lineToRelative(1.146f, 1.146f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.195f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineTo(12f, 8.707f)
            lineToRelative(-1.147f, 1.147f)
            curveToRelative(-0.195f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            lineTo(11.293f, 8f)
            lineToRelative(-1.146f, -1.146f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}
