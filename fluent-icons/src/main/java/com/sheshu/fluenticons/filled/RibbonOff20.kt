package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RibbonOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RibbonOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.625f, 5.332f)
            curveTo(4.224f, 6.135f, 4f, 7.042f, 4f, 8f)
            curveToRelative(0f, 3.314f, 2.686f, 6f, 6f, 6f)
            curveToRelative(0.959f, 0f, 1.865f, -0.225f, 2.668f, -0.624f)
            lineToRelative(0.74f, 0.74f)
            curveTo(12.4f, 14.678f, 11.238f, 15f, 10f, 15f)
            curveToRelative(-1.487f, 0f, -2.866f, -0.464f, -4f, -1.255f)
            verticalLineTo(17.5f)
            curveToRelative(0f, 0.187f, 0.105f, 0.359f, 0.271f, 0.444f)
            curveToRelative(0.167f, 0.086f, 0.367f, 0.072f, 0.52f, -0.037f)
            lineTo(10f, 16f)
            lineToRelative(3.21f, 1.907f)
            curveToRelative(0.152f, 0.108f, 0.352f, 0.123f, 0.519f, 0.037f)
            curveTo(13.895f, 17.86f, 14f, 17.687f, 14f, 17.5f)
            verticalLineToRelative(-2.793f)
            lineToRelative(3.146f, 3.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2.479f, 2.478f)
            close()
            moveToRelative(1.194f, -1.635f)
            lineToRelative(8.484f, 8.485f)
            curveTo(15.353f, 11.1f, 16f, 9.625f, 16f, 8f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            curveToRelative(-1.626f, 0f, -3.1f, 0.647f, -4.181f, 1.697f)
            close()
        }
    }.build()
}
