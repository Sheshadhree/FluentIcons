package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Send32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Send32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.176f, 2.164f)
            curveTo(2.988f, 1.57f, 1.67f, 2.7f, 2.077f, 3.965f)
            lineToRelative(2.858f, 8.883f)
            curveToRelative(0.114f, 0.357f, 0.418f, 0.62f, 0.787f, 0.68f)
            lineToRelative(11.869f, 1.979f)
            curveToRelative(0.557f, 0.093f, 0.557f, 0.893f, 0f, 0.986f)
            lineTo(5.723f, 18.471f)
            curveToRelative(-0.37f, 0.062f, -0.673f, 0.324f, -0.788f, 0.68f)
            lineToRelative(-2.858f, 8.886f)
            curveToRelative(-0.406f, 1.265f, 0.91f, 2.395f, 2.099f, 1.801f)
            lineTo(29.17f, 17.343f)
            curveToRelative(1.106f, -0.553f, 1.106f, -2.13f, 0f, -2.684f)
            lineTo(4.176f, 2.164f)
            close()
        }
    }.build()
}
