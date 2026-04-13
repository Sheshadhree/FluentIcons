package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.254f, 12.961f)
            lineToRelative(1.892f, 1.893f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(4.45f, 5.155f)
            curveTo(4.234f, 5.57f, 4.09f, 6.026f, 4.03f, 6.507f)
            curveTo(2.338f, 6.62f, 1f, 8.03f, 1f, 9.75f)
            curveTo(1f, 11.545f, 2.455f, 13f, 4.25f, 13f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.171f, 0f, 0.34f, -0.013f, 0.504f, -0.039f)
            close()
            moveTo(15f, 9.75f)
            curveToRelative(0f, 0.867f, -0.34f, 1.654f, -0.892f, 2.237f)
            lineToRelative(-8.32f, -8.32f)
            curveTo(6.42f, 3.246f, 7.182f, 3f, 8f, 3f)
            curveToRelative(2.042f, 0f, 3.727f, 1.53f, 3.97f, 3.507f)
            curveTo(13.662f, 6.62f, 15f, 8.03f, 15f, 9.75f)
            close()
        }
    }.build()
}
