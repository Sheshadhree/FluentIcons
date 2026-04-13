package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HandPoint32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HandPoint32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.004f, 5.5f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            curveTo(17.439f, 2f, 19f, 3.567f, 19f, 5.5f)
            verticalLineToRelative(5.545f)
            lineToRelative(4.06f, 0.621f)
            curveToRelative(4.085f, 0.627f, 6.741f, 4.634f, 5.726f, 8.639f)
            lineToRelative(-1.51f, 5.96f)
            curveToRelative(-0.396f, 1.56f, -1.688f, 2.73f, -3.279f, 2.972f)
            lineToRelative(-4.731f, 0.718f)
            curveToRelative(-2.086f, 0.316f, -3.828f, -1.054f, -4.644f, -2.692f)
            curveToRelative(-1.131f, -2.271f, -3.827f, -5.337f, -11.706f, -8.72f)
            curveToRelative(-0.849f, -0.366f, -1.202f, -1.44f, -0.642f, -2.238f)
            curveToRelative(1.874f, -2.666f, 5.354f, -3.663f, 8.355f, -2.394f)
            lineToRelative(1.375f, 0.58f)
            verticalLineTo(5.5f)
            close()
        }
    }.build()
}
