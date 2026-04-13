package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HomeCheckmark20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HomeCheckmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.998f, 2.384f)
            curveToRelative(0.57f, -0.512f, 1.434f, -0.512f, 2.005f, 0f)
            lineToRelative(5.5f, 4.943f)
            curveTo(16.819f, 7.612f, 17f, 8.017f, 17f, 8.443f)
            verticalLineTo(15.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.672f, 17f, 3f, 16.328f, 3f, 15.5f)
            verticalLineTo(8.443f)
            curveToRelative(0f, -0.425f, 0.18f, -0.831f, 0.498f, -1.116f)
            lineToRelative(5.5f, -4.943f)
            close()
            moveToRelative(4.356f, 6.467f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineTo(9f, 11.79f)
            lineToRelative(-1.646f, -1.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2f, 2f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.707f, 0f)
            lineToRelative(4f, -4f)
            close()
        }
    }.build()
}
