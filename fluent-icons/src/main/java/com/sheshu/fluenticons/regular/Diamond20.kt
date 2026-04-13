package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Diamond20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Diamond20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.877f, 2.879f)
            curveToRelative(1.171f, -1.172f, 3.07f, -1.172f, 4.242f, 0f)
            lineToRelative(4.998f, 4.998f)
            curveToRelative(1.172f, 1.171f, 1.172f, 3.07f, 0f, 4.242f)
            lineToRelative(-4.998f, 4.998f)
            curveToRelative(-1.171f, 1.172f, -3.07f, 1.172f, -4.242f, 0f)
            lineTo(2.879f, 12.12f)
            curveToRelative(-1.172f, -1.171f, -1.172f, -3.07f, 0f, -4.242f)
            lineTo(7.877f, 2.88f)
            close()
            moveToRelative(3.535f, 0.707f)
            curveToRelative(-0.78f, -0.781f, -2.047f, -0.781f, -2.828f, 0f)
            lineTo(3.586f, 8.584f)
            curveToRelative(-0.781f, 0.78f, -0.781f, 2.047f, 0f, 2.828f)
            lineToRelative(4.998f, 4.998f)
            curveToRelative(0.78f, 0.781f, 2.047f, 0.781f, 2.828f, 0f)
            lineToRelative(4.998f, -4.998f)
            curveToRelative(0.781f, -0.78f, 0.781f, -2.047f, 0f, -2.828f)
            lineToRelative(-4.998f, -4.998f)
            close()
        }
    }.build()
}
