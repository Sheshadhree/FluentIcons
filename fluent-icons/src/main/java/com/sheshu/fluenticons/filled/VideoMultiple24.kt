package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.75f, 5f)
            curveTo(5.955f, 5f, 4.5f, 6.455f, 4.5f, 8.25f)
            verticalLineToRelative(5.5f)
            curveTo(4.5f, 15.545f, 5.955f, 17f, 7.75f, 17f)
            horizontalLineToRelative(5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-5.5f)
            curveTo(16f, 6.455f, 14.545f, 5f, 12.75f, 5f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(3.507f, 8.007f)
            curveTo(3.502f, 8.087f, 3.5f, 8.168f, 3.5f, 8.25f)
            verticalLineToRelative(5.5f)
            curveTo(3.5f, 16.097f, 5.403f, 18f, 7.75f, 18f)
            horizontalLineToRelative(5f)
            curveToRelative(0.082f, 0f, 0.163f, -0.002f, 0.244f, -0.007f)
            curveToRelative(-0.577f, 0.906f, -1.59f, 1.507f, -2.744f, 1.507f)
            horizontalLineToRelative(-2.5f)
            curveTo(4.574f, 19.5f, 2f, 16.926f, 2f, 13.75f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.153f, 0.6f, -2.166f, 1.507f, -2.743f)
            close()
            moveToRelative(18.495f, -0.254f)
            curveToRelative(0f, -1.416f, -1.594f, -2.245f, -2.754f, -1.434f)
            lineTo(17f, 7.893f)
            verticalLineToRelative(6.214f)
            lineToRelative(2.248f, 1.574f)
            curveToRelative(1.16f, 0.812f, 2.754f, -0.018f, 2.754f, -1.434f)
            verticalLineTo(7.753f)
            close()
        }
    }.build()
}
