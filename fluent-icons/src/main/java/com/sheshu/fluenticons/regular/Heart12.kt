package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Heart12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Heart12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.41f, 2.515f)
            curveToRelative(-0.957f, -0.75f, -2.329f, -0.681f, -3.2f, 0.213f)
            curveToRelative(-0.95f, 0.974f, -0.946f, 2.558f, 0.008f, 3.536f)
            lineTo(5.75f, 9.887f)
            curveToRelative(0.146f, 0.15f, 0.384f, 0.15f, 0.53f, 0f)
            lineToRelative(3.513f, -3.602f)
            curveToRelative(0.947f, -0.977f, 0.944f, -2.556f, -0.01f, -3.535f)
            curveToRelative(-0.878f, -0.901f, -2.254f, -0.978f, -3.21f, -0.226f)
            curveTo(6.49f, 2.59f, 6.409f, 2.662f, 6.333f, 2.74f)
            lineTo(5.995f, 3.086f)
            lineToRelative(-0.34f, -0.35f)
            curveToRelative(-0.078f, -0.08f, -0.16f, -0.153f, -0.246f, -0.22f)
            close()
            moveTo(7.048f, 3.44f)
            curveToRelative(0.555f, -0.57f, 1.451f, -0.573f, 2.018f, 0.009f)
            curveTo(9.643f, 4.04f, 9.643f, 5f, 9.074f, 5.588f)
            verticalLineTo(5.59f)
            lineToRelative(-3.06f, 3.138f)
            lineToRelative(-3.08f, -3.16f)
            curveTo(2.356f, 4.972f, 2.358f, 4.007f, 2.926f, 3.425f)
            curveToRelative(0.553f, -0.568f, 1.449f, -0.57f, 2.014f, 0.009f)
            lineToRelative(0.34f, 0.349f)
            curveToRelative(0.188f, 0.193f, 0.447f, 0.302f, 0.716f, 0.302f)
            curveToRelative(0.27f, 0f, 0.529f, -0.11f, 0.717f, -0.303f)
            lineTo(7.048f, 3.44f)
            close()
        }
    }.build()
}
