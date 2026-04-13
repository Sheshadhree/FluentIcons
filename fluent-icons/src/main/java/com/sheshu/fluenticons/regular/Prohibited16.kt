package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Prohibited16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Prohibited16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.875f, 3.418f)
            curveTo(9.517f, 1.42f, 5.98f, 1.533f, 3.757f, 3.758f)
            curveTo(1.533f, 5.98f, 1.42f, 9.517f, 3.418f, 11.874f)
            lineToRelative(8.457f, -8.457f)
            close()
            moveToRelative(0.707f, 0.707f)
            lineToRelative(-8.457f, 8.457f)
            curveToRelative(2.358f, 1.998f, 5.894f, 1.885f, 8.118f, -0.34f)
            curveToRelative(2.224f, -2.223f, 2.337f, -5.76f, 0.339f, -8.117f)
            close()
            moveTo(3.05f, 3.05f)
            curveToRelative(2.734f, -2.733f, 7.166f, -2.733f, 9.9f, 0f)
            curveToRelative(2.733f, 2.734f, 2.733f, 7.166f, 0f, 9.9f)
            curveToRelative(-2.734f, 2.733f, -7.166f, 2.733f, -9.9f, 0f)
            curveToRelative(-2.733f, -2.734f, -2.733f, -7.166f, 0f, -9.9f)
            close()
        }
    }.build()
}
