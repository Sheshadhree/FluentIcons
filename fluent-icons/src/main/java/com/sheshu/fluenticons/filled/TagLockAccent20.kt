package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TagLockAccent20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagLockAccent20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.506f, 4.034f)
            curveToRelative(0f, -0.824f, -0.666f, -1.493f, -1.49f, -1.498f)
            lineToRelative(-4.89f, -0.032f)
            curveToRelative(-0.4f, -0.003f, -0.786f, 0.155f, -1.07f, 0.438f)
            lineToRelative(-6.68f, 6.664f)
            curveToRelative(-0.588f, 0.586f, -0.588f, 1.537f, -0.002f, 2.123f)
            lineToRelative(4.948f, 4.948f)
            curveToRelative(0.454f, 0.454f, 1.126f, 0.556f, 1.678f, 0.308f)
            verticalLineTo(14f)
            curveToRelative(0f, -0.932f, 0.637f, -1.715f, 1.5f, -1.937f)
            verticalLineTo(12f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            curveToRelative(0.987f, 0f, 1.863f, 0.476f, 2.41f, 1.212f)
            lineToRelative(0.164f, -0.165f)
            curveToRelative(0.282f, -0.282f, 0.44f, -0.665f, 0.44f, -1.063f)
            lineToRelative(-0.008f, -4.95f)
            close()
        }
    }.build()
}
