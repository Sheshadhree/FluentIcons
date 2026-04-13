package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShieldTask16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShieldTask16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.355f, 2.147f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            curveTo(6.404f, 3.388f, 5.03f, 4f, 3.5f, 4f)
            curveTo(3.224f, 4f, 3f, 4.224f, 3f, 4.5f)
            verticalLineToRelative(3.001f)
            curveToRelative(0f, 3.219f, 1.641f, 5.407f, 4.842f, 6.473f)
            curveToRelative(0.103f, 0.035f, 0.214f, 0.035f, 0.316f, 0f)
            curveTo(11.358f, 12.908f, 13f, 10.72f, 13f, 7.501f)
            verticalLineTo(4.5f)
            curveTo(13f, 4.224f, 12.776f, 4f, 12.5f, 4f)
            curveToRelative(-1.531f, 0f, -2.905f, -0.61f, -4.145f, -1.853f)
            close()
            moveToRelative(2.499f, 4f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.194f, -0.195f, -0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            lineTo(7.5f, 8.793f)
            lineToRelative(2.646f, -2.646f)
            curveToRelative(0.195f, -0.195f, 0.512f, -0.196f, 0.708f, 0f)
            close()
        }
    }.build()
}
