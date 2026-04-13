package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Wifi420: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Wifi420",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.963f, 13.787f)
            curveToRelative(0.507f, 0.507f, 0.507f, 1.329f, 0f, 1.836f)
            curveToRelative(-0.507f, 0.507f, -1.329f, 0.507f, -1.836f, 0f)
            curveToRelative(-0.507f, -0.507f, -0.507f, -1.33f, 0f, -1.836f)
            curveToRelative(0.507f, -0.508f, 1.33f, -0.508f, 1.836f, 0f)
            close()
        }
    }.build()
}
