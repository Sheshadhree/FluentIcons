package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cursor20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cursor20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.636f, 2.287f)
            curveTo(5.983f, 1.749f, 5f, 2.213f, 5f, 3.059f)
            verticalLineToRelative(13.998f)
            curveToRelative(0f, 0.927f, 1.15f, 1.355f, 1.756f, 0.655f)
            lineToRelative(3.524f, -4.073f)
            curveToRelative(0.285f, -0.33f, 0.699f, -0.518f, 1.134f, -0.518f)
            horizontalLineToRelative(5.592f)
            curveToRelative(0.938f, 0f, 1.36f, -1.176f, 0.636f, -1.772f)
            lineTo(6.636f, 2.287f)
            close()
        }
    }.build()
}
