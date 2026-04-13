package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DiamondDismiss20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DiamondDismiss20",
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
            moveTo(7.854f, 7.146f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(9.293f, 10f)
            lineToRelative(-2.146f, 2.146f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineTo(10f, 10.707f)
            lineToRelative(2.146f, 2.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(10.707f, 10f)
            lineToRelative(2.147f, -2.146f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(10f, 9.293f)
            lineTo(7.854f, 7.147f)
            close()
        }
    }.build()
}
