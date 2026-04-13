package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataBarHorizontal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataBarHorizontal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 18.251f)
            curveToRelative(0f, -1.242f, -1.007f, -2.249f, -2.25f, -2.249f)
            horizontalLineTo(5.25f)
            curveToRelative(-1.243f, 0f, -2.25f, 1.007f, -2.25f, 2.249f)
            curveToRelative(0f, 1.242f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.008f, 2.25f, -2.25f)
            close()
            moveToRelative(-4f, -6.5f)
            curveToRelative(0f, -1.242f, -1.007f, -2.249f, -2.25f, -2.249f)
            horizontalLineToRelative(-9.5f)
            curveTo(4.006f, 9.502f, 3f, 10.509f, 3f, 11.751f)
            curveToRelative(0f, 1.242f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(9.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.008f, 2.25f, -2.25f)
            close()
            moveToRelative(-4f, -6.5f)
            curveToRelative(0f, -1.242f, -1.007f, -2.249f, -2.25f, -2.249f)
            horizontalLineToRelative(-5.5f)
            curveTo(4.006f, 3.002f, 3f, 4.009f, 3f, 5.251f)
            curveToRelative(0f, 1.242f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(5.5f)
            curveTo(11.994f, 7.5f, 13f, 6.492f, 13f, 5.25f)
            close()
        }
    }.build()
}
