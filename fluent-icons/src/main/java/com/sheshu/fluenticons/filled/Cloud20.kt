package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cloud20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cloud20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 4f)
            curveToRelative(2.817f, 0f, 4.415f, 1.923f, 4.647f, 4.246f)
            horizontalLineToRelative(0.07f)
            curveToRelative(1.814f, 0f, 3.283f, 1.512f, 3.283f, 3.377f)
            curveTo(18f, 13.488f, 16.53f, 15f, 14.718f, 15f)
            horizontalLineTo(5.282f)
            curveTo(3.47f, 15f, 2f, 13.488f, 2f, 11.623f)
            curveToRelative(0f, -1.865f, 1.47f, -3.377f, 3.282f, -3.377f)
            horizontalLineToRelative(0.071f)
            curveTo(5.587f, 5.908f, 7.183f, 4f, 10f, 4f)
            close()
        }
    }.build()
}
