package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Megaphone28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Megaphone28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26f, 7.353f)
            curveToRelative(0f, -1.807f, -1.712f, -3.123f, -3.458f, -2.657f)
            lineTo(4.045f, 9.629f)
            curveTo(2.841f, 9.95f, 2.004f, 11.04f, 2.004f, 12.286f)
            verticalLineToRelative(3.427f)
            curveToRelative(0f, 1.246f, 0.837f, 2.336f, 2.041f, 2.657f)
            lineTo(7f, 19.158f)
            verticalLineTo(19.5f)
            curveToRelative(0f, 2.485f, 2.014f, 4.5f, 4.5f, 4.5f)
            curveToRelative(1.79f, 0f, 3.335f, -1.045f, 4.06f, -2.558f)
            lineToRelative(6.982f, 1.862f)
            curveTo(24.288f, 23.769f, 26f, 22.454f, 26f, 20.647f)
            verticalLineTo(7.352f)
            close()
            moveTo(8.5f, 19.56f)
            lineToRelative(5.572f, 1.486f)
            curveToRelative(-0.525f, 0.871f, -1.48f, 1.455f, -2.572f, 1.455f)
            curveToRelative(-1.637f, 0f, -2.968f, -1.312f, -3f, -2.941f)
            close()
        }
    }.build()
}
