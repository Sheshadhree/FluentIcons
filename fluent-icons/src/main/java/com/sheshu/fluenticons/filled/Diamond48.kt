package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Diamond48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Diamond48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.835f, 19.58f)
            curveToRelative(-2.441f, 2.441f, -2.441f, 6.399f, 0f, 8.84f)
            lineToRelative(13.748f, 13.748f)
            curveToRelative(2.44f, 2.44f, 6.398f, 2.44f, 8.839f, 0f)
            lineTo(42.17f, 28.419f)
            curveToRelative(2.44f, -2.44f, 2.44f, -6.398f, 0f, -8.838f)
            lineTo(28.422f, 5.832f)
            curveToRelative(-2.441f, -2.44f, -6.398f, -2.44f, -8.84f, 0f)
            lineTo(5.835f, 19.581f)
            close()
        }
    }.build()
}
