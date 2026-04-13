package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Checkmark20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Checkmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.374f, 10.168f)
            curveToRelative(-0.184f, -0.207f, -0.5f, -0.225f, -0.706f, -0.042f)
            curveToRelative(-0.207f, 0.184f, -0.225f, 0.5f, -0.042f, 0.706f)
            lineToRelative(4f, 4.5f)
            curveToRelative(0.191f, 0.215f, 0.524f, 0.225f, 0.728f, 0.022f)
            lineToRelative(10.5f, -10.5f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(7.02f, 14.271f)
            lineToRelative(-3.647f, -4.103f)
            close()
        }
    }.build()
}
