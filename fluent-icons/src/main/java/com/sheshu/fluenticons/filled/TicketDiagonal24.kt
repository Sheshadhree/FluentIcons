package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TicketDiagonal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TicketDiagonal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.59f, 2.53f)
            curveToRelative(-0.878f, -0.879f, -2.303f, -0.879f, -3.181f, 0f)
            lineTo(2.53f, 12.41f)
            curveToRelative(-0.879f, 0.878f, -0.879f, 2.303f, 0f, 3.182f)
            lineToRelative(1.172f, 1.171f)
            curveToRelative(0.51f, 0.511f, 1.227f, 0.42f, 1.66f, 0.162f)
            curveTo(5.548f, 16.814f, 5.765f, 16.75f, 6f, 16.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            curveToRelative(0f, 0.234f, -0.064f, 0.451f, -0.175f, 0.637f)
            curveToRelative(-0.257f, 0.433f, -0.349f, 1.15f, 0.162f, 1.66f)
            lineTo(8.41f, 21.47f)
            curveToRelative(0.878f, 0.88f, 2.303f, 0.88f, 3.182f, 0f)
            lineToRelative(9.878f, -9.878f)
            curveToRelative(0.88f, -0.879f, 0.88f, -2.303f, 0f, -3.182f)
            lineToRelative(-1.171f, -1.172f)
            curveToRelative(-0.51f, -0.51f, -1.228f, -0.42f, -1.661f, -0.162f)
            curveTo(18.45f, 7.186f, 18.234f, 7.25f, 18f, 7.25f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            curveToRelative(0f, -0.234f, 0.063f, -0.452f, 0.174f, -0.638f)
            curveToRelative(0.258f, -0.433f, 0.349f, -1.15f, -0.162f, -1.66f)
            lineTo(15.591f, 2.53f)
            close()
        }
    }.build()
}
