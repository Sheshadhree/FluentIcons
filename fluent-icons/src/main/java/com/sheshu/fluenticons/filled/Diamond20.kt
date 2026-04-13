package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Diamond20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Diamond20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.12f, 2.879f)
            curveToRelative(-1.172f, -1.172f, -3.072f, -1.172f, -4.243f, 0f)
            lineTo(2.879f, 7.877f)
            curveToRelative(-1.172f, 1.171f, -1.172f, 3.07f, 0f, 4.242f)
            lineToRelative(4.998f, 4.998f)
            curveToRelative(1.171f, 1.172f, 3.07f, 1.172f, 4.242f, 0f)
            lineToRelative(4.998f, -4.998f)
            curveToRelative(1.172f, -1.171f, 1.172f, -3.07f, 0f, -4.242f)
            lineTo(12.12f, 2.879f)
            close()
        }
    }.build()
}
