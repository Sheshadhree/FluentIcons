package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Send24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Send24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.815f, 12.197f)
            lineToRelative(-7.532f, 1.255f)
            curveToRelative(-0.176f, 0.03f, -0.323f, 0.15f, -0.386f, 0.318f)
            lineTo(2.3f, 20.728f)
            curveToRelative(-0.248f, 0.64f, 0.421f, 1.25f, 1.035f, 0.942f)
            lineToRelative(18f, -9f)
            curveToRelative(0.553f, -0.276f, 0.553f, -1.065f, 0f, -1.341f)
            lineToRelative(-18f, -9f)
            curveTo(2.72f, 2.022f, 2.05f, 2.632f, 2.299f, 3.27f)
            lineToRelative(2.598f, 6.958f)
            curveToRelative(0.063f, 0.167f, 0.21f, 0.289f, 0.386f, 0.318f)
            lineToRelative(7.532f, 1.255f)
            curveToRelative(0.109f, 0.018f, 0.182f, 0.122f, 0.164f, 0.23f)
            curveToRelative(-0.014f, 0.085f, -0.08f, 0.15f, -0.164f, 0.165f)
            close()
        }
    }.build()
}
