package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Wifi420: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Wifi420",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.921f, 13.881f)
            curveToRelative(0.486f, 0.486f, 0.486f, 1.272f, 0f, 1.757f)
            curveToRelative(-0.485f, 0.486f, -1.271f, 0.486f, -1.756f, 0f)
            curveToRelative(-0.485f, -0.485f, -0.485f, -1.271f, 0f, -1.757f)
            curveToRelative(0.485f, -0.485f, 1.271f, -0.485f, 1.757f, 0f)
            close()
        }
    }.build()
}
