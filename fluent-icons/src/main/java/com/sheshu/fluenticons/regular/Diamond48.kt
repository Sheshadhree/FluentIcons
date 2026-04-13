package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Diamond48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Diamond48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.832f, 28.42f)
            curveToRelative(-2.44f, -2.441f, -2.44f, -6.399f, 0f, -8.84f)
            lineTo(19.581f, 5.833f)
            curveToRelative(2.44f, -2.44f, 6.398f, -2.44f, 8.839f, 0f)
            lineToRelative(13.748f, 13.749f)
            curveToRelative(2.441f, 2.44f, 2.441f, 6.398f, 0f, 8.838f)
            lineTo(28.42f, 42.168f)
            curveToRelative(-2.441f, 2.44f, -6.398f, 2.44f, -8.839f, 0f)
            lineTo(5.833f, 28.419f)
            close()
            moveTo(7.6f, 21.347f)
            curveToRelative(-1.464f, 1.465f, -1.464f, 3.84f, 0f, 5.304f)
            lineTo(21.35f, 40.4f)
            curveToRelative(1.464f, 1.465f, 3.839f, 1.465f, 5.303f, 0f)
            lineTo(40.4f, 26.652f)
            curveToRelative(1.465f, -1.465f, 1.465f, -3.84f, 0f, -5.304f)
            lineTo(26.652f, 7.6f)
            curveToRelative(-1.464f, -1.464f, -3.839f, -1.464f, -5.303f, 0f)
            lineTo(7.6f, 21.348f)
            close()
        }
    }.build()
}
