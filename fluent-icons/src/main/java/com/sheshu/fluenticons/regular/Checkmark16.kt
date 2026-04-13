package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Checkmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Checkmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.864f, 3.655f)
            curveToRelative(0.19f, 0.201f, 0.18f, 0.518f, -0.021f, 0.707f)
            lineToRelative(-7.93f, 7.474f)
            curveToRelative(-0.237f, 0.223f, -0.61f, 0.217f, -0.839f, -0.016f)
            lineTo(2.394f, 9.1f)
            curveTo(2.2f, 8.903f, 2.202f, 8.587f, 2.399f, 8.393f)
            curveTo(2.596f, 8.199f, 2.912f, 8.2f, 3.106f, 8.398f)
            lineToRelative(2.406f, 2.442f)
            lineToRelative(7.645f, -7.206f)
            curveToRelative(0.201f, -0.19f, 0.518f, -0.18f, 0.707f, 0.021f)
            close()
        }
    }.build()
}
