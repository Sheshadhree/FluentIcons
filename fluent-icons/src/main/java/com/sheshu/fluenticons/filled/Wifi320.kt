package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Wifi320: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Wifi320",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.955f, 11.84f)
            curveToRelative(0.363f, 0.364f, 0.662f, 0.81f, 0.87f, 1.283f)
            curveToRelative(0.165f, 0.38f, -0.007f, 0.822f, -0.387f, 0.988f)
            curveToRelative(-0.38f, 0.166f, -0.822f, -0.006f, -0.988f, -0.386f)
            curveToRelative(-0.134f, -0.307f, -0.328f, -0.596f, -0.556f, -0.824f)
            curveToRelative(-1.027f, -1.027f, -2.693f, -1.027f, -3.72f, 0f)
            curveToRelative(-0.226f, 0.227f, -0.411f, 0.504f, -0.547f, 0.814f)
            curveToRelative(-0.166f, 0.38f, -0.608f, 0.553f, -0.987f, 0.386f)
            curveToRelative(-0.38f, -0.166f, -0.553f, -0.608f, -0.387f, -0.987f)
            curveToRelative(0.208f, -0.477f, 0.497f, -0.91f, 0.86f, -1.273f)
            curveToRelative(1.614f, -1.613f, 4.229f, -1.613f, 5.842f, 0f)
            close()
            moveToRelative(-2.034f, 2.042f)
            curveToRelative(0.485f, 0.485f, 0.485f, 1.271f, 0f, 1.757f)
            curveToRelative(-0.485f, 0.485f, -1.271f, 0.485f, -1.757f, 0f)
            curveToRelative(-0.485f, -0.486f, -0.485f, -1.272f, 0f, -1.757f)
            curveToRelative(0.486f, -0.485f, 1.272f, -0.485f, 1.757f, 0f)
            close()
        }
    }.build()
}
