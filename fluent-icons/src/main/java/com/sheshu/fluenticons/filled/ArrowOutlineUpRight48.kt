package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowOutlineUpRight48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowOutlineUpRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(43.969f, 9.851f)
            curveToRelative(0.383f, -3.36f, -2.464f, -6.2f, -5.823f, -5.81f)
            lineTo(14.76f, 6.763f)
            curveToRelative(-3.528f, 0.41f, -5.026f, 4.712f, -2.515f, 7.226f)
            lineToRelative(2.748f, 2.751f)
            lineToRelative(-9.451f, 9.452f)
            curveToRelative(-2.05f, 2.049f, -2.05f, 5.37f, -0.004f, 7.421f)
            lineToRelative(8.833f, 8.85f)
            curveToRelative(2.05f, 2.052f, 5.376f, 2.054f, 7.428f, 0.003f)
            lineToRelative(9.464f, -9.46f)
            lineToRelative(2.843f, 2.787f)
            curveToRelative(2.526f, 2.478f, 6.797f, 0.962f, 7.198f, -2.553f)
            lineToRelative(2.665f, -23.39f)
            close()
        }
    }.build()
}
