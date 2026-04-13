package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Wifi320: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Wifi320",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.888f, 11.854f)
            curveToRelative(0.354f, 0.354f, 0.646f, 0.79f, 0.849f, 1.254f)
            curveToRelative(0.11f, 0.253f, -0.004f, 0.548f, -0.257f, 0.659f)
            curveToRelative(-0.253f, 0.11f, -0.548f, -0.005f, -0.659f, -0.258f)
            curveToRelative(-0.154f, -0.352f, -0.377f, -0.684f, -0.64f, -0.948f)
            curveToRelative(-1.185f, -1.184f, -3.105f, -1.184f, -4.29f, 0f)
            curveToRelative(-0.263f, 0.263f, -0.476f, 0.582f, -0.631f, 0.938f)
            curveToRelative(-0.11f, 0.253f, -0.406f, 0.368f, -0.659f, 0.257f)
            curveToRelative(-0.253f, -0.11f, -0.368f, -0.405f, -0.257f, -0.658f)
            curveToRelative(0.204f, -0.467f, 0.486f, -0.89f, 0.84f, -1.244f)
            curveToRelative(1.575f, -1.575f, 4.128f, -1.575f, 5.704f, 0f)
            close()
            moveToRelative(-1.925f, 1.933f)
            curveToRelative(0.507f, 0.507f, 0.507f, 1.329f, 0f, 1.836f)
            curveToRelative(-0.507f, 0.507f, -1.33f, 0.507f, -1.836f, 0f)
            curveToRelative(-0.507f, -0.507f, -0.507f, -1.33f, 0f, -1.836f)
            curveToRelative(0.507f, -0.507f, 1.329f, -0.507f, 1.836f, 0f)
            close()
        }
    }.build()
}
