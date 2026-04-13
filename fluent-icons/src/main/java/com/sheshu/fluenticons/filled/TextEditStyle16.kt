package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextEditStyle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextEditStyle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.471f, 2.332f)
            curveTo(5.4f, 2.132f, 5.211f, 2f, 5.001f, 2f)
            curveTo(4.788f, 2f, 4.6f, 2.133f, 4.528f, 2.332f)
            lineToRelative(-2.5f, 7f)
            curveTo(1.936f, 9.592f, 2.072f, 9.878f, 2.332f, 9.97f)
            curveToRelative(0.26f, 0.093f, 0.546f, -0.043f, 0.639f, -0.303f)
            lineTo(3.924f, 7f)
            horizontalLineToRelative(2.152f)
            lineToRelative(0.475f, 1.328f)
            lineToRelative(0.782f, -0.782f)
            lineToRelative(-1.862f, -5.214f)
            close()
            moveToRelative(-0.47f, 1.655f)
            lineTo(5.718f, 6f)
            horizontalLineTo(4.281f)
            lineToRelative(0.72f, -2.013f)
            close()
            moveToRelative(5.73f, 1.575f)
            curveToRelative(0.748f, -0.748f, 1.96f, -0.748f, 2.708f, 0f)
            curveToRelative(0.748f, 0.748f, 0.748f, 1.96f, 0f, 2.707f)
            lineToRelative(-4.657f, 4.657f)
            curveToRelative(-0.35f, 0.349f, -0.794f, 0.587f, -1.278f, 0.683f)
            lineToRelative(-1.906f, 0.382f)
            curveToRelative(-0.164f, 0.032f, -0.333f, -0.019f, -0.452f, -0.137f)
            curveToRelative(-0.118f, -0.118f, -0.17f, -0.288f, -0.136f, -0.452f)
            lineToRelative(0.381f, -1.906f)
            curveToRelative(0.097f, -0.484f, 0.335f, -0.928f, 0.684f, -1.277f)
            lineToRelative(4.657f, -4.657f)
            close()
        }
    }.build()
}
